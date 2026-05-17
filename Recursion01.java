public class Recursion01{
// Recursion is basically computing solution for a problem by finding solutions to smaller instances of the same problem

    // public static void printNumDec(int n){
    //     if(n==1){
    //         System.out.print(1);
    //         return;
    //     }
    //     System.out.print(n + "  ");
    //     printNumDec(n-1);
    // }

    // public static void printNumInc(int n){
    //     if(n==1){
    //         System.out.print(n+ "  ");
    //         return;
    //     }
    //     printNumInc(n-1);
    //     System.out.print(n + "  ");
    // }

    // public static int factorial(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int fn1 = factorial(n-1);
    //     int fn = n * fn1 ;
    //     return fn;
    // }

    // public static int sumOfNaturalNums(int n){
    //     int sum = 0;
    //     if(n==1){
    //         return 1;
    //     }
    //     sum = n + sumOfNaturalNums(n-1);
    //     return sum;
    // }

    // public static int nthFibonacci(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int fbnm2 = nthFibonacci(n-2);
    //     int fbnm1 = nthFibonacci(n-1);
    //     int fbn = fbnm1 + fbnm2;
    //     return fbn;
    // }

    // Method 1
    // public static void isArraySorted(int arr[], int i){
    //     if(arr[i]==arr.length){
    //         return;
    //     }
    //     boolean sorted = arr[i] <= arr[i+1];
    //     isArraySorted(arr, i+1);
    //     if(sorted==true){
    //         System.out.print(sorted);
    //     }else System.out.print("array is not sorted");
    // }
    
    // Method 2
    // public static boolean isArraySorted(int arr[], int i){
    //     if(i == arr.length-1){
    //         return true;
    //     }
    //     if(arr[i] > arr[i+1]){
    //         return false;
    //     }
    //     return isArraySorted(arr, i+1);
        
    // }

    // public static int firstOccurIndex(int arr[], int i, int n){
    //     if(i == arr.length-1 && arr[i]!=n){
    //         return -1;
    //     }
    //     if(arr[i] == n){
    //         return i;
    //     }
    //     return firstOccurIndex(arr, i+1, n);
    // }
    
    // Method 1
    // public static int lastOccurIndex(int arr[], int i, int n){
    //     if(i == 0 && arr[i]!=n){
    //         return -1;
    //     }
    //     if(arr[i] == n){
    //         return i;
    //     }
    //     return lastOccurIndex(arr, i-1, n);
    // }

    // Method 2
    // public static int lastOccurIndex(int arr[], int i, int n){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     int isFound = lastOccurIndex(arr, i+1, n);
    //     if(isFound==-1 && arr[i] == n){
    //         return i;
    //     }
    //     return isFound;
    // }

    public static void main(String[] args){
        int n=2;
        int arr[] = {1,2,5,4,5,7,8,3,3,2,1,5,2};

        // printNumDec(n);
        // printNumInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sumOfNaturalNums(n));
        // System.out.println(nthFibonacci(n));
        // isArraySorted(arr, arr[0]);
        // System.out.println(isArraySorted(arr, 0));
        // System.out.println(firstOccurIndex(arr, 0, n));
        // System.out.println(lastOccurIndex(arr, arr.length-1, 3)); // Method 1
        // System.out.println(lastOccurIndex(arr, 0, 3)); // Method 2
    }
}