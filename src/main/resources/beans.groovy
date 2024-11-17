import org.example.Card
import org.example.CardHolder

beans = {
    cardBean(Card, "123456789")
    cardHolderBean(CardHolder, ref("cardBean"), "Ivan")
}