package Week3;

import java.util.ArrayList;

public class MusicApp {
    public static void main(String[] args)
    {
        String Songname;
        Song clash = new Song (154928844, "Stormzy", "Clash");
        //clash.print();

        Song starlight = new Song (157580689, "Dave", "starlight");
        //starlight.print();

        Song onedance = new Song (244614185, "Drake", "onedance");
        //onedance.print();

        Song solo = new Song (77362421, "Future", "solo");
        //solo.print();

        Song feelings = new Song (14974183, "Yungen", "feelings");
        //feelings.print();

        Song maskoff = new Song (1255933715,"Future", "maskoff");
        //maskoff.print();

        Song shivers = new Song (998437751, "Ed Sheeran", "shivers");
        //shivers.print();

        Song perfect = new Song (220674740, "Ed Sheeran", "perfect");
        //perfect.print();

        Song impossible = new Song (567837450, "James Arthur", "impossible");
        //impossible.print();

        Song bruises = new Song (849598780, "Lewis Capaldi", "bruises");
        //bruises.print();

        ArrayList<Song> songs = new ArrayList<Song>();

        Song sunrise = new Song(556122, "Ali Gatie", "sunrise");
        songs.add(sunrise); 
        songs.add(clash);  
        songs.add(starlight);
        songs.add(onedance);
        songs.add(solo);
        songs.add(feelings);
        songs.add(maskoff);
        songs.add(shivers);
        songs.add(perfect);
        songs.add(impossible);
        songs.add(bruises);

        

        


  




    }

    /* 
    void remove(int playcount)
    {
        Song song = findByplaycount(849598780);
        if(song !=null)
           songs.remove(song);
           else
           System.out.println("Could not find song");
    }

    private void remove(Song song) {
    }

    private Song findByplaycount(int i) {
        return null;
    }
    */
    
}
