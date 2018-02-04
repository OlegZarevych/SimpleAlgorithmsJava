import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Enter array lenght");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
				
		System.out.println("Generated array:");
		
		Sorting.selectingSort(getRandomArray(n));
		Sorting.bubbleSort(getRandomArray(n));
		Sorting.mergeSort(getRandomArray(n));
	}
	
	private static int[] getRandomArray(int n)
	{
		final Random rand = new Random();
		int[] arr = new int[n];
		
		for(int i=0; i < n ; i++)
		{
			arr[i] = rand.nextInt();
		}
		
		return arr;
	}
}
