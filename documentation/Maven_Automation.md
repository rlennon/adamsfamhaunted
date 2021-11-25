# Build Automation 

- Maven helps automate the build process of a given project and their dependencies.
- Built operations start on the dependencies when the main project build is successful.  
- Maven Build automation ensures the project dependencies are stalbe.
 


# Example of Using Build Automation
 
Build automation can be used when we have a central *apiProject* where we have two other projects that depend on the on this *apiProject*. So lets say if we have project called a *webGUI* when we go to build this project maven will also build *apiProject*.

# Impleenting a depencney
- In the *POM* of the *webGUI* append this.


```
<dependency>
         <groupId>apiProject</groupId>
         <artifactId>apiProject</artifactId>
         <version>1.0-SNAPSHOT</version>
         <scope>system</scope>
         <systemPath>{basedir}apiProject\target\apiProject-1.0-SNAPSHOT.jar</systemPath>
      </dependency>

```

When the team of *webGUI*  project requires that the project gets built when the *apiProject* changes. To kick of the build this there is two methods of approach

- Using a CI server such as Jekines to auotmate the builds.

- Add a build goal to the *apiProject* pom file.


# Updating apiProject Pom.xml

```
<build>
    <plugins>
        <plugin>
        <artifactId>maven-invoker-plugin</artifactId>
        <version>1.6</version>
        <configuration>
        <debug>true</debug>
        <pomIncludes>
            <pomInclude>webGui/pom.xml</pomInclude>
        </pomIncludes>
        </configuration>
        <executions>
        <execution>
            <id>build</id>
            <goals>
                <goal>run</goal>
            </goals>
        </execution>
        </executions>
        </plugin>
      </plugins>
   <build>

```


# Command to Build Project and Dependencies

```
mvn clean package -U 
```



