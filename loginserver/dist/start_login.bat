@echo off
title Login Server
echo Starting JTS LoginServer.
echo.
REM Protected build
java -version:1.7 -server -Dfile.encoding=UTF-8 -Djava.library.path=. -Xms32m -Xmx64m -cp config;./* ru.jts.loginserver.LoginServer

pause