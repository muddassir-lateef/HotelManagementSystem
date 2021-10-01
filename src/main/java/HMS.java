import java.util.ArrayList;
import java.util.Scanner;

public class HMS {
    int lastRoom;
    ArrayList<Room> rooms=null;
    ArrayList<Guest> guests=null;

    public HMS()
    {
        rooms= new ArrayList<Room>();
        guests= new ArrayList<Guest>();

        lastRoom=0;
    }
    public boolean bookroom(String c)
    {
        boolean av=false;
        int rn=-1;
        for(int i=0;i<rooms.size();i++)
        {
            if(rooms.get(i).available==true)
            {
                av=true;
                rn=i;

            }

        }
        if(av==false)
        {
            System.out.println("No room is empty!");

            return false;
        }
        else
        {
            guests.add(new Guest(c,rn));

        }
        return true;
    }

    public void search(int rn)
    {
        System.out.println("Guests in the specified room:");

        for(int i=0;i<guests.size();i++)
        {

            if(guests.get(i).roomNo==rn)
            {
                System.out.println(guests.get(i).name);

            }

        }

    }
    public boolean Addroom()
    {
        rooms.add(new Room(lastRoom));

        lastRoom++;
        return true;
    }
    public void getAvRooms()
    {
        System.out.println("Available Rooms:- ");

        for(int i=0;i<rooms.size();i++)
        {

            if(rooms.get(i).available==true)
            {
                System.out.println("Room No. "+i+" ");
            }

        }

    }

}
