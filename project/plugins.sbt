// required for sbt-github-release resolution
resolvers += "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com" 

addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill" % "1.8.6")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.3")

libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.11.601"

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation")
