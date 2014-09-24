/**
 * 
 */
package com.strada.dices.core

/** A simple numeric dice which executes a command for success or fail.
 * @author strada
 *
 */
class SimpleCommandDice(sides: Int, difficult: Int, fSuccess: (Int) => Any, fFail: (Int) => Any) extends SimpleSuccessfulDice(sides, difficult) {

  override def roll = {
    var r = super.roll
    if (isSuccessful) fSuccess(r)
    else fFail(r)
    r
  }
  
}