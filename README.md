To be able to run the project, we must install maven to download the dependencies and have MySQL installed on the computer.

Configure environment variables in the application.properties file:
spring.datasource.url=jdbc:mysql://localhost:3306/perfect_number
spring.datasource.username=root
spring.datasource.password=1234
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

and run AtividadeApplication
