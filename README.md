# Parser Combinators Library ![GitHub CI](https://github.com/anlun/parserCombinators/workflows/CI/badge.svg)

A lightweight and flexible parser combinator library written in Kotlin.

## Getting Started

### Using the Library

You can download the latest release JAR from the [Releases](https://github.com/anlun/parserCombinators/releases) page.

Current version: 1.1
- Requires Java 18 or later
- Built with Kotlin 2.1.0

### Building from Source

The project uses Gradle Wrapper, so you don't need to install Gradle separately.

1. Ensure you have JDK 18 or later installed
2. Clone the repository
3. Run one of the following commands:
   ```bash
   # Build the project and run tests
   ./gradlew build

   # Run only tests
   ./gradlew test

   # Generate JAR file (will be in build/libs/)
   ./gradlew jar

   # Setup IntelliJ IDEA project files
   ./gradlew setup
   ```

## Releases

Releases are automatically created when a new version tag (e.g., `v1.1`) is pushed to the repository. Each release includes:
- Source code (zip/tar.gz)
- Compiled JAR file
- Release notes

You can find all releases on the [Releases](https://github.com/anlun/parserCombinators/releases) page.
