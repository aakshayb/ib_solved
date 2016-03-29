package com.homeworks.Graphs;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Akshay on 2/16/2016.
 */
public class BFS
{
    public static void main(String args[])
    {
        BFS bfs = new BFS();
        Vertex end  = bfs.knight(7,13,2,8,3,4);
        if(end == null)
            return;
        String path = ""+ (end.x+1) + ","+ (end.y+1) + " -> ";
        while(end.previous != null)
        {
            end = end.previous;
            path += ""+ (end.x+1) + ","+ (end.y+1) + " -> ";
        }
        System.out.print("Path -> " +path   );
    }

    public Vertex knight(int N, int M, int x1, int y1, int x2, int y2) {
        Vertex startVertex = Vertex.create(x1-1,y1-1);
        Vertex endVertex = Vertex.create(x2-1,y2-1);

        Queue<Vertex> queue = new LinkedList<>();
        buildGraph(N, M);

        Vertex currentVertex = startVertex;
        currentVertex.color = Vertex.Color.GREY;
        queue.add(currentVertex);

        while(!queue.isEmpty())
        {
            currentVertex = queue.remove();
            for(Vertex vertex : hashMap.get(currentVertex))
            {
                if(vertex.color != Vertex.Color.WHITE)
                    continue;
                vertex.color = Vertex.Color.GREY;
                vertex.distance = currentVertex.distance +1;
                vertex.previous = currentVertex;
                if(vertex.equals(endVertex))
                    return endVertex;
                queue.add(vertex);
            }
            currentVertex.color = Vertex.Color.BLACK;
        }
        if(endVertex.color == Vertex.Color.WHITE)
            return null;
        return endVertex;
    }

    private void buildGraph(int N, int M) {
        for(int i =0; i< N ; i++)
        {
            for (int j=0; j< M; j++)
            {
                Vertex current = Vertex.create(i, j);
                hashMap.put(current, generateList(current, N, M) );
            }
        }
    }

    HashMap<Vertex, List<Vertex>> hashMap = new HashMap<>();
    private List<Vertex> generateList(Vertex v, int N, int M)
    {
        List<Vertex> vertices = new ArrayList<>();
        List<Vertex> moves = new ArrayList<>( Arrays.asList(
                Vertex.create(2,1), Vertex.create(2, -1), Vertex.create(-2, 1), Vertex.create(-2,-1),
                Vertex.create(1,2),  Vertex.create(1, -2), Vertex.create(-1, 2), Vertex.create(-1, -2))
        );
        for(int i=0; i <7; i++)
        {
            Vertex vertex =  Vertex.create(v.x + moves.get(i).x, v.y + moves.get(i).y);
            if(isLegalVertex(vertex, N, M))
                vertices.add(vertex);
        }
        return vertices;
    }
    private boolean isLegalVertex(Vertex v, int N, int M)
    {
        return v.x < N && v.y < M && v.x >= 0 && v.y >= 0;
    }
    public static class Vertex
    {
        enum Color { BLACK, WHITE, GREY}

        int x, y;
        Vertex previous;
        int distance;
        Color color;
        static HashSet<Vertex> store = new HashSet<>();
        int startTime;
        int endTime;

        private Vertex(int x, int y)
        {
            this.x = x;
            this.y = y;
            distance = 0;
            previous = null;
            color = Color.WHITE;
            startTime = 0;
            endTime = 0;
        }
        public static Vertex create (int x, int y)
        {
            for(Vertex each : store)
            {
                if(each.x == x && each.y == y)
                    return each;
            }
            Vertex now = new Vertex(x, y);
            store.add(now);
            return now;
        }
        @Override
        public boolean equals(Object val)
        {
            if(val == this)
                return true;
            if(val == null)
                return  false;
            if(!val.getClass().equals(this.getClass()))
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

}
