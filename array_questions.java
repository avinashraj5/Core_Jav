public class array_questions {
    public static void main(String[] args) {

        //Decrement of an Array
        /*int [] marks = {20,30,40,50,60};
        for (int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }*/

        //Question 1
        /*System.out.println("From self method");
        float[] weight = {40.8f,50.8f,30.6f,60.9f,70.7f};
        float total = 0;
        for (int i=0; i< weight.length; i++){
            //System.out.println(weight[i]);
            total = total + weight[i];
        }
        System.out.println(total);

                                //OR
        System.out.println("From instructor method");
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);*/

        //Question 2
        /*float[] weight = {40.8f, 50.8f, 30.6f, 60.9f, 70.7f};
        float num = 60.9f;
        boolean isInarray = false;
        //float total = 0;
        for (int i = 0; i < weight.length; i++) {
            if (num == weight[i]) {
                isInarray = true;
                break;
            }
        }
            if (isInarray) {
                System.out.println("The value is present in the array");
            } else {
                System.out.println("The value is not present in the array");
            }*/

        //Question 3
        /*float[] marks = {40.5f,55.7f,60.9f,76.8f,90.9f};
        float sum = 0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("Total average marks: "+sum/ marks.length);*/

        //Question 4
        /*int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(); // Prints a new line
        }*/

        //Question 5
        /*int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }*/

               //OR
        /*int [] reverse = {10,30,40,50,60};
        System.out.println("Original Array");
        for (int i=0;i< reverse.length;i++){
            System.out.print(reverse[i]+" ");
        }
        System.out.println();
        System.out.println("Array in Reverse order");
        for (int i= reverse.length-1;i>=0;i--){
            System.out.println(reverse[i]+" ");
        }*/


        //Question 6
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);*/

        //Question 7
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("the value of the minimum element in this array is: "+ min);*/

        //Question 8
        /*boolean isSorted = true;
        int [] arr = {3, 4, 1, 5, 12, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }*/
    }
}
