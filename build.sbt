scalaVersion := "2.12.11"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.hadoop" % "hadoop-common" % "3.2.1",
  "org.apache.hadoop" % "hadoop-aws" % "3.2.1",
)
dependencyOverrides ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.11.1",
)

initialCommands in console := raw"""
import org.apache.spark.sql._
val spark = SparkSession.builder.appName("spark-shell-sbt").master("local[*]").getOrCreate
import spark.implicits._
"""

