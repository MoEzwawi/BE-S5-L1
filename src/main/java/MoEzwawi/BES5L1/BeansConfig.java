package MoEzwawi.BES5L1;

import MoEzwawi.BES5L1.entities.Beverage;
import MoEzwawi.BES5L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    Beverage getBeer(){
        return new Beverage("Birra",300,3.00);
    }
    @Bean
    Beverage getCoke(){
        return new Beverage("Coca",500,2.50);
    }
    @Bean
    Beverage getWater(){
        return new Beverage("Acqua",0,1.50);
    }
    @Bean
    Topping getHam(){
        return new Topping("Prosciutto",250,2.50);
    }
    @Bean
    Topping getBurrata(){
        return new Topping("Burrata",500,3.00);
    }
    @Bean
    Topping getMozzarella(){
        return new Topping("Mozzarella",400,2.00);
    }
    @Bean
    Topping getTomato(){
        return new Topping("Tomato",70,1.50);
    }
}
