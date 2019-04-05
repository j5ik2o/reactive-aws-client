// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketInventoryConfigurationsResponseBuilderOps(
    val self: ListBucketInventoryConfigurationsResponse.Builder
) extends AnyVal {

  final def withContinuationTokenAsScala(value: Option[String]): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

  final def withInventoryConfigurationListAsScala(
      value: Option[Seq[InventoryConfiguration]]
  ): ListBucketInventoryConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.inventoryConfigurationList(v.asJava)
    } // Seq[InventoryConfiguration]
  }

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withNextContinuationTokenAsScala(
      value: Option[String]
  ): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  } // String

}

final class ListBucketInventoryConfigurationsResponseOps(val self: ListBucketInventoryConfigurationsResponse)
    extends AnyVal {

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

  final def inventoryConfigurationListAsScala: Option[Seq[InventoryConfiguration]] =
    Option(self.inventoryConfigurationList).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[InventoryConfiguration]

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketInventoryConfigurationsResponseOps {

  implicit def toListBucketInventoryConfigurationsResponseBuilderOps(
      v: ListBucketInventoryConfigurationsResponse.Builder
  ): ListBucketInventoryConfigurationsResponseBuilderOps = new ListBucketInventoryConfigurationsResponseBuilderOps(v)

  implicit def toListBucketInventoryConfigurationsResponseOps(
      v: ListBucketInventoryConfigurationsResponse
  ): ListBucketInventoryConfigurationsResponseOps = new ListBucketInventoryConfigurationsResponseOps(v)

}