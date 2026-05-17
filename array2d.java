public class array2d {

    // public static void search2d(int matrics[][], int key){
    //     for(int i=0;i<matrics.length;i++){
    //         for(int j=0;j<matrics[0].length;j++){
    //             if(matrics[i][j]==key){
    //                 System.out.print("key found at ("+i+","+j+")");
    //             }
    //         }3
    //     }
    // }

    // To print spiral matrix
    public static void printSpiral(int matrics[][]){
        int startRow=0;
        int endRow=matrics.length-1;
        int startColumn=0;
        int endColumn=matrics[0].length-1;
        while (startRow<=endRow && startColumn<=endColumn) {
            //top
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(matrics[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrics[i][endColumn]+" ");
            }
            //bottom
            for(int j=endColumn-1;j>=startColumn;j--){
                //for odd nxm conditions
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrics[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                //for odd nxm conditions
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrics[i][startColumn]+" ");
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }

    public static void main(String[] args) {

        int matrics[][]={{1,2,3,4}
                        ,{5,6,7,8,}
                        ,{9,10,11,12}
                        ,{13,14,15,16}
                        // ,{17,18,19,20}
                        // ,{21,22,23,24}
                        };

        printSpiral(matrics);

        // 2D array input
        // int matrics[][] = new int[4][3];
        // Scanner sc=new Scanner(System.in);
        // int key=sc.nextInt();

        // for(int i=0;i<matrics.length;i++){
        //     for(int j=0;j<matrics[0].length;j++){
        //         matrics[i][j]=sc.nextInt();
        //     }
        // }
        // sc.close();

        // 2D array output
        // for(int i=0;i<matrics.length;i++){
        //     for(int j=0;j<matrics[0].length;j++){
        //         System.out.print(matrics[i][j] + " ");
        //     }System.out.println();
        // }

    // search2d(matrics,key);
    }
}


