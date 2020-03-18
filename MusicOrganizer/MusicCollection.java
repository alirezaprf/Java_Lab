package MusicOrganizer;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the music files.
    private ArrayList<Music> musics;
    // A player for the music files.
    private MusicPlayer player;






    //////////////////////////

     
    private ArrayList<Music> favorites;
    /////////////////////////






        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        musics=new ArrayList<Music>();
        favorites=new ArrayList<Music>();
        player=new MusicPlayer();
        
    }
    


    public void addFavorite(Music music)
    {
        favorites.add(music);
    }
    public void removeFavorite(Music music)
    {
        musics.remove(music);
    }

    public void search(String namelike) {
        for(Music m:musics)
        {
            if(m.getFile().contains(namelike) || m.getSinger().contains(namelike))
            {
                System.out.println(m.print());
            }
        }
    }


    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        musics.add(music);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return musics.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        ///?????
        System.out.println(musics.get(index).print());
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music music:musics)
        {
            System.out.println(music.print());
        }
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(this.validIndex(index))
        {
            musics.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(musics.get(index).getFile());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        return (index>=0 && index<musics.size());
        // The return value.
        // Set according to whether the index is valid or not.
       
    }
}