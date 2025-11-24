plugins {
// No root plugins; module applies Android/Kotlin
}


allprojects {
repositories {
google()
mavenCentral()
maven { url = uri("https://jitpack.io") }
}
}
