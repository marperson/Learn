These ant scripts will allow you to easily install/uninstall wfc
and also overlay databases and run SQL scripts.

Pre-requisites:
1. You must have version 1.8.x of Ant to run these scripts. You can 
download Ant binaries from ant.apache.org. See the QA Environment setup document 
on Sharepoing for more details on installing Ant.

https://collaborate.kronos.com/sites/wfm/ProductEngineering/scheduling/WFS/Shared%20Documents/Forms/AllItems.aspx?RootFolder=%2Fsites%2Fwfm%2FProductEngineering%2Fscheduling%2FWFS%2FShared%20Documents%2FEnvironment%20Setup

2. Note that if you run JTF tests on your local machine, you will need to copy additional
jars into ANT_HOME/lib. Copy all the files in \\kvsca-qmfile01\WFC\DevTools\Ant.&.Extensions\Extensions to
ANT_HOME/lib

3. If you run a local instance of SQL Server, you will need to install some stored procedures
so that the scripts can overlay your database. See section 9 of the document at https://collaborate.kronos.com/sites/wfm/ProductEngineering/sat/User%20Documents/manualTestServerSetup-WIN.doc for instructions.

Instructions:
1. Copy server.properties to YOUR_MACHINE_NAME.properties. If you're not sure about your machine name
open a command prompt to the wfc_install directory and type "ant". It will tell you the name of the file.

2. Open YOUR_MACHINE_NAME.properties in a text editor like notepad++. Edit the values in the file
to tell the scripts where the binaries to install are located, what database to use and which database scripts to run.

3. When YOUR_MACHINE_NAME.properties has been configured, open a command prompt to the wfc_install
directory and type "ant". A list of Ant targets will be displayed, along with some description of what they do.

4. Type "ant all" to do a complete uninstallation, installation and database overlay.

Suggestions:

In order to receive the latest and greatest code, please always do an accurev update prior to launching the script.
This can be accomplished by creating a batch script with the following lines:

call accurev update
run.bat

Note that you may want to create a dedicated workspace for wfc_install so that the scope of the update command 
is small and it can execute quickly.

