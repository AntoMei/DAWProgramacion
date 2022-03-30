package Ejercicios.RPG.Item.Potion;

import Ejercicios.RPG.Item.Food.IConsumable;

import Ejercicios.RPG.Character.Character;

public abstract class Potion implements IConsumable {
    private int power;

    public Potion(int power) {
        this.power = power;
    }

    public void consumedBY(Character character){
        character.heals(power);
    }
}