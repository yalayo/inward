plugins {
    application
    kotlin("jvm") version "1.3.61"
}

version = "0.0.1"
group = "com.onmycrowd.recharge"

application {
    mainClassName = "com.onmycrowd.recharge.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}