# Overview of JUnit

- JUnit is a testing framework for the Java programming language and it has been important in the development of test-driven projects.
- JUnit is an open source Unit Testing Framework for the Java Programming Language.
- JUnit test is a method contained in a class (called Test class) which is used only for testing. 
- To define that a certain method is a test method, use the @Test annotation.

# Integrate JUnit with a Maven Build
> junit-jupiter-api (version 5.4.2) is used in this tutorial
- To integrate JUnit within the Maven build is neccessary to add certain dependencies to the *POM* file.
```
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.4.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.4.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
- Next we need to add *Maven Surefire Plugin* which provides test results in a .txt format
- Open the POM file and add the code below

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.1</version>
        </plugin>
    </plugins>
</build>
```
- To ensure that the testing will work it is important to name the testing class one of the following:
1. Test.
2. Tests.
3. TestCase.

- The last step is to add code that will perform the test.

```
import org.junit.jupiter.api.Test;
 
class JUnit5ExampleTest {
 
    @Test
    void justAnExample() {
 
    }
}
```

[Follow this link for the complete tutorial](https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-running-unit-tests-with-maven/)

