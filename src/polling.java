import java.util.Scanner;
public class polling {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
		
		String[] topics = new String[5];
		topics[0] = "Da Prez";
		topics[1] = "Loans";
		topics[2] = "A Job";
		topics[3] = "Health";
		topics[4] = "Grades";
		int numResponses;
		
		System.out.println("How many people are responding?");
		numResponses = scnr.nextInt();
		
		int[][] responses = new int[5][10];
		
		for (int x = 0; x < numResponses; x++) {
			System.out.print("Person " + (x + 1) + " ");
			for (int i = 0; i < 5; i++) {
				System.out.print("How would you rate ");
				System.out.print(topics[i]);
				System.out.println("?");
				responses[i][x] = scnr.nextInt();
			}
		}
		System.out.print("Topic \t");									//This is the header
		for (int g = 0; g < numResponses; g++) {
			System.out.print("Person: " + (g + 1) + "\t");
		}
		for (int e = 0; e < (10 - numResponses); e++) {
			System.out.print("\t\t");
		}
		System.out.println("Average:");
		double rowAverage;
		double highRowAverage = 0;
		double lowRowAverage = 99;
		double highRowTotal = 0;
		double lowRowTotal = 0;
		double denominator = numResponses;
		int rowTotal;
		String highestAverage = "";
		String lowestAverage = "";
		
		for (int row = 0; row < 5; row++) {								//This is the output array
			System.out.print(topics[row] + "\t");						//This is the ROW
			rowTotal = 0;
			for (int column = 0; column < 10; column++) {
				System.out.print(responses[row][column] + "\t\t");		//This is the COLUMN
				rowTotal = rowTotal + responses[row][column];
			}
			rowAverage = rowTotal / denominator;
			if (rowAverage > highRowAverage) {
				highRowAverage = rowAverage;
				highestAverage = topics[row];
				highRowTotal = rowTotal;
			}
			if (rowAverage < lowRowAverage) {
				lowRowAverage = rowAverage;
				lowestAverage = topics[row];
				lowRowTotal = rowTotal;
			}
			System.out.printf("%.2f", rowAverage);
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("The most important issue according to the poll is " + highestAverage + " with a total of " + highRowTotal + " points.");
		System.out.print("The least important issue according to the poll is " + lowestAverage + " with a total of " + lowRowTotal + " points.");
		
		//System.out.println("array 1");
		//display(responses);
		//System.out.println("string array");
		//display(topics);
	
	}
	
	/*
	public static void display(int x[][]) {
		for(int row = 0; row<x.length;row++) {
			for(int column=0;column<x[row].length;column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println("");
		}
	}
	*/
}

/*
int index = 0;
while (index < 5) {
System.out.println(intArray[index]);
index++;
}
*/