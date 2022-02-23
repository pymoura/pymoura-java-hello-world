## pymoura-java-hello-world
***
Simple repository to learn how to use maven and CI systems.

### Requirements
1. Java 8
2. Maven 3.8.4
3. Docker 20.10.12

### Runtime Instructions
1. Clone the repo and change directories to the root folder
   ```
   git clone ...
   cd pymoura-java-hello-world/
   ```
1. Run `mvn clean package` to compile a jar with dependencies
2. run ` java -jar target/pymoura-java-hello-world-1.0-SNAPSHOT-jar-with-dependencies.jar` the output
should be a hello world JSON object e.g.`{"hello":"world"}`
   
### Docker Instructions
1. Clone the repo and change directories to the root folder
   ```
   git clone ...
   cd pymoura-java-hello-world/
   ```
2. Run `docker build -t pymoura/java-hello-world .`
3. Run `docker run pymoura/java-hello-world`
4. Results should also be JSON object e.g. `{"hello":"world"}`

### CI/CD
1. Open feature branch and open PR when happy with changes
2. Get PR approved by team
3. Merge PR to main and trigger automated build with CircleCI
4. Navigate to CircleCI

### To Do
1. Integrate remote Docker repository
2. Integrate remote binary repository
3. Deploy to server on cloud