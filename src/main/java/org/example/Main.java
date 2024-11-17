package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericGroovyApplicationContext("beans.groovy");

        CardHolder cardHolder = (CardHolder) applicationContext.getBean("cardHolderBean");
        System.out.println(cardHolder);
    }
}


