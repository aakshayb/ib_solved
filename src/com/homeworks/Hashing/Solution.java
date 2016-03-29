package com.homeworks.Hashing;

import java.util.*;

/**
 * Created by Akshay on 3/25/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution sol = new Solution();
    RandomListNode node = new RandomListNode(-1).create(Arrays.asList(14,83,188,253,281,254,56,70,3,276,233,280,224,16,173,183,193,44, 184, 33, 213, 134, 95, 213, 48, 300, 62, 237, 63));
    node = sol.copyRandomList(node);
    int num = sol.lengthOfLongestSubstring("abacdbef");
    int res = sol.colorful(3245);
    res = sol.isValidSudoku(Arrays.asList("..4...63.",
                                          ".........",
                                          "5......9.",
                                          "...56....",
                                          "4.3.....1",
                                          "...7.....",
                                          "...5.....",
                                          ".........",
                                          "........."));
    List another = sol.fourSum(new ArrayList<>(Arrays.asList(1,0,-1,0,-2,2)),0);
    another = sol.lszero(new ArrayList<>(Arrays.asList(1,0,-1,0,-2,2)));
    another = sol.equal(new ArrayList<>(Arrays.asList( 3, 4, 7, 1, 2, 9, 8)));
    int rank = sol.findRank("abc");

    int ret =0;
  }
  private ArrayList<Integer> equal(ArrayList<Integer> a)
  {
    HashMap<Integer, ArrayList<Node>> hashMap = new HashMap<>();
    for(int i=0; i<a.size(); i++)
    {
      for(int j=i+1; j< a.size();j++)
      {
        int sum = a.get(i)+ a.get(j);
        Node currentNode = new Node(i, j);
        ArrayList<Node> list;
        if(hashMap.containsKey(sum))
        {
          list = hashMap.get(sum);
        }else
          list = new ArrayList<>();
        list.add(currentNode);
        hashMap.put(sum, list);
      }
    }
    ArrayList<Integer> retList = new ArrayList<>();
    for(int i=0; i< a.size();i++)
    {
      for(int j=i+1; j< a.size();j++)
      {
        int sum =  a.get(i) + a.get(j);
        if(hashMap.containsKey(sum))
        {
          List<Node> nodes = hashMap.get(sum);
          Node currNode = new Node (i,j);
          for(Node node: nodes)
          {
            if(overlaps(currNode, node))
              continue;
            retList.add(currNode.i);
            retList.add(currNode.j);
            retList.add(node.i);
            retList.add(node.j);
            return retList;
          }
        }
      }
    }
    return retList;
  }

  private boolean overlaps(Node currNode, Node node)
  {
    return currNode.i == node.i || currNode.j == node.i || node.j == currNode.i || currNode.j == node.j;
  }

  class Node
  {
    int i,j;
    Node(int one, int two)
    {
      i=one;
      j= two;
    }
  }

  public ArrayList<Integer> equalIncorrect(ArrayList<Integer> a) {
    HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
    ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
    for(int i=0; i< a.size(); i++)
    {
      if(!hashMap.containsKey(a.get(i)))
        hashMap.put(a.get(i), Arrays.asList(i));
    }
    for(int i=0; i < a.size(); i++)
    {
      for(int j=i+1; j< a.size();j++)
      {
        for(int k=j+1; k<a.size(); k++)
        {
          int fourth = a.get(i) + a.get(j) - a.get(k);
          if(hashMap.containsKey(fourth))
          {
            List<Integer> list = hashMap.get(fourth);
            for (Integer aList : list)
            {
              int index = aList;
              if (index != i && index != j && index != k)
                retList.add(new ArrayList<>(Arrays.asList(i, j, k, index)));
            }
          }
        }
      }
    }
    Collections.sort(retList, (o1, o2) -> {
      for(int i =0; i< 3; i++)
      {
        if(o1.get(i) < o2.get(i))
          return -1;
        else if(o1.get(i) > o2.get(i) )
          return 1;
      }
      return Integer.compare(o1.get(3), o2.get(3));
    });
    if(retList.size() !=0)
      return retList.get(0);
    else
      return null;
  }

  // returns largest sub sequence that sums to zero
  public ArrayList<Integer> lszero(ArrayList<Integer> a) {
    int sumArray = 0, l=-1, r=-1;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    int len = 0;
    hashMap.put(0,-1);

    for(int i=0; i< a.size(); i++)
    {
      sumArray += a.get(i);
      if(!hashMap.containsKey(sumArray))
        hashMap.put(sumArray, i);
      else
      {
        if(i-hashMap.get(sumArray)>len)
        {
          l = hashMap.get(sumArray)+1;
          r = i;
          len = i-hashMap.get(sumArray);
        }
      }
    }
    if(l>=0 && r>=0)
    {
      list = new ArrayList<>(a.subList(l,r+1));
    }
    return list;
  }

  public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b)
  {
    HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for (int i = 0; i < a.size(); i++)
    {
      int num = 0 - a.get(i);
      if (!hashMap.containsKey(num))
        hashMap.put(num, new ArrayList<>(Arrays.asList(i)));
      else
        hashMap.get(num).add(i);
    }
    for (int i = 0; i < a.size(); i++)
    {
      for (int j = i + 1; j < a.size(); j++)
      {
        for (int k = j + 1; k < a.size(); k++)
        {
          int sum = a.get(i) + a.get(j) + a.get(k) - b;
          if (hashMap.containsKey(sum))
          {
            List<Integer> l = hashMap.get(sum);
            for (Integer aL : l)
            {
              int c = aL;
              if (c != i && c != j && c != k)
              {
                ArrayList<Integer> toAdd = new ArrayList<>(Arrays.asList(a.get(i), a.get(j), a.get(k), a.get(c)));
                Collections.sort(toAdd);
                if (!list.contains(toAdd))
                  list.add(toAdd);
              }
            }
          }

        }
      }
    }
    Collections.sort(list, (o1, o2) -> {
      if(o1.size() !=4 || o2.size() !=4)
          return -1;

      if(o1.get(0) < o2.get(0))
        return -1;
      else if (o1.get(0) > o2.get(0))
        return 1;

      if(o1.get(1) < o2.get(1))
        return -1;
      else if (o1.get(1) > o2.get(1))
        return 1;

      if(o1.get(2) < o2.get(2))
        return -1;
      else if (o1.get(2) > o2.get(2))
        return 1;

      return Integer.compare(o1.get(3), o2.get(3));
    });
    return list;
  }

  public int diffPossible(final List<Integer> a, int b) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0; i< a.size();i++)
      hashMap.put(a.get(i), i);

    for(int i=0; i< a.size();i++)
    {
      int val = a.get(i)+b;
      if(hashMap.containsKey(val) && hashMap.get(val) != i )
        return 1;
    }
    return 0;
  }

  public int isValidSudoku(final List<String> a) {
    int n  = a.size();
    for(int i=0; i<n/3; i++)
    {
      for(int j=0; j< n/3;j++)
      {
        HashSet<String> hashSet = new HashSet<>();
        for(int k=0; k<3;k++)
        {
          String each = a.get(3*i+k);

          for(int l=0; l<3;l++)
          {
            int index = 3*(j) + l;
            char on = each.charAt(index);
            if(on == '.')
              continue;
            if(hashSet.contains(""+on))
              return 0;
            else
              hashSet.add(""+on);
          }
        }
      }
    }
    for(int i=0;i<a.size();i++)
    {
      HashSet hash = new HashSet();
      HashSet hash2 = new HashSet();
      for(int j=0; j<a.size();j++)
      {
        char on = a.get(i).charAt(j);
        char on2 = a.get(j).charAt(i);

        if(on != '.')
        {
          if(hash.contains(""+on))
            return 0;
          else
            hash.add(""+on);
        }
        if(on2 != '.')
        {
          if(hash2.contains(""+on2))
            return 0;
          else
            hash2.add(""+on2);
        }
      }
    }
    return 1;
  }

  public int colorful(int a) {
    HashSet<Integer> products = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    while(a!=0)
    {
      list.add(a%10);
      if(products.contains(a%10))
        return 0;
      else
        products.add(a%10);
      a/=10;
    }
    if(list.size() ==2)
      return products.contains(list.get(0) *list.get(1)) ? 0:1;
    for(int i=1; i < list.size(); i++)
    {
      int k =0;
      while(k+1<list.size())
      {
        if(i+k == list.size())
            break;
        int product = 1;
        for(int j=k;j <i+k+1; j++)
        {
          product *= list.get(j);
        }
        if(products.contains(product))
          return 0;
        else
          products.add(product);
        k=k+1;
      }
    }
    return 1;
  }

  public int lengthOfLongestSubstring(String a) {
    int retLength = 0;
    for(int i=0; i < a.length(); i++)
    {
      HashSet<Character> hashSet = new HashSet<>();
      int j = i;
      while(!hashSet.contains(a.charAt(j)))
      {
        hashSet.add(a.charAt(j));
        j++;
        if(j == a.length())
          break;
      }
      retLength = Math.max(retLength, j-i);
    }
    return retLength;
  }

  static class RandomListNode {
         int label;
         RandomListNode next, random;
         RandomListNode(int x) { this.label = x; }
        RandomListNode create(List<Integer> arrayList)
        {
          RandomListNode head = null, retHead =null;
          int n = arrayList.get(0);
          List<RandomListNode> list = new ArrayList<>();
          for(int i=1; i<= n; i++)
          {
            RandomListNode node = new RandomListNode(arrayList.get(i));
            list.add(node);
            if(head == null)
               head = retHead = node;
            head.next = node;
            head = head.next;
          }
          head = retHead;
          for(int i=0; i< n; i++)
          {
            head.random = list.get(arrayList.get(n+i) % n);
            head = head.next;
          }
          return retHead;
        }
  }

  public RandomListNode copyRandomList(RandomListNode head) {
    HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<>();
    RandomListNode retHead = head, firet = head;
    while(head!=null)
    {
      if(!hashMap.containsKey(head))
      {
        RandomListNode node =  new RandomListNode(head.label);
        hashMap.put(head, node);
      }
      head = head.next;
    }
    while(retHead!=null)
    {
      if(hashMap.containsKey(retHead))
      {
        RandomListNode newNode = hashMap.get(retHead);
        newNode.next = hashMap.get(retHead.next);
        newNode.random = hashMap.get(retHead.random);
        hashMap.put(retHead, newNode);
      }
      retHead = retHead.next;
    }
    return hashMap.get(firet);
  }

  public int findRank(String a)
  {
    //return ((int) (recursiveFind(a, 0) % 1000003)) ;

    return ((int) (loopyFind(a) % 1000003));
  }

  private long loopyFind(String a)
  {
    HashMap<Long, Long> hashMap = new HashMap<>();
    hashMap.put(1L, 1L);
    hashMap.put(2L, 2L);
    hashMap.put(3L, 6L);
    hashMap.put(4L, 24L);
    hashMap.put(5L, 120L);
    hashMap.put(6L, 720L);
    hashMap.put(7L, 5040L);
    hashMap.put(8L, 40320L);
    hashMap.put(9L, 362880L);
    hashMap.put(10L, 3628800L);
    hashMap.put(11L, 39916800L);
    hashMap.put(12L, 479001600L);
    hashMap.put(13L, 6227020800L);
    hashMap.put(14L, 87178291200L);
    hashMap.put(15L, hashMap.get(14L) * 15L);
    hashMap.put(16L, hashMap.get(15L) * 16L);
    hashMap.put(17L, hashMap.get(16L) * 17L);
    hashMap.put(18L, hashMap.get(17L) * 18L);
    hashMap.put(19L, hashMap.get(18L) * 19L);
    hashMap.put(20L, hashMap.get(19L) * 20L);
    hashMap.put(21L, hashMap.get(20L) * 21L);
    hashMap.put(22L, hashMap.get(21L) * 22L);
    hashMap.put(23L, hashMap.get(22L) * 23L);
    hashMap.put(24L, hashMap.get(23L) * 24L);
    hashMap.put(25L, hashMap.get(24L) * 25L);
    hashMap.put(26L, hashMap.get(25L) * 26L);

    long count = 1;
    for (int i = 0; i < a.length(); i++)
    {
      char charAtI = a.charAt(i);
      long numberOfCharsBefore = 0;
      for (int j = i; j < a.length(); j++)
      {
        if (a.charAt(j) < charAtI)
          numberOfCharsBefore++;
      }
      count += numberOfCharsBefore == 0 ? 0 :
          numberOfCharsBefore * hashMap.get((long) (a.length() - i - 1));
    }
    return count;
  }
}
