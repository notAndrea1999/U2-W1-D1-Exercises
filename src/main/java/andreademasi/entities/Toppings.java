package andreademasi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Toppings {
    private String name;
    private int Kcal;
    private double price;

    @Override
    public String toString() {
        return "Toppings{" + name + ", " + Kcal + ", " + price + '}';
    }
}
