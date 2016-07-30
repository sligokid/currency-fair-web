# trade-engine-web [![Build Status](https://travis-ci.org/sligokid/trade-engine-web.svg?branch=develop)](https://travis-ci.org/sligokid/trade-engine-web)
Spring Boot microservice web frontend rendering reports (2016)

## Table of Contents
  - [Introduction](#introduction)
  - [Overview](#overview)
  - [Architecture](#architecture)
  - [Demo](#demo)
  - [Install](#install)

## Introduction

## Overview

## Architecture

![web-diagram](https://cloud.githubusercontent.com/assets/6519496/17114720/09428b46-52a8-11e6-9622-3b5f8d85ffca.png)

## Demo

http://ec2-52-16-13-114.eu-west-1.compute.amazonaws.com:8100/

<img width="1375" alt="preview-web" src="https://cloud.githubusercontent.com/assets/6519496/17103716/9b9b08b4-5277-11e6-8cd3-5279b9f5ee02.png" style="max-width:100%;">

### 3rd Pary APIs
- Google Maps API https://google-developers.appspot.com/maps/
- Google Charts API https://google-developers.appspot.com/chart/
- Heatmap.js by https://www.patrick-wied.at/static/heatmapjs/

#Install

``` bash
   $ git clone https://github.com/sligokid/trade-engine-web.git
   $ cd trade-engine-web
   $ mvn clean package
   $ mvn spring-boot:run
```
