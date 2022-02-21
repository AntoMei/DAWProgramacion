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

    private int playCount;

    private String album;
    private int seconds;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
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

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return album;
    }
          
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, int seconds)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.seconds = seconds;
    }

    public void resetPlayCount(){
        playCount = 0;
    }

    public void incPlayCount(){
        playCount++;
    }

    @Override
    public String toString(){
        return artist + ": " + title +
                "  (file: " + filename + ")" + 
                " " + album;
    }

    public Track(String filename, int seconds){
        setDetails("unknown", "unknown", filename, seconds);

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void incSeconds(){
        this.seconds++;
    }

    public void decSeconds(){
        this.seconds--;
    }

}