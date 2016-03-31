package com.homeworks.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Akshay on 3/29/2016.
 */
public class Heap
{
  public static void main(String[] args)
  {
    List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2,8,7,5,9,6,3));
    new Heap().buildHeap(integerArrayList);
  }

  public void buildHeap(List<Integer> list)
  {
    int n = list.size();
    int i = n/2;
    list.add(0,0);
    while(i>0)
    {
      percDown(list, i);
      i--;
    }
  }

  private int deleteHead(List<Integer> list)
  {
    int retVal = list.get(1);
    list.add(1, list.get(list.size()-1));
    list.remove(list.size()-1);
    percDown(list, 1);
    return retVal;
  }

  private void percDown(List<Integer> list, int i)
  {
    while(i*2 < list.size())
    {
      int maxChildIndex =  getMaxChild(list, i, list.size());
      if(list.get(i) < list.get(maxChildIndex))
      {
        int temp = list.get(i);
        list.set(i,list.get(maxChildIndex));
        list.set(maxChildIndex, temp);
      }
      i = maxChildIndex;
    }
  }

  private int getMaxChild(List<Integer> list, int i, int N)
  {
    if(i*2 +1 >= N)
      return i*2;
    else if(list.get(i*2) > list.get(2*i+1) )
      return i*2;
    else
      return i*2+1;
  }

  private void percDownRecursive(List<Integer> list, int i)
  {
    int minChildIndex = i;
    if(i*2 < list.size())
    {
      minChildIndex =  getMaxChild(list, i, list.size());
      if(list.get(i) > list.get(minChildIndex))
      {
        int temp = list.get(i);
        list.set(i,list.get(minChildIndex));
        list.set(minChildIndex, temp);
      }
    }
    if(i == minChildIndex)
      return;
    else
      percDownRecursive(list, minChildIndex);
  }

  private void percDown(List<Integer> list, int i, int N)
  {
    while(i*2 < N)
    {
      int maxChildIndex =  getMaxChild(list, i, N);
      if(list.get(i) < list.get(maxChildIndex))
      {
        int temp = list.get(i);
        list.set(i,list.get(maxChildIndex));
        list.set(maxChildIndex, temp);
      }
      i = maxChildIndex;
    }
  }
}
