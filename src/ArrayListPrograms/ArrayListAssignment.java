package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {

	 ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public ArrayListAssignment()
	{
		numberList.add(12);
	    numberList.add(92);
	    numberList.add(18);
	    numberList.add(26);
	    numberList.add(02);
	    numberList.add(36);
	    numberList.add(42);
	    numberList.add(87);
	    numberList.add(87);
	    numberList.add(50);
	}
	// Task 2
	public  void displayArrayList(ArrayList<Integer> arrList)
	{
		
		for(Integer num : arrList)
		{
			System.out.print(num + " ");
		}
	}
	// Task 3
	public  void addElement(int value)
	{
		numberList.add(value);
	}
	// Task 4
	public  void removeElement(int value)
	{
		numberList.remove(Integer.valueOf(value));
	}
	// Task 5
	public  void reverseArrayList()
	{
		 Collections.reverse(numberList);
	}
	// Task 6
    public  int findSum(ArrayList<Integer> arrList)
	{
    	int sum = 0;
    	for(Integer num : arrList)
		{
			sum += num;
		}
    	return sum;
			
	}
    // Task 7
    public  int findMaximum(ArrayList<Integer> arrList)
    {
    	if(arrList.isEmpty())
    	{   
    	  return -1;
    	}
    		
    	int max = arrList.get(0);
    	for(Integer num : arrList)
    	{
    		if(num > max)
    		{
    			max = num;
    		}
    	}
    		return max;
    	
    }
   // Task 7
    public  int findMinimum(ArrayList<Integer> arrList)
    {
    	if(arrList.isEmpty())
    	{   
    	  return -1;
    	}
    	
    	int min = arrList.get(0);
    	for(Integer num : arrList)
		{
			if(num < min)
			{
				min = num;
			}
		}
    	return min;
    }
    // Task 8 
    public void sortArrayList()
    {
    	Collections.sort(numberList);
    }
    // Task 10
    public int findElement(int val)
    {
    	return numberList.indexOf(val);
    }
    
    //  Task 11
    public ArrayList<Integer> removeDuplicates()
    {
    	ArrayList<Integer> newArrayLst = new ArrayList<Integer>();
    	for(Integer num : numberList)
    	{
    		if(!newArrayLst.contains(num))
    		{
    			newArrayLst.add(num);
    		}
    	}
    	return newArrayLst;
    }
    // Task 12
    public ArrayList<Integer> getSublist(int startind, int endind)
    {
    	ArrayList<Integer> newArrayLst = new ArrayList<Integer>();
    	if (startind < 0 || endind > numberList.size() || startind > endind) {
    		return null;
    	}
    	for (int i = startind; i < endind; i++) {
             newArrayLst.add(numberList.get(i));
        }
    	 return newArrayLst;
    }
    
    // Task 13
    public boolean isEmptyArrayList()
    {	
    	return numberList.isEmpty();
    }
    // Task 14
    public void replaceElement(int oldValue,int newValue)
    {
    	for(Integer num : numberList)
    	{
    		if(num == oldValue)
    		{
    			int index = numberList.indexOf(num);
    			numberList.set(index, newValue);
    		}
    	}
    }
    // Task 15
    public int countOccurrences(int val)
    {
//    	int counter = 0;
//    	for(Integer num : numberList)
//    	{
//    		if(num == val)
//    		{
//    			counter++;
//    		}
//    	}
//    	return counter;
    	return Collections.frequency(numberList, val);
    }
    // Task 16
    public void clearArrayList()
    {
    	numberList.clear();
    }
    // Task 17
    public int getArrayListSize()
    {
    	return numberList.size();
    }
    // Task 18
    public ArrayList<Integer> copyArrayList()
    {
    	ArrayList<Integer> cloneArrList = (ArrayList<Integer>) numberList.clone();
        return cloneArrList;
    }
    // Task 19
    public double findAverage()
    {
    	int sum = findSum(numberList);
    	
    	if(sum > 0)
    	{
    		double avg =(double)sum/numberList.size();
    		return avg;
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment obj = new ArrayListAssignment();
		
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		obj.addElement(25);
		System.out.println("Element Added");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		obj.removeElement(25);
		System.out.println("Element Remove");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Reversing Element");
		obj.reverseArrayList();
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Sum of all  Element  : " + obj.findSum(obj.numberList) );
		
		System.out.println("Maximum Element : " + obj.findMaximum(obj.numberList) );
		
		System.out.println("Minimum Element  : " + obj.findMinimum(obj.numberList) );
	
		System.out.println("Sorting Array (Asc) ");
		obj.sortArrayList();
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Find  Element  : " + obj.findElement(15) );
		System.out.println("Find  Element  : " + obj.findElement(36) );
		
		
		System.out.println("Checking Array is Empty  : " + obj.isEmptyArrayList() );
	
		obj.addElement(2);
		System.out.println("Old Element : ");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		System.out.println("Replacing Element 2 with 17  : ");
		obj.replaceElement(2, 17);
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Counting Occurance  : " + obj.countOccurrences(87) );
		
//		System.out.println("Remove All Element Task 16 : ");
//		obj.clearArrayList();
//		obj.displayArrayList(obj.numberList);
		
		System.out.println("Get size of array list  : " + obj.getArrayListSize() );
		System.out.println("Copy Array : " + obj.copyArrayList() );
		System.out.println("Average  : " + obj.findAverage() );
		
		
		System.out.println("Get Sub list from the Array");
		System.out.println(obj.getSublist(3, 6));
		
		System.out.println("Remove duplicates value from the Array");
		System.out.println("Original  Element : ");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		System.out.println(obj.removeDuplicates());
		
	}

}
