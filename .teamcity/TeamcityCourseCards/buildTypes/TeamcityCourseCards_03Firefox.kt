package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamcityCourseCards_03Firefox : BuildType({
    template(TeamcityCourseCards.buildTypes.TeamcityCourseCards_Template)
    uuid = "77aa8529-c617-486c-9be0-2a8260e89756"
    extId = "TeamcityCourseCards_03Firefox"
    name = "02. Firefox"

    params {
        param("browser", "Firefox")
    }

    dependencies {
        dependency(TeamcityCourseCards.buildTypes.TeamcityCourseCards_Build) {
            snapshot {
            }
        }
    }
})
