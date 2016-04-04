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
    int maxDistance = solution.mice(new ArrayList<>(Arrays.asList(4, -4, 2)), new ArrayList<>(Arrays.asList(4,0,5)));
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

  public int mice(ArrayList<Integer> a, ArrayList<Integer> b) {
    Collections.sort(a);
    Collections.sort(b);

    int maxDistance = -1;
    for(int i=0; i< a.size(); i++)
      maxDistance = Math.max(maxDistance, Math.abs(a.get(i) - b.get(i)) );
    return maxDistance;
  }
}
