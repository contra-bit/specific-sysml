package de.dfki.cps.specific.sysml

sealed trait PropertyModifier
object PropertyModifier {
  case object ReadOnly extends PropertyModifier
  case object Union extends PropertyModifier
  case class Subsets(propertyName: String) extends PropertyModifier
  case class Redefines(propertyName: String) extends PropertyModifier
  case object Ordered extends PropertyModifier
  case object Unordered extends PropertyModifier
  case object Unique extends PropertyModifier
  case object Nonunique extends PropertyModifier
  case object Sequence extends PropertyModifier
  case object Id extends PropertyModifier
  case class Constraint(raw: UnprocessedConstraint)
}