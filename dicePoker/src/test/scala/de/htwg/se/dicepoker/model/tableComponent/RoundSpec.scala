package de.htwg.se.dicepoker.model.tableComponent

import org.scalatest.WordSpec
import org.scalatest.Matchers

class RoundSpec extends WordSpec with Matchers{
  
  "A Round" can{
    
    val aDiceCup = DiceCup(List(1,2,3,4,5))
    val aPlayer1 = Player("Testplayer1", 5, aDiceCup)
    val aPlayer2 = Player("Testplayer2", 5, aDiceCup) 
    var aBid = Bid(Result (1,1), aPlayer2)
    val aRound = Round(aBid)
    
    "have a winner" in{
      
      aRound.theRoundWins(aPlayer2) should be (Player("Testplayer2", 5, aDiceCup))
    }
    
  }
  
}