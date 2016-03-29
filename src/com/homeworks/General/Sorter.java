package com.homeworks.General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Akshay on 3/28/2016.
 */
public class Sorter
{
  public static void main(String[] args)
  {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 10, 20, 3, 6, 23, 45, 30, 2, 1));
    List sortedList = new Sorter().mergeSort(arrayList);
    new Sorter().quickSort(arrayList);

    Integer[] ints = new Integer[]{1, 8, 4, 7, 2, 0};
    String [] stringArray = new String [] {"Akshay", "Bhatnagar", "Shalini", "Khare"};
    out.println("Unsorted array -> "+ toString(ints) + "Sorted array -> " + toString(new Sorter().Sort(ints)));
    ints = new Integer[]{1, 8, 4, 7, 2, 0};
    out.println("Unsorted array -> "+ toString(ints) + "Sorted array -> " + toString(new Sorter().BubbleSort(ints)));

  }

  public void quickSort(List<Integer> arrayList)
  {
    if(arrayList.size()<=1)
      return;
    int rightMark = partition(arrayList);
    quickSort(arrayList.subList(0, rightMark));
    quickSort(arrayList.subList(rightMark+1, arrayList.size()));
  }

  private int partition(List<Integer> arrayList)
  {
    int p = arrayList.get(0);
    int leftMark = 1;
    int rightMark = arrayList.size()-1;
    while(leftMark <= rightMark)
    {
      if(arrayList.get(leftMark) <= p)
      {
        leftMark++;
      }else if(arrayList.get(rightMark) > p)
      {
        rightMark--;
      }
      else if(arrayList.get(leftMark) > arrayList.get(rightMark))
      {
        swap(arrayList, leftMark, rightMark );
      }
    }
    swap(arrayList, 0, rightMark);
    return rightMark;
  }

  private void swap(List<Integer> arrayList, int leftMark, int rightMark)
  {
    if(arrayList.get(leftMark) == arrayList.get(rightMark))
      return;
    arrayList.set(leftMark, arrayList.get(leftMark)^ arrayList.get(rightMark));
    arrayList.set(rightMark, arrayList.get(leftMark)^ arrayList.get(rightMark));
    arrayList.set(leftMark, arrayList.get(leftMark)^ arrayList.get(rightMark));
  }

  public List mergeSort(List<Integer> arrayList)
  {
    if(arrayList.size() <= 1)
      return arrayList;
    int mid = arrayList.size()/2;
    List<Integer> leftList = mergeSort(arrayList.subList(0, mid));
    List<Integer> rightList = mergeSort(arrayList.subList(mid, arrayList.size()));

    return merge(leftList, rightList);
  }

  private List merge(List<Integer> leftList, List<Integer> rightList)
  {
    int left =0, right =0;
    List<Integer> retList = new ArrayList<>();
    for(int i=0; i< leftList.size() + rightList.size() ; i++)
    {
      if(left == leftList.size())
      {
        addRemainingList(right, rightList, retList);
        break;
      }
      if(right == rightList.size())
      {
        addRemainingList(left, leftList, retList);
        break;
      }
      if(leftList.get(left) <= rightList.get(right))
      {
        retList.add(leftList.get(left));
        left++;
      }
      else
      {
        retList.add(rightList.get(right));
        right++;
      }
    }
    return retList;
  }

  private void addRemainingList(int index, List<Integer> remList,  List<Integer> retList)
  {
    while(index != remList.size() )
    {
      retList.add(remList.get(index));
      index++;
    }
  }


  public Integer[] Sort(Integer[] array)
  {
    for(int i = 0; i < array.length - 1 ; i++)
    {
      for(int j = i+1; j < array.length; j++ )
      {
        if(array[i] > array[j])
        {
          array[i] = array[i] ^ array[j];
          array[j] = array[j] ^ array[i];
          array[i] = array[i] ^ array[j];
        }
      }
    }
    return array;
  }
  public Integer[] BubbleSort(Integer[] array)
  {
    for(int i=1; i< array.length ; i++)
    {
      for(int j=0; j< array.length - i; j++)
      {
        if(array[j] > array [j+1])
        {
          array[j] = array[j] ^ array[j+1];
          array[j+1] = array[j+1] ^ array[j];
          array[j] = array[j] ^ array[j+1];
        }
      }
    }
    return array;
  }

  private static String toString(Integer[] array)
  {
    StringBuilder sb = new StringBuilder();
    for (Integer anArray : array)
    {
      sb.append(anArray + ", ");
    }
    return sb.toString();
  }
}
