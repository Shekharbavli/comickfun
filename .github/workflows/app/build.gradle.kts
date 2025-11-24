plugins {
id("com.android.library")
kotlin("android")
}


android {
namespace = "org.comickfun"
compileSdk = 33


defaultConfig {
minSdk = 23
targetSdk = 33
}


buildTypes {
release {
isMinifyEnabled = false
consumerProguardFiles("consumer-rules.pro")
}
}
}


dependencies {
implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
implementation("org.jsoup:jsoup:1.16.1")
// The Tachiyomi extension API is usually provided by the Tachiyomi project when building as an extension module.
// If you plan to build inside the Tachiyomi extensions repository, those dependencies will be satisfied there.
}
