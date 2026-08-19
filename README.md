# notification

This project demonstrates usage of 
  spring boot,
  REST API,
  Web app,
  logging cofiguration (usage of logger),
  error page configuration.

It's gradle based project.


Initial Spring boot Code is generated from below site:

**https://start.spring.io/**


Below JDK Version is Used:

**17.0.12**


Below Gradle version is used:

**9.7.0**


Below Eclipse IDE for Enterprise Java and Web Developers is used for development:

**Version: 2026-06 (4.40.0)
Build id: 20260604-0653**

Below Git Bash is used for develoment:
**Git-2.55.0.4-64-bit**

Once you install JDK, Gradle, GIT on your machine, check version of each software using below commands in command prompt:

java -version

gradle -version

git --version



**How to run this application:**

From Eclipse, select below class (contains main() method). Right click this class and select **Run As -> Java Application**.

com.pt.notification.NotificationApplication

------------------------------------------------------------------------------------------------------------------------------
**Running API URL:**
Once you run this spring boot application within Eclipse, you can test using below API URL's from Browser:

http://localhost:8080/greet

http://localhost:8080/greet?name=Amit


Below will be output for URL **http://localhost:8080/greet**

**Good Morning Ashutosh**


Below will be output for URL **http://localhost:8080/greet?name=Amit**

**Good Morning Amit**

---------------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------------
**Running Web Application URL:**
Once you run this spring boot application within Eclipse, you can test using below web application URL's from Browser:

http://localhost:8080/index

http://localhost:8080/welcome


Below will be output for URL **http://localhost:8080/index**

**index.html file output will be displayed on the browser**


Below will be output for URL **http://localhost:8080/welcome**

**welcome.html file output will be displayed on the browser**

---------------------------------------------------------------------------------------------------------------------------------

**Logging Information:**

You need to create below folder. This logging folder path is defined in application.properties (under src/main/resources folder).

**C://notification//logs**

**notification.log** will be created in above folder. This log file will contain all debug, info, error etc messages written by the application.
