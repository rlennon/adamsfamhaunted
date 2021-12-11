


#  Dependency Check 

The Dependency Check tool can be used as a plugin for Maven to detect vulnerabilities that are publicly disclosed. Dependency Check will check for vulnerable software contained inside the dependencies. It checks a given dependency for a Common Platform Enumeration (CPE), if detected the plugin will generate a report linking to the corresponding CVE entry. Dependency-Check also can be accessed via the command line interface (CLI). Dependency Check consists of an array of analyzers that scans the dependencies. Dependency check also updates automatically using NVD data feeds, which are CVE entries in a database format that are hosted on NIST. Dependency Check also works with Jenkins via a plugin, Internet access is also required because of the periodic updating of the vulnerability database. Dependency Check does not come with automation built in, it can be run manually or by using an automation add on. The CVE entries contain information about the vulnerability such as known software configuration, solution and tools. But as with all pieces of software there can also be false negatives and false positives due to mismatching of the CPE. Despite this small drawback Dependency Check is a good all round solution for checking vulnerabilities in open source software and requires little effort to integrate into the pipeline. 


# Download dependency Check

The Central Repo on GitHub disscussing Dependency Check Maven the binary releases can be found on the repo's github pagaes. 

[Dependency-Check-Maven](https://github.com/jeremylong/DependencyCheck/tree/master/maven)



# Integrate Dependency Check with Maven 
Open the *POM* file and append the following into the dependencies.

```
<dependency>
  <groupId>org.owasp</groupId>
  <artifactId>dependency-check-maven</artifactId>
  <version>6.5.0</version>
  <type>maven-plugin</type>
</dependency>

```


# Addtional Links

1. [Maven Central Repo Search](https://search.maven.org/artifact/org.owasp/dependency-check-maven/6.5.0/maven-plugin)
2. [Owasp Dependency Check](https://owasp.org/www-project-dependency-check/)
3. [Good Page On Medium](https://medium.com/@rebeccab_16699/owasp-dependency-check-what-it-is-and-how-it-works-ecee62f285da)
 
