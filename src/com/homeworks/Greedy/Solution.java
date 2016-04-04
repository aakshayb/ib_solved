package com.homeworks.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    int canComplete = solution.mice(new ArrayList<>(Arrays.asList(1,2)), new ArrayList<>(Arrays.asList(2,1)));
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

  public int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
    int start = 0;
    int end =1;
    if(gas.size() <= 1)
      return 0;
    int currCost = gas.get(start) - cost.get(start);

    while(end!=start || currCost < 0)
    {
      while(currCost <0 && start!=end)
      {
        currCost -= gas.get(start) - cost.get(start);
        start = (start+1)%gas.size();
        if(start ==0)return -1;
      }
      currCost += gas.get(end) - cost.get(end);
      end = (end+1)%gas.size();
    }
    return start;
  }

}
