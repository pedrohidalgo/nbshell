package com.qualixium.nbshell.lexer;

import com.qualixium.nbshell.jcclexer.JavaCharStream;
import com.qualixium.nbshell.jcclexer.JavaParserTokenManager;
import com.qualixium.nbshell.jcclexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ShellScriptLexer implements Lexer<ShellScriptTokenId> {

    private LexerRestartInfo<ShellScriptTokenId> info;
    private JavaParserTokenManager javaParserTokenManager;

    ShellScriptLexer(LexerRestartInfo<ShellScriptTokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());
        javaParserTokenManager = new JavaParserTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<ShellScriptTokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();
        if (info.input().readLength() < 1) {
            return null;
        }
        return info.tokenFactory().createToken(ShellScriptLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
