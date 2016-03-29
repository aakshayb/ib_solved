package com.homeworks.BackTracking;

import java.util.*;

/**
 * Created by Akshay on 3/27/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution sol = new Solution();
    List another =  sol.combinationSum(new ArrayList<>(Arrays.asList( 8, 10, 6, 11, 1, 16, 8 )),28);
    another =  sol.combinationSum2(new ArrayList<>(Arrays.asList( 8, 10, 6, 11, 1, 16, 8 )),28);
    another = sol.combine(4,2);
    another = sol.easyCombine(4,2);

    another = new MergeSort().mergeSort(Arrays.asList( 8, 10, 6, 11, 1, 16, 8 ));

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int each: Arrays.asList( 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 ))
    {
      pq.add(each);
    }
    List<Integer> ter = new ArrayList<>();
    ter.add(pq.remove());
    int n =pq.size();
    for(int i=1; i<= n;i++)
    {
      int val = pq.remove();
      if(ter.get(ter.size()-1) != val)
        ter.add(val);
    }
    int retVal =1, retVal2 =1;
    for(int i =1; i< ter.size(); i++)
    {
      if(ter.get(i) == ter.get(i-1)+1 )
      {
        retVal++;
      }else
        retVal = 1;
      retVal2 = Math.max(retVal2, retVal);
    }

    int ret =0;
  }

  public ArrayList<ArrayList<Integer>> easyCombine(int n, int k) {

    result = new ArrayList<>();
    easyCombinations(n,0,k, new ArrayList<>());
    Collections.sort(result, (o1, o2)-> {
      for(int i=0; i< k-1; i++)
      {
        if(o1.get(i) < o2.get(i))
          return -1;
        if(o1.get(i) > o2.get(i))
          return 1;
      }
      return Integer.compare(o1.get(k-1), o2.get(k-1));
    });
    return result;
  }
  private void easyCombinations(int n, int last, int k,ArrayList<Integer> temp )
  {
    if(k == 0)
    {
      result.add(new ArrayList<>(temp));
      return;
    }
    for(int i = last+1; i< n; i++ )
    {
      temp.add(i);
      easyCombinations(n,i,k-1,temp);
      temp.remove(temp.size()-1);
    }
  }

  public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    ArrayList<Integer> list = new ArrayList<>();
    result = new ArrayList<>();
    for(int i=0; i <n ;i++)
      list.add(i+1);

    combinations(list, new ArrayList<>(), k, 0);
    Collections.sort(result, (o1, o2)-> {
      for(int i=0; i< k-1; i++)
      {
        if(o1.get(i) < o2.get(i))
          return -1;
        if(o1.get(i) > o2.get(i))
          return 1;
      }
      return Integer.compare(o1.get(k-1), o2.get(k-1));
    });
    return result;
  }
  private void combinations(ArrayList<Integer> a, ArrayList<Integer> answer, int k, int index  )
  {
    if(answer.size() == k)
    {
      result.add(new ArrayList<>(answer));
      return;
    }
    if(index >= a.size())
      return;
    int i = index+1;
    for(;i<a.size(); i++)
      if(a.get(i)!= a.get(i-1))
        break;
    combinations(a, answer, k, i  );
    answer.add(a.get(index));
    combinations(a, answer, k, index+1);
    answer.remove(answer.size()-1);
  }

  ArrayList<ArrayList<Integer>> result ;
  public ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> a, int b) {
    result = new ArrayList<>();
    if(a == null)
      return result;
    ArrayList<Integer> unique = new ArrayList<>();
    Collections.sort(a);
    unique.add(a.get(0));
    for(int i =1; i< a.size();i++)
    {
      if(a.get(i) != a.get(i-1))
        unique.add(a.get(i));
    }
    recursion2(unique, new ArrayList<>(), b, 0);
    return result;
  }
  private void recursion2(ArrayList<Integer> a, ArrayList<Integer> answer, int b, int index )
  {
    if(b == 0)
    {
      result.add(new ArrayList<>(answer));
      return;
    }
    if(b <0 || index >= a.size())
      return;
    for(int i=index; i<a.size(); i++)
    {
      answer.add(a.get(i));
      recursion2(a, answer, b- a.get(i), i );
      answer.remove(answer.size()-1);
    }
  }


  ArrayList<ArrayList<Integer>> retList;// duplicate copies not allowed
  public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
    retList = new ArrayList<>();
    if(a ==null)
      return null;
    Collections.sort(a);
    recursion(a, new ArrayList<>(), b, 0);
    return retList;
  }
  private void recursion(ArrayList<Integer> a, ArrayList<Integer> ans, int b, int index)
  {
    if(b == 0)
    {
      retList.add(new ArrayList<>(ans));
      return;
    }

    if(b<0 || index >= a.size())
      return;
    int i = index +1;
    for(;i<a.size();i++)
    {
      if(a.get(i) != a.get(i-1) )
        break;
    }
    recursion(a, ans, b, i);

    ans.add(a.get(index));
    recursion(a, ans, b-a.get(index), index+1);
    ans.remove(ans.size()-1);
  }

}
