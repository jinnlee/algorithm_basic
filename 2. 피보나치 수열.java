class Main {
    public static void main(String[] args) {
        int n = 10;
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        
        for(int i=2; i<n; i+=1){
          arr[i]  = arr[i-2] + arr[i-1];
        }
        
        for(int i=0; i<n; i+=1) {
            System.out.print(arr[i]+" ");
        }
    }
}
