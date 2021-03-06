

object Versions {

    //Version codes for all the libraries
    const val kotlin = "1.5.21"
    const val appCompat = "1.4.0-alpha03"
    const val constraintLayout = "2.1.0"
    const val ktx = "1.7.0-alpha01"
    const val material = "1.5.0-alpha02"

    //Version codes for all the test libraries
    const val junit4 = "4.13.2"
    const val testRunner = "1.4.0"
    const val espresso = "3.4.0"
    const val annotation = "1.3.0-alpha01"

    // Gradle Plugins
    const val ktlint = "10.1.0"
    const val detekt = "1.18.0"
    const val spotless = "5.14.2"
    const val dokka = "1.5.0"
    const val gradleVersionsPlugin = "0.39.0"
    const val jacoco = "0.8.7"

    // Paging
    const val paging = "3.0.0-alpha06"

    // Networking
    const val retrofit = "2.9.0"
    const val loggingInterceptor = "4.8.1"

    // Lifecycle
    const val lifecycle = "2.2.0"

    // Exoplayer
    const val exoPlayer = "2.15.1"
}

object BuildPlugins {
    const val androidLibrary = "com.android.library"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val spotlessPlugin = "com.diffplug.spotless"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinParcelizePlugin = "org.jetbrains.kotlin.plugin.parcelize"
    const val gradleVersionsPlugin = "com.github.ben-manes.versions"
    const val jacocoAndroid = "com.hiya.jacoco-android"
}

object Libraries {
    //Any Library is added here
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val materialComponents = "com.google.android.material:material:${Versions.material}"
    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val lifecycleRuntime =  "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModel =  "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val livedata =  "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val extensions =  "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val exoPlayerCore = "com.google.android.exoplayer:exoplayer-core:${Versions.exoPlayer}"
    const val exoPlayerUi = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoPlayer}"
    const val exoPlayerDash = "com.google.android.exoplayer:exoplayer-dash:${Versions.exoPlayer}"
}

object TestLibraries {
    //any test library is added here
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
}


object AndroidSdk {
    const val minSdkVersion = 21
    const val compileSdkVersion = 30
    const val targetSdkVersion = compileSdkVersion
    const val versionCode = 1
    const val versionName = "1.0"
}