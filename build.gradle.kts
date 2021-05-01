buildscript {
    val kotlin_version by extra("1.3.72")
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(BuildPlugins.gradleBuildPlugin)
        classpath(BuildPlugins.kotlinBuildPlugin)
        classpath(BuildPlugins.safeArgsGradlePlugin)
        classpath(BuildPlugins.hiltBuildPlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

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
