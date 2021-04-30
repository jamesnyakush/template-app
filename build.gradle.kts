buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(BuildPlugins.gradleBuildPlugin)
        classpath(BuildPlugins.kotlinBuildPlugin)

    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}
