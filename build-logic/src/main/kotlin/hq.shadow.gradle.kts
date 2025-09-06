plugins {
    java
    id("com.gradleup.shadow")
}

tasks.shadowJar {
    archiveBaseName.set(project.rootProject.name)
    archiveVersion.set("")
    archiveClassifier.set("")
    destinationDirectory.set(file(rootProject.projectDir.path + "/build_outputs"))
}

configurations.runtimeClasspath.get().apply {
    exclude("org.jetbrains.kotlin", "*")
}