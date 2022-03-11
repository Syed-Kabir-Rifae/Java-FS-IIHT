package expee;
import java.util.LinkedList;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashMap;
class HashMapEx
{
	public static void main(String arg[])

{ 
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
String s="Syed Ahamed Kabir Rifae";
char[] c= s.toCharArray();
for(char ci : c)
{
	if(hm.containsKey(ci))
	{
		hm.put(ci, hm.get(ci)+1);
	}
	
	else
		hm.put(ci, 1);
	}
}}
/*
System.out.println(hm);
Set<Entry<Character, Integer>> se = hm.entrySet();
for(Map.Entry<Character,Integer> entry : se)
{
	if(entry.getValue()>1)
		{​​​​​​​​
        System.out.println(entry.getKey());}
	
		​​​​​​​​
}}}}​​​​​​​​
}
/*Iterator itr =hm.iterator();
for(char ch:itr)
{
	if(hm.get(ch)>1)
	{
		System.out.println("Duplicate character is"+ hm.get(ch));
	}
	
}
	*/

