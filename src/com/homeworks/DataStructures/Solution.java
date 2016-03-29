package com.homeworks.DataStructures;

import com.homeworks.General.BaseConverter;
import com.homeworks.General.ReverseString;
import com.homeworks.General.StringMatcher;
import com.homeworks.Graphs.KnightsTour;

import java.io.UnsupportedEncodingException;
import java.util.*;

import static java.lang.System.out;

/**
 * Created by spiff on 1/16/16.
 */
public class Solution
{
    public static void main(String args[])
    {
        ReverseString two = new ReverseString();
        String testInput1 = "Interview work for Akshay";
        out.println(two.reverse(testInput1));
        out.println(two.recursiveReverse(testInput1));
        out.println(two.swapReverse(testInput1));

        FileReader ic = new FileReader();
        int output = ic.getInversionCount(ic.FileReader("/Users/spiff/InterviewQuest/Cracking_the_coding_interview/Cracking_the_coding_interview/input.txt"));
        out.println(output);

        Node first = new Node(1);
        out.println(first.toString());
        first.appendTo(new Node(100)).appendTo(new Node(250))
                .appendTo(new Node(150)).appendTo(new Node(175))
                .appendTo(new Node(230)).appendTo(new Node(200));
        out.println(first.toString());
        first.deleteLast();
        out.println(first.toString());
        first.deleteByElement(250);
        out.println(first.toString());
        first.deleteByElement(20);
        out.println(first.toString());
        first.deleteByElement(1);
        out.println(first.toString());

        Node firstElement = new Node(10);
        com.homeworks.DataStructures.LinkedList linkedList = new com.homeworks.DataStructures.LinkedList(firstElement);
        Node abc = new Node(200);
        linkedList.append(abc).append(new Node(250))
                .append(new Node(140)).append(new Node(90));
        out.println(linkedList);
        linkedList.deleteLast();
        out.println(linkedList);
        linkedList.deleteElement(abc);
        out.println(linkedList);
        linkedList.deleteElement(firstElement);
        out.println(linkedList);

        String oneStr = "Command";
        String twoStr = "and";
        out.println(" Result is : " + new StringMatcher().match(oneStr, twoStr));
        out.println(" Result is : " + new StringMatcher().match(testInput1, "Akshay"));
        out.println(" Result is : " + new StringMatcher().match(testInput1, "Shalini"));

        Integer[] ints = new Integer[]{1, 8, 4, 7, 2, 0};
        String [] stringArray = new String [] {"Akshay", "Bhatnagar", "Shalini", "Khare"};


        BaseConverter converter = new BaseConverter();
        out.println("Convert 52220 to binary is : " + converter.convert(52220,2));
        out.println("Convert 52220 to hexa is : " + converter.convert(52220,16));
        out.println("Convert 52220 to octa is : " + converter.convert(52220,8));

        List<Integer> arrayList = Arrays.asList(ints);
        Collections.sort(arrayList);
        arrayList.forEach(out::println);

        Collections.sort(Arrays.asList(stringArray), (String s1, String s2)  -> {
                    if(s1.length() > s2.length())
                        return 1;
                    if(s1.length() == s2.length())
                        return 0;
                    return -1;
                }
        );
        Arrays.asList(stringArray).forEach(out::println);
        HashMap<String, Integer> hashMap = new HashMap<>();
        Arrays.asList(ints).forEach(each ->
                        Arrays.asList(stringArray).forEach(eachString -> hashMap.put(eachString, each))
        );

        hashMap.forEach((K,V) -> out.print("Key: " + K +" Value: "+ V) );
        //hashMap.forEach(out::println); Doesn't work
        for(Map.Entry<String, Integer> entry : hashMap.entrySet())
        {

        }
        Integer[] atr = new Integer[100];
        Node [] nodes;

        HashMap<Key, String> testHashMap = new HashMap<>();
        testHashMap.put(new Key(1), "Akshay");
        testHashMap.put(new Key(2), "Shalini");

        String retunValue = testHashMap.get(new Key(2));
        boolean isTrue = "X-Capillary-Relay" == "Message-ID";

    }



}
