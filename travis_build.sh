#!/bin/bash
set -ev
if [ "$WITH_COVERALLS" == "true" ];
then
  mvn -f com.example.proveCI/pom.xml clean verify -Pjacoco coveralls:report;
elif [ "${TRAVIS_PULL_REQUEST}" != "false" ]; then
  mvn -f com.example.proveCI/pom.xml clean verify;
fi
