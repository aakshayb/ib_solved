package com.homeworks.General;

import java.util.Scanner;

/**
 * Created by spiff on 2/25/16.
 */
public class AmazonPrelimScanner
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0)
        {

            int r = scanner.nextInt();
            int c = scanner.nextInt();

            //System.out.print("T "+t+  "R "+r+"C "+c);
            String[] bigArr = populateArr(scanner,r,c);

            r= scanner.nextInt();
            c= scanner.nextInt();

            //System.out.print("R "+r+"C "+c);

            String[] smallArr = populateArr(scanner,r,c);
            boolean matched = false;

            for(int i=0; i< bigArr.length - smallArr.length; i++)
            {
                for(int j=0; j< bigArr[0].length() - smallArr[0].length(); j++ )
                {
                    for(int k=0; k< smallArr[0].length(); k++)
                    {
                        for(int l=0; l< smallArr.length; l++) {
                            if (bigArr[i+k].charAt(j+k) == smallArr[k].charAt(l))

                            {
                                matched = true;
                                continue;
                            }
                            matched = false;
                            break;
                        }
                        if(!matched)
                            break;
                    }
                    if(matched)
                        break;
                }
                if(matched)
                    break;
            }
            System.out.println(matched?"YES":"NO");
            t--;
        }

    }
    private static String[] populateArr(Scanner scanner,int r, int c)
    {
        String[] strArr = new String [r] ;
        for(int i=0; i < r; i++)
        {
            strArr[i] = scanner.next();
        }
        return strArr;
    }
}
