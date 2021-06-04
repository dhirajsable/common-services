#!/bin/bash

echo This script is going to delete all docker images from system. Do you want to proceed ?
read input
if [ $input == 'yes' ] || [ $input == 'YES' ] || [ $input == 'Yes' ]
then
    docker kill $(docker ps -q)
    docker rm $(docker ps -a -q)
    docker rmi $(docker images -q)
else
  docker images
fi