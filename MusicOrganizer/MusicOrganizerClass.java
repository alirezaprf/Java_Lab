package MusicOrganizer;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicOrganizerClass {
    private ArrayList<String> tracks=new ArrayList<String>();

    public void removeTrack(String nameLike) {
        Iterator<String> it=tracks.iterator();
        while(it.hasNext())
        {
            if(it.next().contains(nameLike))
            {
                it.remove();
            }
        }
}
}