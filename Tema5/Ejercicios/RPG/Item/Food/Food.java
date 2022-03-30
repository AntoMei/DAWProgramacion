package Ejercicios.RPG.Item.Food;

import Ejercicios.RPG.Character.Character;

public abstract class Food implements IConsumable{
    private int power;

    public Food(int power) {
        this.power = power;
    } 

    public void consumeBY(Character character){
        character.heals(power);
    }
}