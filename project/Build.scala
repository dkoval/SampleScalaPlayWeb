import sbt._
import Keys._
import PlayProject._

import com.github.play2war.plugin._

object ApplicationBuild extends Build {

    val appName         = "SampleScalaPlayWeb"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
        Play2WarKeys.servletVersion := "3.0"
    ).settings(Play2WarPlugin.play2WarSettings: _*)

}
