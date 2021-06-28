package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        players.add(new Player("周润发"));
        players.add(new Player("刘德华"));
        players.add(new Player("周星驰"));
        players.add(new Player("佳乐"));
        players.add(new Player("家乐"));
        //洗牌前
        intlizedCard(cards);
        Collections.shuffle(cards);
        //洗牌后
        //System.out.println(cards);
        //抽牌
        for (int i = 0; i < 4; i++) {
            for (Player player: players){
                Card card = cards.remove(0);
                player.cardList.add(card);
            }
        }
        System.out.println(cards);
        System.out.println(players);
        Card toFound = new Card("♣",2);
        Player player8 = players.get(0);
        if (! player8.cardList.contains(toFound)) {
            player8.cardList.set(0,toFound);
        }
        for (Player player: players) {
            for (Card card: player.cardList) {
                if (card.equals(toFound)) {
                    System.out.println(player.name+"获胜");
                    return;
                }
            }
        }
        System.out.println("没有玩家获胜");
    }

    private static void intlizedCard(List<Card> cards) {
     for (String suit: new String[]{"♣","♦","♠","♥"}) {
         for (int i = 1; i < 6; i++) {
             Card card = new Card(suit,i);
             cards.add(card);
         }
     }
        //System.out.println(cards);
    }
}
