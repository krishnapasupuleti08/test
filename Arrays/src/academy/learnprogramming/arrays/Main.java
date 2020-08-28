package academy.learnprogramming.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = new int[7];

        intArray[0] =20;
        intArray[1] =30;
        intArray[2] =10;
        intArray[3] =-15;
        intArray[4] =7;
        intArray[5] =70;
        intArray[6] =44;

        for (int value : intArray) {
            System.out.println(value);
        }

    }
}
