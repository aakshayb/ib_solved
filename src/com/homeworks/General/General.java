package com.homeworks.General;

import java.io.UnsupportedEncodingException;
import java.util.*;

import static java.lang.System.out;

/**
 * Created by Akshay on 3/19/2016.
 */
public class General
{
  public static void main(String... args)
  {
    General general = new General();
   List another = general.allFactors(6);
    another = general.sieve(18);
    String res = general.findDigitsInBinary(13);
    another = general.getRow(2);
    int ref = general.cntBits(new ArrayList<>(Arrays.asList(1,3,5)));
    another = general.searchRange(new ArrayList(Arrays.asList(1)),1);

    int many = general.searchMatrix(new ArrayList<>( Arrays.asList(new ArrayList<>(Arrays.asList(1,3,5,7)),new ArrayList<>(Arrays.asList(10,11,16,20)),
        new ArrayList<>(Arrays.asList(23,30,34,50))) ) , 90  );

    boolean ret = general.checkPalindrome("Akshay");
    ret = general.checkPalindrome("Detartrated");

    List<Integer> a = Arrays.asList(5,1,3,2,4);

    another = Arrays.asList(Arrays.asList(4,5,6,7), Arrays.asList(10,12,14,16), Arrays.asList(9, 15, 18, 4),
        Arrays.asList(19, 115, 118, 14));
    a =  general.spiral(another);
    List<Integer>b = Arrays.asList(6, 12, 9, 1, 2, 7);

    a = general.wave(Arrays.asList(6, 0, 6, 12));
    List<Integer> array = general.wave(Arrays.asList(5,1,3,2,4));
    Collections.sort(a);
    a.add(4, 10);
    List<Integer>d = Arrays.asList(6, 12, 9, 1, 2, 7);
    general.maximumGap(d);

    general.rotate(another);
    Character cd = new Character('a');

    Character cd2 = new Character( (char) ('a'+ 4) );
    general.titleToNumber("AB");

    String abv =general.convertToTitle(28);
    int result = general.result(18, 8);

    ArrayList<ArrayList<Integer>> another2 = general.prettyPrint(3);

    general.power("16");
    Deque<String> stack = new LinkedList<>();
    //stack.getFirst()
    general.evalRPN(Arrays.asList("5", "1", "2", "+", "4", "*", "+", "3", "-" ));

    printASCII("FB");
    printASCII("Ea");

    String t1 = "FB";
    String t2 = "FB";
    boolean isTruthy = t1 == t2;
    testEqualStrings(t1, t2);

    HashMap test2HashMap = new HashMap();
    test2HashMap.put("Ea", 1);
    test2HashMap.put("FB", 2);

    //int bestProfit = bestProfit(new int[] {10, 7, 5, 8, 11, 9}) -->COMPILE ERROR, because cant do autoboxing on arrays of primitive type;
    Integer [] arr = new Integer[] {10, 7, 5, 8, 11, 9};

    int randomNumber = new Random().nextInt(10);
    int bestProfit = bestProfit(arr);
    long time2 = System.currentTimeMillis();


    int c = 0;

    int stop =1;
  }

