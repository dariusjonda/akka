// import akka.{ AkkaBuild, Dependencies, Formatting, MultiNode, Unidoc, OSGi } FIXME
import akka.{ AkkaBuild, Dependencies, Formatting, MultiNode, OSGi }

AkkaBuild.defaultSettings
Formatting.formatSettings
OSGi.distributedData
Dependencies.distributedData

enablePlugins(MultiNodeScalaTest)