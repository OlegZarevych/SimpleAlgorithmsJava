import java.sql.Timestamp;
import java.util.Arrays;

public final class Sorting {

	public static void selectingSort(int[] unSortedArray)
	{
		final int n = unSortedArray.length;
		
		System.out.println("Selecting Sort");
		Timestamp timeStampStart = new Timestamp(System.currentTimeMillis());
		
		for(int i = 0; i < n ; i++)
		{
			int k = 0;
			int min = unSortedArray[i];
			
			//find minimal value
			for(int j = i; j < n; j++ )
			{
				if (unSortedArray[j] < min)
				{
					min = unSortedArray[j];
					k = j;
				}				
			}
			
			if(min != unSortedArray[i])
			{
				int temp = unSortedArray[i];
			
				//swap
				unSortedArray[i] = min;
				unSortedArray[k] = temp;
			}
		}
		
		Timestamp timeStampEnd = new Timestamp(System.currentTimeMillis());
		String time = String.valueOf(timeStampEnd.getTime() - timeStampStart.getTime());
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(unSortedArray));
		System.out.println("");
		System.out.println(timeStampStart);
		System.out.println(timeStampEnd);
		System.out.println("Time spent:" + time);
	}
}

