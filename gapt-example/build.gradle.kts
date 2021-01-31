plugins {
    id("java-library")
}

dependencies {
    annotationProcessor(project(":gapt-processor"))

    implementation(project(":gapt-processor"))
}

