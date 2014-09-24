/**
 *
 */
package com.strada.dices.core

/** A trait which defines conditions for consider a dice rolling successful.
 *  It also defines some useful actions for them.
 * @author strada
 *
 */
trait SuccessfulDice[T] extends Dice[T] {

  def isSuccessful: Boolean = {
    if (!isRolled) throw new IllegalStateException("The dice hasn't been rolled.")
    true
  }
  
  def rerollFailed: T = {
    if (!isSuccessful) roll
    else throw new IllegalStateException("The previous roll was successful.")
  }
  
  def rerollSuccessful: T = {
    if (isSuccessful) roll
    else throw new IllegalStateException("The previous roll was failed.")
  }
  
  def rerollAll: T = {
    if (isRolled) roll
    else throw new IllegalStateException("The dice hasn't been rolled.")
  }
  
}