package Arrays.slidingWindow;

public class sum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        int size=3;
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of first window is "+ sum);
        for(int i=1; i<=arr.length-size; i++){
            sum=sum-arr[i-1]+arr[i+size-1];
            System.out.println(sum);
        }
    }
}
