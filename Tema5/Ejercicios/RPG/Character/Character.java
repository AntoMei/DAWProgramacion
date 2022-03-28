package Ejercicios.RPG.Character;

import Ejercicios.RPG.Character.Job.Job;
import Ejercicios.RPG.Character.Race.Race;
import Ejercicios.RPG.Character.Stat.Constitution;
import Ejercicios.RPG.Character.Stat.Dexterity;
import Ejercicios.RPG.Character.Stat.Intelligence;
import Ejercicios.RPG.Character.Stat.Strength;
import Ejercicios.RPG.Item.Food.IConsumable;

public class Character implements IDamageable{
    private final String name;
    private final Race race;
    private final Job job;
    private double health;

    private final Strength strength;
    private final Dexterity dexterity;
    private final Constitution constitution;
    private final Intelligence intelligence;

    public Character(final String name, final Race race, final Job job, final int strength, final int dexterity, final int constitution, final int intelligence, double health){
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(strength);
        this.dexterity = new Dexterity(dexterity);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence); 
    }

    public String getName(){
        return name;
    }
    
    public Race getRace(){
        return race;
    }

    public Job getJob(){
        return job;
    }
    
    public double velocity(){
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2.0f;
    }

    public double power(){
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2.0f;
    }

    public double magic(){
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) * 2.0f;
    }
    
    @Override
    public String toString() {
        return "Character [constitution=" + constitution + ", dexterity=" + dexterity + ", intelligence=" + intelligence
                + ", job=" + job + ", name=" + name + ", race=" + race + ", strength=" + strength + "]";
    }

    @Override
    public double maxHealth() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        if (health < 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void receivesDamage(double amount) {
        health = health - amount;
        System.out.println("Kram received" + amount + ". Health: " + health);
    }

    @Override
    public void heals(double amount) {
        double curacionCompleta = 0;
        if(health < 250){
            curacionCompleta = health + amount;

            if(curacionCompleta > 250){
                health = 250;
            }else{
                health = curacionCompleta;
            }
        }
    }

    public void consumes(IConsumable consumable){
        consumable.consumedBY(this);
    }
}