package com.homeworks.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Akshay on 4/3/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution solution = new Solution();
    int maxProduct = solution.maxp3(new ArrayList<>(Arrays.asList(3, -5, 20)));
    int ret =0;
  }
  public int maxp3(ArrayList<Integer> a) {
    if(a ==null || a.size() <3)
      return 0;
    Collections.sort(a);

    int lastIndex = a.size()-1;
    int max = a.get(lastIndex) * a.get(lastIndex-1) * a.get(lastIndex -2);
    max = Math.max(max, a.get(0)* a.get(1)* a.get(lastIndex));
    return max;
  }
}
