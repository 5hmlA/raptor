package osp.publish.osp

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class Raptor : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("maven-plush")

            extensions.getByType<org.gradle.api.publish.PublishingExtension>().apply {
                repositories {
                    maven {
                        //name会成为任务名字的一部分 publishOspPublicationTo [LocalTest] Repository
                        name = "Raptor"
                        setUrl("${rootDir}/repo")
                    }
                }
            }

            tasks.filter { it.name.startsWith("publish") }.forEach {
                println(it.name)
            }
        }
    }
}