// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectTaggingResponseBuilderOps(val self: GetObjectTaggingResponse.Builder) extends AnyVal {

  final def withVersionIdAsScala(value: Option[String]): GetObjectTaggingResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withTagSetAsScala(value: Option[Seq[Tag]]): GetObjectTaggingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSet(v.asJava)
    } // Seq[Tag]
  }

}

final class GetObjectTaggingResponseOps(val self: GetObjectTaggingResponse) extends AnyVal {

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def tagSetAsScala: Option[Seq[Tag]] = Option(self.tagSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectTaggingResponseOps {

  implicit def toGetObjectTaggingResponseBuilderOps(
      v: GetObjectTaggingResponse.Builder
  ): GetObjectTaggingResponseBuilderOps = new GetObjectTaggingResponseBuilderOps(v)

  implicit def toGetObjectTaggingResponseOps(v: GetObjectTaggingResponse): GetObjectTaggingResponseOps =
    new GetObjectTaggingResponseOps(v)

}