package com.homeworks.General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Akshay on 2/19/2016.
 */
public class MiceNHoles
{
  public static void main(String[] args)
  {
    MiceNHoles mc = new MiceNHoles();
    List<Integer> arrayList = new ArrayList<>(Arrays.asList(33, -81, -13, -14, -36, -69, -94, -1, -95, -4, 98, -23, 82, 66, 37, -44, -97, -28, -58));
    List<Integer> arrayList2 = Arrays.asList(98, -5, -32, -76, 99, 100, 13, 58, -9, -69, 31, 63, 66, -53, -22, -13, 2, 32, 91);
    List<Integer> arrayList3 = Arrays.asList(1, 3, 5, 2, 8, 0, -1, -3);
    mc.quickSort(arrayList);
    mc.quickSort(arrayList2);
    mc.quickSort(arrayList3);
    int res = arrayList3.get(arrayList3.size()-1)* arrayList3.get(arrayList3.size()-2) * arrayList3.get(arrayList3.size()-3);

//    int result = mc.mice(arrayList,arrayList2);

//  int result = mc.mice(Arrays.asList(4,-4,2), Arrays.asList(4,0,5));

    int maxDistance = 0;

    for(int i=0; i < arrayList.size(); i++)
    {
      int candi =  Math.abs(arrayList.get(i) - arrayList2.get(i));
      if(candi > maxDistance)
        maxDistance = candi;
    }
    int result = maxDistance;
    //int steps = mc.arrange("BWBWWWWBWBBWBWBWBBWBBBWWWBWBWBWWWBWBWBWBBWBW",19 );
    List<Integer> array = mc.wave(Arrays.asList(5,1,3,2,4));
    System.out.print(result);
  }
  public ArrayList<Integer> wave(List<Integer> a) {
    quickSort(a);
    ArrayList<Integer> returnList = new ArrayList<Integer>();
    for(int i=1; i< a.size(); i=i+2)
    {
      returnList.add(i);
      returnList.add(i-1);
    }
    if(a.size()!= returnList.size())
      returnList.add(a.get(a.size()-1));
    return returnList;
  }

  public int arrange(String a, int b) {
    if(b == 1)
    {
      return numberOfHorses(a, 'W') * numberOfHorses(a, 'B');
    }
    int prodSum = 100000;
    for(int i=1; i < a.length(); i++)
    {
      String horsesInStable = a.substring(0, i);
      String remainingHorses = a.substring(i, a.length());
      int localProd =  numberOfHorses(horsesInStable, 'W') * numberOfHorses(horsesInStable, 'B');
      if(localProd > prodSum)
          continue;
      prodSum = Math.min(prodSum, localProd + arrange(remainingHorses, b-1));
    }
    return prodSum;
  }
  private HashMap<String, Integer> memoizeWhite = new HashMap<>();
  private HashMap<String, Integer> memoizeBlack = new HashMap<>();
  private int numberOfHorses(String a, char horseColor)
  {
    int count = 0;
    HashMap<String, Integer> memoize = null;
    if(horseColor == 'B')
      memoize = memoizeBlack;
    else
      memoize = memoizeWhite;
    if(memoize.containsKey(a))
      return memoize.get(a);
    for(int i=0; i< a.length(); i++)
    {
      if(a.charAt(i) == horseColor)
        count++;
    }
    memoize.put(a, count);
    return count;
  }




  private void quickSort(List<Integer> list)
  {
    if(list.size() <=1)
      return;
    int partitionPoint = partition(list);
    quickSort(list.subList(0, partitionPoint));
    quickSort(list.subList(partitionPoint+1, list.size()));
  }
  private int partition(List<Integer> list)
  {
    Integer pivot = list.get(0);
    int leftMark = 1;
    int rightMark = list.size() -1;

    while(leftMark <= rightMark)
    {
      if(list.get(leftMark) <= pivot )
        leftMark++;
      else if(list.get(rightMark) > pivot)
        rightMark--;
      else if(list.get(leftMark) > list.get(rightMark))
        swap(list, leftMark, rightMark);
    }
    swap(list, 0, rightMark);
    return rightMark;
  }
  private void swap(List<Integer> list, int leftMark, int rightMark)
  {
    if(list.get(leftMark) != list.get(rightMark))
    {
      list.set(leftMark, list.get(leftMark) ^ list.get(rightMark));
      list.set(rightMark, list.get(leftMark) ^ list.get(rightMark));
      list.set(leftMark, list.get(leftMark) ^ list.get(rightMark));
    }
  }
  public int mice(List<Integer> a, List<Integer> b) {
    if(b.size() < a.size())
      return -1;

    List<List<Integer>> distance = new ArrayList<>();
    int maxDistance = -10000;

    //find distance to each hole for each mice
    for (Integer anA : a)
    {
      List<Integer> eachDistance = new ArrayList<>();
      for (int j = 0; j < b.size(); j++)
      {
        int candidate = Math.abs(b.get(j) - anA);
        eachDistance.add(candidate);
        if (candidate > maxDistance)
          maxDistance = candidate;
      }
      distance.add(eachDistance);
    }
    return minimumMoves(distance, maxDistance,0 );
  }
  private int minimumMoves(List<List<Integer>> distance,int maxDistance, int cost)
  {
    if(distance.size() == 1)
    {
      int candidate = distance.get(0).get(0);
      for(int i=1; i< distance.get(0).size() ; i++)
      {
        if(distance.get(0).get(i) < candidate)
          candidate = distance.get(0).get(i);
      }
      if(cost>candidate)
        candidate = cost;

      if(candidate < maxDistance)
        return candidate;
      else
        return maxDistance;
    }
    for(int k=0; k< distance.get(0).size() ; k++)
    {
      int selectionMax  = distance.get(0).get(k);
      if(selectionMax > cost)
        cost = selectionMax;
      if(selectionMax >= maxDistance)
        continue;
      List<List<Integer>> newSubList = createNewList(distance, k);
      maxDistance = minimumMoves (newSubList, maxDistance, cost);
    }
    return maxDistance;
  }
  private List<List<Integer>> createNewList(List<List<Integer>> originalList, int a)
  {
    List<List<Integer>> newSubList = new ArrayList<>();
    for(int i =1 ; i < originalList.size(); i++)
    {
      List<Integer> toBeAdded = new ArrayList<>();
      for(int j=0; j < originalList.get(i).size(); j++)
      {
        if( j == a)
          continue;
        toBeAdded.add(originalList.get(i).get(j));
      }
      newSubList.add(toBeAdded);
    }
    return newSubList;
  }
}
