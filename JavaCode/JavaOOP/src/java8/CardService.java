package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CardService {
    private static List<Card> cardList = new ArrayList<>();
    
    public CardService() {
        Card card1 = new Card(123, "农行卡");
        Card card2 = new Card(234, "工行卡");
        cardList.add(card1);
        cardList.add(card2);
    }
    
    public Card getCardByUser(User user) {
        return cardList.stream().filter(card -> card.getNumber() == user.getCardNumber()).findFirst().get();
    }
}
