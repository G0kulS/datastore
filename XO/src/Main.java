import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        Ttinput d = new Ttinput();
         Result ch = new Result();
        char[][] tt = new char[3][3];
        int i = 0;
        for( ; i < 9 ; i++)
        {

                printingtt(tt);
                System.out.println();
                System.out.println(playercheck(d.count)+"--"+"Please Enter the position : ");
                int positon  = g.nextInt();
                if(valid(positon))
                {
                    if(i>=4)
                    {
                        if(d.pcheck(positon,tt))
                        {
                            d.input(positon,tt);
                           if(ch.winner(d.positionfinder(positon),tt))
                           {
                               System.out.println("-------------------------");
                               System.out.println("| "+"Winner --"+playercheck(i)+" |");
                               System.out.println("-------------------------");
                               break;
                           }

                        }
                        else
                        {
                            i--;
                        }
                    }
                    else
                    {
                       if(d.pcheck(positon,tt))
                       {
                           d.input(positon,tt);
                       }
                       else
                       {
                           i--;
                       }
                    }
                }
                else
                {
                    i--;
                }


        }
        if(i>8) {
            System.out.println("-------------------------");
            System.out.println("|      Match Tied        |");
            System.out.println("-------------------------");
        }
    }
    public static void printingtt(char[][] tt)
    {
        for(int i=0 ; i<3;i++)
        {
        System.out.println("_____________");
        System.out.println("| "+tt[i][0]+" | "+tt[i][1]+" | "+tt[i][2]+" |");
       // System.out.println("-----------------");
        }
    }
    public static boolean valid(int i)
    {
        if(i>=1&&i<=9)
        {
            return true;
        }
        else
        {
            System.out.println("Please enter valid position between 1  to 9 :  ");
            return  false ;

        }
    }
    public static String playercheck(int i)
    {
        if(i%2==0)
        {
            return "Player1";
        }
        else
        {
            return "Player2";
        }
    }
}
