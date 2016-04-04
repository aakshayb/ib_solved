package com.homeworks.Graphs;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Akshay on 2/16/2016.
 */
public class Solution
{
  public static void main(String args[])
  {
    Solution shapes = new Solution();
    shapes.black(Arrays.asList("XXOOXXXXXOOXOOOXOOX",
        "OXOOOOXOOXXXOXXOXOX",
        "OOOXXOOOXXOXXOXOXOX",
        "OOOOOOOOOXOOOOXXXXX",
        "OXXXOXXOOOXXXOOXXOO",
        "XOOOXXXXXXXXOOXOXXX",
        "XOXOXXOXOXOOOOXXXXX",
        "XOXXOXOOOXXOOOXXXXX"));
    shapes.blackImproved(new ArrayList<>(Arrays.asList("XXOOXXXXXOOXOOOXOOX",
        "OXOOOOXOOXXXOXXOXOX",
        "OOOXXOOOXXOXXOXOXOX",
        "OOOOOOOOOXOOOOXXXXX",
        "OXXXOXXOOOXXXOOXXOO",
        "XOOOXXXXXXXXOOXOXXX",
        "XOXOXXOXOXOOOOXXXXX",
        "XOXXOXOOOXXOOOXXXXX")));
    int knight = shapes.knight(8, 8, 1, 1, 8, 8);
    knight = shapes.knightImproved(8, 8, 1, 1, 8, 8);
    String ret = shapes.multiple(50);
    int exist = shapes.exist(new ArrayList<>(Arrays.asList("ABCE",
                                                           "SFCS",
                                                           "ADEE")), "ABCB");// should return 1
    exist = shapes.exist(new ArrayList<>(Arrays.asList("ABCE", "SFCS", "ADEE")), "ABFSAB"); // should return 1
    exist = shapes.exist(new ArrayList<>(Arrays.asList("ABCE", "SFCS", "ADEE")), "ABCD"); // should return 0

    int g =1;
  }

  public int exist(ArrayList<String> a, String b) {
    int index =0;
    for(int i=0; i< a.size();i++)
    {
      for(int j=0; j< a.get(0).length();j++)
      {
        if(a.get(i).charAt(j) == b.charAt(index))
        {
          int ret = dfs(a, b, i, j, index);
          if(ret == 1) return ret;
        }
      }
    }
    return 0;

  }
  private int dfs (ArrayList<String>a, String b, int i, int j, int index)
  {
    if(index == b.length())
      return 1;
    if(i == a.size() || j == a.get(0).length() || i< 0 || j <0)
      return 0;

    int ret =0;
    if(a.get(i).charAt(j) == b.charAt(index))
    {
      ret = dfs(a,b,i+1,j, index+1);
      if(ret != 1)
        ret = dfs(a,b,i-1,j, index+1);
      if(ret!=1)
        ret = dfs(a,b,i,j-1, index+1);
      if(ret !=1)
        ret = dfs(a,b,i,j+1, index+1);
    }
    return ret;

  }

