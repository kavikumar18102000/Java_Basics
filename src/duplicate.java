public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,4,5,2,1,4};

        for(int i=0; i<arr.length-1; i++){
            // int a=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == arr[i] ){
                    System.out.println("Duplicate number : "+ arr[j]);
                }
            }
        }
    }
    
}
