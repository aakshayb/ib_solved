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
    int knight = shapes.knight(8, 8, 1, 1, 8, 8);
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
