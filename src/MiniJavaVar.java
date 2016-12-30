/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;

public class MiniJavaVar {
    public String type;
    public Object value;

    public MiniJavaVar(String _type, Object _value) {
        type = _type;
        value = _value;
    }

    public boolean isError() {
        return type.equals("0Error");
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

    public static MiniJavaVar makeRuntimeError() { return new MiniJavaVar("0Error", 0); }
}
