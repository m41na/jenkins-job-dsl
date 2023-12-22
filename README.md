# jenkins-job-dsl

Playing with jenkins and maven for Ci/CD automation

>sonar scan using gradle

Include plugin

```bash
plugins {
  id "org.sonarqube" version "4.4.1.3373"
}
```

Execute command 

```bash
./gradlew sonar \
  -Dsonar.projectKey=jenkins-job-dsl \
  -Dsonar.projectName='jenkins-job-dsl' \
  -Dsonar.host.url=http://192.168.1.14:9000 \
  -Dsonar.token=sqp_9166a952ca9ef4d44211a55444ea9f9ce307c9e8
```
