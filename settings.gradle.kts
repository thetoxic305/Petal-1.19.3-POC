if (!file(".git").exists()) {
    val errorText = """
        
        =====================[ ERROR ]=====================
         The Petal project directory is not a properly cloned Git repository.
         
         In order to build Purpur from source you must clone
         the Purpur repository using Git, not download a code
         zip from GitHub.
         
         Built Petal jars are available for download at
         https://github.com/Bloom-host/Petal/releases/
         
         See Purpur's contributing guide https://github.com/PurpurMC/Purpur/blob/HEAD/CONTRIBUTING.md
         for further information on building and modifying Petal.
        ===================================================
    """.trimIndent()
    error(errorText)
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "petal"

include("petal-api", "petal-server")