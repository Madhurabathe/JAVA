Build and Run

Prerequisites:
- Java JDK installed and `javac`/`java` on PATH.

From project root (D:\java project):

1) Build (Windows):

```
build.bat
```

This compiles all .java files into `bin/` and produces `employee-app.jar`.

2) Run the packaged application:

```
java -jar employee-app.jar
```

Or run the main class directly:

```
javac employee\*.java
java employee.employemenu
```

Notes:
- The jar's Main-Class is `employee.employemenu` (login: admin / 1234).
- If compilation fails, run `javac` manually to see errors.