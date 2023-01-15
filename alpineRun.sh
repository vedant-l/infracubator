#!/bin/bash

# Author: Vedant L Iyangar
# Date Created: 11-01-2023
# Last Modified: 11-01-2023
# Description: Description
# Usage: How to use

docker build -f alpine/Dockerfile.alpine -t vedant/my-alpine alpine/. || echo "Build Failed: Alpine"

# docker build -f maven/Dockerfile.maven -t vedant/maven maven/. || echo "Build Failed: MVN"
docker build -f npm/Dockerfile.npm -t vedant/npm npm/. || echo "Build Failed: NPM"

# docker run -it vedant/my-alpine
# docker run -it vedant/maven
docker run -it vedant/npm
