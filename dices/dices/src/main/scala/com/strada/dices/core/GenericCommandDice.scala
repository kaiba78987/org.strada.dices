/**
 * 
 */
package com.strada.dices.core


/** A generic dice which can execute commands for success or fail.
 * @author strada
 *
 */
class GenericCommandDice[T](sides: Array[T], successfulResults: Array[T], fSuccess: (T) => Any, fFail: (T) => Any) extends GenericSuccessfulDice[T](sides, successfulResults) {

  override def roll: T = {
    val r = super.roll
    if (isSuccessful) fSuccess(r)
    else fFail(r)
    r
  }
  
}