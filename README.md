# SchedulePredict

This is an application that can be used to predict the delays of the forthcoming flights based on their flight numbers.
Technologies used in this project are <br/>
	1.  Java 7<br/>
	2.  Oracle 10g and above<br/>
	3.	Spring Framework<br/>
	4.	Hibernate ORM tool<br/>
	5.	Twitter Bootstrap framework.<br/>
	

To start using this application, please follow the below steps.

	1.  Build the WAR file by updating the properties file as stated below.
	2.	Make these changes in the database.properties file located at res/datasource/database.properties
			1.	update the database.url (For Example: jdbc:oracle:thin:<username>@//localhost:1521/xe)
			2.	update the username and password in the database.user and database.password fields 				respectively.
	3.	Deploy the application into the Tomcat or any other Server(Jboss, Jetty etc...) that hosts a 		JVM container.
	4.  Access the application at the url: http[s]://<hostname>:<port>/SchedulePredict/app
	
Cheers!!!
