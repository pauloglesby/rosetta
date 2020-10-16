import sbt._

object Dependencies {
  lazy val catsVersion = "2.2.0"
  lazy val circeVersion = "0.12.3"

  lazy val catsCore: Seq[ModuleID] = Seq("org.typelevel" %% "cats-core" % catsVersion)

  lazy val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  lazy val baseDependencies: Seq[ModuleID] =
    catsCore ++ circe

  lazy val munit = "org.scalameta" %% "munit" % "0.7.7" % Test

  /* ------- MODULES --------- */

  lazy val coreDependencies = baseDependencies ++ Seq(munit)
}
