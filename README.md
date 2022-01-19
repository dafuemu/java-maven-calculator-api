# A Java Maven Calculator Web App
A Java calculator web app, build by Maven, CI/CD

# Requirements

Create calculator App
* Sum: sum two numbers and return result
* Substract: substract two numbers and return result
* Multiply: multiply two numbers and return result
* Divide: divide two numbers and return result

## System requirements

JDK-11
Maven 3.8.4

## 1. Manualy Build, Test, and Deploy By Maven

### 1.2 Run JUnit Test

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

**TODO**
