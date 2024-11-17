import org.example.CardHolder
import org.example.CardHolderConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

def context = new AnnotationConfigApplicationContext(CardHolderConfig)
def cardHolder = context.getBean(CardHolder)
println cardHolder
context.close()