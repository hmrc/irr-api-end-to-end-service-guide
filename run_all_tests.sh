#!/usr/bin/env bash

sbt scalafmtAll clean compile test dependencyUpdates
