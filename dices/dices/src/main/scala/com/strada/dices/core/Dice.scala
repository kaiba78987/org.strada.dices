/**
 *
 */
package com.strada.dices.core

/** This trait defines the dices behaviour.
 * @author strada
 *
 */
trait Dice[T] {

  def isRolled: Boolean
  
  def setRolled(rolled: Boolean): Unit
  
  def roll: T
  
  def getResult: T
  
  def setResult(result: T): Unit
  
}