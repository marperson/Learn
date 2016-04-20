load('nashorn:mozilla_compat.js')
importClass(java.io.File);

// query the service and store the result in the temporary file
f = new File(wfcinstall.getProperty("tmp"));
exec = wfcinstall.createTask("exec");
exec.setExecutable("sc.exe");
exec.setOutput(f);
arg = exec.createArg();
arg.setLine("query " + wfcinstall.getProperty("service.name"));
exec.perform();
self.setValue(true);