public class Check {
    public boolean cRowAndColumn(int[] r , char[][] tt)
    {
        boolean result = false ;
        char element = tt[r[0]][r[1]];
        int row = 0 ;
        int column =0 ;
        //System.out.println("TO be checked "+ element);

        for(int i =0 ;i<3;i++)
        {
            if(tt[r[0]][i]==element)
            {  //  System.out.println("row plus one");
                row++;
            }
            if(tt[i][r[1]]==element)
            {  //System.out.println("column plus one");
                column++;
            }
        }
        if(row==3||column==3)
        {
            //System.out.println("checking  "+" True");
            return true;

        }
        else
        {  //System.out.println("checking  "+" false");
            return false;
        }

    }
    public boolean cCross(int[] r , char[][] tt)
    {
        char element = tt[r[0]][r[1]];
        int i1 = 1;
        int i2 =1;
        int index1 =r[0];
        int index2 = r[1];
        int count = 0 ;
        if(r[0]==2)
        {
            i1 = -1;
        }
        if(r[1]==2)
        {
            i2 =-1;
        }
        for(int i =0 ; i<3;i++)
        {
            if(tt[index1][index2]==element)
            {
                count++;
            }
            index1+=i1;
            index2+=i2;
        }
        if(count==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
