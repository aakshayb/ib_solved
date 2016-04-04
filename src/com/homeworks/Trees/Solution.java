package com.homeworks.Trees;

import java.math.BigInteger;
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
    
    root = TreeNode.create(Arrays.asList(543, 0 ,2 ,0 ,1 ,0 ,2 ,2 ,1 ,0 ,0 ,1 ,2 ,1 ,1 ,2 ,1 ,2 ,1 ,0 ,0 ,2 ,0 ,2 ,2 ,-1 ,1 ,0 ,1 ,-1 ,1 ,2 ,2 ,2 ,1 ,1 ,-1 ,1 ,2 ,1 ,0 ,1 ,1 ,0 ,2 ,2 ,2 ,2 ,2 ,0 ,2 ,0 ,1 ,2 ,-1 ,-1 ,0 ,1 ,0 ,2 ,-1 ,2 ,1 ,0 ,-1 ,-1 ,2 ,1 ,0 ,-1 ,0 ,2 ,-1 ,-1 ,1 ,2 ,-1 ,-1 ,0 ,2 ,1 ,-1 ,1 ,0 ,0 ,-1 ,2 ,-1 ,-1 ,1 ,2 ,0 ,-1 ,-1 ,2 ,1 ,2 ,-1 ,1 ,1 ,0 ,2 ,2 ,0 ,-1 ,1 ,1 ,0 ,1 ,0 ,0 ,1 ,2 ,2 ,0 ,-1 ,1 ,2 ,0 ,-1 ,-1 ,-1 ,0 ,-1 ,2 ,2 ,-1 ,-1 ,0 ,-1 ,1 ,0 ,-1 ,-1 ,0 ,-1 ,1 ,-1 ,0 ,1 ,-1 ,1 ,0 ,0 ,-1 ,2 ,1 ,-1 ,0 ,0 ,0 ,0 ,-1 ,-1 ,-1 ,-1 ,2 ,1 ,-1 ,1 ,2 ,-1 ,0 ,1 ,1 ,2 ,0 ,-1 ,-1 ,0 ,-1 ,0 ,2 ,0 ,-1 ,1 ,-1 ,2 ,1 ,-1 ,0 ,-1 ,0 ,2 ,-1 ,0 ,2 ,0 ,1 ,0 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,1 ,0 ,-1 ,1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,-1 ,-1 ,2 ,1 ,1 ,2 ,1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,2 ,2 ,0 ,-1 ,-1 ,1 ,0 ,-1 ,1 ,1 ,1 ,-1 ,2 ,1 ,0 ,2 ,-1 ,1 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,2 ,1 ,1 ,-1 ,2 ,0 ,2 ,-1 ,-1 ,-1 ,1 ,2 ,-1 ,-1 ,-1 ,-1 ,0 ,1 ,1 ,-1 ,-1 ,-1 ,2 ,2 ,-1 ,-1 ,2 ,2 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,1 ,-1 ,-1 ,1 ,2 ,-1 ,1 ,2 ,2 ,-1 ,-1 ,-1 ,2 ,-1 ,0 ,-1 ,0 ,2 ,2 ,0 ,2 ,-1 ,0 ,2 ,1 ,-1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,1 ,-1 ,0 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,0 ,2 ,1 ,0 ,-1 ,-1 ,2 ,0 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,-1 ,-1 ,0 ,1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,0 ,0 ,-1 ,1 ,1 ,1 ,2 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,0 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,0 ,2 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,0 ,2 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,1 ,-1 ,-1 ,1 ,2 ,1 ,0 ,-1 ,-1 ,0 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,2 ,-1 ,-1 ,2 ,-1 ,1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,0 ,1 ,1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ));
    another = sol.pathSum(root, 10);

    root = TreeNode.create(Arrays.asList(763 ,3 ,7 ,9 ,9 ,0 ,-1 ,-1 ,2 ,1 ,4 ,3 ,2 ,5 ,2 ,2 ,4 ,8 ,1 ,1 ,4 ,9 ,0 ,-1 ,8 ,3 ,5 ,2 ,5 ,-1 ,1 ,6 ,2 ,8 ,1 ,0 ,7 ,3 ,-1 ,7 ,-1 ,6 ,6 ,1 ,7 ,1 ,5 ,9 ,4 ,7 ,-1 ,7 ,-1 ,-1 ,-1 ,6 ,2 ,8 ,7 ,8 ,1 ,5 ,9 ,0 ,4 ,6 ,-1 ,-1 ,5 ,6 ,-1 ,2 ,1 ,8 ,2 ,5 ,5 ,-1 ,4 ,-1 ,1 ,9 ,1 ,4 ,3 ,5 ,7 ,4 ,-1 ,-1 ,0 ,6 ,7 ,5 ,-1 ,2 ,1 ,7 ,1 ,9 ,0 ,2 ,5 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,8 ,2 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,3 ,9 ,4 ,8 ,8 ,6 ,4 ,7 ,2 ,5 ,7 ,1 ,-1 ,9 ,5 ,3 ,8 ,0 ,4 ,-1 ,-1 ,5 ,5 ,7 ,2 ,-1 ,-1 ,-1 ,8 ,0 ,4 ,4 ,5 ,5 ,7 ,-1 ,-1 ,5 ,6 ,3 ,-1 ,9 ,1 ,9 ,-1 ,8 ,-1 ,-1 ,9 ,-1 ,-1 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,7 ,3 ,-1 ,1 ,8 ,-1 ,-1 ,1 ,8 ,-1 ,-1 ,-1 ,8 ,0 ,0 ,5 ,6 ,-1 ,-1 ,0 ,-1 ,9 ,-1 ,5 ,-1 ,6 ,6 ,-1 ,6 ,2 ,6 ,5 ,-1 ,-1 ,7 ,3 ,1 ,6 ,-1 ,7 ,6 ,-1 ,-1 ,6 ,-1 ,3 ,9 ,-1 ,-1 ,-1 ,0 ,-1 ,2 ,-1 ,0 ,-1 ,7 ,3 ,5 ,-1 ,8 ,2 ,0 ,6 ,8 ,7 ,3 ,9 ,0 ,1 ,0 ,-1 ,-1 ,-1 ,0 ,8 ,7 ,2 ,9 ,-1 ,6 ,6 ,6 ,-1 ,2 ,3 ,2 ,-1 ,-1 ,1 ,1 ,4 ,8 ,-1 ,2 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,3 ,6 ,-1 ,-1 ,-1 ,-1 ,5 ,4 ,1 ,7 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,8 ,0 ,-1 ,5 ,5 ,-1 ,7 ,3 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,7 ,9 ,4 ,-1 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,0 ,5 ,5 ,-1 ,-1 ,-1 ,2 ,6 ,8 ,1 ,-1 ,0 ,-1 ,6 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,8 ,2 ,-1 ,4 ,2 ,-1 ,1 ,-1 ,-1 ,-1 ,2 ,1 ,0 ,2 ,7 ,8 ,-1 ,1 ,-1 ,-1 ,3 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,8 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,8 ,-1 ,3 ,-1 ,8 ,6 ,3 ,-1 ,-1 ,-1 ,8 ,6 ,4 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,9 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,2 ,7 ,3 ,9 ,-1 ,-1 ,9 ,-1 ,-1 ,-1 ,-1 ,6 ,-1 ,3 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,3 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,1 ,9 ,1 ,-1 ,-1 ,2 ,5 ,1 ,-1 ,-1 ,4 ,2 ,-1 ,-1 ,-1 ,7 ,6 ,3 ,8 ,2 ,8 ,-1 ,-1 ,0 ,-1 ,-1 ,3 ,1 ,-1 ,-1 ,5 ,-1 ,-1 ,9 ,-1 ,2 ,-1 ,0 ,-1 ,-1 ,-1 ,8 ,-1 ,-1 ,8 ,-1 ,-1 ,0 ,-1 ,0 ,-1 ,7 ,-1 ,-1 ,1 ,4 ,-1 ,9 ,5 ,3 ,-1 ,-1 ,-1 ,2 ,3 ,-1 ,-1 ,-1 ,6 ,7 ,-1 ,0 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,8 ,3 ,-1 ,-1 ,9 ,5 ,-1 ,-1 ,-1 ,9 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,0 ,-1 ,8 ,1 ,-1 ,5 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,1 ,0 ,-1 ,8 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,3 ,5 ,9 ,4 ,1 ,9 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,9 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,0 ,1 ,-1 ,3 ,-1 ,8 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,2 ,5 ,6 ,2 ,6 ,-1 ,6 ,6 ,4 ,-1 ,9 ,-1 ,-1 ,-1 ,-1 ,5 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,7 ,-1 ,-1 ,-1 ,-1 ,9 ,4 ,2 ,1 ,8 ,-1 ,-1 ,-1 ,3 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,9 ,-1 ,-1 ,-1 ,3 ,-1 ,-1 ,3 ,-1 ,-1 ,7 ,4 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,7 ,8 ,-1 ,9 ,0 ,-1 ,-1 ,-1 ,2 ,6 ,-1 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,4 ,2 ,-1 ,-1 ,6 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,-1));
    int res = sol.sumNumbers(root);

    int stop =1;
  }

  public void connect(TreeLinkNode root) {
    TreeLinkNode iter = root, prev =null;
    if(root ==null)
      return;
    root.next = null;
    while(iter!=null)
    {
      TreeLinkNode iter2 = iter;
      while(iter2!=null)
      {
        if(iter2.left!=null)
        {

          iter2.left.next = iter2.right;

        }
        if(iter2.right!=null)
          iter2.right.next = getNextRight(iter2);
        iter2 = iter2.next;
      }
      if(iter.left !=null)
        iter = iter.left;
      else if (iter.right != null)
        iter = iter.right;
      else
        iter = getNextRight(iter);
    }
  }

  private TreeLinkNode getNextRight(TreeLinkNode p)
  {
    TreeLinkNode temp = p.next;
    while(temp!=null)
    {
      if(temp.left!=null)
        return temp.left;
      if(temp.right != null)
        return temp.right;
      temp = temp.next;
    }
    return null;
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

  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
    ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> each = new ArrayList<>();

    Queue<TreeNode> current = new LinkedList<>();
    Queue<TreeNode> next = new LinkedList<>();
    current.add(a);
    while(!current.isEmpty())
    {
      TreeNode curr = current.remove();
      if(curr.left!=null)
        next.add(curr.left);
      if(curr.right!=null)
        next.add(curr.right);
      each.add(curr.val);
      if(current.isEmpty())
      {
        current = next;
        next = new LinkedList<>();
        retList.add(each);
        each = new ArrayList<>();
      }
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


  public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
    pathSum(root, sum, 0, new ArrayList<Integer>(), retList);
    return retList;

  }
  private void pathSum(TreeNode node, int sum, int currentSum, List<Integer> list, ArrayList<ArrayList<Integer>>retList )	{
    if(node == null) return ;
    if(node.left ==null && node.right == null)
    {
      if(sum == node.val+currentSum)
      {
        ArrayList<Integer> myList = new ArrayList<>(list);
        myList.add(node.val);
        retList.add(myList);
        return;
      }
      else
        return;
    }
    list.add(node.val);
    pathSum(node.left, sum, currentSum+ node.val, list, retList);
    pathSum(node.right, sum, currentSum + node.val, list, retList);
    list.remove(list.size()-1);

  }

  public int sumNumbers(TreeNode a) {
    return sumNumbers(a, "", 0)%1003;
  }

  private int sumNumbers(TreeNode a, String currNum, int sumSofar)
  {
    if(a==null) return -1;
    if(a.left == null && a.right ==null)
    {
      int num = Integer.parseInt(currNum+a.val);
      return num;
    }

    int leftSum = sumNumbers(a.left, currNum+a.val, sumSofar );
    int rightSum = sumNumbers(a.right, currNum+a.val, sumSofar);

    if(rightSum !=-1)
      sumSofar +=rightSum;
    if(leftSum!=-1)
      sumSofar+=leftSum;

    return sumSofar;
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
      while( node.key!=newVal.key  )
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
