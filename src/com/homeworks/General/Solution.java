package com.homeworks.General;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by Akshay on 2/18/2016.
 */
public class Solution
{
  public static void main(String args[])
  {
    Solution sorter = new Solution();
    List<Integer> arr = Arrays.asList(54,26,93,17,77,31,44,55,20);
    List<Integer> arrayList = new ArrayList<>(arr);
    //arrayList.toArray();

    Solution another = new Solution();
    String ret =  another.largestNumber(Arrays.asList(3, 30, 34, 5, 9));

    int res = another.compareVersion("01", "1");

    String ass = another.reverseWords("fwbpudnbrozzifml osdt          ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq");

    int abp = another.atoi(" 7 U 0 T7165  0128862 089 39 5");

    int ll = another.power("1");
    String longest = another.longestPalindrome("abcb");

    List<Integer> A = Arrays.asList(-2,-1,0,2,3);
    Collections.sort(A);
    boolean found = false;

    int j = A.size() - 1;
    for (int i = 0; i < A.size(); i++)
      for (; j > i; j--) {
        if (i != j && A.get(i) + A.get(j) == 0)
          found = true;
        if (A.get(i) + A.get(j) < 0)
          break; // Clearly A[i] + A[j] would decrease as j decreases.
      }

    ArrayList<Integer> B = new ArrayList<>(Arrays.asList(-2,3,-4,5,6));
    B.remove(2);
    another.threeSumClosest(B, 8);
    another.removeDuplicates(new ArrayList<>(Arrays.asList(5000,5000,5000 )));

    res = another.coverPoints(Arrays.asList(-5, 7, -12, 4, -6, 2, -5, -12, -6, 3, 11, 10, -8, 11, -13, -8, 5, -12, 4, 4),
        Arrays.asList( -6, 6, -8, -13, -2, -9, -10, -10, -7, -14, 9, -8, -4, 8, 13, -11, 13, 5, 9, 11));
    int d = another.Match("aaabbbac", "aba");

    int N = 1000;
    another.goodMatcher(N);


    String abc = "abc";
  }

  private  void goodMatcher(int N)
  {
    for(int a = 1; a <= N; a++)
      for(int b = 1; b<= N; b++)
      {
        double res1 = Math.pow(a,3) + Math.pow(b,3);
        if(intMap.containsKey(res1))
        {
          intMap.get(res1).add(new Point(a, b));
        } else
        {
          intMap.put(res1, new ArrayList<>(Collections.singletonList(new Point(a, b))));
        }
      }
    for(Map.Entry<Double, List<Point>> each: intMap.entrySet())
    {
      if(each.getValue().size() > 1)
      {
        List<Point> list = each.getValue();
        list.forEach(every -> System.out.println(every.x+""+""+every.y));
      }
    }
    //Poor matcher
    //    for(int a = 1; a <= N; a++)
//      for(int b = 1; b<= N; b++)
//        for(int c=1; c<=N; c++)
//          for(int d=1; d<=N; d++)
//            if(Math.pow(a,3) + Math.pow(b,3) == Math.pow(c,3) + Math.pow(d,3))
//              System.out.println("a"+a+"b"+b+"c"+c+"d"+d);
  }

  public int removeDuplicates(ArrayList<Integer> a) {
    int j =1;
    for(int i=1; i < a.size(); i++)
    {
      if(a.get(i).intValue() != a.get(i-1).intValue())
      {
        a.set(j,a.get(i));
        j++;
      }
    }
    return j;
  }

  public int threeSumClosest(ArrayList<Integer> a, int b) {
    if(a.size()<3)
      return 0;

    Collections.sort(a);

    int target = b;
    int retSum = a.get(0) + a.get(1) + a.get(2);
    if(a.size() == 3)
      return retSum;

    for(int i=0; i< a.size();i++)
    {
      target = b - a.get(i);
      int j = i+1;
      int k = a.size()-1;

      while(j<k)
      {
        int sum = a.get(j) + a.get(k);
        if(sum == target)
          return b;
        else if( sum < target)
          j++;
        else
          k--;

        int tempdiff = Math.abs(sum-target);
        int diff = Math.abs(retSum -b);
        if(tempdiff < diff)
          retSum = sum + a.get(i);
      }

    }
    return retSum;

  }

  public String longestPalindrome(String A) {

    int n;
    boolean [][] dp;
    int i;

    n = A.length();

    dp = new boolean[n][n];

    for (i = 0; i < n; i++)
      dp[i][i] = true;

    for (int len = 2; len <= n; len++) {

      int j;

      for (i = 0; i < n - len + 1; i++) {

        j = i + len - 1;

        if (len == 2) {
          if (A.charAt(i) == A.charAt(j)) {
            dp[i][j] = true;
          }
        } else {
          if (A.charAt(i) == A.charAt(j) && dp[i + 1][j - 1])
            dp[i][j] = true;
        }

      }

    }

    int start = -1;
    int len = -1;

    for (i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (dp[i][j] && j - i + 1 > len) {
          len = j - i + 1;
          start = i;
        }
      }
    }


