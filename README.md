# SpringBootAngularjsDemo
Basic project for understanding spring boot and it's integration with Angularjs, With Embedded Web Service having CURD operations
Added Live relaod (hot swapping) using DevTools

SpringBootSpring module which provides RAD (Rapid Application Development) feature to Spring framework.
It is used to create stand alone spring based application that you can just run because it needs very little spring configuration.
Spring Boot does not generate code and there is absolutely no requirement for XML configuration.
It uses convention over configuration software design paradigm that means it decrease the effort of developer.
ADV:

	* Create stand-alone Spring applications that can be started using java -jar.
	* Embed Tomcat, Jetty or Undertow directly. You don't need to deploy WAR files.
	* It provides opinionated 'starter' POMs to simplify your Maven configuration.
	* It automatically configure Spring whenever possible.
	* It provides production-ready features such as metrics, health checks and externalized configuration.
	* Absolutely no code generation and no requirement for XML configuration.


What is AutoConfigration ? ->  configure all interdependent beans on the basis of dependencies present in pom
i.e frameworks present on classpath and existing configuration for the application
example-> is add spring mvc in pom-> spring boot will auto configure dispatcher servlet, view resolver etc.

embedded server ? -> tomcat bind with war, so direct deploy on Linux machine having only java

for monitoring it provides Actuator
add entry to pom for acutator and hal browser

Access url-> localhost:port/actuator/index.html#/actuator

application.properties -> 

//to access all metrics you need all access from spring security so better disable it on dev
management.security.enabled=false

AutoRead Class files- > (one option is springLoaded http://blog.netgloo.com/2014/05/21/hot-swapping-in-spring-boot-with-eclipse-sts/) 

easiest to configure
DevTools-> auto reload for advance hot swapping as default hot swapping has limitations

just add dependency entry in pom.xml

it will work out of the box if any issues try adding below
Application.properties
spring.devtools.livereload.enabled=true
