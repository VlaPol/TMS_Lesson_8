/**
 * Объяви внутри DateTimeUtils глобальную функцию, которая принимает год и возвращает, является ли он високосным.
 */
public class DateTimeUtils {

    public static String getLeapYear(String year){

            if (Integer.parseInt(year) % 4 == 0) {

                if (Integer.parseInt(year) % 100 == 0) {

                    if (Integer.parseInt(year) % 400 == 0) {
                        return " - is leap year";
                    }else {
                        return " - is not leap year";
                    }
                }else {
                    return " - is leap year";
                }
            }else {
                return " - is not leap year";
            }

    }

}
