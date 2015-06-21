# Java Challenges

OO and algorithm challenges in Java.

## Setup

Make sure you have gradle installed:

```
brew update
brew install gradle
```

Configure the gradle build daemon, for faster builds:

```
touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties
```

## Running tests

Run all tests with:

```
gradle test
```

Run a single test with:

```
gradle test --tests challenges.MathServiceTest
```

## Resources

* https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_test
