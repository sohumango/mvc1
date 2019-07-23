#!/bin/bash

function deploy()
{
    server=mango@jcent.local
    if mvn clean package -DskipTests war:war; then
        scp target/mvc1.war $server:mvc1.war
        ssh $server "sudo cp -f mvc1.war /opt/tomcat/webapps; sudo systemctl restart tomcat"
    fi
}

if [ ! -f "./pom.xml" ]; then
    echo not find pom.xml file, please goto jcb_server
else
    echo build jcb_server by maven
    # mvn package war:war -DskipTests
    deploy
fi