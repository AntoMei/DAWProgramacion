package Ejercicios.RPG.Character.Job;

import Ejercicios.RPG.Character.Stat.Dexterity;
import Ejercicios.RPG.Character.Stat.Intelligence;
import Ejercicios.RPG.Character.Stat.Stat;

public class Mage extends Job {

    @Override
    public int modifier(Stat stat) {
        
        int resultado = 0;

        if (stat instanceof Intelligence) {
            resultado = 4;
        }else if (stat instanceof Dexterity){
            resultado = 1;
        }
    
        return resultado;
    }

    @Override
    public String toString() {
        return "Mage []";
    }    
}