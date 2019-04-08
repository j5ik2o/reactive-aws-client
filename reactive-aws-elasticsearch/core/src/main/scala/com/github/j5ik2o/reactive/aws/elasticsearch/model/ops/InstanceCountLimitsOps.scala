// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class InstanceCountLimitsBuilderOps(val self: InstanceCountLimits.Builder) extends AnyVal {

  final def minimumInstanceCountAsScala(value: Option[Int]): InstanceCountLimits.Builder = {
    value.fold(self) { v =>
      self.minimumInstanceCount(v)
    }
  }

  final def maximumInstanceCountAsScala(value: Option[Int]): InstanceCountLimits.Builder = {
    value.fold(self) { v =>
      self.maximumInstanceCount(v)
    }
  }

}

final class InstanceCountLimitsOps(val self: InstanceCountLimits) extends AnyVal {

  final def minimumInstanceCountAsScala: Option[Int] = Option(self.minimumInstanceCount)

  final def maximumInstanceCountAsScala: Option[Int] = Option(self.maximumInstanceCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCountLimitsOps {

  implicit def toInstanceCountLimitsBuilderOps(v: InstanceCountLimits.Builder): InstanceCountLimitsBuilderOps =
    new InstanceCountLimitsBuilderOps(v)

  implicit def toInstanceCountLimitsOps(v: InstanceCountLimits): InstanceCountLimitsOps = new InstanceCountLimitsOps(v)

}
