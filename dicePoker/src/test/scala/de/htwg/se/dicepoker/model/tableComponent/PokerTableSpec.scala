package de.htwg.se.dicepoker.model.tableComponent

import org.scalatest.WordSpec
import org.scalatest.Matchers
import de.htwg.se.dicepoker.model.tableComponent.Player

class PokerTableSpec extends WordSpec with Matchers {

  "A PokerTable" can {
    val aDiceCup = DiceCup(List(1, 2, 3, 4, 5))
    val aPlayer1 = Player("Testplayer1", 5, aDiceCup)
    val aPlayer2 = Player("Testplayer2", 5, aDiceCup)
    val players: Vector[Player] = Vector(aPlayer1, aPlayer2)

    val aTable = PokerTable(players)

    "roll the dice of existing dice cups" in {
      val updatedTable = aTable.rollTheDice
      val updatedPlayer1 = updatedTable.players(0)
      val updatedPlayer2 = updatedTable.players(1)
      aPlayer1.name should be(updatedPlayer1.name)
      aPlayer2.name should be(updatedPlayer2.name)
    }

  }
}