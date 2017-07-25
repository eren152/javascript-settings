package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamcityCourseCards_09DeployToStaging : BuildType({
    uuid = "3209f757-cf1e-4256-9b7f-7ebeea9ff9c2"
    extId = "TeamcityCourseCards_09DeployToStaging"
    name = "09. Deploy to Staging"

    vcs {
        root(TeamcityCourseCards.vcsRoots.TeamcityCourseCards_HttpsGithubComEren152teamcityCourseCardsRefsHeadsMaster)

    }

    dependencies {
        dependency(TeamcityCourseCards.buildTypes.TeamcityCourseCards_02Chrome) {
            snapshot {
            }
        }
        dependency(TeamcityCourseCards.buildTypes.TeamcityCourseCards_03Firefox) {
            snapshot {
            }
        }
    }
})
