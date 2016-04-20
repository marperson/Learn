@echo off

set X=
for /f "skip=1 delims=" %%x in ('wmic os get localdatetime') do if not defined X set X=%%x

set DATE.YEAR=%X:~0,4%
set DATE.MONTH=%X:~4,2%
set DATE.DAY=%X:~6,2%
set DATE.HOUR=%X:~8,2%
set DATE.MINUTE=%X:~10,2%
set DATE.SECOND=%X:~12,2%
set logfile=%DATE.YEAR%%DATE.MONTH%%DATE.DAY%_%DATE.HOUR%%DATE.MINUTE%%DATE.SECOND%.log.txt

ant -l ".\nightlyLogs\%logfile%" sp.all