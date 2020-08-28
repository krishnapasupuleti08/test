package academy.learnprogramming.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestNumberIndex =0;
            for(int i = 0 ; i<=lastUnsortedIndex ; i++ ){
                if(intArray[largestNumberIndex] < intArray[i]){
                    largestNumberIndex = i;
                }
                swap(intArray,largestNumberIndex,lastUnsortedIndex);
            }
        }

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    public static void swap(int[] array, int origin, int destination){
        if(origin == destination){
            return;
        }
        int temp = array[origin];
        array[origin] = array[destination];
        array[destination] = temp;
    }
}
