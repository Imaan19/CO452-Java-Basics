package Week3;

public class Song 
{
   private String name;
   private int playcount;
   //Constructor
   public Song(int playcount, String name, String songname)
   {
    this.playcount = playcount;
    this.name = name;

   }

    
   public Song(int i, String string) 
   {

}


//print method
   public void print()
   {
         System.out.println("playcount; " + this.playcount + "name " + this.name);

         
   }





}
