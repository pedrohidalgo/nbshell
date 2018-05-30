## Shell Scripts file support on NetBeans IDE

*   Syntax Highlighting
*   Simple autocompletion
*   Run Script File

#### Note:

Currently no environment variable exists when executing the file with Right Click "Run File" context menu option. So if you need an environment variable be sure to set it up at the beginning of the Execution like below:

```shell
echo "Starting to do something"
export PATH=/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
....
echo "finished ..."
```
