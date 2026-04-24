package Day11nd12;

import java.util.Random;

class Card {
    String suit;
    String rank;
    int rankValue;

    Card(String suit, String rank, int rankValue) {
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rankValue;
    }

    void display() {
        System.out.println(rank + " of " + suit);
    }
}

class CardNode {
    Card card;
    CardNode next;

    CardNode(Card card) {
        this.card = card;
        this.next = null;
    }
}

class CardQueue {
    CardNode front;
    CardNode rear;

    void enqueue(Card card) {
        CardNode newNode = new CardNode(card);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    Card dequeue() {
        if (front == null) {
            return null;
        }

        Card card = front.card;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return card;
    }

    void sortByRank() {
        if (front == null) {
            return;
        }

        for (CardNode i = front; i != null; i = i.next) {
            for (CardNode j = i.next; j != null; j = j.next) {
                if (i.card.rankValue > j.card.rankValue) {
                    Card temp = i.card;
                    i.card = j.card;
                    j.card = temp;
                }
            }
        }
    }

    void displayCards() {
        CardNode temp = front;

        while (temp != null) {
            temp.card.display();
            temp = temp.next;
        }
    }
}

class Player {
    int playerNumber;
    CardQueue cardQueue;

    Player(int playerNumber) {
        this.playerNumber = playerNumber;
        cardQueue = new CardQueue();
    }

    void addCard(Card card) {
        cardQueue.enqueue(card);
    }

    void sortCards() {
        cardQueue.sortByRank();
    }

    void displayPlayerCards() {
        System.out.println("\nPlayer " + playerNumber + " Cards:");
        cardQueue.displayCards();
    }
}

class PlayerNode {
    Player player;
    PlayerNode next;

    PlayerNode(Player player) {
        this.player = player;
        this.next = null;
    }
}

class PlayerQueue {
    PlayerNode front;
    PlayerNode rear;

    void enqueue(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void displayPlayers() {
        PlayerNode temp = front;

        while (temp != null) {
            temp.player.displayPlayerCards();
            temp = temp.next;
        }
    }
}

public class DeckOfCardsQueue {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        Card[] deck = new Card[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = new Card(suits[i], ranks[j], j + 2);
                index++;
            }
        }

        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(52);

            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            players[i] = new Player(i + 1);
        }

        index = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i].addCard(deck[index]);
                index++;
            }

            players[i].sortCards();
        }

        PlayerQueue playerQueue = new PlayerQueue();

        for (int i = 0; i < 4; i++) {
            playerQueue.enqueue(players[i]);
        }

        playerQueue.displayPlayers();
    }
}