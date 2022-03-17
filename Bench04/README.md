# Bench04

### Bench04

   * Description: 

### Run

```
sh execute.sh
```

Or: 

```
mvn -am

cd spark/
mvn clean test -pl core -am
cd ..
```

### Scripts

   * download.sh: download all projects (should not be used. It only serves to show the commands used)
   * build.sh: initial build of all projects (only used the first time, to install the dependencies)
   * execute.sh: test the projects 