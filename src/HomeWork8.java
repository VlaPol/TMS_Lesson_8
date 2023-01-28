import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        int key;
        Scanner scanner = new Scanner(System.in);

        do{
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

            key = scanner.nextInt();

            switch (key) {
                case 1 -> {
                    System.out.print("Input interesting year: ");
                    scanner = new Scanner(System.in);
                    String year = scanner.nextLine();
                    System.out.println(year + " " + DateTimeUtils.getLeapYear(year));
                }
                case 2 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter number of array elements: ");
                    System.out.println("Arithmetic mean in array is " +
                            ArrayUtils.getArithmeticMean(
                                    UserInputUtils.getNewArray(scanner.nextInt())));
                }
                case 3 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter number of array elements: ");
                    System.out.println("Inverted array is " +
                            Arrays.toString(
                                    ArrayUtils.getReversArray(
                                            UserInputUtils.getNewArray(scanner.nextInt()))));
                }
                case 4 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter number of array elements: ");
                    int dimension = scanner.nextInt();
                    int[] tmpArray = UserInputUtils.getNewArray(dimension);
                    System.out.println(Arrays.toString(tmpArray));
                    System.out.print("Enter looking number: ");
                    int lookingNumber = scanner.nextInt();
                    int position = ArrayUtils.getLookingNumber(tmpArray, lookingNumber);
                    if (position != -1) {
                        System.out.println("Position of " + lookingNumber + " in the array is " + position);
                    } else {
                        System.out.println("Not such element in the array!");
                    }
                }
                case 5 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter number of array elements: ");
                    int arrDimension = scanner.nextInt();
                    int[] tmpArray2 = UserInputUtils.getNewArray(arrDimension);
                    System.out.println(Arrays.toString(tmpArray2));
                    System.out.print("Enter left bound: ");
                    int lBound = scanner.nextInt();
                    System.out.print("Enter right bound: ");
                    int rBound = scanner.nextInt();
                    System.out.println(Arrays.toString(
                            ArrayUtils.getSubArray(tmpArray2, lBound, rBound)));
                }
                case 6 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter number of array elements: ");
                    int arrDimension2 = scanner.nextInt();
                    int[] tmpArray3 = UserInputUtils.getNewArray(arrDimension2);
                    System.out.println(Arrays.toString(tmpArray3));
                    System.out.print("Enter page number: ");
                    int pageNumber = scanner.nextInt();
                    System.out.print("Enter number of elements on the page: ");
                    int quantity = scanner.nextInt();
                    System.out.println(Arrays.toString(
                            ArrayUtils.getSubArrayWithOneBound(tmpArray3, pageNumber,  quantity)));
                }
                case 0 -> {
                    System.out.println("See you!!!");
                    return;
                }
                default -> System.out.println("Wrong key!!!");
            }
        }while(true);
    }
}
