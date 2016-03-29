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
    ret = sol.get(2);
    sol.set(2,6);
    sol.get(1);
    sol.set(1,5);
    sol.set(1,2);

    sol.treeMap.clear();
    sol.set(2,1);
    sol.set(1,1);
    sol.set(2,3);
    sol.set(4,1);
    ret = sol.get(1);
    ret = sol.get(2);

    ret = sol.get(1);
    ret = sol.get(2);
    sol.set(1,1);
    sol.set(2,3);
    sol.set(4,1);
    ret = sol.get(1);
    ret = sol.get(2);
    ret = sol.get(10);
    sol.set(6,14);
    sol.set(9,24);


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


  TreeMap<Key, Integer > treeMap;
  int capacity;
  int counter ;
  public Solution(int capacity) {
    treeMap = new TreeMap<>();
    this.capacity = capacity;
    this.counter=0;
  }

  public int get(int key) {
    Key key1 = new Key(key,counter++);
    for(Key each: treeMap.keySet())
    {
      if(each.equals(key1))
      {
        int val = treeMap.get(each);
        treeMap.remove(each);
        treeMap.put(key1,val);
        return val;
      }
    }
    return -1;
  }

  public void set(int key, int value) {
    Key key1 = new Key(key,counter++);
    for(Key each: treeMap.keySet())
    {
      if(each.equals(key1))
      {
        int val = treeMap.get(each);
        treeMap.remove(each);
        treeMap.put(key1,value);
        return;
      }
    }
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
