plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.automotive_example"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.automotive_example"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        kotlinOptions {
            jvmTarget = "1.8"  // Make sure this matches your Java version
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
}

dependencies {

    implementation (libs.androidx.core.ktx.v190)
    implementation (libs.androidx.appcompat.v151)
    testImplementation (libs.junit)
    androidTestImplementation (libs.androidx.junit.v114)
    androidTestImplementation (libs.androidx.espresso.core)
    implementation (libs.androidx.app.automotive)
    testImplementation (libs.androidx.app.testing)
}