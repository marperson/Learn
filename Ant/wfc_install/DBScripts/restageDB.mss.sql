use Master;

-- overlay the db
exec kron_overlay ${DEFAULT_DB_OR_SID_NAME}, '${actual.file}';