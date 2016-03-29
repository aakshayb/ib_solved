package com.homeworks.Graphs;

import java.util.*;

/**
 * Created by spiff on 1/16/16.
 */
public class KnightsTour
{
   private String inputString = "This is an interview";
   private boolean hasUnique(String input)
   {
       HashMap hash = new HashMap();
       for(char c : input.toCharArray())
       {
           if(hash.containsKey(c))
               return false;
           hash.put(c, 1);
       }
       return true;
   }
   public static void main(String args[])
   {
       KnightsTour one = new KnightsTour();
       System.out.println(one.hasUnique("Akshlin"));
       System.out.println(one.hasUnique("Quick brown fox jumped over the lazy dog"));
   }

  List<Edge> graph = new ArrayList<>();

  class Edge
  {
    Vertex v1, v2;
    Edge(Vertex v1, Vertex v2)
    {
      this.v1 = v1;
      this.v2 = v2;
    }

  }

  class Vertex
  {
    int x;
    int y;
    Vertex(int x, int y)
    {
      this.x = x;
      this.y = y;
    }
  }

}
