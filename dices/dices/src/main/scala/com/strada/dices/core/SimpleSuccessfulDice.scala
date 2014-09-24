/**
 * 
 */
package com.strada.dices.core

import scala.util.Random


/** A dice which has n numerical sides, all of them continuos.
 *  It allows to select a minimum result to be successful and rerolling methods.
 *  The default is a 6 sides dice.
 * @author strada
 *
 */
class SimpleSuccessfulDice(sides: Int = 6, difficult: Int) extends SimpleDice(sides) with SuccessfulDice[Int] {
  
  override def isSuccessful = {
    if (isRolled) result >= difficult
    else throw new IllegalStateException("The dice hasn't been rolled.")
  }
  
}