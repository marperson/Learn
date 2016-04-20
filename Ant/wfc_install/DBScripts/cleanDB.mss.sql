use Master;

-- delete the db if it exists
IF EXISTS(SELECT name FROM master.dbo.sysdatabases WHERE name = N'${DEFAULT_DB_OR_SID_NAME}')
BEGIN
	-- close all connections by setting it to single user
	ALTER DATABASE ${DEFAULT_DB_OR_SID_NAME} SET SINGLE_USER WITH ROLLBACK IMMEDIATE 
	WAITFOR DELAY '00:00:02'
	ALTER DATABASE ${DEFAULT_DB_OR_SID_NAME} SET MULTI_USER
	
	-- drop the database
	DROP DATABASE [${DEFAULT_DB_OR_SID_NAME}];
END
