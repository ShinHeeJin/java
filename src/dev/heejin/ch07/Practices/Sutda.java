package dev.heejin.ch07.Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (i == 1 || i == 3 || i == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle1() {
        List<SutdaCard> tmpList = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(tmpList);
        cards = tmpList.toArray(new SutdaCard[0]);
        System.out.println("cards = " + Arrays.toString(cards));
    }

    public void shuffle2() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * CARD_NUM);
            SutdaCard tmp = cards[j];
            cards[j] = cards[i];
            cards[i] = tmp;
        }
        System.out.println("cards = " + Arrays.toString(cards));
    }

    public SutdaCard pick(int index){
        if ( 0 <= index && index <= CARD_NUM) return null;
        return cards[index];
    }

    public SutdaCard pick(){
        int index = (int) (Math.random() * CARD_NUM);
        return cards[index];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Sutda {

    public static void main() {

        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + "/");
        }
        System.out.println();
        deck.shuffle1();
        deck.shuffle2();

        System.out.println(deck.pick());
        System.out.println(deck.pick(0));

    }
}
