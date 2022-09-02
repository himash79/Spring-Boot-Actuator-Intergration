# Spring-Boot-Actuator-Intergration
Build Restful web service using Spring Boot as well as Monitoring web service Status, Health, Loggers using Actuator.

## Requirements

01) Java 1.8
02) Maven 3.8
03) MongoDB

## Project setup

01) Clone the project

		git clone https://github.com/himash79/Spring-Boot-Actuator-Intergration.git

02) Create MongoDB Database

		Create database import attached query data to table and refer the `instructions` file.

03) Clean and build the project using maven

		open command line (CMD) in project directory and execute 'mvn clean install'
		
04) Open project using intelij / eclipse

05) Set up database configurations in application.properties file
		
		spring.data.mongodb.database = Developer database name
		
06) Monitor the web service components
