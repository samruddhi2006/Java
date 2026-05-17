public class array_operations{

    // Code to reverse an array
// public static void reverse(int numbers[]){
    
//     int start = 0;
//     int end = numbers.length-1;
//     while(start<end){
        
//         int temp = numbers[end];
//         numbers[end] = numbers[start];
//         numbers[start] = temp;
//         start++;
//         end--;
//     }
// }

// code to print pairs in array
// public static void pairs_in_array(int numbers[]){
//     int tp = 0 ;
//     for(int i=0 ; i<numbers.length ; i++){
//         int curr = numbers[i];
//         for(int j=i+1 ; j<numbers.length ; j++){
//             System.out.print("("+ curr + "," + numbers[j] + ")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs : " + tp);

// }


// public static void sub_array(int numbers[]){
//     int i=0;
//     int ts=0;
//     while(i<numbers.length){
//         // System.out.print(numbers[i]);
//         for(int j=i;j<numbers.length;j++){

//             for(int k=i;k<=j;k++){
//                 System.out.print(numbers[k]+" ");
//             }
//             ts++;
//             System.out.println();
//         }
//         i++;
//         System.out.println();
//     }
//     System.out.println("total subarrays : "+ ts);
// }

// public static void sub_array_sum(int numbers[]){
//     int i=0;
//     int ts=0;
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
    
//     while(i<numbers.length){
//         // System.out.print(numbers[i]);
//         for(int j=i;j<numbers.length;j++){
//             currsum=0;
//             for(int k=i;k<=j;k++){
//                 currsum+= numbers[k];
//                 System.out.print(numbers[k]+ " ");
//             }
//             // System.out.print(" = ");
//             System.out.print(" = "+currsum);
//             ts++;
//             System.out.println();
//             if(maxsum<currsum){
//                 maxsum=currsum;
//             }
//         }
//         i++;
//         System.out.println();
//     }
//     System.out.println("total subarrays : "+ ts);
//     System.out.println("maximum sum possible is :"+ maxsum);
// }

// public static void pairs(int numbers[]) {
//     int total_pairs=0;
//     for(int i=0;i<=numbers.length-1;i++){
//         for(int j=i+1;j<=numbers.length-1;j++){
//             System.out.print("("+numbers[i]+" , "+numbers[j]+")");
//             total_pairs++;
//         }
//         System.out.println();
//     }
//     System.out.println(total_pairs);
// }


// Trapped Rainwater
// public static int trappedRainwater(int height[]){
//     //leftMax boundary - array

//     int leftMax[] = new int[height.length];
//     leftMax[0] = height[0];
//     for(int i=1;i<height.length;i++){
//         leftMax[i]=Math.max(height[i],leftMax[i-1]);
//     }

//     //rightMax boundary - array

//     int rightMax[] = new int[height.length];
//     rightMax[height.length-1] = height[height.length-1];
//     for(int i=height.length-2;i>=0;i--){
//         rightMax[i]=Math.max(height[i],rightMax[i+1]);
//     }

//     //loop
//     int trappedWater = 0;
//     for(int i=0;i<height.length;i++){
//         //waterlevel = min(leftMax[i], rightMax[i])
//         int waterlevel=Math.min(leftMax[i],rightMax[i]);

//         //trappedWater = waterlevel - height[i]
//         trappedWater += waterlevel - height[i];
//     }
//     return trappedWater;
// }

public static void main(String[] args) {
    // int[] numbers = {2,4,6,8};
    // int height[]={4,2,0,6,3,2,5};

    // reverse(numbers);
    // pairs(numbers);
    // for(int i=0;i<numbers.length;i++){
    //         System.out.print(numbers[i]+" ");
    //     }
    //     System.out.println();

    // int a=10;
    // int b=20;
    // int temp=a;
    // a=b;
    // b=temp;
    // System.out.println(a);
    // System.out.println(b);


// pairs_in_array(numbers);


// sub_array(numbers);
// System.out.println(numbers.length);


// sub_array_sum(numbers);
    

// System.out.println(trappedRainwater(height));
}

}