// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateComputeEnvironmentResponseBuilderOps(val self: CreateComputeEnvironmentResponse.Builder)
    extends AnyVal {

  final def computeEnvironmentNameAsScala(value: Option[String]): CreateComputeEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentName(v)
    }
  }

  final def computeEnvironmentArnAsScala(value: Option[String]): CreateComputeEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.computeEnvironmentArn(v)
    }
  }

}

final class CreateComputeEnvironmentResponseOps(val self: CreateComputeEnvironmentResponse) extends AnyVal {

  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  final def computeEnvironmentArnAsScala: Option[String] = Option(self.computeEnvironmentArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateComputeEnvironmentResponseOps {

  implicit def toCreateComputeEnvironmentResponseBuilderOps(
      v: CreateComputeEnvironmentResponse.Builder
  ): CreateComputeEnvironmentResponseBuilderOps = new CreateComputeEnvironmentResponseBuilderOps(v)

  implicit def toCreateComputeEnvironmentResponseOps(
      v: CreateComputeEnvironmentResponse
  ): CreateComputeEnvironmentResponseOps = new CreateComputeEnvironmentResponseOps(v)

}
