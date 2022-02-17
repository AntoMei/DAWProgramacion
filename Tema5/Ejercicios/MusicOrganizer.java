package Ejercicios;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(isValidIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(isValidIndex(index)) {
            files.remove(index);
        }else{
            System.out.println();
        }
    }

    //Método checkIndex
    public void checkIndex(int parametro){
        if ((parametro < 0) || (parametro >= files.size())) {
            System.out.println("Error, el rango válido de valores esta entre 0 y " + (files.size()-1));  
        }
    }

    //Método isValidIndex
    public boolean isValidIndex(int parametro){
        if ((parametro < 0) || (parametro >= files.size())) {
            return false;
        }else{
            return true;
        }
    }
}