plugins {
    //application
    //kotlin("jvm")
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(28)
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