package Ejercicios.music;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
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
        if(index >= 0 && index < files.size()) {
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
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    //Método listAllFiles
    public void listAllFiles(){
        for (String filename: files) {
            System.out.println(filename);
        }
    }

    //Método listMaching //Con un boolean o un contador
    public void listMatching(String match){
        boolean resultado = false;
        for (String filename : files) {
            if (filename.contains(match)) {
                System.out.println(filename);   
                resultado = true;
            }
        }
        if (!resultado) {
            System.out.println("Error");
        }
    }
            
    //Método playMatching
    public void playMatching(String match){
        for (String filename : files) {
            if (filename.contains(match)) {
                player.playSample(filename);
            }  
        }
    }
 
    //Método getMatching
    public void getMatching(String match){
        for (int i = 0; i < match.length(); i++) {
        }
    }

    //Método findFirst
    public void findFirst(String searchString){
        boolean buscador;
        int indice = 0;
        int tamaño = files.size();
        while ( ) {
            
        }
    }
}