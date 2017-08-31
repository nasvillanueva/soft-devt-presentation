## Build Tools

*or Build Automation Tools*




> Build automation is the process of automating the creation 
> of a software build and the associated processes including: 
> compiling computer source code into binary code, packaging 
> binary code, and running automated tests.
>
> &mdash; <cite>[Build Automation (Wikipedia)](https://en.wikipedia.org/wiki/Build_automation)</cite>




### What we (or most people) use

- [Apache Maven](https://maven.apache.org/)
- [Gradle](https://gradle.org/)

<br>

### Alternatives

- [Apache Ant](http://ant.apache.org/) with [Apache Ivy](http://ant.apache.org/ivy/)





## How to use it?

### Maven
```bash
# 1. Install Maven
# 2. Create Project Structure and pom.xml file
# 3. Code
# 4. Execute this command:
$ mvn clean install
```
### Gradle
```bash
# 1. Install Gradle
# 2. Create Project Structure and build.gradle file
# 3. Code
# 4. Execute this command:
$ gradle clean build
```




## Why Use it?

- Downloads all of the dependencies of your project
- Prevents version inconsistencies between developers
- Whole Build process with only one execution