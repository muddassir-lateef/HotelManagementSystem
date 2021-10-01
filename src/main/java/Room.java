import java.util.ArrayList;
public class Room {
    int RoomNo;
    boolean available;
    boolean reserved;
    String freeon;
    public Room(int rn)
    {
        RoomNo=rn;
        available=true;
        reserved=false;
        String freeon="";

    }
}

