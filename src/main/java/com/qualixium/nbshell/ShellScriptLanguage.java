package com.qualixium.nbshell;

import com.qualixium.nbshell.lexer.ShellScriptTokenId;
import javax.swing.ImageIcon;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.openide.util.ImageUtilities;

@LanguageRegistration(mimeType = ShellScriptLanguage.MIME_TYPE)
public class ShellScriptLanguage extends DefaultLanguageConfig {
    public static final String MIME_TYPE = "text/sh";
    public static final String COMMENT_SYMBOL = "#";
    @StaticResource
    public static final String ICON_STRING_BASE = "com/qualixium/nbshell/sh_icon.png";
    public static final ImageIcon IMAGE_ICON = new ImageIcon(ImageUtilities.loadImage(ICON_STRING_BASE));

    @Override
    public Language getLexerLanguage() {
        return ShellScriptTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "Shell Script File";
    }
    
    @Override
    public String getLineCommentPrefix() {
        return COMMENT_SYMBOL;
    }
}