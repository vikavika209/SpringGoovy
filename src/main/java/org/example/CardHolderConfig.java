package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardHolderConfig {
    @Bean
    Card card(){
        return new Card();
    }

    @Bean
    CardHolder cardHolder(){
        return new CardHolder();
    }

}
