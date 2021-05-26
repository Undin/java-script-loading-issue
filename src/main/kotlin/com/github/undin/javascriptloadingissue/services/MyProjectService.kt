package com.github.undin.javascriptloadingissue.services

import com.github.undin.javascriptloadingissue.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
