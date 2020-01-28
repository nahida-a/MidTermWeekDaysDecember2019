package math.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static int[] mergeArray(){
        int [] arrayA={1,3,4,};
        int [] arrayB={4,5,6,7,8};
        //merging array
        int []mergedArray=new int[arrayA.length+arrayB.length];
        for(int i=0;i<arrayA.length;i++){
            mergedArray[i]=arrayA[i];
        }
        for(int i=0;i<arrayB.length;i++){
            mergedArray[i+arrayA.length]=arrayB[i];
        }
        return mergedArray;
    }
    public static int[] setWithNoDuplicates(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < length; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    length--;
                    j--;
                }
            }
        }

        int[] output = new int[length];
        for(int i = 0; i < length; i++){
            output[i] = arr[i];
        }
        return output;
    }
    public static void main(String[] args)
    {

        System.out.println(Arrays.toString(mergeArray()));
        System.out.println(Arrays.toString(setWithNoDuplicates(mergeArray())));
    }

    }

}
