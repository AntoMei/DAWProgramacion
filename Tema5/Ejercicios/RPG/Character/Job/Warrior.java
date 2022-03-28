package Ejercicios.RPG.Character.Job;

import Ejercicios.RPG.Character.Stat.Constitution;
import Ejercicios.RPG.Character.Stat.Stat;
import Ejercicios.RPG.Character.Stat.Strength;

public class Warrior extends Job {

    @Override
    public int modifier(Stat stat) {
        
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = 5;
        }else if (stat instanceof Constitution){
            resultado = 2;
        }
    
        return resultado;
    }

    @Override
    public String toString() {
        return "Warrior []";
    }  
}