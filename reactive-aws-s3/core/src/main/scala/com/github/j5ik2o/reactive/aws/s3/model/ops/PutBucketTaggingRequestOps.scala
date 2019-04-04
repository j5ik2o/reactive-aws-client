// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketTaggingRequestBuilderOps(val self: PutBucketTaggingRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withTaggingAsScala(value: Option[Tagging]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // Tagging

}

final class PutBucketTaggingRequestOps(val self: PutBucketTaggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def taggingAsScala: Option[Tagging] = Option(self.tagging) // Tagging

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketTaggingRequestOps {

  implicit def toPutBucketTaggingRequestBuilderOps(
      v: PutBucketTaggingRequest.Builder
  ): PutBucketTaggingRequestBuilderOps = new PutBucketTaggingRequestBuilderOps(v)

  implicit def toPutBucketTaggingRequestOps(v: PutBucketTaggingRequest): PutBucketTaggingRequestOps =
    new PutBucketTaggingRequestOps(v)

}
