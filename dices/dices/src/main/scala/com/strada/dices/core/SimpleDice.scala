/**
 * 
 */
package com.strada.dices.core

import scala.util.Random



/** A simple dice. Its sides are numeric and consecutive, from 1 to n.
 *  The default number of sides is 6.
 * @author strada
 *
 */
class SimpleDice(n: Int = 6) extends AbstractDice[Int] {

  var result = 0
  
  override def roll: Int = {
    setResult(Random.nextInt(n) +1)
    setRolled(true)
    result
  }
  
}