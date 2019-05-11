import java.util.Scanner;

public class FA2017LAB2_SortingApp_Khoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int selection = 0;
		String numbers = " ";
		
		while(true){
		System.out.print("SORTING TOOL - AMAN KHOJA \n");
		System.out.print("1. BUBBLE SORT \n" );
		System.out.print("2. SELECTION SORT \n" );
		System.out.print("3. INSERTION SORT \n" );
		System.out.print("0. EXIT \n");
		
		System.out.print("Enter a number to select a sorting method : ");
		selection = reader.nextInt();
		
		if(selection == 0){
			System.out.println("\nThe program is terminating...");
			break;
		}
		
		else if(selection == 1 || selection == 2 || selection == 3){
		reader.nextLine();
		
		System.out.print("Enter a list of numbers that you want to sort : " );
		numbers = reader.nextLine();

		
		
		FA2017LAB2_IntegerArray_Khoja test1 = new FA2017LAB2_IntegerArray_Khoja(numbers, selection);
		System.out.println(test1);
			}
		
		else
			System.out.println("Invalid input");
		}

	}

}


/*SORTING TOOL - AMAN KHOJA 
1. BUBBLE SORT 
2. SELECTION SORT 
3. INSERTION SORT 
0. EXIT 
Enter a number to select a sorting method : 1
Enter a list of numbers that you want to sort : 45 34 76 81 23 91 50



------------------------------------------------------------------
Selected Sorting Method: BUBBLE SORTING METHOD
Original List of Numbers: 45 34 76 81 23 91 50 
Sorted List of Numbers : 23 34 45 50 76 81 91 
------------------------------------------------------------------


SORTING TOOL - AMAN KHOJA 
1. BUBBLE SORT 
2. SELECTION SORT 
3. INSERTION SORT 
0. EXIT 
Enter a number to select a sorting method : 0
The program is terminating...
*/