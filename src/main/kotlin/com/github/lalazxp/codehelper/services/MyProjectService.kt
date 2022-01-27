package com.github.lalazxp.codehelper.services

import com.intellij.openapi.project.Project
import com.github.lalazxp.codehelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
