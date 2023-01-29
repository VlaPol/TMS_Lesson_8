import java.util.Scanner;

public class UserInputUtils {

    public static int[] getNewArray() throws IllegalArgumentException {

        System.out.print("Enter number of elements: ");

        Scanner scanner = new Scanner(System.in);
        int arrayDimension = scanner.nextInt();

        if (arrayDimension < 0) {
            throw new IllegalArgumentException("Wrong number of elements!");
        }

        int[] createdArray = new int[arrayDimension];

        if (arrayDimension != 0) {
            for (int i = 0; i < arrayDimension; i++) {
                System.out.print("Enter number: ");
                createdArray[i] = scanner.nextInt();
            }
        }
        return createdArray;
    }
}
