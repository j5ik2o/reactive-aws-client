// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetRecordsResponse => ScalaGetRecordsResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ GetRecordsResponse => JavaGetRecordsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetRecordsResponseOps {

  implicit class JavaGetRecordsResponseOps(val self: JavaGetRecordsResponse) extends AnyVal {

    def toScala: ScalaGetRecordsResponse = {
      ScalaGetRecordsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRecords(Option(self.records).map { v =>
          import scala.collection.JavaConverters._, RecordOps._; v.asScala.map(_.toScala)
        }) // Seq[Record]
        .withNextShardIterator(Option(self.nextShardIterator)) // String
        .withMillisBehindLatest(Option(self.millisBehindLatest).map(_.longValue)) // Long
    }

  }

}