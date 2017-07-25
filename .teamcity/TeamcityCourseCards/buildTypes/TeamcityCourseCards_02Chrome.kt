package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamcityCourseCards_02Chrome : BuildType({
    template(TeamcityCourseCards.buildTypes.TeamcityCourseCards_Template)
    uuid = "97fe890b-1a02-4f68-83d9-4496f7429284"
    extId = "TeamcityCourseCards_02Chrome"
    name = "02. Chrome"

    params {
        param("browser", "Chrome")
    }

    dependencies {
        dependency(TeamcityCourseCards.buildTypes.TeamcityCourseCards_Build) {
            snapshot {
            }
        }
    }
})
