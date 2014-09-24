/**
 *
 */
package com.strada.dices.core

import scala.util.Random

/** A generic dice for roll.
 *  It is based on a set of sides, which can be different between themselves.
 * @author strada
 *
 */
class GenericDice[T](sides: Array[T]) extends AbstractDice[T] {

  var result: T = sides(0)
  
  override def roll: T = {
    setResult(sides(Random.nextInt(sides.length)))
    setRolled(true)
    result
  }
  
}