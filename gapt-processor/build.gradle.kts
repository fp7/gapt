plugins {
    id("java-library")
}

dependencies {
    annotationProcessor("com.google.auto.service:auto-service:1.0-rc7")
    implementation("com.google.auto.service:auto-service:1.0-rc7")

    api("org.clojure:clojure:1.10.2")
}

