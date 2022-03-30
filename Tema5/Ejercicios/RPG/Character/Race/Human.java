package Ejercicios.RPG.Character.Race;

import Ejercicios.RPG.Character.Stat.Constitution;
import Ejercicios.RPG.Character.Stat.Dexterity;
import Ejercicios.RPG.Character.Stat.Stat;
import Ejercicios.RPG.Character.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        
        int resultado = 0;

        if (stat instanceof Strength) {
            resultado = 2;
        }else if (stat instanceof Constitution){
            resultado = 2;
        }else if (stat instanceof Dexterity){
            resultado = 1;
        }
    
        return resultado;
    }
}