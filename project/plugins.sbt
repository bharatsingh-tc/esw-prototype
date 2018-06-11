classpathTypes += "maven-plugin"

addSbtPlugin("com.typesafe.sbt"   % "sbt-native-packager"      % "1.3.3")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "0.6.22")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.4.0")
addSbtPlugin("io.spray"           % "sbt-revolver"             % "0.9.1")
addSbtPlugin("io.get-coursier"    % "sbt-coursier"             % "1.0.2")
addSbtPlugin("com.typesafe.sbt"   % "sbt-mocha"                % "1.1.2")