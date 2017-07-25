package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamcityCourseCards_Build : BuildType({
    template(TeamcityCourseCards.buildTypes.TeamcityCourseCards_Template)
    uuid = "74869eb7-3546-401e-a976-23e0333394b1"
    extId = "TeamcityCourseCards_Build"
    name = "01. Fast Tests."

    params {
        param("browser", "PhantomJS")
    }
})
