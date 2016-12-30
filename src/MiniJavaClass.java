/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import miniJava.*;

public class MiniJavaClass {
    public Vector<String> propertyName = new Vector<>();

    public HashMap<String, ParserRuleContext> methods = new HashMap<>();
    public HashMap<String, String> methodPermission = new HashMap<>();

    public String parentClassName = null;

    public MiniJavaParser.ClassDeclarationContext ctx;
}
