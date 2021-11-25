# Overview of the Selenium Framework 
- Selenium is an open source umbrella project for a range of tolls and libraries aimed at supporting web browser applications.
- Compatible with a number of programming languages including *Python*, *Java*, *C#*, *JavaScript*, *Ruby*.

# Integrate Selenium with Maven Project
- Open the *POM* file and add the following inside the *project* section.


```
<project>
<modelVersion></modelVersion>
   <groupId>Selenium.maven</groupId>
   <artifactId>Name of Project goes here</artifactId>

</project>
```
- Next navigate to this page to find more information under the *downloads* tab - [Selenium](http://docs.seleniumhq.org/download/maven.jsp)
- Add the code below to the *POM* file in the *dependencies* section

```
<dependency>
   <groupId>org.seleniumhq.selenium</groupId>
   <artifactId>selenium-java</artifactId>
   <version>2.42.1</version>
</dependency>
```
- Adding TestNG dependency - [Source](https://testng.org/doc/maven.html)

```
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>6.8</version>
  <scope>test</scope>
</dependency>

```

> After adding and saving the above dependency your Maven Build should now have a folder called *Maven Dependencies*

- The last step is to create a testing class
> The example below is just for illustration and to perform specific tests is recommended to refer to the Selenium Official Documentation
- [Selenium Official Documentation](https://www.selenium.dev/documentation/)

- Example code

```
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class Testfacebook {
 
@Test
public void TestFireFox(){
 
	WebDriver driver=new FirefoxDriver();
 
	driver.manage().window().maximize();
 
	driver.get("http://www.facebook.com");
 
	driver.quit();
 
	}
 
}

```

[Link to the Full Tutorial](https://learn-automation.com/maven-integration-with-selenium/)