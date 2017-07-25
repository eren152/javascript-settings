package TeamcityCourseCards

import TeamcityCourseCards.buildTypes.*
import TeamcityCourseCards.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "eabdff2e-d3dc-4a24-9534-d110b5efc136"
    extId = "TeamcityCourseCards"
    parentId = "_Root"
    name = "Teamcity Course Cards"

    vcsRoot(TeamcityCourseCards_HttpsGithubComEren152teamcityCourseCardsRefsHeadsMaster)

    buildType(TeamcityCourseCards_02Chrome)
    buildType(TeamcityCourseCards_09DeployToStaging)
    buildType(TeamcityCourseCards_03Firefox)
    buildType(TeamcityCourseCards_Build)

    template(TeamcityCourseCards_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComEren152javascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
