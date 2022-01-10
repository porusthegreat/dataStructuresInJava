import java.util.Random;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] array = new int[100];

        for(int i=0; i< array.length; i++){
            Random rand = new Random();
            array[i] = rand.nextInt(10000);
        }
        mergeSort(array);
        printArray("AFTER", array);
    }


    public static void mergeSort(int[] array){
        int arraySize = array.length;

        if(arraySize < 2){
            return;
        }

        int midIndex = arraySize/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arraySize - midIndex];

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = array[i];
        }

        for(int i = midIndex; i < arraySize; i++){
            rightHalf[i - midIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }

    private static void printArray(String str, int[] array) {
        System.out.println(str + ":") ;
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0;

        while (i < leftSize && j < rightSize ){
            if(leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
