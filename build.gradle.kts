plugins {
    idea
    kotlin("jvm") version "2.1.0"
}

group = "net.podkopaev"
version = "1.1"

java {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18
}

kotlin {
    jvmToolchain(18)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "18"
    }
}

defaultTasks("test")

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.0")
    testImplementation("junit:junit:4.13.2")
}

sourceSets {
    main {
        kotlin {
            srcDir("src/main")
        }
    }
    test {
        kotlin {
            srcDir("src/test")
        }
    }
}

idea {
    module {
        name = "parserCombinators"
        sourceDirs = sourceDirs + file("src/main")
        testSourceDirs = testSourceDirs + file("src/test")
    }
}

tasks {
    register("setup") {
        dependsOn("ideaModule")
    }

    jar {
        archiveBaseName.set("parser-combinators")
        archiveVersion.set(project.version.toString())

        manifest {
            attributes(
                "Implementation-Title" to "Parser Combinators Library",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "net.podkopaev",
                "Built-By" to System.getProperty("user.name"),
                "Built-JDK" to System.getProperty("java.version"),
                "Created-By" to "Gradle ${gradle.gradleVersion}"
            )
        }

        from(sourceSets.main.get().output)
        from(sourceSets.main.get().allSource)
    }

    test {
        useJUnit()
    }

    wrapper {
        gradleVersion = "8.10"
    }
}
