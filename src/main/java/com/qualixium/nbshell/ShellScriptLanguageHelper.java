package com.qualixium.nbshell;

import com.qualixium.nbshell.completion.ConfigurationItem;
import java.util.ArrayList;
import java.util.List;

public abstract class ShellScriptLanguageHelper {
    
    public static List<ConfigurationItem> getKeys() {
        List<ConfigurationItem> items = new ArrayList<>();
        //Keywords
        items.add(new ConfigurationItem("if", ""));
        items.add(new ConfigurationItem("then", ""));
        items.add(new ConfigurationItem("else", ""));
        items.add(new ConfigurationItem("elif", ""));
        items.add(new ConfigurationItem("fi", ""));
        items.add(new ConfigurationItem("case", ""));
        items.add(new ConfigurationItem("esac", ""));
        items.add(new ConfigurationItem("for", ""));
        items.add(new ConfigurationItem("select", ""));
        items.add(new ConfigurationItem("while", ""));
        items.add(new ConfigurationItem("until", ""));
        items.add(new ConfigurationItem("do", ""));
        items.add(new ConfigurationItem("done", ""));
        items.add(new ConfigurationItem("in", ""));
        items.add(new ConfigurationItem("function", ""));
        items.add(new ConfigurationItem("time", ""));
        items.add(new ConfigurationItem("coproc", ""));
        //Linux commands
        items.add(new ConfigurationItem("cat", "Display file’s contents to the standard output device"));
        items.add(new ConfigurationItem("cd", "Change to directory."));
        items.add(new ConfigurationItem("chmod", "Change a file’s permissions."));
        items.add(new ConfigurationItem("chown", "Change who owns a file."));
        items.add(new ConfigurationItem("clear", "Clear a command line screen/window for a fresh start."));
        items.add(new ConfigurationItem("cp", "Copy files and directories."));
        items.add(new ConfigurationItem("crontab", ""));
        items.add(new ConfigurationItem("date", "Display or set the system date and time."));
        items.add(new ConfigurationItem("df", "Display used and available disk space."));
        items.add(new ConfigurationItem("diff", ""));
        items.add(new ConfigurationItem("du", "Show how much space each file takes up."));
        items.add(new ConfigurationItem("echo", ""));
        items.add(new ConfigurationItem("export", ""));
        items.add(new ConfigurationItem("file", "Determine what type of data is within a file."));
        items.add(new ConfigurationItem("find", "Search for files matching a provided pattern."));
        items.add(new ConfigurationItem("free", ""));
        items.add(new ConfigurationItem("ftp", ""));
        items.add(new ConfigurationItem("grep", "Search files or output for a particular pattern."));
        items.add(new ConfigurationItem("ifconfig", ""));
        items.add(new ConfigurationItem("kill", "Stop a process."));
        items.add(new ConfigurationItem("less", "View the contents of a file one page at a time."));
        items.add(new ConfigurationItem("ln", "Create a shortcut."));
        items.add(new ConfigurationItem("locate", "Search a copy of your filesystem for the specified filename."));
        items.add(new ConfigurationItem("lpr", "Send a print job."));
        items.add(new ConfigurationItem("ls", "List directory contents."));
        items.add(new ConfigurationItem("man", "Display the help information for the specified command."));
        items.add(new ConfigurationItem("mkdir", "Create a new directory."));
        items.add(new ConfigurationItem("mount", ""));
        items.add(new ConfigurationItem("mv", "Rename or move file(s) or directories."));
        items.add(new ConfigurationItem("passwd", "Change the password or allow (for the system administrator) to change any password."));
        items.add(new ConfigurationItem("ping", ""));
        items.add(new ConfigurationItem("ps", "Display a snapshot of the currently running processes."));
        items.add(new ConfigurationItem("pwd", "Display the pathname for the current directory."));
        items.add(new ConfigurationItem("rm", "Remove (delete) file(s) and/or directories."));
        items.add(new ConfigurationItem("rmdir", "Delete empty directories."));
        items.add(new ConfigurationItem("scp", ""));
        items.add(new ConfigurationItem("service", ""));
        items.add(new ConfigurationItem("shutdown", ""));
        items.add(new ConfigurationItem("sort", ""));
        items.add(new ConfigurationItem("ssh", "Remotely log in to another Linux machine, over the network"));
        items.add(new ConfigurationItem("su", "Switch to another user account."));
        items.add(new ConfigurationItem("tail", "Display the last n lines of a file (the default is 10)."));
        items.add(new ConfigurationItem("tar", "Store and extract files from a tarfile (.tar) or tarball (.tar.gz or .tgz)."));
        items.add(new ConfigurationItem("top", ""));
        items.add(new ConfigurationItem("touch", "Create an empty file with the specified name."));
        items.add(new ConfigurationItem("uname", ""));
        items.add(new ConfigurationItem("unzip", ""));
        items.add(new ConfigurationItem("vim", ""));
        items.add(new ConfigurationItem("wget", ""));
        items.add(new ConfigurationItem("whatis", ""));
        items.add(new ConfigurationItem("whereis", ""));
        items.add(new ConfigurationItem("who", "Display who is logged on."));

        return items;
    }

}