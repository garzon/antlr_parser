
import org.antlr.v4.runtime.*;

/**
 * Created by ougar_000 on 2017/1/1.
 */
public class LexerErrorListener extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        System.err.printf("[Lexical ERR] Line %d, Char %d: %s\n", line, charPositionInLine, msg);
        CliUtil.underlineError(recognizer,(Token)offendingSymbol,
                line, charPositionInLine);
    }

}
