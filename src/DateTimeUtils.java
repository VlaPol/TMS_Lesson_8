/**
 * Объяви внутри DateTimeUtils глобальную функцию, которая принимает год и возвращает, является ли он високосным.
 */
public class DateTimeUtils {

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
