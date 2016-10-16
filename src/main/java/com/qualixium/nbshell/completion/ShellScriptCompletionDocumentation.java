package com.qualixium.nbshell.completion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;

public class ShellScriptCompletionDocumentation implements CompletionDocumentation {

    private final ConfigurationItem item;

    public ShellScriptCompletionDocumentation(ConfigurationItem item) {
        this.item = item;
    }

    @Override
    public String getText() {
        return item.documentation;
    }

    @Override
    public URL getURL() {
        if (item.url != null && !item.url.isEmpty()) {
            try {
                return new URL(item.url);
            } catch (MalformedURLException ex) {
            }
        }

        return null;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }
}
