plugins {
    //trick: for the same plugin versions in all sub-modules
    id("maven-publish")
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}

/*afterEvaluate {
    publishing {
        publications {
            release(MavenPublication) {
                *//*from components.release
                        groupId "com.github.pradeepyubin"
                artifactId "simpleKml"
                version = "1.0"*//*
            }
        }
    }
}*/

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {

                groupId = "com.github.pradeepyubin"
                artifactId = "simpleKml"
                version = "1.0"
            }
        }
    }
}