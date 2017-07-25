package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object TeamcityCourseCards_Template : Template({
    uuid = "9089373a-469a-41bd-bb82-e3b1b718374a"
    extId = "TeamcityCourseCards_Template"
    name = "Template"

    vcs {
        root(TeamcityCourseCards.vcsRoots.TeamcityCourseCards_HttpsGithubComEren152teamcityCourseCardsRefsHeadsMaster)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_2"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_3"
            scriptContent = "npm test -- --single-run --browsers %browser% --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
