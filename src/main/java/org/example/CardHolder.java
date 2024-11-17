package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class CardHolder {
    Card card;
    String name;

    public CardHolder() {
    }

    @Autowired
    public CardHolder(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
