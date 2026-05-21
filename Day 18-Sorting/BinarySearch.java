public class BinarySearch {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int k=5;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==k){
                System.out.println("found");
                return;
            }
            else if(a[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("not found");
    }
}