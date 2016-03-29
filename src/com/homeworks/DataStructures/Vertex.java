package com.homeworks.DataStructures;

import java.util.HashSet;

public class Vertex
{
  public enum Color
  {
    BLACK, WHITE, GREY
  }

  int x;
  int y;
  Vertex previous;
  int distance;
  Color color;
  static HashSet<Vertex> store = new HashSet<>();

  private Vertex(int x, int y)
  {
    this.x = x;
    this.y = y;
    distance = 0;
    previous = null;
    color = Color.WHITE;
  }

  public static Vertex create(int x, int y)
  {
    for (Vertex each : store)
    {
      if (each.x == x && each.y == y)
        return each;
    }
    Vertex now = new Vertex(x, y);
    store.add(now);
    return now;
  }

  @Override
  public boolean equals(Object val)
  {
    if (val == this)
      return true;
    if (val == null)
      return false;
    if (!val.getClass().equals(this.getClass()))
      return false;
    Vertex vertex = (Vertex) val;
    return vertex.x == this.x && vertex.y == this.y;
  }

  @Override
  public int hashCode()
  {
    int prime = 100003;
    int result = 1;
    result = result * prime + 10 * this.x + this.y;
    return result;
  }


}
