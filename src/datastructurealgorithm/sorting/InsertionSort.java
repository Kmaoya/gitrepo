package datastructurealgorithm.sorting;

public class InsertionSort {
    public static void main(String[] args) {

     //Insertion sort

     int[]number={34,56,76,12,4,70,47};
     //output: 4 12 34 47 56 70 76



     for (int i=0; i<number.length; i++) {
         int j = i - 1;
         int point=number[i];
         while (j>=0 && number[j]>point) { number[j+1]=number[j];
             j=j-1;
         }
         number[j+1]=point;


     }

     for (int n=0;n<number.length;n++) {
         System.out.println(number[n]+" ");
     }





    }
}
