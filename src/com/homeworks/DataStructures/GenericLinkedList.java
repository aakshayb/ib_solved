package com.homeworks.DataStructures;

/**
 * Created by Akshay on 4/5/2016.
 */
public class GenericLinkedList<T>
{
  private T element;
  private GenericLinkedList<T> next;
  public GenericLinkedList(T el, GenericLinkedList<T> nxt)
  {
    element =el;
    next = nxt;
  }
  public T getElement() { return element;}
  public GenericLinkedList<T> getNext() {return next;}

  public <T> GenericLinkedList<T> reverse(GenericLinkedList<T> original) throws NullPointerException
  {
    if(original == null)
        throw  new NullPointerException("Cannot reverse null list");

    if(original.next == null)
        return  original;

    GenericLinkedList<T> previous = null, head = original;
    while(head!=null)
    {
      GenericLinkedList<T> next = head.next;
      head.next = previous;
      previous = head;
      head = next;
    }
    //return previous;

    final GenericLinkedList<T> next = original.next;
    original.next = null;
    GenericLinkedList<T> reversed = reverse(next);
    next.next = original;
    return  reversed;
  }

}
