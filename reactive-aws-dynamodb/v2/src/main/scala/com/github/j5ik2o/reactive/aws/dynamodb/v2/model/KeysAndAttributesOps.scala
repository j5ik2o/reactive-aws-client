// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeysAndAttributes => ScalaKeysAndAttributes, _ }
import software.amazon.awssdk.services.dynamodb.model.{ KeysAndAttributes => JavaKeysAndAttributes }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object KeysAndAttributesOps {

  implicit class ScalaKeysAndAttributesOps(val self: ScalaKeysAndAttributes) extends AnyVal {

    def toJava: JavaKeysAndAttributes = {
      val result = JavaKeysAndAttributes.builder()
      self.keys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.keys(v.map(_.mapValues(_.toJava).asJava).asJava)
      } // Seq[Map[String, AttributeValue]]
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.attributesToGet(v.asJava)
      } // Seq[String]
      self.consistentRead.map(_.booleanValue).foreach(v => result.consistentRead(v))            // Boolean
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]

      result.build()
    }

  }

  implicit class JavaKeysAndAttributesOps(val self: JavaKeysAndAttributes) extends AnyVal {

    def toScala: ScalaKeysAndAttributes = {
      ScalaKeysAndAttributes()
        .withKeys(Option(self.keys).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.map(_.asScala.toMap.mapValues(_.toScala))
        }) // Seq[Map[String, AttributeValue]]
        .withAttributesToGet(Option(self.attributesToGet).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withConsistentRead(Option(self.consistentRead).map(_.booleanValue)) // Boolean
        .withProjectionExpression(Option(self.projectionExpression)) // String
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
    }

  }

}