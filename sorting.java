// import java.util.Arrays;
// import java.util.Collections;

public class sorting{

    // BUBBLE SORT
    // public static void bubbleSort(int array[]){
    //     for(int turn=0;turn<array.length-1;turn++){
    //         for(int j=0;j<array.length-1-turn;j++){
    //             if(array[j]>array[j+1]){
    //                 //Swap
    //                 int temp=array[j];
    //                 array[j]=array[j+1];
    //                 array[j+1]=temp;
    //             }
    //         }
    //     }
    // }

    // public static void selectionSort(int array[]){
    //     for(int i=0;i<array.length;i++){
    //         int minpos=i;
    //         for(int j=i+1;j<array.length;j++){
    //             if(array[minpos]>array[j]){
    //                 array[minpos]=array[j];
    //             }
    //         }
    //         int temp=array[minpos];
    //         array[minpos]=array[i];
    //         array[i]=temp;

    //     }
    // }

    // public static void insertionSort(int array[]) {
    //     for(int i=1;i<array.length;i++){
    //         int curr=array[i];
    //         int prev=i-1;
    //         //find position to insert
    //         while (prev>=0 && array[prev]>curr) {
    //             array[prev+1]=array[prev];
    //             prev--;
    //         }
    //         //Insertion logic
    //         array[prev+1]=curr;

    //     }
    // }

    public static void countingSort(int array[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest, array[i]);
        }
        // frequency Count Array
        int count[]=new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        // Insert sorted values into original array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int array[] = {5,4,6,8,12,21,14,13,8,1,3,2};
        // int array[] = {1,4,6,3,6,2,1,9,5,3,5,1,2,6,2,9,6,4,3,1,4,2,1,5};
        // Integer array[]= {5,4,6,8,12,21,14,13,8,1,3,2};

        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        
        //Inbuilt Sort (Ascending and Descending)
        // Arrays.sort(array,0,6);                                  ////Inbuilt Sort (Ascending)
        // Arrays.sort(array,Collections.reverseOrder());           ////Inbuilt Sort (Descending)

        countingSort(array);

        printArray(array);
    }
}