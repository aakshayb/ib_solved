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
    List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2,8,7,5,9,6,3));
    new Sorter().buildHeap(integerArrayList);

    integerArrayList = new ArrayList<>(Arrays.asList(1, 2,8,7,5,9,6,3));
    new Sorter().heapSort(integerArrayList);

    Integer[] ints = new Integer[]{1, 8, 4, 7, 2, 0};
    String [] stringArray = new String [] {"Akshay", "Bhatnagar", "Shalini", "Khare"};
    out.println("Unsorted array -> "+ toString(ints) + "Sorted array -> " + toString(new Sorter().Sort(ints)));
    ints = new Integer[]{1, 8, 4, 7, 2, 0};
    out.println("Unsorted array -> "+ toString(ints) + "Sorted array -> " + toString(new Sorter().BubbleSort(ints)));

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


  public void heapSort(List<Integer> arr)
  {
    buildInitHeap(arr);
    int N = arr.size()-1;
    for (int i = N; i > 0; i--)
    {
      swap(arr,0, i);
      N = N-1;
      maxheap(arr, 0, N);
    }
  }

  public  void buildInitHeap(List<Integer> arr)
  {
    int N = arr.size()-1;
    for (int i = N/2; i >= 0; i--)
      maxheap(arr, i, N);
  }


  public  void maxheap(List<Integer> arr, int i, int N)
  {
    int left = 2*i ;
    int right = 2*i + 1;
    int max = i;
    if (left <= N && arr.get(left) > arr.get(i))
      max = left;
    if (right <= N && arr.get(right) > arr.get(max))
      max = right;

    if (max != i)
    {
      swap(arr, i, max);
      maxheap(arr, max, N);
    }
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

  private int getMaxChild(List<Integer> list, int i, int N)
  {
    if(i*2 +1 >= N)
      return i*2;
    else if(list.get(i*2) > list.get(2*i+1) )
      return i*2;
    else
        return i*2+1;
  }

  /* Function to swap two numbers in an array */


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
