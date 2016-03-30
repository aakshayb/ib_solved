package com.homeworks.Trees;

import java.util.*;

/**
 * Created by Akshay on 3/28/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution sol = new Solution(2);
    TreeNode root = TreeNode.create(Arrays.asList(7, 2, 3, 4, 5, -1, 7,9));
//    root = TreeNode.create(Arrays.asList(5,1,2,4,-1,5));
    List another = sol.inOrderTraversal(root);
    List another2 = sol.preOrderTraversal(root);
    List another3 = sol.postOrderTraversal(root);


    int ret = 0;
    //case 1
    ret = sol.get(2);
    sol.set(2,6);
    ret = sol.get(1);
    sol.set(1,5);
    sol.set(1,2);

    ret = sol.getVal(2);
    sol.setVal(2,6);
    ret =sol.getVal(1);
    sol.setVal(1,5);
    sol.setVal(1,2);

    //Case2
    sol.treeMap.clear();
    sol.set(2,1);
    sol.set(1,1);
    sol.set(2,3);
    sol.set(4,1);
    ret = sol.get(1);
    ret = sol.get(2);

    sol.setVal(2,1);
    sol.setVal(1,1);
    sol.setVal(2,3);
    sol.setVal(4,1);
    ret = sol.getVal(1);
    ret = sol.getVal(2);


    int stop =1;
  }
  private ArrayList<Integer> inOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode current = root;
    while(current!=null || !stack.isEmpty())
    {
      if(current !=null)
      {
        stack.addFirst(current);
        current = current.left;
        continue;
      }
      TreeNode popped = stack.removeFirst();
      retList.add(popped.val);
      if(popped.right!=null)
      {
        current = popped.right;
      }
    }
    return retList;
  }

  private ArrayList<Integer> preOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.addFirst(root);
    while(!stack.isEmpty())
    {
      TreeNode popped = stack.removeFirst();
      retList.add(popped.val);
      if(popped.right!=null)
        stack.addFirst(popped.right);
      if(popped.left !=null)
        stack.addFirst(popped.left);
    }
    return retList;
  }

  private ArrayList<Integer> postOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.addFirst(root);
    TreeNode previous = null;
    while(!stack.isEmpty())
    {
      TreeNode current = stack.peekFirst();
      if(previous == null || previous.left == current || previous.right == current )
      {
        if(current.left!=null)
          stack.addFirst(current.left);
        else if (current.right !=null)
          stack.addFirst(current.right);
        else
          retList.add(stack.removeFirst().val);
      }
      else if( current.left == previous)
      {
        if(current.right !=null)
          stack.addFirst(current.right);
        else
          retList.add(stack.removeFirst().val);
      }
      else if(current.right == previous)
        retList.add(stack.removeFirst().val);
      previous = current;
    }
    return retList;
  }

  public int hasPathSum(TreeNode a, int b) {
    return hasPathSum(a, b, 0);
  }

  private int hasPathSum(TreeNode a, int limit, int sum)
  {
    if(a == null)
      return 0;
    if(sum + a.val == limit)
      return 1;
    if(sum + a.val > limit)
      return 0;
    sum += a.val;
    boolean hasit = false;
    return hasPathSum(a.left, limit, sum) == 1 ?  1 :  hasPathSum(a.right, limit, sum);
  }


  //LRU implementation with just HashMap and LinkedList

  Value head, tail;
  HashMap<Integer, Value> hashMap;
  class Value
  {
    int val, key;
    Value next, previous;

    Value(int num, int key1)
    {
      val = num;
      key = key1;
    }
  }

  public int getVal(int key)
  {
    if(hashMap.containsKey(key))
    {
      Value value = hashMap.get(key);
      Value node = head;
      while(node.key!=value.key && node.val!= value.val)
      {
        node = node.next;
      }
      if(node.previous!=null)
        node.previous.next = node.next;
      if(node.next!=null)
        node.next.previous = node.previous;
      if(node == head)
        head = node.next;
      if(node == tail)
        tail = tail.previous;

      head.previous = value;
      value.next = head;
      head = value;
      return value.val;
    }
    return -1;
  }
  public void setVal(int key, int value )
  {
    Value newVal = new Value(value, key);
    if(hashMap.containsKey(key))
    {
      if(head ==null || tail == null)
        return;
      Value node = head;
      while( node.key!=newVal.key && node.val != newVal.val )
      {
        node = node.next;
      }
      if(node.previous!=null)
        node.previous.next = node.next;
      if(node.next!=null)
        node.next.previous = node.previous;
      if(node == head)
        head = node.next;
      if(node == tail)
        tail = tail.previous;

      head.previous = newVal;
      newVal.next = head;
      head = newVal;
      hashMap.remove(key);
      hashMap.put(key, newVal);
    }else
    {

      if(hashMap.size() == capacity)
      {
        if(head ==null || tail == null)
            return ;
        hashMap.remove(tail.key);
        tail = tail.previous;
        tail.next =null;
        head.previous = newVal;
        newVal.next = head;
        head = newVal;
        hashMap.put(key, newVal);
      }
      else
      {
        hashMap.put(key, newVal );
        if(head == null) {
          head = newVal;
        }
        else
        {
          head.previous = newVal;
          newVal.next = head;
          head = newVal;
        }
        if(tail == null)
          tail = newVal;
        else
        {
          tail.previous = newVal;
        }
      }
    }

  }


  // LRU implementation using treeMap

  TreeMap<Key, Integer > treeMap;
  int capacity;
  int counter ;
  public Solution(int capacity) {
    treeMap = new TreeMap<>();
    this.capacity = capacity;
    this.counter=0;
    hashMap = new HashMap<>();
  }

  public int get(int key) {
    Key key1 = new Key(key,counter++);
    return getValueIfContained(treeMap, key1, -1);
  }

  private int getValueIfContained(TreeMap<Key, Integer> treeMap, Key key, int value)
  {
    for(Key each: treeMap.keySet())
    {
      if(each.equals(key))
      {
        int val = treeMap.get(each);
        treeMap.remove(each);
        if(value == -1)
          treeMap.put(key,val);
        else
          treeMap.put(key,value);
        return val;
      }
    }
    return -1;
  }

  public void set(int key, int value) {
    Key key1 = new Key(key,counter++);
    int retVal = getValueIfContained(treeMap, key1, value);
    if(retVal !=-1) return;

    if(treeMap.size() == capacity)
      treeMap.remove(treeMap.lastKey());
    treeMap.put(key1, value);
  }

  class Key implements Comparable<Key>
  {
    int num;
    long time;
    Key(int num, long time)
    {
      this.num = num;
      this.time = time;
    }
    @Override
    public int compareTo(Key o1)
    {
      if(this.num == o1.num)
          return 0;

      if(this.time < o1.time)
        return 1;
      else if (this.time > o1.time)
        return -1;
      else
        return 0;
    }
    @Override
    public int hashCode()
    {
      return Integer.hashCode(num);
    }
    @Override
    public boolean equals(Object o)
    {
      if(o instanceof Key){
        Key toCompare = (Key) o;
        return this.num == toCompare.num;
      }
      return false;

    }

  }

}
