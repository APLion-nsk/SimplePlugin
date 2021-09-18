package com.github.aplionnsk.simpleplugin.services

import com.intellij.openapi.project.Project
import com.github.aplionnsk.simpleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
