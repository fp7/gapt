tasks {
    wrapper {
        distributionType = org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL
        gradleVersion = "6.8.1"
    }
}

subprojects {
    repositories {
        jcenter()

        maven {
            setUrl("https://clojars.org/repo")
        }
    }
}
