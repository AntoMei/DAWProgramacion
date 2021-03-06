package Ejercicios.RPG.Character.Race;

import Ejercicios.RPG.Character.Stat.Stat;

public abstract class Race {
    public abstract int modifier(Stat stat);

    public boolean equals(Object obj){
        return getClass().getName().equals(obj.getClass().getName());
    }

    public String toString(){
        return getClass().getName();
    }  
}