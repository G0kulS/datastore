public class Result {
    public boolean winner (int[] r, char[][] tt)
    {   Check f = new Check();
        boolean result = false;
        if(r[0]==1&&r[1]==1)
        {
            boolean r1 = f.cRowAndColumn(r,tt);
            r[0] = 0;
            r[1] = 0;
            boolean r2 = f.cCross(r,tt);
            r[1] =2 ;
            boolean r3 = f.cCross(r,tt);
            if(r1||r2||r3)
            {
                result = true;
            }
        }
        else {
        if(r[0]==1||r[1]==1)
        {
            result=f.cRowAndColumn(r,tt);
        }
        else
        {
            boolean r1 = f.cRowAndColumn(r,tt);
            boolean r2 = f.cCross(r,tt);
            if(r1||r2)
            {
                result = true ;
            }
        }

    }
        return result;
    }
}
