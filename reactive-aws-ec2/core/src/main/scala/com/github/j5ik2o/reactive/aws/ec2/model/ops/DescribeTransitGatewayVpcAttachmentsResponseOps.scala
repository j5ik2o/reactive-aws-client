// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayVpcAttachmentsResponseBuilderOps(
    val self: DescribeTransitGatewayVpcAttachmentsResponse.Builder
) extends AnyVal {

  final def transitGatewayVpcAttachmentsAsScala(
      value: Option[Seq[TransitGatewayVpcAttachment]]
  ): DescribeTransitGatewayVpcAttachmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitGatewayVpcAttachments(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayVpcAttachmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayVpcAttachmentsResponseOps(val self: DescribeTransitGatewayVpcAttachmentsResponse)
    extends AnyVal {

  final def transitGatewayVpcAttachmentsAsScala: Option[Seq[TransitGatewayVpcAttachment]] =
    Option(self.transitGatewayVpcAttachments).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayVpcAttachmentsResponseOps {

  implicit def toDescribeTransitGatewayVpcAttachmentsResponseBuilderOps(
      v: DescribeTransitGatewayVpcAttachmentsResponse.Builder
  ): DescribeTransitGatewayVpcAttachmentsResponseBuilderOps =
    new DescribeTransitGatewayVpcAttachmentsResponseBuilderOps(v)

  implicit def toDescribeTransitGatewayVpcAttachmentsResponseOps(
      v: DescribeTransitGatewayVpcAttachmentsResponse
  ): DescribeTransitGatewayVpcAttachmentsResponseOps = new DescribeTransitGatewayVpcAttachmentsResponseOps(v)

}
