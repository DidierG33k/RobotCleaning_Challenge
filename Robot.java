public class Robot {
    private boolean [] CleanedRooms;
    public Robot() {
CleanedRooms = new boolean[4];
    }
public  void CleanHouse(){
        for (int i=0; i<CleanedRooms.length;i++)
        {
            System.out.println("Cleaned room"+ (i+1));
            CleanedRooms[i]=true;
        }
        System.out.println("All rooms are cleaned");
}

    public  static  void  main(String[]args)
    {
        //create an object to call the method
     Robot cleaner=new Robot();
     cleaner.CleanHouse();

    }
}
