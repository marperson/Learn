# Sprint boot demo
Springboot application with Anuglar static file in resource/static folder, use one tomcat instead of tomcat + nginx server
Check sample Anuglar code in Learn/Angular/springboot-with-angular folder which generates this static code

check this reference:
https://www.baeldung.com/spring-boot-angular-web
https://stackoverflow.com/questions/53854541/how-to-package-angular-project-with-springboot-application

**to run:**
```bash
./gradlew bootRun
```

open browser:
Frontend: http://localhost:8081
Backend: http://localhost:8081/hello

**API endpoint:**
http://localhost:8081/hello?name=Amy

## Simple springboot application - HelloWorld
This is a simple sprintboot application follows offcial guide https://spring.io/quickstart

1. Bootstrap project with SpringBoot initializer http://start.spring.io/