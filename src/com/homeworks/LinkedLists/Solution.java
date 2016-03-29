package com.homeworks.LinkedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Akshay on 3/28/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution solution = new Solution();
    ListNode result = solution.mergeTwoLists( new ListNode(1).create(Arrays.asList()), new ListNode(1).create(Arrays.asList(4,11,15))  );
    List another = solution.twoSum(Arrays.asList(1,1,1),2);
    another = solution.anagrams(Arrays.asList("abbbaabbbabbbbabababbbbbbbaabaaabbaaababbabbabbaababbbaaabbabaabbaabbabbbbbababbbababbbbaabababba", "abaaabbbabaaabbbbabaabbabaaaababbbbabbbaaaabaababbbbaaaabbbaaaabaabbaaabbaabaaabbabbaaaababbabbaa", "babbabbaaabbbbabaaaabaabaabbbabaabaaabbbbbbabbabababbbabaabaabbaabaabaabbaabbbabaabbbabaaaabbbbab", "bbbabaaabaaaaabaabaaaaaaabbabaaaabbababbabbabbaabbabaaabaabbbabbaabaabaabaaaabbabbabaaababbaababb", "abbbbbbbbbbbbabaabbbbabababaabaabbbababbabbabaaaabaabbabbaaabbaaaabbaabbbbbaaaabaaaaababababaabab", "aabbbbaaabbaabbbbabbbbbaabbababbbbababbbabaabbbbbbababaaaabbbabaabbbbabbbababbbaaabbabaaaabaaaaba", "abbaaababbbabbbbabababbbababbbaaaaabbbbbbaaaabbaaabbbbbbabbabbabbaabbbbaabaabbababbbaabbbaababbaa", "aabaaabaaaaaabbbbaabbabaaaabbaababaaabbabbaaaaababaaabaabbbabbababaabababbaabaababbaabbabbbaaabbb"));

    solution.lPalin3(new ListNode(1).create(Arrays.asList(1)));
    solution.deleteDuplicates(new ListNode(1).create(Arrays.asList(1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4)));
    solution.insertionSort(new ArrayList<>(Arrays.asList(2,3,1,4,7,5,0)));
    solution.insertionSortList(new ListNode(1).create(Arrays.asList(2, 5, 1, 3, 7, 4, 0)));
    solution.removeNthFromEnd(new ListNode(1).create(Arrays.asList(2, 5, 1, 3, 7, 4, 0)), 10);
    solution.rotateRight(new ListNode(1).create(Arrays.asList(2, 5, 1, 3, 7, 4, 0)), 2);
    solution.subtract(new ListNode(1).create(Arrays.asList(88,15,98)));

    int stop =1;

  }

  public ListNode subtract(ListNode a) {
    ListNode mid = a, head =a, end =a, start =a;
    while(head.next!=null && head.next.next !=null)
    {
      end = mid;
      mid = mid.next;
      head = head.next.next;
    }
    if(head.next != null)
      end = mid;
    ListNode prev = end.next, temp = null, ender = end.next;

    if(prev == null ) // need atleast two elements to reverse the list;
      return a;
    int i=0;
    while(a != ender)
    {
      ListNode val = getIthFromEnd(start, ender, i);
      int value = 0;
      if(val != null)
        value = val.val;
      a.val = value - a.val;
      a = a.next;
      i++;
    }
    return start;
  }
  private ListNode getIthFromEnd(ListNode start,ListNode end, int k)
  {
    ListNode mover = start;
    for(int i=0; i< k; i++)
    {
      if(mover != null)
        mover = mover.next;
      else
        return null;
    }
    while( mover.next!=null)
    {
      mover = mover.next;
      start = start.next;
    }
    return start;
  }

  public ListNode rotateRight(ListNode a, int b) {
    ListNode start = a;
    ListNode bth =a;
    for(int i=0; i< b; i++)
    {
      if(start == null)
        start = a;
      start = start.next;
    }
    ListNode prev = null;
    while(start !=null)
    {
      start = start.next;
      prev = bth;
      bth = bth.next;
    }
    if(prev == null)
      return a;
    else
      prev.next = null;
    ListNode newHead = bth;
    while(bth!=null)
    {
      prev = bth;
      bth = bth.next;
    }
    prev.next =a;
    return newHead;

  }

  public ListNode removeNthFromEnd(ListNode a, int b) {

    ListNode start =a;
    ListNode bth = a;
    for(int i=0; i< b; i++)
    {
      if(start == null)
        return a.next; // list is smaller than b
      start = start.next;
    }
    ListNode prev = null;
    while(start!=null)
    {
      start = start.next;
      prev = bth;
      bth = bth.next;
    }
    if(prev == null)
      a = a.next;
    else
      prev.next = bth.next;
    return a;
  }

  public ListNode insertionSortList(ListNode a)
  {
    if(a.next == null)
      return a;

    ListNode i = a.next;
    while(i !=null)
    {
      ListNode j = a;
      ListNode prev = null;
      ListNode temp =null;
      boolean set = false;
      boolean set2 = false;
      while(i != j)
      {
        if(i.val < j.val)
        {

          temp = i.next;
          i.next = j;

          if(prev != null)
            prev.next = i;
          else
          {
            a =i;
            set =true;
          }
          i=j.next;
          set2 = true;

        }
        if(!set)
          prev = j;
        else
          prev = j.next;
        j = j.next;
      }
      if(set2)
        prev.next = temp;
      i = i.next;
    }
    return a;
  }

  private void insertionSort(List<Integer> list)
  {
    for(int i=1; i < list.size(); i++)
    {
      for(int j=0; j<i; j++)
      {
        if(list.get(i) < list.get(j))
        {
          list.add(j, list.get(i));
          list.remove(i+1);
          break;
        }
      }
    }
  }

  public ListNode deleteDuplicates(ListNode a) {
    ListNode head = a;
    if(a == null)
      return a;
    while(a.next !=null)
    {
      if(a.next.val == a.val )
      {
        a.next = a.next.next;
      }
      else
        a = a.next;
    }
    return head;
  }


  public int lPalin2(ListNode A) {
    ListNode head = A;
    ListNode origHead = A;
    ListNode last  = null;
    ListNode newHead = null;
    ListNode prev = null;
    if(A == null)
      return 0;


    while(head !=null)
    {
      if(last == null)
      {
        last = new ListNode(head.val);
        last.next = null;
        prev = last;
      }
      else
      {
        last = new ListNode(head.val);
        last.next = prev;
        prev = last;
      }
      head = head.next;
    }
    while(origHead !=null)
    {
      if(origHead.val != last.val)
        return 0;
      origHead = origHead.next;
      last = last.next;
    }
    return 1;

  }
  public int lPalin3(ListNode A) {
    ListNode head = A;
    ListNode start = A;
    ListNode mid = A;
    ListNode newHead = null;
    ListNode prev = null;
    ListNode next =null;
    if(A == null)
      return 0;
    while(head.next!=null && head.next.next!=null)
    {
      head = head.next.next;
      mid = mid.next;
    }
    ListNode temp = mid;
    mid = mid.next;
    while(mid != null)
    {
      next = mid.next;
      mid.next = prev;
      prev = mid;
      if(next ==null) break;
      mid = next;
    }
    while(mid!=null)
    {
      if(start.val != mid.val)
        return 0;
      start = start.next;
      mid = mid.next;
    }
    return 1;

  }
  public int lPalin(ListNode A) {
    ListNode tail = A;
    ListNode mid = A;
    ListNode head = A;
    if(A.next == null)
      return 0;
    while(tail.next !=null && tail.next.next !=null )
    {
      mid = mid.next;
      tail = tail.next.next;
    }
    while(mid.next !=null)
    {
      if(head.val != mid.next.val)
        return 0;
      head = head.next;
      mid = mid.next;
    }
    return 1;
  }

  public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    List<String> hList = new ArrayList<>();
    for(int i=0; i<a.size(); i++)
    {
      String each = a.get(i);
      char[] array = each.toCharArray();
      Arrays.sort(array);
      String word = new String(array);

      if(hList.contains(word))
      {
        ArrayList<Integer> li = new ArrayList<>();
        int index1= i +1;
        int index2= hList.indexOf(word) +1;
        int minIndex = Math.min(index1-1, index2-1);
        ArrayList<Integer> lii = list.get(minIndex);
        lii.add(index1);
      }else
      {
        int index1= i +1;
        list.add(new ArrayList<>(Arrays.asList(index1)));
        hList.add(word);
      }

    }
    return list;
  }

  public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0; i < a.size(); i++)
    {
      int num = a.get(i);
      if(!hashMap.containsKey(num))
        hashMap.put(num,i);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < a.size(); i++)
    {
      int curVal = b- a.get(i);
      if(hashMap.containsKey(curVal))
      {
        if(hashMap.get(curVal) == i)
          continue;
        if(list.size() == 0)
        {
          list.add(Math.min(i+1,hashMap.get(curVal)+1));
          list.add(Math.max(i+1,hashMap.get(curVal)+1));

        } else
        {
          int index1 = Math.min(i+1, hashMap.get(curVal)+1);
          int index2 = Math.max(i+1, hashMap.get(curVal)+1);
          if(list.get(1) > index2)
          {
            list.clear();
            list.add(index1);
            list.add(index2);
          }
        }
      }
    }
    return list;
  }

  public ListNode mergeTwoLists(ListNode a, ListNode b) {
    ListNode merged = null, mergeHead =null;
    while(a !=null || b!=null)
    {
      if(a == null)
      {
        if(merged == null)
        {
          return b;
        }
        merged.next = b;
        break;
      }
      if(b == null)
      {
        if(merged == null)
        {
          return a;
        }
        merged.next = a;
        break;
      }
      if(a.val <= b.val)
      {
        ListNode newNode = new ListNode(a.val);
        if(merged != null)
        {
          merged.next = newNode;
          merged = merged.next;
        }
        else
        {
          merged = newNode;
          mergeHead = merged;
        }
        a = a.next;
      }else
      {
        ListNode newNode = new ListNode(b.val);
        if(merged != null)
        {
          merged.next = newNode;
          merged = merged.next;
        }
        else
        {
          merged = newNode;
          mergeHead = merged;
        }
        b = b.next;
      }


    }
    return mergeHead;
  }

}
