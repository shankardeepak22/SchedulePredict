# SchedulePredict

This is an application that can be used to predict the delays of the forthcoming flights based on their flight numbers.
Technologies used in this project are <br/>
	1.	Spring Framework
	2.	Hibernate ORM tool
	3.	Oracle XE database
	4.	Twitter Bootstrap framework.

To start using this application, please follow the below steps.

	1.	This project need Java 7. So, please make sure that you have Java 7 configured in your system.
	2.	Make sure you have a running instance of Oracle database. (Recommended version is 10g or above).
	3.	Also, make sure you have Tomcat server instance configured for hosting the applications.
	3.	Configure your classpath to include all the dependency libraries that are in the WEB-INF/lib directory.
	3.	Make these changes in the database.properties file located at res/datasource/database.properties
			1.	update the database.url to point to your running instance of the Oracle Database.
			2.	update the username and password in the database.user and database.password file respectively.
	4.	Build the application into a WAR file.
	5.	Deploy the application into the Tomcat container.
	6. Access the application at the url: http[s]://<hostname>:<port>/SchedulePredict
