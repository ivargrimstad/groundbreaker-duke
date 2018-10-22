#!/bin/bash

cd dukes-stone-processor
mvn clean package -Pthorntail
mvn clean package -Pliberty
mvn clean package docker:build -Ppayara
mvn clean package docker:build -Ptomee

cd ../dukes-stone-processor-jar
mvn clean package -Phelidon
mvn clean package -Pkumuluz

cd ..