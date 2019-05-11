import java.util.Arrays;

public class FA2017LAB2_IntegerArray_Khoja {
	
	int[] testArray;
	int inSelection;

	public FA2017LAB2_IntegerArray_Khoja(){
		
	}
	
	public FA2017LAB2_IntegerArray_Khoja(String numbers, int selection){
		
		String[] input;
		input = numbers.split(" ");
		testArray = new int[input.length];
		for(int i = 0; i < input.length; i++) {
		    testArray[i] = Integer.parseInt(input[i]);
		}
		
		inSelection = selection;
	}
	
	public String getSort(){
		
		String s = null;
		switch(inSelection){
		case 1 : s = "BUBBLE SORTING METHOD";
				break;
		case 2 : s = "SELECTION SORTING METHOD";
				break;
		case 3 : s = "INSERTION SORTING METHOD";
				break;
		default : s = "Invalid Inputt";
				break;
		}
				
				return s;
		}
	//
	public void selection(){
		
		switch(inSelection){
			case 1 : SortingMethods.bubbleSort(testArray);
					break;
			case 2 : SortingMethods.insertionSort(testArray);
					break;
			case 3 : SortingMethods.selectionSort(testArray);
					break;
		}

	}
	public String toString(){
		String test = "Selected Sorting Method: " + getSort() ;
		String test1 = "Original List of Numbers: ";
		String dashes = "------------------------------------------------------------------";
		for(int i = 0; i <testArray.length ; i++)
		{
			test1 += testArray[i] + " ";
		}
		selection();
		String test2 = "Sorted List of Numbers : ";
		for(int i = 0; i < testArray.length; i++)
		{
			test2 += testArray[i] + " ";
		}
		
		return "\n\n\n" + dashes + "\n" + test + "\n" + test1 + "\n" + test2 + "\n" + dashes + "\n\n";
	}
	
}
