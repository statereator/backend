plugins {
	java
}

dependencies {
	implementation(libs.spring.boot.starter.webmvc)
	implementation(libs.spring.boot.starter.data.jpa)
	implementation(libs.spring.boot.starter.security)

	runtimeOnly(libs.postgresql) 
}