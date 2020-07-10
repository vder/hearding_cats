val catsVersion = "2.1.1"
val catsCore = "org.typelevel" %% "cats-core" % catsVersion
val catsFree = "org.typelevel" %% "cats-free" % catsVersion
val catsMtl = "org.typelevel" %% "cats-mtl-core" % "0.7.1"

val simulacrum = "org.typelevel" %% "simulacrum" % "1.0.0"
val kindProjector = compilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
val resetAllAttrs = "org.scalamacros" %% "resetallattrs" % "1.0.0"

val specs2Version = "4.10.0" // use the version used by discipline
val specs2Core  = "org.specs2" %% "specs2-core" % specs2Version
val specs2Scalacheck = "org.specs2" %% "specs2-scalacheck" % specs2Version
val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.3"

lazy val root = (project in file(".")).
  settings(
    organization := "com.example",
    name := "something",
    scalaVersion := "2.13.2",
    libraryDependencies ++= Seq(
      catsCore,
      catsFree,
      catsMtl,
      simulacrum,
      specs2Core % Test, specs2Scalacheck % Test, scalacheck % Test,
       kindProjector, resetAllAttrs
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
	  "-Ymacro-annotations",
      "-language:_"
    )
  )