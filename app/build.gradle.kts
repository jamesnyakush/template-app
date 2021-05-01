
plugins {
    id(BuildPlugins.application)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kapt)
    id(BuildPlugins.safeArgs)
    id(BuildPlugins.hilt)
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
    api(Libraries.appcompat)
    api(Libraries.core)
    api(Libraries.constraintlayout)
    api(Libraries.support)


    //Kotlin Coroutines
    implementation(Libraries.coroutines_android)
    implementation(Libraries.coroutines_core)

    // ViewModel and LiveData
    api(Libraries.lifecycle_extensions)
    api(Libraries.lifecycle_viewmodel)

    //New Material Design
    api(Libraries.material)


    //Android Navigation Architecture
    api(Libraries.navigation_fragment)
    api(Libraries.navigation_ui)

    //
    implementation(Libraries.retrofit)
    implementation(Libraries.converter_gson)

    // Dagger Hilt
    implementation(Libraries.hiltAndroid)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    kapt(Libraries.hiltAndroidCompiler)


    api(Libraries.timber)

    api(Libraries.preference)
}