    return A.substring(start, start + len);
  }

  public int atoi(final String a) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("0");
    hashSet.add("1");
    hashSet.add("2");
    hashSet.add("3");
    hashSet.add("4");
    hashSet.add("5");
    hashSet.add("6");
    hashSet.add("7");
    hashSet.add("8");
    hashSet.add("9");

    String st = "";

    for(int i=0; i< a.length(); i++)
    {
      if(hashSet.contains(""+a.charAt(i)))
        st += a.charAt(i);
    }
    int sum =0;
    for(int i=0; i< st.length(); i++)
    {
      sum+= Integer.parseInt(""+st.charAt(i)) * Math.pow(10, st.length()-1-i );
    }
    return sum;
  }

  public int power(String a) {
    BigInteger a1 = new BigInteger(a);
    while(a1.compareTo(BigInteger.ONE) >= 1 )
    {
      if(a1.remainder( new BigInteger("2")) == BigInteger.ZERO)
        a1 = a1.divide(new BigInteger("2")) ;
      else
        return 0;
    }
    return 1;



  }

  public  String reverseWords(String a) {

    String[] arr = a.split("\\s");
    StringBuilder sb = new StringBuilder();
    for(int i=0; i < arr.length; i++)
    {
      if(arr[arr.length -1 -i] == " ")
        continue;
      sb.append(arr[arr.length -1 -i]);
      if(i != arr.length -1)
        sb.append(" ");
    }

    return sb.toString();

  }
  public int compareVersion(String a, String b) {
    String[] arrA = a.split("\\.");
    String[] arrB = b.split("\\.");



    int len = Math.max(arrA.length, arrB.length);
    for(int i=0; i < len; i++)
    {
      if(i< arrA.length && i< arrB.length)
      {
        long aa = Integer.parseInt(arrA[i]);
        long bb = Integer.parseInt(arrB[i]);
        if(aa > bb)
          return 1;
        if(aa< bb)
          return -1;
      }
      if(i == arrA.length && i < arrB.length)
        return -1;
      if(i == arrB.length && i < arrA.length)
        return 1;
    }
    return 0;
  }
//  public String largestNumber(final List<Integer> A) {
//    StringBuffer strBuf = new StringBuffer();
//    Node num[];
//    int i = 0;
//
//    num = new Node[A.size()];
//
//    for (int n : A) {
//      num[i] = new Node(n);
//      i++;
//    }
//
//    Arrays.sort(num);
//
//    for (Node n : num) {
//      if (n.number == 0 && strBuf.length() != 0)
//        continue;
//      strBuf.append(n.number);
//    }
//
//
//    return strBuf.toString();
//  }

  public String largestNumber(List<Integer> a)
  {
    StringBuilder sb = new StringBuilder();
    List<Node> ar = new ArrayList<>();

    for(int each : a)
    {
      ar.add(new Node(each));
    }
    Node[] nodeArr = new Node[ar.size()];
    ar.toArray(nodeArr);
    Arrays.sort(nodeArr);

    for(Node each : nodeArr)
    {
      if(each.number == 0 && sb.length() !=0 )
        continue;
      sb.append(each.number);
    }
    return sb.toString();
  }

  class Node implements Comparable<Node>
  {
    int number;
    Node(int a)
    {
      number = a;
    }
    @Override
    public int compareTo(Node o)
    {
      String first = String.valueOf(this.number) + String.valueOf(o.number);
      String second = String.valueOf(o.number) + String.valueOf(this.number);

      return second.compareTo(first);
    }
  }

  private int Match(String a, String b)
  {
    int retVal = 0;
    for(int i=0; i<= a.length()-b.length(); i++)
    {
      for(int j =0; j< b.length(); j++)
      {
        if(a.charAt(i+j) == b.charAt(j))
          retVal =1;
        else
        {
          retVal = 0;
          break;
        }
      }
      if(retVal == 1)
        break;
    }
    return retVal;
  }

  static HashMap<Double, List<Point>> intMap = new HashMap<>();
  static class Point
  {
    int x, y;
    Point(int x1, int y1)
    {
      x =x1;
      y =y1;
    }
  }
  public int coverPoints(List<Integer> X, List<Integer> Y) {
    int steps = 0;
    for(int i=0; i< X.size()-1; i++)
    {
      int a = X.get(i);
      int b = Y.get(i);
      int x2 = X.get(i+1);
      int y2 = Y.get(i+1);
      while(a != x2  || b != y2)
      {
        if(a < x2 && b < y2)
        {
          int min = Math.min(Math.abs(x2-a), Math.abs(y2-b));
          a += min;
          b += min;
          steps += min;
        }
        if(a > x2 && b > y2)
        {
          int min = Math.min(Math.abs(x2-a), Math.abs(y2-b));
          a -= min;
          b -= min;
          steps += min;
        }
        if(a > x2 && b < y2)
        {
          int min = Math.min(Math.abs(x2-a), Math.abs(y2-b));
          a -= min;
          b += min;
          steps += min;
        }
        if(a < x2 && b > y2)
        {
          int min = Math.min(Math.abs(x2-a), Math.abs(y2-b));
          a += min;
          b -= min;
          steps += min;
        }
        if(b == y2 && a != x2)
        {
          int min = x2-a;
          a += min;
          steps += Math.abs(min);

        }
        if(a == x2 && b != y2)
        {
          int min = y2 - b;
          b += min;
          steps += Math.abs(min);
        }
      }
    }
    return steps;
  }

}
