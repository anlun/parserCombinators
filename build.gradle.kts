plugins {
    idea
    kotlin("jvm") version "2.1.0"
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
        from(sourceSets.main.get().allSource)
    }

    test {
    }

    wrapper {
        gradleVersion = "8.10"
    }
}
