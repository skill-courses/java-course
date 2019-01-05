package java8;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class UserCardTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        CardService cardService = new CardService();
        CompletableFuture<User> userCompletableFuture = CompletableFuture.supplyAsync(() -> userService.getUser(1));
        CompletableFuture<Card> cardCompletableFuture = userCompletableFuture.thenCompose(user -> CompletableFuture.supplyAsync(() -> cardService.getCardByUser(user)));
        Card card = cardCompletableFuture.join();
        System.out.println(card.getName());
    }
}
