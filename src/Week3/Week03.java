package Week3;

import java.util.ArrayList;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    /**
     * @param args
     */
    public static void main(String[] args)
    
        System.out.println(CONSOLE_CLEAR);
    {
        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        
        Student imaan = new Student ( 22201497, "Imaan");
        //imaan.print();

        Student nick = new Student (123456, "Nick");
        //nick.print();

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(imaan);
        students.add(nick);

        for (Student student: students)
        {
            student.print();
        }
        

    }

}


    private int playcount;
    private String name;

     //Constructor
     public Song(int playcount, String name)
     {
         this.playcount = playcount;
         this.name = name;
     }

        //print method
    public void print()
    {
        System.out.println("Playcount; " + this.playcount + "name " + this.name);
    }

{
    {

        System.out.println(CONSOLE_CLEAR);

        System.out.println(x: "===================================");


        Song clash = new Song (playcount: 154928844, name:"Stormzy");
        //clash.print();

        Song starlight = new Song (playcount: 157580689, name:"Dave");
        //starlight.print();

        Song onedance = new Song (playcount: 2446141850, name:"Drake");
        //onedance.print();

        Song starlight = new Song ( playcount: 157580689, name:"Future");
        //maskoff.print();

        Song solo = new Song (playcount: 77362421, name:"Future");
        //solo.print();

        Song maskoff = new Song (playcount: 1255933715, name:"Future");
        //maskoff.print();

        Song shivers = new Song (playcount: 998437751, name:"Ed Sheeran");
        //shivers.print();

        Song perfect = new Song (playcount: 2206747403, name:"Ed Sheeran");
        //perfect.print();

        Song impossible = new Song (playcount: 567837450, name:"James Arthur");
        //impossible.print();

        Song bruises = new Song (playcount: 849598780, name:"Lewis Capaldi");
        //bruises.print();

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(sunrise);

        for (Song song: songs)
        {
            song.print();
        }








    }
}




    



    
    







    
