To publish to some local maven-compatible artifact storage:
```
scala-cli config publish.credentials my-artifactory env:USER env:PASSWORD --password-value
scala-cli publish -S 3.3.3 .
```
