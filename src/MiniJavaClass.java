/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import miniJava.*;

public class MiniJavaClass {
    public HashMap<String, String> property = new HashMap<>();

    public HashMap<String, MiniJavaParser.MethodDeclarationContext> methods = new HashMap<>();
    public HashMap<String, String> methodPermission = new HashMap<>();
    public HashMap<String, Vector<String>> methodArgs = new HashMap<>();
    public HashMap<String, Vector<String>> methodArgsName = new HashMap<>();

    public String parentClassName = null;

    public MiniJavaParser.ClassDeclarationContext ctx;
}
