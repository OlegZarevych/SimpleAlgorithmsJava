import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter array lenght");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		//get random array
		int[] arr = getRandomArray(n);
		
		System.out.println("Generated array:");
		System.out.println(Arrays.toString(arr));
		
		Sorting.selectingSort(arr);
	}
	
	private static int[] getRandomArray(int n)
	{
		final Random rand = new Random();
		int[] arr = new int[n];
		
		for(int i=0; i < n ; i++)
		{
			arr[i] = rand.nextInt(100);
		}
		
		return arr;
	}

}
