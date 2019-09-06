public class BinaryRecursiveSearch implements Practice03Search{
	public BinaryRecursiveSearch(){
		return;
	}

	public String searchName(){
		return "Binary recursive search"; 
	}

	public int search(int[] arr, int target){
		int low = 0; 
		int high = arr.length-1; 
		return binSearch(arr, target, low, high); 
	}

	public int binSearch(int[] arr, int target, int low, int high){

		int mid = (low+high)/2; 

		if(high<low){
			return -1; 
		}
		else if(arr[mid] == target){
			return mid;
		}
		else if(arr[mid]>target){
			return binSearch(arr,target,low,mid-1);
		}
		else{
			return binSearch(arr,target,mid+1,high); 
		}
	}
}