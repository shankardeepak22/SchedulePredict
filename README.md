# SchedulePredict

This is an application that can be used to predict the delays of the forthcoming flights based on their flight numbers.
Technologies used in this project are <br/>
	1.  Java 7
	2.  Oracle 10g and above
	3.	Spring Framework
	4.	Hibernate ORM tool
	5.	Twitter Bootstrap framework.
	

To start using this application, please follow the below steps.

	1.  Import WAR file.
	2.  File -> Import WAR File -> Choose the WAR from zip file.
	3.	Configure build path to include all the dependency libraries that are in the  WEB-INF/lib directory.
	4.	Make these changes in the database.properties file located at res/datasource/database.properties
			1.	update the database.url (For Example: jdbc:oracle:thin:CSCI620@//localhost:1521/xe)
			2.	update the username and password in the database.user and database.password file respectively.
	6.	Deploy the application into the Tomcat container.
	7.  Access the application at the url: http[s]://<hostname>:<port>/SchedulePredict
