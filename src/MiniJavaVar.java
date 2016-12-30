/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;

public class MiniJavaVar {
    public String type;
    public Integer value;

    public MiniJavaVar(String _type, Integer _value) {
        type = _type;
        value = _value;
    }

    public static MiniJavaVar makeVoid() {
        return new MiniJavaVar("void", 0);
    }

    public static MiniJavaVar makeInt(Integer v) {
        return new MiniJavaVar("int", v);
    }
}
