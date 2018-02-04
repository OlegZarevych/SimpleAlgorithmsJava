import java.sql.Timestamp;
import java.util.Arrays;

public final class Sorting {

	public static void selectingSort(int[] unSortedArray)

	{
		final int n = unSortedArray.length;
		
		System.out.println("Selecting Sort");
		System.out.println("Input array");
		System.out.println(Arrays.toString(unSortedArray));
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

	public static void bubbleSort(int[] unSortedArray)
	{
		final int n = unSortedArray.length;
		
		System.out.println("Bubble Sort");
		System.out.println("Input array");
		System.out.println(Arrays.toString(unSortedArray));
		Timestamp timeStampStart = new Timestamp(System.currentTimeMillis());

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - 1; j++)
			{
				if(unSortedArray[j + 1] < unSortedArray[j])
				{
					//swap
					int temp = unSortedArray[j + 1];
					unSortedArray[j + 1] = unSortedArray[j];
					unSortedArray[j] = temp;
				}
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

	public static void mergeSort(int[] unSortedArray)
	{

		
		System.out.println("Merge Sort");
		System.out.println("Input array");
		System.out.println(Arrays.toString(unSortedArray));
		Timestamp timeStampStart = new Timestamp(System.currentTimeMillis());
		
		int[] result = mergeSplit(unSortedArray);
					
		Timestamp timeStampEnd = new Timestamp(System.currentTimeMillis());
		String time = String.valueOf(timeStampEnd.getTime() - timeStampStart.getTime());
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(result));
		System.out.println("");
		System.out.println(timeStampStart);
		System.out.println(timeStampEnd);
		System.out.println("Time spent:" + time);
	}

	public static void insertSort(int[] unSortedArray)
	{
		//TODO
	}
	
	public static void quickSort(int[] unSortedArray)
	{
		//TODO
	}
	
	private static int[] mergeSplit(int[] unSortedArray) 
	{
		final int n = unSortedArray.length;
		int[] right, left;
		
		if(n % 2 == 0)
		{
			right = new int[n/2];
			left = new int[n/2];
		}
		else 
		{
			right = new int[n/2+1];
			left = new int[n/2];
		}
		
		for(int i = 0; i < n; i++)
		{
			if (i < n/2)
			left[i] = unSortedArray[i];
			else
			right[i - n/2] = unSortedArray[i];
		}
		
		if(left.length > 1)
			left = mergeSplit(left);
		if(right.length > 1)
			right = mergeSplit(right);
		
		return merge(right, left);
	}
	
	private static int[] merge(int[] right, int[] left)
	{
		int[] result = new int[right.length + left.length];
		
		int i = 0;
		int j = 0;
		int index = 0;
		
		while(right.length > j && left.length > i)
		{
			if(left[i] < right[j])
			{
				result[index++] = left[i++];
			}
			else
			{
				result[index++] = right[j++];
			}
		}
		
		while(right.length > j)
		{
			result[index++] = right[j++];
		}
		
		while(left.length > i)
		{
			result[index++] = left[i++];
		}
		
		return result;
	}
}

