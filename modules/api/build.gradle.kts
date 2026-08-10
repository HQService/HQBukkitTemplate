plugins {
    id("hq.shared")
    id("hq.publish")
}

dependencies {
    compileOnly(libs.paper.api)
    compileOnly(framework.core)
}