#!/bin/bash
#
# Start script for filing-notification-sender
#
PORT=8080

exec java -jar -Dserver.port="${PORT}" "filing-notification-sender.jar"
