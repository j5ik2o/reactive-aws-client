// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRequestBuilderOps(val self: PutObjectRequest.Builder) extends AnyVal {

  final def withAclAsScala(value: Option[ObjectCannedACL]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // String

  final def withBucketAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withCacheControlAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def withContentDispositionAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def withContentEncodingAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def withContentLanguageAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def withContentLengthAsScala(value: Option[Long]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  } // Long

  final def withContentMD5AsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withContentTypeAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def withExpiresAsScala(value: Option[java.time.Instant]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Instant

  final def withGrantFullControlAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def withGrantReadAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def withGrantReadACPAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def withGrantWriteACPAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withMetadataAsScala(value: Option[Map[String, String]]): PutObjectRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withStorageClassAsScala(value: Option[StorageClass]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withWebsiteRedirectLocationAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withTaggingAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // String

  final def withObjectLockModeAsScala(value: Option[ObjectLockMode]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // String

  final def withObjectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // Instant

  final def withObjectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // String

}

final class PutObjectRequestOps(val self: PutObjectRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl) // String

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition) // String

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding) // String

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage) // String

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength) // Long

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def contentTypeAsScala: Option[String] = Option(self.contentType) // String

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires) // Instant

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def taggingAsScala: Option[String] = Option(self.tagging) // String

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // String

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRequestOps {

  implicit def toPutObjectRequestBuilderOps(v: PutObjectRequest.Builder): PutObjectRequestBuilderOps =
    new PutObjectRequestBuilderOps(v)

  implicit def toPutObjectRequestOps(v: PutObjectRequest): PutObjectRequestOps = new PutObjectRequestOps(v)

}