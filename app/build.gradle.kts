plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinParcelizePlugin)
    id(BuildPlugins.ktlintPlugin)
    id(BuildPlugins.jacocoAndroid)
    id("kotlin-android")
}

jacoco {
    toolVersion = Versions.jacoco
}

android {

    compileSdk = AndroidSdk.compileSdkVersion
    android.buildFeatures.dataBinding = true
    android.buildFeatures.viewBinding = true

    defaultConfig {
        applicationId = "ke.co.appslab.gradleplugins"
        minSdk = AndroidSdk.minSdkVersion
        targetSdk = AndroidSdk.targetSdkVersion
        versionCode = AndroidSdk.versionCode
        versionName = AndroidSdk.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        animationsDisabled = true
        unitTests.apply {
            isReturnDefaultValues = true
            isIncludeAndroidResources = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    dependencies {
        implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
        implementation(Libraries.kotlinStandardLibrary)
        implementation(Libraries.appCompat)
        implementation(Libraries.ktxCore)
        implementation(Libraries.constraintLayout)
        implementation(Libraries.materialComponents)
        implementation(Libraries.paging)
        implementation(Libraries.retrofit)
        implementation(Libraries.loggingInterceptor)
        implementation(Libraries.gsonConverter)
        implementation(Libraries.lifecycleRuntime)
        implementation(Libraries.gsonConverter)
        implementation(Libraries.viewModel)
        implementation(Libraries.livedata)
        implementation(Libraries.extensions)
        implementation(Libraries.exoPlayerCore)
        implementation(Libraries.exoPlayerDash)
        implementation(Libraries.exoPlayerUi)


        androidTestImplementation(TestLibraries.testRunner)
        androidTestImplementation(TestLibraries.espresso)
        androidTestImplementation(TestLibraries.annotation)

        testImplementation(TestLibraries.junit4)
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
}
