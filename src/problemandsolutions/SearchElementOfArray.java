package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {
        int i, j, temp;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Integer in the Array ");
        System.out.println(" ");
        num = sc.nextInt();
        System.out.println("Enter Integers Numbers ");
        int[] array = new int[num];
        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Search num in the Array ");
        temp = sc.nextInt();
        for (i = 0; i < num; i++) {
            if (array[i] == temp) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        if (SearchElementOfArray.sequrntialSearch() == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found number- ");
        }

    }
}

