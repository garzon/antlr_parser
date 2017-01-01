/**
 * Created by ougar_000 on 2017/1/1.
 */

import org.antlr.v4.runtime.*;

public class ParserErrorListener extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        System.err.printf("[Syntax ERR] Line %d, Char %d: %s\n", line, charPositionInLine, msg);
        CliUtil.underlineError(recognizer,(Token)offendingSymbol,
                line, charPositionInLine);
    }

}
