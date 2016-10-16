package com.qualixium.nbshell.lexer;

import com.qualixium.nbshell.ShellScriptLanguage;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author pedro
 */
public class ShellScriptLanguageHierarchy extends LanguageHierarchy<ShellScriptTokenId> {

    private static List<ShellScriptTokenId> tokens;
    private static Map<Integer, ShellScriptTokenId> idToToken;

    private static void init() {
        tokens = Arrays.<ShellScriptTokenId>asList(new ShellScriptTokenId[]{
            new ShellScriptTokenId("EOF", "whitespace", 0),
            new ShellScriptTokenId("WHITESPACE", "whitespace", 1),
            new ShellScriptTokenId("SINGLE_LINE_COMMENT", "comment", 2),
            new ShellScriptTokenId("IF", "keyword", 3),
            new ShellScriptTokenId("THEN", "keyword", 4),
            new ShellScriptTokenId("ELSE", "keyword", 5),
            new ShellScriptTokenId("ELIF", "keyword", 6),
            new ShellScriptTokenId("FI", "keyword", 7),
            new ShellScriptTokenId("CASE", "keyword", 8),
            new ShellScriptTokenId("ESAC", "keyword", 9),
            new ShellScriptTokenId("FOR", "keyword", 10),
            new ShellScriptTokenId("SELECT", "keyword", 11),
            new ShellScriptTokenId("WHILE", "keyword", 12),
            new ShellScriptTokenId("UNTIL", "keyword", 13),
            new ShellScriptTokenId("DO", "keyword", 14),
            new ShellScriptTokenId("DONE", "keyword", 15),
            new ShellScriptTokenId("IN", "keyword", 16),
            new ShellScriptTokenId("FUNCTION", "keyword", 17),
            new ShellScriptTokenId("TIME", "keyword", 18),
            new ShellScriptTokenId("COPROC", "keyword", 19),
            new ShellScriptTokenId("CAT", "linux_command", 20),
            new ShellScriptTokenId("CD", "linux_command", 21),
            new ShellScriptTokenId("CHMOD", "linux_command",22 ),
            new ShellScriptTokenId("CHOWN", "linux_command", 23),
            new ShellScriptTokenId("CLEAR", "linux_command", 24),
            new ShellScriptTokenId("CP", "linux_command", 25),
            new ShellScriptTokenId("CRONTAB", "linux_command", 26),
            new ShellScriptTokenId("DATE", "linux_command", 27),
            new ShellScriptTokenId("DF", "linux_command", 28),
            new ShellScriptTokenId("DIFF", "linux_command", 29),
            new ShellScriptTokenId("DU", "linux_command", 30),
            new ShellScriptTokenId("ECHO", "linux_command", 31),
            new ShellScriptTokenId("EXPORT", "linux_command", 32),
            new ShellScriptTokenId("FILE", "linux_command", 33),
            new ShellScriptTokenId("FIND", "linux_command", 34),
            new ShellScriptTokenId("FREE", "linux_command", 35),
            new ShellScriptTokenId("FTP", "linux_command", 36),
            new ShellScriptTokenId("GREP", "linux_command", 37),
            new ShellScriptTokenId("IFCONFIG", "linux_command", 38),
            new ShellScriptTokenId("KILL", "linux_command", 39),
            new ShellScriptTokenId("LESS", "linux_command", 40),
            new ShellScriptTokenId("LN", "linux_command", 41),
            new ShellScriptTokenId("LOCATE", "linux_command", 42),
            new ShellScriptTokenId("LPR", "linux_command", 43),
            new ShellScriptTokenId("LS", "linux_command", 44),
            new ShellScriptTokenId("MAN", "linux_command", 45),
            new ShellScriptTokenId("MKDIR", "linux_command", 46),
            new ShellScriptTokenId("MOUNT", "linux_command", 47),
            new ShellScriptTokenId("MV", "linux_command", 48),
            new ShellScriptTokenId("PASSWD", "linux_command", 49),
            new ShellScriptTokenId("PING", "linux_command", 50),
            new ShellScriptTokenId("PS", "linux_command", 51),
            new ShellScriptTokenId("PWD", "linux_command", 52),
            new ShellScriptTokenId("RM", "linux_command", 53),
            new ShellScriptTokenId("RMDIR", "linux_command", 54),
            new ShellScriptTokenId("SCP", "linux_command", 55),
            new ShellScriptTokenId("SERVICE", "linux_command", 56),
            new ShellScriptTokenId("SHUTDOWN", "linux_command", 57),
            new ShellScriptTokenId("SORT", "linux_command", 58),
            new ShellScriptTokenId("SSH", "linux_command", 59),
            new ShellScriptTokenId("SU", "linux_command", 60),
            new ShellScriptTokenId("TAIL", "linux_command", 61),
            new ShellScriptTokenId("TAR", "linux_command", 62),
            new ShellScriptTokenId("TOP", "linux_command", 63),
            new ShellScriptTokenId("TOUCH", "linux_command",64 ),
            new ShellScriptTokenId("UNAME", "linux_command", 65),
            new ShellScriptTokenId("UNZIP", "linux_command", 66),
            new ShellScriptTokenId("VIM", "linux_command", 67),
            new ShellScriptTokenId("WGET", "linux_command", 68),
            new ShellScriptTokenId("WHATIS", "linux_command", 69),
            new ShellScriptTokenId("WHEREIS", "linux_command", 70),
            new ShellScriptTokenId("WHO", "linux_command", 71),
            new ShellScriptTokenId("INTEGER_LITERAL", "literal", 72),
            new ShellScriptTokenId("DECIMAL_LITERAL", "literal", 73),
            new ShellScriptTokenId("HEX_LITERAL", "literal", 74),
            new ShellScriptTokenId("OCTAL_LITERAL", "literal", 75),
            new ShellScriptTokenId("FLOATING_POINT_LITERAL", "literal", 76),
            new ShellScriptTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 77),
            new ShellScriptTokenId("DECIMAL_EXPONENT", "number", 78),
            new ShellScriptTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 79),
            new ShellScriptTokenId("HEXADECIMAL_EXPONENT", "number", 80),
            new ShellScriptTokenId("CHARACTER_LITERAL", "literal", 81),
            new ShellScriptTokenId("STRING_LITERAL", "literal", 82),
            new ShellScriptTokenId("IDENTIFIER", "identifier", 83),
            new ShellScriptTokenId("LETTER", "literal", 84),
            new ShellScriptTokenId("PART_LETTER", "literal", 85),
            new ShellScriptTokenId("LPAREN", "separator", 86),
            new ShellScriptTokenId("RPAREN", "separator", 87),
            new ShellScriptTokenId("LBRACE", "separator", 88),
            new ShellScriptTokenId("RBRACE", "separator", 89),
            new ShellScriptTokenId("LBRACKET", "separator", 90),
            new ShellScriptTokenId("RBRACKET", "separator", 91),
            new ShellScriptTokenId("DLBRACKET", "separator", 92),
            new ShellScriptTokenId("DRBRACKET", "separator", 93),
            new ShellScriptTokenId("SEMICOLON", "separator", 94),
            new ShellScriptTokenId("COMMA", "separator", 95),
            new ShellScriptTokenId("DOT", "separator", 96),
            new ShellScriptTokenId("ASSIGN", "operator", 97),
            new ShellScriptTokenId("LT", "operator", 98),
            new ShellScriptTokenId("BANG", "operator", 99),
            new ShellScriptTokenId("TILDE", "operator", 100),
            new ShellScriptTokenId("HOOK", "operator", 101),
            new ShellScriptTokenId("COLON", "operator", 102),
            new ShellScriptTokenId("EQ", "operator", 103),
            new ShellScriptTokenId("LE", "operator", 104),
            new ShellScriptTokenId("GE", "operator", 105),
            new ShellScriptTokenId("NE", "operator", 106),
            new ShellScriptTokenId("SC_OR", "operator", 107),
            new ShellScriptTokenId("SC_AND", "operator", 108),
            new ShellScriptTokenId("INCR", "operator", 109),
            new ShellScriptTokenId("DECR", "operator", 110),
            new ShellScriptTokenId("PLUS", "operator", 111),
            new ShellScriptTokenId("MINUS", "operator", 112),
            new ShellScriptTokenId("STAR", "operator", 113),
            new ShellScriptTokenId("SLASH", "operator", 114),
            new ShellScriptTokenId("BIT_AND", "operator", 115),
            new ShellScriptTokenId("BIT_OR", "operator", 116),
            new ShellScriptTokenId("XOR", "operator", 117),
            new ShellScriptTokenId("REM", "operator", 118),
            new ShellScriptTokenId("LSHIFT", "operator", 119),
            new ShellScriptTokenId("PLUSASSIGN", "operator", 120),
            new ShellScriptTokenId("MINUSASSIGN", "operator", 121),
            new ShellScriptTokenId("STARASSIGN", "operator", 122),
            new ShellScriptTokenId("SLASHASSIGN", "operator", 123),
            new ShellScriptTokenId("ANDASSIGN", "operator", 124),
            new ShellScriptTokenId("ORASSIGN", "operator", 125),
            new ShellScriptTokenId("XORASSIGN", "operator", 126),
            new ShellScriptTokenId("REMASSIGN", "operator", 127),
            new ShellScriptTokenId("LSHIFTASSIGN", "operator", 128),
            new ShellScriptTokenId("RSIGNEDSHIFTASSIGN", "operator", 129),
            new ShellScriptTokenId("RUNSIGNEDSHIFTASSIGN", "operator", 130),
            new ShellScriptTokenId("ELLIPSIS", "operator", 131),
            new ShellScriptTokenId("BAD_QUOTE", "operator", 132),
        });

        idToToken = new HashMap<>();
        for (ShellScriptTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized ShellScriptTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }
        return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<ShellScriptTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }
        return tokens;
    }

    @Override
    protected synchronized Lexer<ShellScriptTokenId> createLexer(LexerRestartInfo<ShellScriptTokenId> info) {
        return new ShellScriptLexer(info);
    }

    @Override
    protected String mimeType() {
        return ShellScriptLanguage.MIME_TYPE;
    }
}
