/**
 * 
 */
package com.strada.dices.core


/** An abstract dice that defines some common behaviour.
 * @author strada
 *
 */
abstract class AbstractDice[T] extends Dice[T] {

  var rolled: Boolean = false
  var result: T
  
  override def isRolled: Boolean = rolled
  
  override def setRolled(r: Boolean): Unit = rolled = r
  
  override def getResult: T = {
    if (isRolled) result
    else throw new IllegalStateException("The dice hasn't been rolled.")
  }
  
  override def setResult(result: T): Unit = {
    this.result = result
  }
  
}