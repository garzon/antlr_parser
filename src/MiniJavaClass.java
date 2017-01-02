/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import miniJava.*;

public class MiniJavaClass {
    public HashMap<String, String> property = new HashMap<>();

    public HashMap<String, MiniJavaMethod> methods = new HashMap<>();

    public String parentClassName = null;
    public String name = null;

    public MiniJavaParser.ClassDeclarationContext ctx;

    public String toString() {
        return String.format("class(%s)", name);
    }
}
