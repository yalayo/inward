plugins {
    //application
    //kotlin("jvm")
    id("com.android.application")
    id("org.jetbrains.kotlin.android.extensions")
    kotlin("android")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.onmycrowd.recharge"
        testApplicationId = "com.onmycrowd.recharge.test"
        minSdkVersion(26)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "0.0.1"

        // 1) Make sure to use the AndroidJUnitRunner, of a subclass of it. This requires a dependency on androidx.test:runner, too!
        //testInstrumentationRunner "cucumber.cukeulator.test.Instrumentation"
        //testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "com.onmycrowd.recharge.test.Instrumentation"
        // 2) Connect JUnit 5 to the runner
        testInstrumentationRunnerArgument("runnerBuilder", "de.mannodermaus.junit5.AndroidJUnit5Builder")
    }

    packagingOptions {
        exclude("META-INF/LICENSE*")
    }

    sourceSets["main"].java.srcDir("src/main/kotlin")
    sourceSets["androidTest"].java.srcDir("src/androidTest/kotlin")
    sourceSets["test"].java.srcDir("src/test/kotlin")
}

version = "0.0.1"
group = "com.onmycrowd.recharge"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    //For AWSMobileClient only:
    implementation("com.amazonaws:aws-android-sdk-mobile-client:2.16.8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    androidTestImplementation("de.mannodermaus.junit5:android-test-core:1.2.0")
    androidTestRuntimeOnly("de.mannodermaus.junit5:android-test-runner:1.0.0")
    //androidTestImplementation("androidx.test:runner:1.2.0")
    //androidTestImplementation("androidx.test:rules:1.2.0")
    // Optional -- Hamcrest library
    androidTestImplementation("org.hamcrest:hamcrest-library:1.3")
    // Optional -- UI testing with Espresso
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
    //For cucumber
    androidTestImplementation("io.cucumber:cucumber-android:4.4.0")
    androidTestImplementation("io.cucumber:cucumber-picocontainer:4.4.0")
}