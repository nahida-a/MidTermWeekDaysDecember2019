package string.problems;


public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        class GFG {
            static boolean areAnagram(char[] str1, char[] str2)
            {
                int n1 = str1.length;
                int n2 = str2.length;//get length

                if (n1 != n2)//length of both strings is has to be the same to be call anagram
                    return false;

                Arrays.sort(str1);
                Arrays.sort(str2);// Sort both strings

                for (int i = 0; i < n1; i++)
                    if (str1[i] != str2[i])//Compare sorted strings
                        return false;
                    return true;
            }

            public static void main(String args[])
            {
                char str1[] = { 'a', 'c', 't' };
                char str2[] = { 'c', 'a', 't'};
                if (areAnagram(str1, str2))
                    System.out.println("The two strings are"
                            + " anagram of each other");
                else
                    System.out.println("The two strings are not"
                            + " anagram of each other");
            }
        }
    }
}
