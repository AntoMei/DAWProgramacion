package Ejercicios.musicv5;

/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //Campo playCount
    private int playCount;
    //Campo album
    private String album;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    //@param para documentar los atributos.
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
   //Se borrá el método Details
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    
    //Método set resetPlayCount
    public void resetPlayCount(){
        playCount = 0;
    }
    //Método set incplayCount
    public void incPlayCount(){
        playCount++;
    }

    //Método fijar album set consAlbum
    public void setAlbum(String album){
        this.album = album;
    }

    //Métogo get consutar album
    public String getAlbum(){
        return album;
    }

    @Override //Decorador. //Override sobreescribe el método
    //Método toString
    public String toString(){
        return artist + ": " + title + 
        "  (file: " + filename + ")" + 
        " " + album;

    }
}