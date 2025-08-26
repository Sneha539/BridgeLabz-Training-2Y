




public class L1Q4{
    //  static void  swap(int arr[],int a, int b){
    //     int c = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = c;    
    //     }
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int l = arr.length;
        int target = 8;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
                
            }
            
        }
    }}
                    
        

        // int a = 10;
        // int b = 20;
        // swap(arr,1,4);
        // System.out.println(arr[1]+" "+arr[4]);

       
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int sum ;
        // if (num > 0){
        //     System.out.println(" YES it is a natural number");
        //     sum = num * (num+1) / 2 ;
        //     System.out.println("The sum of "+num+"is"+sum);

        // }
        // else {
        //     System.out.println("The number" + num +" is not a natural number");
        // }

    
