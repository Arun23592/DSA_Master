package ImportantTechnicalCodings;

public class NumberOfDaysBetweenTwoDays {

    private boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }
    public int toDays(String date){

        //Step 1: Parse year, month, days
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int Day = Integer.parseInt(date.substring(8, 10));


        //Step 2: Days per month with running cumulative sum

        int[] daysInMonth = {0, 31, 59, 90, 120, 151,
                           181, 212, 243, 273, 304, 334};


        int total = 0;

        //Step 3: Add days for all full years from  1971 to year-1

        for(int y=1971; y<year; y++){
            total +=
        }

    }

    public int daysBetweenTwoDays(String date1, String date2){
        return Math.abs(toDays(date1) - toDays(date2));
    }

    public static void main(String[] args){
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
    }
}
