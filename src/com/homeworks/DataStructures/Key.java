package com.homeworks.DataStructures;

/**
 * Created by spiff on 2/6/16.
 */
public class Key implements Comparable<Key>{

    private final int testValue;
    public Key(int testValue)
    {
        this.testValue = testValue;
    }
    @Override
    public int compareTo(Key testKey)
    {
        return Integer.compare(testValue, testKey.testValue);
    }
    @Override
    public boolean equals(Object testObj)
    {
        if(this == testObj) return true;
        if(testObj == null || getClass() != testObj.getClass() ) return false;
        return ((Key)testObj).testValue == this.testValue;
    }
    @Override
    public int hashCode()
    {
        return 1;
    }
}
