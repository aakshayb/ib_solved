package com.homeworks.LinkedLists;

import java.util.Arrays;

/**
 * Created by Akshay on 3/25/2016.
 */
public class InsertionSort
{
  public static void main(String[] args)
  {
    ListNode node = new ListNode(1).create(Arrays.asList(5,3, 7,2,1,8));
    ListNode retNode = new InsertionSort().insertionSort(node);
    int another =1;
  }

  private ListNode insertionSort(ListNode head)
  {
    ListNode fakeHead = new ListNode(0);
    fakeHead.next = head;
    ListNode node= head;
    if(head ==null || head.next == null)
        return head;
    while(node.next!=null)
      node = node.next;
    ListNode previous = getPrevious(fakeHead,node);
    while(previous !=null)
    {
      ListNode temp = previous;
      while(node.next!=null && node.val > node.next.val)
      {
        swap(previous, node, node.next);
        previous = previous.next;
      }
      node = temp;
      previous = getPrevious(fakeHead,node);
    }
    return fakeHead.next;
  }

  private void swap(ListNode previous, ListNode node, ListNode next)
  {
    if(previous !=null)
      previous.next = next;
    node.next = next.next;
    next.next = node;
  }

  private ListNode getPrevious(ListNode head, ListNode node)
  {
    if(head == node)
        return null;
    while(head.next!=null && head.next != node)
    {
      head = head.next;
    }
    return head;
  }


}
