// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class TagBuilderOps(val self: Tag.Builder) extends AnyVal {

  final def tagKeyAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.tagKey(v)
    }
  }

  final def tagValueAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.tagValue(v)
    }
  }

}

final class TagOps(val self: Tag) extends AnyVal {

  final def tagKeyAsScala: Option[String] = Option(self.tagKey)

  final def tagValueAsScala: Option[String] = Option(self.tagValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagOps {

  implicit def toTagBuilderOps(v: Tag.Builder): TagBuilderOps = new TagBuilderOps(v)

  implicit def toTagOps(v: Tag): TagOps = new TagOps(v)

}
