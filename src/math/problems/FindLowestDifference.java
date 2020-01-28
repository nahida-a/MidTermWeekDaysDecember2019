package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        System.out.println("The lowest difference between two array cell: "+findLowDiff());
    }
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        public static int findLowDiff(){
            int [] array1 = {30,12,5,9,2,20,33,1};
            int [] array2 = {18,25,41,47,17,36,14,19};
            int [] arr=new int[array1.length+array2.length] ;
            for(int i=0;i<array1.length;i++){
                arr[i]=array1[i];
            }
            for(int i=0;i<array2.length;i++){
                arr[i+array1.length]=array2[i];
            }

            int i,j,k,temp;
            for (i=1;i<arr.length;i++){
                k=arr[i];
                j=i-1;
                while(j>=0 && k < arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j--;
                }
            }

    }

}
