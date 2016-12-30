/**
 * Created by ougar_000 on 2016/12/30.
 */

import com.sun.istack.internal.Nullable;
import org.antlr.v4.Tool;

import java.lang.*;
import java.util.*;

public class MiniJavaVarCtxManager {
    private Stack<MiniJavaVarCtx> contexts = new Stack<>();

    public void enterBlock() {
        contexts.push(new MiniJavaVarCtx());
    }

    public void exitBlock() {
        contexts.pop();
    }

    public boolean isTopLevel() { return contexts.size() == 1; }

    public MiniJavaVar assignVar(String varName, MiniJavaVar varValue) {
        contexts.peek().vars.put(varName, varValue);
        return varValue;
    }

    public MiniJavaVar findVar(String varName) {
        int n = contexts.size();
        for(n -= 1; n >= 0; n--) {
            MiniJavaVar findRes = contexts.get(n).vars.get(varName);
            if(findRes != null) {
                return findRes;
            }
        }
        return null;
    }

    public boolean isRedefinedVar(String varName) {
        MiniJavaVar findRes = contexts.peek().vars.get(varName);
        return findRes != null;
    }
}
