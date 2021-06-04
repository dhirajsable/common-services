#!/bin/bash

./gradlew clean classes build
docker-compose up --build