/**
 * Created by ougar_000 on 2016/12/30.
 */

import com.sun.istack.internal.Nullable;

import java.lang.*;
import java.util.HashMap;
import java.util.Vector;

public class MiniJavaVar {
    public final String type;
    public Object value;

    public MiniJavaVar(String _type, @Nullable Object _value) {
        type = _type;
        value = _value;
    }

    public boolean isError() {
        return type.equals("0Error");
    }

    public static boolean isArrayType(String type) {
        return type.endsWith("[]");
    }

    public static boolean isParentClassOf(HashMap<String, MiniJavaClass> classes, String cl1, String cl2) {
        if(isArrayType(cl1)) return false;
        if(cl1.equals("int") || cl1.equals("boolean")) return false;
        MiniJavaClass begin = classes.get(cl2);
        while(begin != null && begin.parentClassName != null) {
            if(begin.parentClassName.equals(cl1)) return true;
            begin = classes.get(begin.parentClassName);
        }
        return false;
    }

    public static MiniJavaVar makeVoid() {
        return new MiniJavaVar("void", 0);
    }

    public static MiniJavaVar makeInt(Integer v) {
        return new MiniJavaVar("int", v);
    }

    public static MiniJavaVar makeBool(boolean v) {
        return new MiniJavaVar("boolean", v);
    }

    public static MiniJavaVar makeError() { return new MiniJavaVar("0Error", 0); }

    public static MiniJavaVar makeInitVar(String type) {
        if(isArrayType(type)) {
            MiniJavaVar arr = makeInit(type);
            arr.value = new Vector<MiniJavaVar>();
            return arr;
        } else {
            if(type.equals("int")) return makeInt(0);
            if(type.equals("boolean")) return makeBool(false);
            MiniJavaVar inst = makeInit(type);
            inst.value = new MiniJavaInstance();
            return inst;
        }
    }

    public static MiniJavaVar makeInit(String type) { return new MiniJavaVar(type, null); }

    public static MiniJavaVar makeNewObj(String newTypeName, MiniJavaVar objToPoint) {
        if(objToPoint.value == null) return makeInit(newTypeName);
        if(newTypeName.equals(objToPoint.type)) {
            if(objToPoint.type.equals("int")) return MiniJavaVar.makeInt((int)objToPoint.value);
            if(objToPoint.type.equals("boolean")) return MiniJavaVar.makeBool((boolean)objToPoint.value);
            return objToPoint;
        }
        MiniJavaVar res = makeInit(newTypeName);
        res.value = objToPoint.value;
        return res;
    }

    public String toString() {
        return String.format("%s(%s)", type, value);
    }
}
