/*
 * Copyright (c) 2021 JumpIfZero <https://github.com/JumpIfZero>
 */

version = "1.0.0"

project.extra["PluginName"] = "Socket shooting stars"
project.extra["PluginDescription"] = "Displays scout information on shooting stars, API+socket"
project.extra["ProjectSupportUrl"] = "https://github.com/JumpIfZero"

dependencies {
    compileOnly(project(":socketprivate"))
}

tasks {
    jar {
        manifest {
            attributes(mapOf(
                    "Plugin-Version" to project.version,
                    "Plugin-Id" to nameToId(project.extra["PluginName"] as String),
                    "Plugin-Provider" to project.extra["PluginProvider"],
                    "Plugin-Dependencies" to nameToId("socketprivate"),
                    "Plugin-Description" to project.extra["PluginDescription"],
                    "Plugin-License" to project.extra["PluginLicense"]
            ))
        }
    }
}