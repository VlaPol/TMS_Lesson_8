import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*********** MENU *************");
            System.out.println("1. Task_1");
            System.out.println("2. Task_2");
            System.out.println("3. Task_3");
            System.out.println("4. Task_4");
            System.out.println("5. Task_5");
            System.out.println("6. Task_6");
            System.out.println("0. Exit");
            System.out.println("******************************");
            System.out.print("Input task number (0 for exit): ");

            int key = scanner.nextInt();
            int [] tmpArray;

            switch (key) {
                case 1 -> {
                    System.out.print("Input interesting year: ");
                    int year = scanner.nextInt();
                    System.out.println("Is " + year + " year a leap? " + DateTimeUtils.isLeapYear(year));
                }
                case 2 -> {
                    tmpArray = UserInputUtils.getNewArray();
                    System.out.println("Average of elements in the array is " +
                            ArrayUtils.getAverageOfElements(tmpArray)
                    );
                }
                case 3 -> {
                    tmpArray = UserInputUtils.getNewArray();
                    ArrayUtils.getReversArray(tmpArray);
                    System.out.println("Inverted array is " + Arrays.toString(tmpArray));
                }
                case 4 -> {
                    tmpArray = UserInputUtils.getNewArray();
                    System.out.println(Arrays.toString(tmpArray));
                    System.out.print("Enter looking number: ");
                    int lookingNumber = scanner.nextInt();
                    int position = ArrayUtils.getIndexOfFindFirstElement(tmpArray, lookingNumber);
                    if (position != -1) {
                        System.out.println("Position of " + lookingNumber + " in the array is " + position);
                    } else {
                        System.out.println("Not such element in the array!");
                    }
                }
                case 5 -> {
                    tmpArray = UserInputUtils.getNewArray();
                    System.out.println(Arrays.toString(tmpArray));
                    System.out.print("Enter left bound: ");
                    int lBound = scanner.nextInt();
                    System.out.print("Enter right bound: ");
                    int rBound = scanner.nextInt();
                    System.out.println(Arrays.toString(ArrayUtils.getSubArray(tmpArray, lBound, rBound)));
                }
                case 6 -> {
                    tmpArray = UserInputUtils.getNewArray();
                    System.out.println(Arrays.toString(tmpArray));
                    System.out.print("Enter page number: ");
                    int pageNumber = scanner.nextInt();
                    System.out.print("Enter number of elements on the page: ");
                    int quantity = scanner.nextInt();
                    System.out.println(Arrays.toString(
                            ArrayUtils.getElementsFromPage(tmpArray, pageNumber, quantity))
                    );
                }
                case 0 -> {
                    System.out.println("See you!!!");
                    return;
                }
                default -> System.out.println("Wrong key!!!");
            }
        } while (true);
    }
}
