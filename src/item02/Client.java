package item02;

import item02.concrete.CalzonePizza;
import item02.concrete.CalzonePizza.Builder;
import item02.concrete.SeoulPizza;
import item02.domain.Size;
import item02.domain.Topping;

public class Client {

    public static void main(String[] args) {
        SeoulPizza seoulPizza = new SeoulPizza.Builder(Size.SMALL).addTopping(Topping.HAM)
                                                                  .addTopping(Topping.ONION)
                                                                  .build();

        System.out.println(seoulPizza.getToppings());
        System.out.println(seoulPizza.getSize());

        CalzonePizza calzonePizza = new Builder().sauceInside(false)
                                                 .addTopping(Topping.PEPPER)
                                                 .addTopping(Topping.SAUSAGE)
                                                 .build();

        System.out.println(calzonePizza.getToppings());
        System.out.println(calzonePizza.isSauceInside());
    }

}
