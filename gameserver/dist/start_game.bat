@echo off
title Game Server
echo Starting JTS GameServer.
echo.
REM Protected build
REM java -version:1.7 -server -Xbootclasspath/p:./loader.jar -Dfile.encoding=UTF-8 -Xms512m -Xmx1024m -cp config;./* ru.jts.gameserver.GameServer
java -version:1.7 -server -Dfile.encoding=UTF-8 -Xms512m -Xmx1024m -cp config;./* ru.jts.gameserver.GameServer

pause