package com.home.random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestArray {

	public static void main(String[] args) {

	   List<Integer> randomIntegerList = Arrays.asList(1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11);
	 
	   /** Most efficient way to remove duplicates as its much faster **/
	   print(removeDuplicate(randomIntegerList));
	   
	   /** Second  efficient way ,has overhead to keep ordering **/
	   print(removeDuplicateKeepOrder(randomIntegerList));
	   
	   /** Thrid most efficient way due to sorting **/
	   print(removeDupicateWithSortedOrder(randomIntegerList));
	   
	   /** Prints numbers counting occuranceses in array **/
	   printMap(randomIntegerList);
	}

	public static Set removeDuplicate(List<Integer> numberList){
		Set <Integer> numberSet = new HashSet<Integer>();
		numberSet.addAll(numberList);
		return numberSet;
	}
	public static Set removeDuplicateKeepOrder(List <Integer> numberList){
		Set <Integer> numLinked = new LinkedHashSet <Integer>();
		numLinked.addAll(numberList);
		return numLinked;
	}
	public static Set removeDupicateWithSortedOrder(List <Integer> numberList){
		Set <Integer> numberTree = new TreeSet <Integer>();
		numberTree.addAll(numberList);
		return numberTree;
	}

	public static void print(Set numberSet){
		Iterator itr = numberSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next() );
		}
	}
	public static void printMap(List<Integer> randomIntegerList){
		Map<Integer,Integer> randomMap = new TreeMap<Integer,Integer>();
		for(Integer randomNumber : randomIntegerList){
				if(randomMap.containsKey(randomNumber)){
					Integer occurance = randomMap.get(randomNumber);
					occurance = occurance +1;
					randomMap.put(randomNumber, occurance);
				}else{
				randomMap.put(randomNumber, 0);
				}
			}
				
			Iterator itr = randomMap.entrySet().iterator();
			while(itr.hasNext()){
				Map.Entry row	= (Map.Entry)itr.next();
				System.out.print ("Occurance of " +row.getKey() +" is "+row.getValue() +" \n");
			}
	}
}
