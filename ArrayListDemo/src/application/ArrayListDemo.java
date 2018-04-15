package application;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

	ArrayList<Integer> numberList = new ArrayList<Integer>();

	numberList.add(6);
	numberList.add(3);
	numberList.add(7);



	for(int index = 0; index<numberList.size(); index++)
	{
		System.out.println(numberList.get(index));
	}

}

}
