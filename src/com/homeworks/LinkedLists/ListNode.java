package com.homeworks.LinkedLists;

import java.util.List;

public class ListNode
{
  public int val;
  public ListNode next;
  public ListNode(int v)
  {
    val = v;
    next = null;
  }
  public ListNode create(List<Integer> list)
  {
    ListNode head = null, prev =null, retHead = null;
    for(int each: list)
    {
      head = new ListNode(each);
      if(prev !=null)
        prev.next = head;
      else
        retHead = head;
      prev = head;
    }
    return retHead;
  }
}
