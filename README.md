# Backend For PerfectNumberProject

- Java version: `21.0.2`
- Maven version: `3.6.3` 

To be able to run the project, we must install maven to download the dependencies and have MySQL installed on the computer.

Configure environment variables in the application.properties file:
- `spring.datasource.url=jdbc:mysql://localhost:3306/perfect_number`
- `spring.datasource.username=root`
- `spring.datasource.password=1234`
- `spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`
- `spring.jpa.hibernate.ddl-auto=update`
- `spring.jpa.show-sql=true`

and run AtividadeApplication

# Routes

- `/numbers/verify`: Checks whether the number is a perfect number or not
- `/numbers/range`: Checks all perfect numbers between two numbers

