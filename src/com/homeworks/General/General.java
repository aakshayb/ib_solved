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

    arr =  new Integer[]{7551982, 8124939, 4023780, 7868369, 4412570, 2542961, 7380261, 1164290, 7781065, 1164599, 2563492, 5354415, 4994454, 2627136, 5933501, 668219, 1821804, 7818378, 33654, 4167689, 8652323, 5750640, 9822437, 3466466, 554089, 6168826, 335687, 2466661, 8511732, 6288553, 2905889, 7747975, 3744045, 1545003, 1008624, 8041203, 7176125, 4321092, 714053, 7200073, 166697, 7814651, 3090485, 8318668, 6600364, 3352620, 2430137, 7685821, 1442555, 828955, 6540266, 5305436, 116568, 1883410, 7975347, 9629015, 4735259, 6559041, 1832532, 5840170, 6983732, 5886179, 1496505, 7241412, 144558, 9462840, 8579314, 2488436, 9677478, 7589124, 5636642, 2440601, 1767332, 2399786, 6299635, 8534665, 1367339, 805592, 5572668, 6990026, 8465261, 4808596, 7641452, 8464860, 3170126, 7403200, 6932907, 3776122, 1313688, 3992189, 2382116, 3886952, 349816, 1596435, 7353742, 9964868, 9882224, 3818546, 3885458, 1200559, 3910256, 7949895, 463872, 6392805, 9513226, 3427933, 3470571, 6225817, 552452, 5567651, 6414423, 6701681, 4725847, 894529, 8046603, 426263, 5280891, 9197661, 9764507, 1740413, 9530261, 9163599, 7561587, 5848442, 7312422, 4794268, 5793465, 5039382, 5147388, 7346933, 4697363, 6436473, 5159752, 2207985, 8256403, 8958858, 6099618, 2172252, 3063342, 4324166, 3919237, 8985768, 2703255, 2386343, 3064166, 247762, 7271683, 1812487, 7163753, 4635382, 449426, 2561592, 3746615, 8741199, 6696192, 606265, 5374062, 3065308, 6918398, 2956279, 8949324, 2804580, 3421479, 7846658, 8895839, 8277589, 1262596, 451779, 9972218, 6378556, 4216958, 7127258, 8593578, 326883, 4737513, 6578257, 7582654, 8675499, 9038961, 7902676, 8874020, 5513073, 631930, 912719, 8394492, 1508363, 455175, 9215635, 6813970, 2021710, 5673212, 184474, 4511247, 4653238, 2218883, 9669544, 295018, 3694660, 1709444, 4019025, 5047809, 45740, 1035395, 8159408, 1557286, 1304144, 6496263, 2094202, 9945315, 1905585, 1143081, 6994125, 9609830, 1077628, 3488222, 6299366, 7187139, 3883908, 7077292, 3210807, 7328762, 7695314, 1138834, 7689433, 5083719, 202831, 8138452, 5495064, 7543763, 1597085, 5429837, 8455839, 6925605, 6600884, 3571512, 3422637, 8911245, 3700762, 2338168, 6830853, 2539094, 490627, 2294717, 497349, 8297867, 7299269, 4769134, 285033, 4335917, 9908413, 152868, 2658658, 3525848, 1884044, 4953877, 8660374, 8989154, 888731, 7217408, 2614940, 7990455, 9779818, 1441488, 9605891, 4518756, 3705442, 9331226, 404585, 9011202, 7355000, 7461968, 6512552, 2689841, 2873446, 256454, 1068037, 8786859, 2323599, 3332506, 2361155, 7476810, 5605915, 5950352, 6491737, 8696129, 4637800, 4207476, 9334774, 840248, 9159149, 5201180, 7211332, 3135016, 8524857, 4566111, 7697488, 1833291, 7227481, 8289951, 2389102, 9102789, 8585135, 1869227, 4082835, 8447466, 4985240, 4176179};
    int bestProfitOnceBuyAndSell = bestProfit(arr);
    int bestProfitMultiple = bestProfitMultiple(arr);
    Arrays.sort(arr);
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
  public static int bestProfitMultiple(Integer [] prices )
  {
    int result =0; int buyPrice = prices[0];
    int previousProfit = 0;
    for(int i=1; i< prices.length; i++)
    {
      if(buyPrice > prices[i])
      {
        if(previousProfit ==0)
          buyPrice = prices[i];
        else
        {
          result+=previousProfit;
          buyPrice =prices[i];
          previousProfit =0;
        }
      }
      else {
         int profit = (prices[i] - buyPrice);
          if(previousProfit < profit)
            previousProfit = profit;
          else
          {
            result+= previousProfit;
            buyPrice = prices[i];
            previousProfit =0;
          }
      }
      HashSet<Integer>hashSet = new HashSet<>();


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

