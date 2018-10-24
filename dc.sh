#!/bin/bash

# Script to wrap docker command so that you can run:
# dc thorntail mind

case $1 in
  thorntail)
    docker run -it -p 8100:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:$1
    ;;
  tomee)
    docker run -it -p 8200:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:$1
    ;;
  openliberty)
    docker run -it -p 8300:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:liberty
    ;;
  payara)
    docker run -it -p 8400:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:$1
    ;;
  helidon)
    docker run -it -p 8500:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:$1
    ;;
  kumuluzee)
    docker run -it -p 8600:8080 -e stone=$2 -e quality=5 groundbreakerduke/dukes-stone-processor:kumuluz
    ;;
  *)
    echo "Unknown stone synthesizer"
esac
