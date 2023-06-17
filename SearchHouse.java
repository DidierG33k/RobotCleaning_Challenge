import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SearchHouse {

    private final int NUM_ROOMS=10;
    private  boolean [] cleanedRooms= new boolean[NUM_ROOMS];
    private final Set<Integer> visitedRooms= new HashSet<Integer>();
    public  SearchHouse(){
        for(int i=0; i<NUM_ROOMS; i++){
            cleanedRooms[i]=true;
        }
    }

public  void cleanHouse(){
        int roomTOclean;
        Random random= new Random();
        while (visitedRooms.size()<NUM_ROOMS)
        {
            roomTOclean=random.nextInt(NUM_ROOMS);
            if(!visitedRooms.contains(roomTOclean))
            {
                visitedRooms.add(roomTOclean);
                System.out.println("Cleaning Room" + (roomTOclean+1));
                cleanedRooms[roomTOclean]= true;
            }
        }

    }
    //this is method to verify if all rooms have been cleaned
public  boolean isHouseclean(){
        for(int i=0; i<NUM_ROOMS;i++){
            if(!cleanedRooms[i]){
                return  false;
            }
        }
        return true;
}



public  static void main(String[]args)
    {
SearchHouse cleaner=new SearchHouse();
cleaner.isHouseclean();
if(cleaner.isHouseclean())
{
    System.out.println("---The house is clean!!!");
}
else{
    System.out.println("The house is not cleaned");
}
    }
}
