package MoEzwawi.BES5L1.entities;

import java.util.List;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Menu {
    private List<Pizza> listOfPizzas;
    private List<Topping> listOfToppings;
    private List<Beverage> listOfBeverages;
}
