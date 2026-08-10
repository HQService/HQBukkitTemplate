plugins {
    id("hq.shared")
}

dependencies {
    compileOnly(libs.paper.api)
    compileOnly(framework.core)
    compileOnly(project(":modules:api"))
}