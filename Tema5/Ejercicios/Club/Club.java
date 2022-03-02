package Ejercicios.Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club 
{
    private ArrayList<Membership> list = new ArrayList<>();
    // Define any necessary fields here ...
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        list.add(member);
    
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return list.size();
    }

    //Método joinedInMonth
    public int joinedInMonth(int month){

        int contador = 0;

        if (month > 1 && month < 12) {
            for (Membership itemMember : list){
                if (itemMember.getMonth() == month) {
                    contador++;
                }
            }
        }else{
            System.out.println("Error");
        }
        return contador;
    }
    //Método purge
    public void purge(int month){
        Iterator<Membership> it = list.iterator();
    
        while (it.hasNext()) {
            Membership member = it.next();
            if (member.getMonth() == month) {
                it.remove();  
            }  
        }
    }
}