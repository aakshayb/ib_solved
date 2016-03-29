package com.homeworks.Trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode
{
  public int val;
  public TreeNode left, right;
  TreeNode(int x)
  {
    val =x;
  }

  static TreeNode create(List<Integer> listNodes)
  {
    int n = listNodes.get(0);
    TreeNode root = null, previous = null;
    List<TreeNode> treeNodes = new ArrayList<>();
    treeNodes.add(null);
    for(int i=1; i<= (n-1)/2 +1 ;i++)
    {
      if(previous != null)
      {
        int leftIndex = 2*(i-1);
        if(leftIndex < treeNodes.size())
          previous.left = treeNodes.get(leftIndex);
        else
        {
          previous.left = listNodes.get(2*(i-1) )== -1? null: new TreeNode(listNodes.get(2*(i-1)));
          treeNodes.add(leftIndex, previous.left);
        }

        int rightIndex = 2*(i-1)+1;
        if(rightIndex < treeNodes.size())
          previous.right = treeNodes.get(rightIndex);
        else
        {
          previous.right = listNodes.get(2*(i-1)+1 )== -1? null: new TreeNode(listNodes.get(2*(i-1)+1));
          treeNodes.add(rightIndex, previous.right);
        }
      }
      TreeNode current;
      if(i< treeNodes.size())
        current =  treeNodes.get(i);
      else
      {
        current = listNodes.get(i) == -1? null : new TreeNode(listNodes.get(i));
        treeNodes.add(i,current);
      }
      if(current == null)
          continue;
      if(root == null)
        root = current;
      previous = current;
    }
    return root;
  }


}