  public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
    return searchMatrx(a,b);
  }

  private int searchMatrx(List<ArrayList<Integer>> a, int b)
  {
    if(a.size() == 0)
      return 0;
    if(a.size() == 1)
      return searchRow(a.get(0),b);
    int mid = a.size()/2;
    List<Integer> midList = a.get(mid);
    if(midList.get(midList.size()-1) == b || midList.get(0) ==b )
      return 1;
    if(midList.get(midList.size()-1) > b )
    {
      if(midList.get(0) > b )
        return searchMatrx(a.subList(0, mid), b);
      else
        return searchRow(midList,b);
    }
    else
    {
      return searchMatrx(a.subList(mid, a.size()), b);
    }
  }
  private int searchRow(List<Integer> list, int b)
  {
    if(list.size() == 0)
      return 0;
    if(list.size() == 1 )
    {
      if(list.get(0) !=b )
        return 0;
      else
        return 1;
    }
    int mid = list.size()/2;
    if(list.get(mid) == b)
      return 1;
    if(list.get(mid) > b)
      return searchRow(list.subList(0, mid),b);
    else
      return searchRow(list.subList( mid, list.size()),b);
  }
  public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
    int start = searchRangeStart(a,b,0, false);
    int end = searchRangeEnd(a,b,0, false);
    return new ArrayList<>(Arrays.asList(start,end));
  }
  public int searchRangeStart(final List<Integer> a, int b, int midPrev, boolean found) {
    if(a.size() == 0)
      return -1;
    int mid = a.size()/2;
    if(a.get(mid) == b)
    {
      if(mid == 0)
        return mid + midPrev;
      else if( a.get(mid-1) ==b )
        return searchRangeStart(a.subList(0, mid), b, midPrev, true);
      else
        return mid+midPrev;
    }
    if(found)
      return searchRangeStart(a.subList(mid, a.size()),b, mid+midPrev, found );
    if(a.get(mid) > b)
      return searchRangeStart(a.subList(0, mid),b,midPrev, false);
    else
      return searchRangeStart(a.subList(mid+1, a.size()), b, mid+midPrev+1, false);
  }
  public int searchRangeEnd(final List<Integer> a, int b, int midPrev, boolean found) {
    if(a.size() == 0)
      return -1;
    int mid = a.size()/2;
    if(a.get(mid) == b)
    {
      if(mid == 0 || mid+1 == a.size())
        return mid + midPrev;
      else if( a.get(mid+1) ==b )
        return searchRangeEnd(a.subList(mid, a.size()), b, mid+midPrev, true);
      else
        return mid+midPrev;
    }
    if(found)
      return searchRangeEnd(a.subList(0, mid),b, midPrev, found );
    if(a.get(mid) > b)
      return searchRangeEnd(a.subList(0, mid),b,midPrev, false);
    else
      return searchRangeEnd(a.subList(mid+1, a.size()), b, mid+midPrev+1, false);
  }

  public int cntBits(ArrayList<Integer> A) {
    ArrayList<ArrayList<Integer>> array = new ArrayList<>();
    long num = 0;

    for(int i=0; i< A.size(); i++)
    {
      if(i!=0)
      {
        int k =i;
        int l=0;
        while(k>0)
        {
          k--;
          num+= array.get(k).get(l);
          l++;
        }
      }
      ArrayList<Integer> list = new ArrayList<>();
      for(int j=i; j< A.size(); j++)
      {
        if(i==j)
        {
          continue;
        }
        int toAdd = numberBits(A.get(i), A.get(j));
        list.add(toAdd);
        num += toAdd;
      }
      array.add(list);
    }
    return (int)(num % 1000000007);

  }

  private int numberBits(int a, int b)
  {
    int ans = a ^ b;
    int res = 0;
    while (ans !=0)
    {
      if(ans%2 != 0)
        res++;
      ans /= 2;
    }
    return res;
  }

  public class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
     }
  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    Collections.sort(intervals, (o1, o2) -> {
      int compare = Integer.compare(o1.start, o2.start);
      if(compare != 0)
        return compare;
      compare = Integer.compare(o1.end,o2.end);
      return compare;
    });
    Iterator<Interval> iter = intervals.iterator();
    ArrayList<Interval> list = new ArrayList<>();
    Interval previous = null;

    while(iter.hasNext())
    {
      if(previous == null)
      {
        previous = iter.next();
        continue;
      }
      Interval current = iter.next();
      if(current.start <= previous.end)
      {
        previous = new Interval(previous.start, Math.max(current.end, previous.end));
      }
      else
      {
        list.add(previous);
        previous = current;
      }
    }
    list.add(previous);
    return list;
  }

  public ArrayList<Integer> getRow(int a) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> prev = new ArrayList<>();
    prev.add(1);
    if (a ==1)
      return prev;
    for(int i=1; i <=a; i++)
    {
      list = new ArrayList<>();
      for(int j=0; j< prev.size()+1 ; j++)
      {
        if(j==0)
          list.add(prev.get(j));
        else if(j== prev.size())
          list.add(prev.get(j-1));
        else
          list.add(prev.get(j) + prev.get(j-1)  );
      }
      prev = list;
    }
    return list;
  }

  public String findDigitsInBinary(int a) {
    Deque<Character> stack = new LinkedList<>();
    while(a !=0)
    {
      stack.addFirst(Character.forDigit(a%2, 10));
      a /= 2;
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty())
    {
      sb.append(stack.removeFirst());
    }

    return sb.toString();
  }

  public ArrayList<Integer> sieve(int a) {
    ArrayList<Integer> retList = new ArrayList<>();
    ArrayList<Boolean> boolList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    for(int i=2; i<=a; i++)
    {
      retList.add(i);
      boolList.add(true);
    }

    for(int i=0; i<retList.size(); i++)
    {
      if(!boolList.get(i))
        continue;

      int n = 1;
      int num = retList.get(i);
      while(num*n < a)
      {
        int index = n*retList.get(i) - 2*(retList.get(i)%2);
        n++;
        if(index == i)
          continue;
        boolList.set(index, false);

      }
    }
    for(int i=0; i< retList.size();i++)
    {
      if(boolList.get(i))
        list.add(retList.get(i));
    }
    return list;
  }

  private boolean isPrime(int num)
  {
    if(num <=1)
      return false;
    if(num <=3)
      return true;
    for(int i=2; i<= Math.sqrt(num); i++)
    {
      if(num%i == 0)
        return false;
    }
    return true;
  }

  public ArrayList<Integer> allFactors(int a) {
    ArrayList<Integer> retList = new ArrayList<>();
    for(int i=1 ;i<= Math.sqrt(a); i++)
    {
      if(a%i ==0)
      {
        retList.add(i);
        if(i != a/i)
          retList.add(a/i);
      }
    }
    Collections.sort(retList);
    return  retList;
  }

  public boolean checkPalindrome(String input)
  {
    char[] array = input.toLowerCase().toCharArray();
    int length = array.length;
    for(int i=0; i< length/2; i++)
    {
      if(array[i] != array[length-i-1])
      {
        return false;
      }
    }
    return true;
  }

  public int evalRPN(List<String> a) {
    Deque<Integer> stack = new LinkedList<>();
    int prev = 0;
    for(String word: a)
    {
      if(word.equals("/") || word.equals("*") || word.equals("+") || word.equals("-"))
      {
        int num1 = stack.removeFirst();
        int num2 = stack.removeFirst();
        switch(word)
        {
          case "+":
            prev = num1+ num2;
            break;
          case "/":
            prev = num2 /num1;
            break;
          case "*":
            prev =num1*num2;
            break;
          case "-":
            prev = num2 - num1;
            break;
        }
        stack.addFirst(prev);
      }
      else
        stack.addFirst(Integer.parseInt(word));
    }
    return stack.removeFirst();

  }

  public int power(String a) {
    // java.math.BigInteger a1 = new java.math.BigInteger(a);
    // boolean isPower = false;

    // while(a1.compareTo(java.math.BigInteger.ONE) >= 1 )
    //     {
    //         if(a1.remainder( new java.math.BigInteger("2")) == java.math.BigInteger.ZERO)
    //         {
    //             a1 = a1.divide(new java.math.BigInteger("2")) ;
    //             isPower = true;
    //         }
    //         else
    //             return 0;
    //     }
    //     if(isPower)
    //     return 1;
    // else
    //     return 0;
    if(a.length() == 0)
      return 0;
    if(a.length() == 1 && a.charAt(0) == '0' )
      return 0;




    while(a.length() > 0 && !a.equals("2") )
    {
      if(a.length()>0)
      {
        if( (char) (a.charAt(a.length()-1) - '0') %2 == 1)
          return 0;
      }
      StringBuilder sb = new StringBuilder();
      int carry = 0;
      for(int i=0; i< a.length(); i++)
      {
        char c = (char) (a.charAt(i) - '0');
        int res = c + 10*carry;
        c = (char)( res/2 + '0');
        carry = res %2;
        sb.append(c);
      }
      if(sb.charAt(0) == '0')
        sb.deleteCharAt(0);

      a = sb.toString();
    }
    return 1;
  }

  public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
    ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
    for(int i=0; i< a; i++)
    {
      ArrayList<Integer> each =null;
      if(i ==0 )
      {
        each = new ArrayList<Integer>();
        for(int j=0; j<2*a-1; j++)
          each.add(a);
        retList.add(each);
        retList.add(each);
        continue;
      }
      each = new ArrayList<>(retList.get(retList.size()-i));
      for(int j=0; j < 2*a -1; j++)
      {
        if(j >= i && j<= 2*a-2-i )
          each.set(j, a-i);
      }
      retList.add(i, each);
      if(i != (2*a-1)/2 )
        retList.add(i, each);
    }

    return retList;
  }

  private int result(int n, int m)
  {
    int min = Math.min(n,m);
    double res =1;
    for(int i=0; i < min; i++)
    {
      res *=n;
      res /=m;
      n--;
      m--;
    }
    return (int) Math.round(res);
  }

  public int titleToNumber(String a) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for(int i =0; i < 26; i++)
      hashMap.put(new Character( (char ) ('A' + i )  ), i+1);

    int sum = 0;
    a = new StringBuffer(a).reverse().toString();
    for(int i=0; i< a.length(); i++)
    {
      sum += Math.pow(26, i) * hashMap.get(a.charAt(i));
    }
    return sum;
  }

  public String convertToTitle(int a) {
    HashMap<Integer, Character> hashMap = new HashMap<>();
    for(int i=0; i < 26; i++ )
    {
      hashMap.put(i, new Character( (char) ('A'+i ) ) );
    }

    StringBuilder sb = new StringBuilder();
    int i =0;
    while (a >0)
    {
      int temp = (a -1+ 26)%26;
      a = (a-1) / 26;
      sb.append(hashMap.get(temp));
    }
    return sb.reverse().toString();
  }

  public void rotate(List<List<Integer>> a) {
    if (a == null || a.size() == 0)
      return;
    int n = a.size();
    int m = a.get(0).size();
    if (m == 1)
      return;
    for (int i = 0; i < n / 2 ; i++) {
      for (int j = i; j < m -i - 1; j++) {
        int temp = a.get(n - j - 1).get(m - 1 - i);

        //Set bottom-right
        a.get(n - j - 1).set(m - 1 - i, a.get(i).get(m - j - 1));

        //set top-right
        a.get(i).set(m - j - 1, a.get(j).get(i));

        //set top-left
        a.get(j).set(i, a.get(m - i - 1).get(j));

        //set bottom-left
        a.get(m - i - 1).set(j, temp);
      }
    }
  }

  public int maximumGap(final List<Integer> a) {
    int max = -1;
    Node[] indexArr = new Node [a.size()];
    for(int i=0; i < a.size(); i++)
    {
      indexArr[i] = new Node(a.get(i), i);
    }

    Arrays.sort(indexArr);


    return max;
  }
  class Node implements Comparable<Node>
  {
    int number;
    int index;
    Node(int n, int in)
    {
      number =n;
      index = in;
    }
    @Override
    public int compareTo(Node o)
    {
      if(this.number > o.number)
        return 1;
      else if(this.number == o.number )
        return 0;
      else
        return -1;
    }
  }

  public ArrayList<Integer> wave(List<Integer> a) {
    Collections.sort(a);
    ArrayList<Integer> ret = new ArrayList<>();
    for(int i=1; i< a.size(); i=i+2)
    {
      ret.add(a.get(i));
      ret.add(a.get(i-1));
    }
    if(ret.size() != a.size())
      ret.add(a.get(a.size()-1));
    return ret;
  }

  public List<Integer> spiral(List<List<Integer>> a)
  {
    if(a.size() == 1)
      return a.get(0);
    List<Integer> retList = new ArrayList<>();
    int r=0, c=0, layer=0;
    int dir = 1;
    int n = a.get(0).size() ;
    int m = a.size();
    for(int i=0; i < n*m; i++)
    {
      retList.add(a.get(r).get(c));
      switch(dir)
      {
        case 1: // going right
          if(c == n - layer-1)
          {
            dir = 2;
            r++;
          }
          else
            c++;
          break;
        case 2: // going down
          if(r == m - layer -1)
          {
            dir = 3;
            c--;
          }
          else
            r++;
          break;
        case 3: // going  left
          if(c == layer)
          {
            dir = 4;
            r--;
          }
          else
            c--;
          break;
        case 4: // going up

          if(r == layer +1)
          {
            dir = 1;
            c++;
            layer++;
          }
          else
            r--;
          break;

      }
    }
    return retList;
  }


  private static void testEqualStrings(String t1, String t2)
  {
    boolean isTruthy = t1 == t2;
    isTruthy = false;
  }
  public static int bestProfit(Integer [] prices )
  {
    int result =0; int buyPrice = prices[0];
    for(int i=0; i< prices.length-1; i++)
    {
      if(buyPrice > prices[i+1])
      {
        buyPrice = prices[i+1];
      }
      else {
        int diff= prices[i+1] - buyPrice ;
        result = diff > result ? diff : result;
      }

    }
    return result;
  }
  public static int bestProfitWrong( Integer[] prices )
  {
    List<Integer> unMutableArrayList = Arrays.asList(prices);
    Collections.sort(unMutableArrayList);

//        unMutableArrayList.remove(0); // operation fails at runtime

    List<Integer> another = new ArrayList<>(unMutableArrayList);
    another.remove(0); // creates a new list after copying from original;


    return prices[prices.length-1] - prices[0];
  }

  private static void printASCII(String text) {
    try {
      byte [] bytes = text.getBytes("US-ASCII");
      out.print(""+ bytes[0] + " " + bytes[1] + " "+ ( bytes[0] + bytes[1]));


    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }

  long factorial(long n) {return n <= 1 ? 1 : n*factorial(n-1);}

  public static int recursiveMultiply(int x, int n)
  {
    int result =x;
    if(n==1)
      return result;
    if( n % 2 == 1)
    {
      result *= x *recursiveMultiply(result, n/2);
    }else
    {
      result *= recursiveMultiply(result, n/2);
    }
    return  result;
  }

}

