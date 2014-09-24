/**
 * 
 */
package com.strada.dices.core

/** A generic dice which can determinate if the result is successful or not.
 * @author strada
 *
 */
class GenericSuccessfulDice[T](sides: Array[T], successfulResults: Array[T]) extends GenericDice[T](sides) with SuccessfulDice[T] {
  
  override def isSuccessful: Boolean = {
    super.isSuccessful
    if (successfulResults.contains(getResult)) true
    else false
  }
  
}