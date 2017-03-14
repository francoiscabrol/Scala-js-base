
name := "Scala,js Project"
scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)
enablePlugins(WorkbenchPlugin)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
)

/* Many librairies that you will probably need
libraryDependencies ++= Seq(
  "com.lihaoyi" %%% "upickle" % "0.4.3",
  "com.github.japgolly.scalacss" %%% "core" % "0.5.0",
  "com.github.japgolly.scalacss" %%% "ext-scalatags" % "0.5.0",
  "com.lihaoyi" %%% "scalatags" % "0.6.1"
)
Add JQuery
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
jsDependencies += "org.webjars" % "jquery" % "2.1.3" / "2.1.3/jquery.js"
*/

/* move these files out of target/. Also sets up same file for both fast and full optimization */
val generatedDir = file("assets")
crossTarget  in (Compile, fullOptJS)                     := generatedDir
crossTarget  in (Compile, fastOptJS)                     := generatedDir
crossTarget  in (Compile, packageJSDependencies)         := generatedDir
crossTarget  in (Compile, packageScalaJSLauncher)        := generatedDir
crossTarget  in (Compile, packageMinifiedJSDependencies) := generatedDir
