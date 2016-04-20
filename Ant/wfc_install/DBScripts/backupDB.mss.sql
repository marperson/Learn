USE Master;
GO
BACKUP DATABASE ${DEFAULT_DB_OR_SID_NAME}
TO DISK = '${db.backup.path}\${db.backup.file}'
GO	
