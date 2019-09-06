public class BinaryIterativeSearch implements Practice03Search{
	public BinaryIterativeSearch(){
		return;
	}

	public String searchName(){
		return "Binary iterative search"; 
	}

	public int search(int[] arr, int target){
		int low = 0;
		int high = arr.length-1; 

		while(low<=high){
			int mid = (low+high)/2;

			if(target < arr[mid]){
				high = mid-1; 
			}
			else if(target>arr[mid]){
				low = mid+1;
			}
			else if(target == arr[mid]){
				return mid; 
			}
		}
		return -1; 
	}
}