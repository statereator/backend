plugins {
	java
	alias(libs.plugins.spring.boot) apply false
	alias(libs.plugins.spring.dependency.management) apply false
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(25)
  }
}

allprojects {
	group = "com.statereator"
	version = "1.0.0"
}