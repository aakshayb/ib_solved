package com.homeworks.General;


/**
 * Created by spiff on 1/16/16.
 */
public class Interleaved
{
   public static void main(String args[])
   {
       Interleaved one = new Interleaved();
     Interleaved a  = new Interleaved();
     a.isInterleave("B", "e", "Be");
     a.isInterleave("kQMi2G2DP4lDVycU2kraW49wnJ5oNQ5szn7tZ7aMA8sM", "J2qof422vinqzNsJIylQEZllxeSD", "Jk2qof4Q2M2vi2Gi2nDqP4zNsJlDIyVylQEcUZ2llkrxaWe49SwDnJ5oNQ5szn7tZ7aMA8sM" );
   }


    private String s1, s2, s3;
    public int isInterleave(String a, String b, String c) {
        s1 = a;
        s2 = b;
        s3 = c;
        if(a.length() == 0 || b.length() == 0)
            return c.contains(a) || c.contains(b) ? 1 : 0;

        return isInterleave(0,0,0) ? 1 : 0;
    }
    private boolean isInterleave(int index1, int index2, int index3)
    {
        boolean answer = false;
        if(index1 == s1.length() && index2 == s2.length())
            return true;
        if(index1 < s1.length() && s1.charAt(index1) == s3.charAt(index3))
            answer = isInterleave(index1+1 , index2, index3+1);
        if(index2 < s2.length() && s2.charAt(index2) == s3.charAt(index3) && !answer)
            answer = isInterleave(index1 , index2+1, index3+1);
        return answer;

    }

}
