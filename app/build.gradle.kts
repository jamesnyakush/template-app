plugins {
    id(BuildPlugins.application)
    id(BuildPlugins.kotlinAndroid)
}

android {
    compileSdkVersion(AndroidSDK.targetSdkVersion)
    buildToolsVersion("30.0.3")

    defaultConfig {
        applicationId = "com.jamesnyakush.template"
        minSdkVersion(AndroidSDK.minSdkVersion)
        targetSdkVersion(AndroidSDK.targetSdkVersion)
        versionCode = AndroidSDK.versionCode
        versionName = AndroidSDK.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true

            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }

        getByName("debug") {

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Libraries.kotlin)
    implementation(Libraries.core)
    implementation(Libraries.appcompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintlayout)
}