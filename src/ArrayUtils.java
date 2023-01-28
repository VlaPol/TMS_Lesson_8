import java.util.Scanner;

public class ArrayUtils {

     public static double getArithmeticMean(int [] currentArray){

        double sum = 0;
        for (int j : currentArray) {
            sum += j;
        }
        return sum / currentArray.length;
    }
    public static int [] getReversArray(int [] currentArray){

        int [] tmpArray = new int[currentArray.length];
        int j = 0;

        for(int i = currentArray.length - 1;  i >= 0; i--){
            tmpArray[j] = currentArray[i];
            j++;
        }
        return tmpArray;
    }
    public static int getLookingNumber(int [] currentArray, int lookingNumber){

        for (int i = 0; i < currentArray.length; i++) {
            if(currentArray[i] == lookingNumber) {
                return i;
            }
        }
        return -1;
    }
    public static int[] getSubArray(int [] currentArray, int leftBound, int rightBound){

        if(leftBound < 0 || rightBound > currentArray.length ){
            throw new IllegalArgumentException("Bad one of bounds");
        }

        int [] tmpArray = new int[rightBound - leftBound];
        int j = 0;

        for(int i = leftBound; i < rightBound; i++){
            tmpArray[j] = currentArray[i];
            j++;
        }

        return tmpArray;
    }
    public static int[] getSubArrayWithOneBound(int [] currentArray, int page, int quantity){

         if(currentArray.length < page + quantity){
             throw new IllegalArgumentException("Wrong page number or quantity of substring elements");
         }

         int [] tmpArray = getSubArray(currentArray, page, quantity);

         return tmpArray;
    }
}
