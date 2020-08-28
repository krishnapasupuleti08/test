package academy.learnprogramming.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        insertionSort(intArray,intArray.length);
//        for(int firstUnsortedIndex = 1;firstUnsortedIndex>0;firstUnsortedIndex++){
//            int newElement = intArray[firstUnsortedIndex];
//            int i;
//            for(i=firstUnsortedIndex; i> 0 && intArray[i-1] > newElement;i--){
//                intArray[i] = intArray[i-1];
//            }
//            intArray[i] = newElement;
//        }

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    public static void insertionSort(int[] input,int numItems){
        if(numItems < 2)
            return;
        insertionSort(input,numItems-1);

        int newElement = input[numItems-1];
        int i;
        for(i=numItems-1; i> 0 && input[i-1] > newElement;i--){
            input[i] = input[i-1];
        }
        input[i] = newElement;
    }
}
