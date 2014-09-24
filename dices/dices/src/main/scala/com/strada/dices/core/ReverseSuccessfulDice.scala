/**
 * 
 */
package com.strada.dices.core

/** A simple numeric dice which is successful with a result <= difficult.
 * @author strada
 *
 */
class ReverseSuccessfulDice(sides: Int, difficult: Int) extends SimpleDice with SuccessfulDice[Int] {

  override def isSuccessful = {getResult <= difficult}
  
}