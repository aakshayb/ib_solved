package com.homeworks.BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akshay on 3/27/2016.
 */
public class MergeSort
{
  public ArrayList<Integer> mergeSort(List<Integer> a)
  {
    if(a == null)
      return null;
    if(a.size() <=1)
      return new ArrayList<>(a);
    int mid = a.size()/2;
    ArrayList<Integer> left = mergeSort(a.subList(0, mid));
    ArrayList<Integer> right = mergeSort(a.subList(mid, a.size()));
    return merge(left, right);
  }
  private ArrayList<Integer> merge(List<Integer> a, List<Integer>b)
  {
    ArrayList<Integer> list = new ArrayList<>();
    int left = 0, right =0;
    while(left < a.size() || right < b.size())
    {
      if(left == a.size())
      {
        list.add(b.get(right++));
        continue;
      }
      if(right == b.size())
      {
        list.add(a.get(left++));
        continue;
      }
      if(a.get(left) <= b.get(right))
        list.add(a.get(left++));
      else
        list.add(b.get(right++));

    }
    return list;
  }
}
