package Ejercicios.RPG.Item.Food;

public abstract class Food implements IConsumable{
    private int power;

    public Food(int power) {
        this.power = power;
    }

    @Override
    public void consumedBY(Character character) {
    } 
}