import java.sql.Timestamp;
import java.util.Arrays;

public class Search {

	public static void binarySearch(int[] arr, int search)
	{
		System.out.println("Binary search");
		System.out.println("Input array");
		
		Timestamp timeStampStart = new Timestamp(System.currentTimeMillis());
		
		biSearch(arr, search);
		
		Timestamp timeStampEnd = new Timestamp(System.currentTimeMillis());
		String time = String.valueOf(timeStampEnd.getTime() - timeStampStart.getTime());
		
		System.out.println(timeStampStart);
		System.out.println(timeStampEnd);
		System.out.println("Time spent:" + time);
	}
	
	private static boolean biSearch(int[] arr, int search)
	{
		if((arr.length == 1) && (arr[0] == search))
			return true;
		else if((arr.length == 1) && (arr[0] != search))
			return false;
		
		int n = arr.length;
		int middle = n/2;
			
		if(arr[middle] == search)
			return true;
		
		if(arr[middle] > search)
			return biSearch(Arrays.copyOfRange(arr, middle+1, n), search);
			
		return biSearch(Arrays.copyOfRange(arr, 0, middle-1), search);
	}
}
