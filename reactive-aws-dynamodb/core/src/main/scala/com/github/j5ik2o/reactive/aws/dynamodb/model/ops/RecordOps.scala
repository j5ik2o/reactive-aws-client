// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RecordBuilderOps(val self: Record.Builder) extends AnyVal {

  final def withEventIDAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventID(v)
    }
  } // String

  final def withEventNameAsScala(value: Option[OperationType]): Record.Builder = {
    value.fold(self) { v =>
      self.eventName(v)
    }
  } // String

  final def withEventVersionAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventVersion(v)
    }
  } // String

  final def withEventSourceAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventSource(v)
    }
  } // String

  final def withAwsRegionAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  } // String

  final def withDynamodbAsScala(value: Option[StreamRecord]): Record.Builder = {
    value.fold(self) { v =>
      self.dynamodb(v)
    }
  } // StreamRecord

  final def withUserIdentityAsScala(value: Option[Identity]): Record.Builder = {
    value.fold(self) { v =>
      self.userIdentity(v)
    }
  } // Identity

}

final class RecordOps(val self: Record) extends AnyVal {

  final def eventIDAsScala: Option[String] = Option(self.eventID) // String

  final def eventNameAsScala: Option[OperationType] = Option(self.eventName) // String

  final def eventVersionAsScala: Option[String] = Option(self.eventVersion) // String

  final def eventSourceAsScala: Option[String] = Option(self.eventSource) // String

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion) // String

  final def dynamodbAsScala: Option[StreamRecord] = Option(self.dynamodb) // StreamRecord

  final def userIdentityAsScala: Option[Identity] = Option(self.userIdentity) // Identity

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecordOps {

  implicit def toRecordBuilderOps(v: Record.Builder): RecordBuilderOps = new RecordBuilderOps(v)

  implicit def toRecordOps(v: Record): RecordOps = new RecordOps(v)

}