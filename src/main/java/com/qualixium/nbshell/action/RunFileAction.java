/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualixium.nbshell.action;

import com.qualixium.nbshell.ShellScriptDataObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.netbeans.api.extexecution.ExecutionDescriptor;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.api.extexecution.ExternalProcessBuilder;
import org.openide.LifecycleManager;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.qualixium.nbshell.action.RunFileAction"
)
@ActionRegistration(
        displayName = "#CTL_RunFileAction"
)
@ActionReference(path = "Loaders/text/sh/Actions", position = 210, separatorAfter = 250)
@Messages("CTL_RunFileAction=Run File")
public final class RunFileAction implements ActionListener {

    private final ShellScriptDataObject context;

    public RunFileAction(ShellScriptDataObject context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        FileObject fileObject = context.getPrimaryFile();
        String fileDisplayName = FileUtil.getFileDisplayName(fileObject);

        ExecutionDescriptor descriptor = new ExecutionDescriptor()
                .frontWindow(true)
                .showProgress(true)
                .inputVisible(true)
                .controllable(true)
                .preExecution(() -> {
                    try {
                        Runtime.getRuntime().exec("chmod +x " + fileDisplayName).waitFor();
                    } catch (IOException | InterruptedException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    
                    LifecycleManager.getDefault().saveAll();
                });

        ExternalProcessBuilder processBuilder = new ExternalProcessBuilder(fileDisplayName);

        ExecutionService service = ExecutionService.newService(
                processBuilder, descriptor, fileDisplayName);

        service.run();
    }
}
