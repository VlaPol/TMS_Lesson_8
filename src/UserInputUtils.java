import java.util.Scanner;

public class UserInputUtils {

    public static int [] getNewArray(int arrayDimension) throws IllegalArgumentException{

        if(arrayDimension < 2){
            throw new IllegalArgumentException("Array should have at least two numbers !");
        }

        int [] createdArray = new int[arrayDimension];

        for(int i = 0; i < arrayDimension; i++){
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            createdArray[i] = scanner.nextInt();
        }
        return createdArray;
    }
}