  public int black(List<String> a)
  {
    String[] arr = new String[a.size()];
    a.toArray(arr);
    int maxLen = 0;
    for (String each : a)
    {
      if (each.length() > maxLen)
        maxLen = each.length();
    }
    Integer[][] intArr = new Integer[arr.length][maxLen];
    for (int i = 0; i < arr.length; i++)
      for (int j = 0; j < maxLen; j++)
        intArr[i][j] = 0;

    int count = 0;

    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < maxLen; j++)
      {
        if (arr[i].charAt(j) == 'X' && intArr[i][j] == 0)
        {
          count++;
          intArr[i][j] = 1;
          Queue<Integer> queue = new LinkedList<>();
          queue.add(i * 10000 + j);
          while (!queue.isEmpty())
          {
            int ijVal = queue.remove();
            int iVal = ijVal / 10000;
            int jVal = ijVal % 10000;
            if (iVal + 1 < arr.length && arr[iVal + 1].charAt(jVal) == 'X' && intArr[iVal + 1][jVal] == 0)
            {
              intArr[iVal + 1][jVal] = 1;
              queue.add((iVal + 1) * 10000 + jVal);
            }
            if (jVal + 1 < maxLen && arr[iVal].charAt(jVal + 1) == 'X' && intArr[iVal][jVal + 1] == 0)
            {
              intArr[iVal][jVal + 1] = 1;
              queue.add(iVal * 10000 + jVal + 1);
            }
            if (iVal - 1 >= 0 && arr[iVal - 1].charAt(jVal) == 'X' && intArr[iVal - 1][jVal] == 0)
            {
              intArr[iVal - 1][jVal] = 1;
              queue.add((iVal - 1) * 10000 + jVal);
            }
            if (jVal - 1 >= 0 && arr[iVal].charAt(jVal - 1) == 'X' && intArr[iVal][jVal - 1] == 0)
            {
              intArr[iVal][jVal - 1] = 1;
              queue.add(iVal * 10000 + jVal - 1);
            }
          }
        }

      }
    }
    return count;

  }

  boolean[][] used;
  public int blackImproved(ArrayList<String> a) {
    used = new boolean[a.size()][a.get(0).length()];
    int sum =0;
    for(int i=0; i<a.size(); i++)
    {
      for(int j=0; j< a.get(0).length();j++)
      {
        if(a.get(i).charAt(j) == 'X' && !used[i][j])
        {
          sum++;
          dfs(a, i,j);
        }
      }
    }
    return sum;
  }
  private void dfs(ArrayList<String>a, int i, int j)
  {
    if(i >= a.size() || j >= a.get(0).length() || i< 0 || j<0   ) return;
    if(a.get(i).charAt(j) == 'X' && !used[i][j])
    {
      used[i][j] = true;
      dfs(a,i+1, j);
      dfs(a,i, j+1);
      dfs(a, i-1, j);
      dfs(a, i, j-1);
    }
    return;
  }

  public int knightImproved(int N, int M, int x1, int y1, int x2, int y2) {
    return knight2(N,M, x1-1,y1-1,x2-1,y2-1);
  }

  private int knight2 (int N, int M, int x1, int y1, int x2, int y2)
  {
    boolean[][] arr = new boolean[N][M];
    List<Integer> dx = Arrays.asList(-2, -2, -1, -1, 1, 1, 2, 2);
    List<Integer> dy = Arrays.asList(-1, 1, -2, 2, 2, -2, 1, -1);

    Queue<Node> queue = new LinkedList<>();
    Queue<Node> next = new LinkedList<>();
    queue.add(new Node(x1, y1));
    int count =0;
    while(!queue.isEmpty())
    {
      Node node = queue.remove();
      if(node.x == x2 && node.y == y2) return count;

      for(int i=0; i<8;i++)
      {
        int ti = node.x+dx.get(i);
        int tj = node.y+dy.get(i);
        if(isValid(ti, tj,N,M ) && !arr[ti][tj]  )
        {
          next.add(new Node(ti, tj));
          arr[ti][tj] = true;
        }
      }
      if(queue.isEmpty())
      {
        queue = next;
        count++;
        next = new LinkedList<>();
      }
    }
    return -1;
  }

  class Node
  {
    int x, y;
    Node(int a, int b)
    {
      x =a;
      y=b;
    }
  }

  public int knight(int N, int M, int x1, int y1, int x2, int y2)
  {
    Integer[][] arr = new Integer[N][M];
    List<Integer> dx = Arrays.asList(-2, -2, -1, -1, 1, 1, 2, 2);
    List<Integer> dy = Arrays.asList(-1, 1, -2, 2, 2, -2, 1, -1);
    for (int i = 0; i < N; i++)
      for (int j = 0; j < M; j++)
        arr[i][j] = -1;
    int count = 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.add((x1 - 1) * 10000 + (y1 - 1));
    arr[x1 - 1][y1 - 1] = 0;
    while (!queue.isEmpty())
    {
      int ijVal = queue.remove();
      int iVal = ijVal / 10000;
      int jVal = ijVal % 10000;
      count++;
      for (int i = 0; i < 8; i++)
      {
        int ti = iVal + dx.get(i);
        int tj = jVal + dy.get(i);
        if (isValid(ti, tj, N, M) && arr[ti][tj] == -1)
        {
          if (ti == x2 - 1 && tj == y2 - 1)
            return arr[iVal][jVal] + 1;
          arr[ti][tj] = arr[iVal][jVal] + 1;
          queue.add(ti * 10000 + tj);
        }
      }
    }

    return -1;
  }

  public String multiple(int A) {
    Queue<Num> queue = new LinkedList<>();
    Queue<Num> next = new LinkedList<>();

    int test =A;
    while(test>0)
    {
      if(test%10 == 0 || test%10 ==1)
        test /=10;
      else
        break;
    }
    if(test == 0) return ""+A;
    for(int i=0; i< 10; i++)
    {
      String num = ""+A*i;
      if(num.charAt(num.length()-1) == '0' || num.charAt(num.length()-1) == '1' )
      {
        Num number = new Num( (A*i)/10, ""+i ,  ""+num.charAt(num.length()-1)  );
        queue.add(number);
        if(number.carry == 1 ) return  "1"+ number.res;
        if(number.carry == 0 && number.res.charAt(0) == '1' ) return number.res;
      }
    }
    while(!queue.isEmpty())
    {
      Num curr = queue.remove();
      for(int i=0; i< 10; i++)
      {
        String prod = ""+i+curr.num;
        Integer multiplier = Integer.parseInt(""+prod.charAt(0));
        String check = ""+ (multiplier * A + curr.carry);
        if(check.charAt(check.length()-1) == '0' || check.charAt(check.length()-1) == '1' )
        {
          Num num = new Num((multiplier * A + curr.carry)/10, prod, check.charAt(check.length()-1) +curr.res  );
          if(num.carry == 1 ) return  "1"+ num.res;
          if(num.carry == 0 && num.res.charAt(0) == '1' ) return num.res;
          next.add(num);
        }
      }
      if(queue.isEmpty())
      {
        queue =next;
        next = new LinkedList<>();
      }

    }
    return "";
  }
  class Num
  {
    String num;
    Integer  carry;
    String res;
    Num(int a, String b, String c)
    {
      carry =a;
      num = b;
      res = c;
    }
  }


  private boolean isValid(int i, int j, int N, int M)
  {
    return i >= 0 && j >= 0 && i < N && j < M;
  }

  public ArrayList<String> restoreIpAddresses(String A) {
    int ip;
    ArrayList<String> res = new ArrayList<>();
    dfs(res, 0, A, 3, "");

    Collections.sort(res);

    return res;
  }

  public void dfs(ArrayList<String> res, int startIndex, String A, int num, String ip) {

    if (num == 0) {
      int len = A.length();

      if (len - startIndex > 3 || len - startIndex < 1)
        return;

      String str = A.substring(startIndex, len);
      int val = Integer.parseInt(str);

      if (val < 0 || val > 255)
        return;

      if (str.charAt(0) == '0' && str.length() > 1)
        return;

      res.add(ip + str);

      return;

    }

    for (int i = startIndex + 1; i <= Math.min(A.length(), startIndex + 3); i++) {
      String str = A.substring(startIndex, i);
      int val = Integer.parseInt(str);
      if (val > 255)
        continue;

      if (str.charAt(0) == '0' && str.length() > 1)
        return;

      dfs(res, i, A, num - 1, ip + str + ".");
    }

  }

}
