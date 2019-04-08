// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceStatusResponseBuilderOps(val self: DescribeInstanceStatusResponse.Builder) extends AnyVal {

  final def instanceStatusesAsScala(value: Option[Seq[InstanceStatus]]): DescribeInstanceStatusResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceStatuses(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeInstanceStatusResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeInstanceStatusResponseOps(val self: DescribeInstanceStatusResponse) extends AnyVal {

  final def instanceStatusesAsScala: Option[Seq[InstanceStatus]] = Option(self.instanceStatuses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceStatusResponseOps {

  implicit def toDescribeInstanceStatusResponseBuilderOps(
      v: DescribeInstanceStatusResponse.Builder
  ): DescribeInstanceStatusResponseBuilderOps = new DescribeInstanceStatusResponseBuilderOps(v)

  implicit def toDescribeInstanceStatusResponseOps(
      v: DescribeInstanceStatusResponse
  ): DescribeInstanceStatusResponseOps = new DescribeInstanceStatusResponseOps(v)

}
