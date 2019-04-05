// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SequenceNumberRangeBuilderOps(val self: SequenceNumberRange.Builder) extends AnyVal {

  final def withStartingSequenceNumberAsScala(value: Option[String]): SequenceNumberRange.Builder = {
    value.fold(self) { v =>
      self.startingSequenceNumber(v)
    }
  } // String

  final def withEndingSequenceNumberAsScala(value: Option[String]): SequenceNumberRange.Builder = {
    value.fold(self) { v =>
      self.endingSequenceNumber(v)
    }
  } // String

}

final class SequenceNumberRangeOps(val self: SequenceNumberRange) extends AnyVal {

  final def startingSequenceNumberAsScala: Option[String] = Option(self.startingSequenceNumber) // String

  final def endingSequenceNumberAsScala: Option[String] = Option(self.endingSequenceNumber) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSequenceNumberRangeOps {

  implicit def toSequenceNumberRangeBuilderOps(v: SequenceNumberRange.Builder): SequenceNumberRangeBuilderOps =
    new SequenceNumberRangeBuilderOps(v)

  implicit def toSequenceNumberRangeOps(v: SequenceNumberRange): SequenceNumberRangeOps = new SequenceNumberRangeOps(v)

}