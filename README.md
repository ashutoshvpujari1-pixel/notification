# notification

This project demonstrates usage of 

  spring boot,

  REST API,
  
  Web app,
  
  logging cofiguration (usage of logger),
  
  security for authentication,
  
  error page configuration.


It's Spring Boot Gradle based project.


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



------------------------------------------------------------------------------------------------------------------------------

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

---------------------------------------------------------------------------------------------------------------------------------

Once application is running, we can access the following URL's to check health, metrics of application (this feature is implemented using Spring Actuator) 

http://localhost:8080/actuator: The base path discovery page that displays all available endpoints.

http://localhost:8080/actuator/health: This URL Shows basic application status (UP, DOWN).

http://localhost:8080/actuator/metrics: This URL lists available system and application performance metrics (e.g., JVM memory, CPU usage).

http://localhost:8080/actuator/metrics/system.cpu.count: This URL fetches details for a specific individual metric.

http://localhost:8080/actuator/info: Displays the custom metadata specified in your properties file.

---------------------------------------------------------------------------------------------------------------------------------

Added ApplicationStartupController. In this class, run method, you can implement application start up related logic
that needs to be executed after start of server.

---------------------------------------------------------------------------------------------------------------------------------

How to invoke Employee JPA implementation REST API URLs to test (using RestMan tool):

POST: (select POST in RestMan)
http://localhost:8080/api/employees
Content-Type	application/json
{
    "id": 103,
    "name": "Anil",
    "department": "IT",
    "salary": 75000
}


GET:  (select GET in RestMan)
For getting all employees details:
http://localhost:8080/api/employees

For getting single employee details:
http://localhost:8080/api/employees/101


DELETE: (select DELETE in RestMan)
http://localhost:8080/api/employees/101

PUT: (select PUT in RestMan)
http://localhost:8080/api/employees/103
Content-Type	application/json
{
    "id": 103,
    "name": "Anil Kumar",
    "department": "IT",
    "salary": 77000
}

----------------------------------------------------------------------------------------------------------------------------
To invoke Employee pages to add, show employee records, update record, delete record call below URL's from your brower.
http://localhost:8080/employee-add.html
http://localhost:8080/employee-list.html
http://localhost:8080/employee-update.html
http://localhost:8080/employee-delete.html

----------------------------------------------------------------------------------------------------------------------------
If profile is configured as dev, then test using below URL:
http://localhost:8081/environment

If profile is configured as test, then test using below URL:
http://localhost:8082/environment

If profile is configured as prod, then test using below URL:
http://localhost:8083/environment

-------------------------------------------------------------------------------------------------------------------------------

Use below URL to test Spring ai module which invokes open ai LLM
http://localhost:8080/api/ai/chat
