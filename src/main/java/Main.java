import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        HMS hotel=new HMS();

        System.out.println("I am a Geek");
        int op=-1;

        while(op!=0)
        {
            System.out.println("1.Add Room");
            System.out.println("2.Show Available Rooms");

            System.out.println("Press 0 to Exit!");
            Scanner sc= new Scanner(System.in);
            op= sc.nextInt();
            if(op==1)
            {
                hotel.Addroom();
            }
            if(op==2)
            {
                hotel.getAvRooms();
            }
        }
    }

}
