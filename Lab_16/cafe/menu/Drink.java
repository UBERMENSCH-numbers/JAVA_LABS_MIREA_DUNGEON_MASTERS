package Lab_16.cafe.menu;

import Lab_16.cafe.interfaces.Alcoholable;


public final class Drink extends MenuItem implements Alcoholable {

    private final double alcoholVol;
    private final DrinkTypeEnum type;


    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }


    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }
}
