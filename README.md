# Technical Documentation - Interest Restriction Return (IRR) Service Guide

## Overview

This repository contains the source files that are used to generate the [Interest Restriction Return (IRR) end-to-end service guide](https://developer.service.hmrc.gov.uk/guides/irr-api-end-to-end-service-guide) on the HMRC Developer Hub.

## Editing Service Guide pages

Template files are located in `./source/documentation`. All pages are written in [Markdown](https://en.wikipedia.org/wiki/Markdown).

To add new pages simply copy and paste one of the existing pages, it will automatically appear in the menu.

## Previewing

#### Option 1 - Using Docker (recommended)

Requirements:
* [Docker](https://www.docker.com/)

To live preview:
```
./batect preview
```
The local URL and port where the files can be previewed will be output, this is normally http://localhost:4567.

NB: The first time this is run it builds the Docker image and installs dependencies so may take 5 mins.
Subsequent runs will be much quicker.

#### Option 2 - Local install (not recommended)

Requirements:
* [Ruby Version Manager](https://github.com/rbenv/rbenv)
* [Node Version Manager](https://github.com/nodenv/nodenv)

To live preview:
```
bundle install
bundle exec middleman serve
```
The local URL and port where the files can be previewed will be output, this is normally http://localhost:4567.

## Running the Scala Application

Requirements:
* Scala/sbt

### Build the HTML files
```
./batect build
```
### Run the Scala Application
```
sbt run
```

The local URL and port where the files can be previewed will be output, this is normally http://localhost:9000/guides/irr-api-end-to-end-service-guide/.

## Updating the Ruby Gems

To update the Ruby Gems to the latest versions, run
```
./batect update
```
This will update the `Gemfile.lock`

## Updating the Ruby version

Edit `.ruby-version` with the required version of Ruby.

## Updating the Node version

Edit `.node-version` with the required version of Node. Also, ensure that the version you specify in `.node-version` is the same as what is in the [build job](https://github.com/hmrc/build-jobs/blob/main/jobs/live/ddcelsIRR.groovy#L51).

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
