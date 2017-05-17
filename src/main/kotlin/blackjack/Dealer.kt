package blackjack

/**
 * Created by xoma on 15/05/2017.
 */

class Dealer(val shoe: Takable = Shoe()) {
    fun deal(player: Player) {
        player.receive(shoe.take())
    }
}
