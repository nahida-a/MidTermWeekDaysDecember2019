package problemandsolutions;

public class ArraySort {
    public static void main(String []args) {
        int num, i, j, temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Integers to sort:");
        num = sc.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " Integers: \n");

        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted integers- ");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }


}
