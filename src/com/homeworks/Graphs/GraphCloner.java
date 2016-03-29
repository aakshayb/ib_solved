package com.homeworks.Graphs;

import java.util.*;

/**
 * Created by spiff on 2/22/16.
 */
public class GraphCloner
{

    public HashMap <Node, List<Node>> graph;

    public GraphCloner(HashMap <Node, List<Node>> g)
    {
        graph = g;
    }

    public GraphCloner clone()
    {
        HashMap<Node, List<Node>> hashMap = new HashMap<>();
        for(Map.Entry<Node, List<Node> > each : graph.entrySet() )
        {
            List<Node> node = new ArrayList<>();
            for(Node n : each.getValue())
            {
                node.add(n);
            }
            hashMap.put(each.getKey(), node);
        }
        return new GraphCloner(hashMap);
    }

    static class Node {
        int data;
        Node(int d)
        {
            data = d;
        }
    }

    public static void main(String args[])
    {
        HashMap <Node, List<Node>> graph = new HashMap<>();
        Node n1 = new Node(1);
        graph.put( n1 , Arrays.asList(new Node(2) , new Node(4)) );
        GraphCloner gr = new GraphCloner(graph);
        GraphCloner gr2 = gr.clone();
        List<Node> list =  gr.graph.get(n1);
        Node n = list.get(0);
        n.data = 100;
        n.data  = 1;


    }





}

