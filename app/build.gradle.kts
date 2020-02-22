plugins {
    //application
    //kotlin("jvm")
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(28)

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
}