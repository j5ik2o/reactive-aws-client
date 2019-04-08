// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class EnableAlarmActionsRequestBuilderOps(val self: EnableAlarmActionsRequest.Builder) extends AnyVal {

  final def alarmNamesAsScala(value: Option[Seq[String]]): EnableAlarmActionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmNames(v.asJava)
    }
  }

}

final class EnableAlarmActionsRequestOps(val self: EnableAlarmActionsRequest) extends AnyVal {

  final def alarmNamesAsScala: Option[Seq[String]] = Option(self.alarmNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableAlarmActionsRequestOps {

  implicit def toEnableAlarmActionsRequestBuilderOps(
      v: EnableAlarmActionsRequest.Builder
  ): EnableAlarmActionsRequestBuilderOps = new EnableAlarmActionsRequestBuilderOps(v)

  implicit def toEnableAlarmActionsRequestOps(v: EnableAlarmActionsRequest): EnableAlarmActionsRequestOps =
    new EnableAlarmActionsRequestOps(v)

}
