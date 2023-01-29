public class ArrayUtils {

    public static double getAverageOfElements(int[] currentArray) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Can't find average in 0-array");
        }

        double sum = 0;
        for (int j : currentArray) {
            sum += j;
        }
        return sum / currentArray.length;
    }

    public static void getReversArray(int[] currentArray) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Can't revers array with 0 elements");
        }

        for (int i = 0, j = currentArray.length - 1; i <= j; i++, j--) {
            int tmpNumber = currentArray[i];
            currentArray[i] = currentArray[j];
            currentArray[j] = tmpNumber;
        }

    }

    public static int getIndexOfFindFirstElement(int[] currentArray, int lookingElementIndex) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Can't looking element index in the array with 0 elements");
        }

        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] == lookingElementIndex) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getSubArray(int[] currentArray, int leftBoundInclusive, int rightBoundExclusive) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Can't work with 0-elements array");
        }

        if (leftBoundInclusive < 0 || rightBoundExclusive > currentArray.length) {
            throw new IllegalArgumentException("Bad one of bounds");
        }

        int[] tmpArray = new int[rightBoundExclusive - leftBoundInclusive];
        int j = 0;

        for (int i = leftBoundInclusive; i < rightBoundExclusive; i++) {
            tmpArray[j] = currentArray[i];
            j++;
        }

        return tmpArray;
    }

    public static int[] getElementsFromPage(int[] currentArray, int pageNumber, int elementsOnPage) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Can't work with 0 elements");
        }

        if (pageNumber < 1) {
            throw new IllegalArgumentException("Page number should start from 1!");
        }

        if (currentArray.length < ((pageNumber - 1) * elementsOnPage) && currentArray.length < pageNumber * elementsOnPage) {
            throw new IllegalArgumentException("Wrong page number or quantity of elements on the page");
        }

        int lBound = (pageNumber - 1) * elementsOnPage;
        int rBound = lBound + elementsOnPage;

        if (rBound > currentArray.length) {
            rBound = currentArray.length;
        }
        return getSubArray(currentArray, lBound, rBound);
    }
}
