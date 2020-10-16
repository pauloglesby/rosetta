package ly.analogical.rosetta

import cats.data.NonEmptyList

sealed trait Data

object Data {

  sealed trait Field extends Data {
    def key: String
  }

  object Field {
    final case class DString(key: String) extends Field
    final case class DInteger(key: String) extends Field
    final case class DBoolean(key: String) extends Field
    final case class DNull(key: String) extends Field
    final case class DObject(key: String, properties: NonEmptyList[Field]) extends Field
  }

  final case class Document(fields: NonEmptyList[Field]) extends Data

}
