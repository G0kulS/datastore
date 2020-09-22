public class Ttinput {
    static int count = 0;
    public void input(int p,char[][] tt)
    {
        count++;
        int[] r = positionfinder(p);
        tt[r[0]][r[1]] = check(count);

    }
    public char check(int pos)
    {
        if(pos%2==0)
        {
            return '0';
        }
        else
        {
            return 'X';
        }
    }
    public boolean pcheck (int p , char[][] tt)
    {
        int[] r = positionfinder(p);
        if(tt[r[0]][r[1]] == '\0')
        {
          return true;

        }
        else
        {   System.out.println("Please enter valid position : ");
            return false;
        }
    }
    public int[] positionfinder(int p)
    {
        switch (p)
        {
            case 1:
            { int[] r = {0,0};
                return r; }
            case 2:{
                int[] r = {0,1};
                return r ; }
            case 3:{
                int[] r = {0,2};
                return r ; }
            case 4:{
                int[] r = {1,0};
                return r ; }
            case 5:{
                int[] r = {1,1};
                return r ; }
            case 6:{
                int[] r = {1,2};
                return r ; }
            case 7:{
                int[] r = {2,0};
                return r ; }
            case 8:{
                int[] r = {2,1};
                return r ; }
            case 9:{
                int[] r = {2,2};
                return r ; }
            default:
            {   int[] r ={0,0};
                return r ;}
        }
    }
}
