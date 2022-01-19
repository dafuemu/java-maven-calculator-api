# A Java Maven Calculator Web App

A Java calculator web app, build by Maven, CI/CD

# Requirements

Create calculator App

* Sum: sum two numbers and return result
* Subtract: subtract two numbers and return result
* Multiply: multiply two numbers and return result
* Divide: divide two numbers and return result

Create a service to wrap those methods

* Sum: sum two numbers and return result
* Subtract: subtract two numbers and return result
* Multiply: multiply two numbers and return result
* Divide: divide two numbers and return result

Create a REST service to expose those methods with URLs in browser:

- /api/calculator/ping
- /api/calculator/add?x=8&y=26
- /api/calculator/sub?x=12&y=8
- /api/calculator/mul?x=11&y=8
- /api/calculator/div?x=12&y=12

## System requirements

* JDK-11
* Maven 3.8.4

## 1. Manually Build, Test, and Deploy By Maven

### 1.1 Run JUnit Test

Maven execution:

```console
$ mvn clean test
```

Maven wrapper:

```console
$ mvn wrapper:wrapper -Dmaven=3.8.4
```

Execute (linux/macos mvnw or windows mvnw.cmd):

```console
$ ./mvnw clean test
```

### 1.2 Run Integration Test

```console
$ mvn clean integration-test
```

### 1.3  Run Locally

```console
$ mvn jetty:run
[INFO] Started Jetty Server
```

By default, the jetty port is 8080, so you should visit following urls in browser:

- http://localhost:8080/calculator/api/calculator/ping
- http://localhost:8080/calculator/api/calculator/add?x=8&y=26
- http://localhost:8080/calculator/api/calculator/sub?x=12&y=8
- http://localhost:8080/calculator/api/calculator/mul?x=11&y=8
- http://localhost:8080/calculator/api/calculator/div?x=12&y=12

To run in a different port, `mvn jetty:run -Djetty.port=<Your-Port>`.

## 2. Automatically Build and Test

[Github action ci](.github/workflows/ci.yml) step definition:

```yaml
steps:
  # Checks-out your repository under $GITHUB_WORKSPACE, so your job can access it
  - uses: actions/checkout@v2
  # Runs a single command using the runners shell
  - name: Set up JDK 1.11
    uses: actions/setup-java@v2.5.0
    with:
      java-version: '11'
      distribution: 'zulu'
      cache: 'maven'
  - name: Compile
    run: mvn compile
  - name: Test
    run: mvn verify
```

## 3. Containerize Your Web App

### 3.1. Build a docker image using Dockerfile:

```console
$ docker build -t myjetty --no-cache -f Dockerfile .
[+] Building 18.9s (11/11) FINISHED
```

### 3.2. Run docker image locally

```console
$ docker run --rm -p 8080:8080 myjetty
```

> Explain: --rm means delete the container after stopping it.

Access the web app at http://localhost:8080/api/calculator/ping in browser.

Press Control-C to stop and remove the container.

### 3.3. Run docker-compose environment

Define a service to use repository Docker image:

```yaml
version: '3.8'
services:
  calculator:
    build: .
    ports:
      - "8080:8080"
```

Run docker-compose environment:

```console
$ docker-compse up 
```

Access the web app at http://localhost:8080/api/calculator/ping in browser.
