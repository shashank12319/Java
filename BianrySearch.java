package binary;

 public class BianrySearch {
int BinarySearch(int arr[],int l,int r,int x) {
	if(r>=l) {
		int mid =l+(r-l)/2;
		if(arr[mid]==x)
			return mid;
		
		if(arr[mid]>x)
			return BinarySearch(arr,l,mid-1,x);
		
		return BinarySearch(arr,mid+1,r,x);
	}
	return -1;
}
public static void main(String[] args) {
     BianrySearch bs=new BianrySearch();
     int arr[]= {2,3,4,5,6,10,12,13,14,15,16};
     int n=arr.length;
     int x=5;
     int result=bs.BinarySearch(arr,0,n-1,x);
     if(result==-1)
    	 System.out.println("not present");
     else
    	 System.out.println("element found at index"+ result);
}
}
