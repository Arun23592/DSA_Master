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
            total += isLeap(y) ? 366: 365;
        }

        for(int m=1; m < month; m++){
            total += daysInMonth[m];

            if (m == 2 && isLeap(year)) total += 1;
        }

        total += Day;

        return total;
    }

    public int daysBetweenTwoDays(String date1, String date2){
        return Math.abs(toDays(date1) - toDays(date2));
    }

    public static void main(String[] args){
        String date1 = "2019-06-20";
        String date2 = "2019-06-30";

        NumberOfDaysBetweenTwoDays days = new NumberOfDaysBetweenTwoDays();
        String result = String.valueOf(days.daysBetweenTwoDays(date1, date2));
        System.out.println(result);
    }
}

/*

Parse: year=2019, month=6, day=29

Step 1: Add days for years 1971 → 2018 (all full years before 2019)
        Each year = 365 days + 1 if leap

Step 2: Add days for months Jan → May (full months before June)
        Jan=31, Feb=28(2019 not leap), Mar=31, Apr=30, May=31
        = 31+28+31+30+31 = 151

Step 3: Add day = 29

totalDays("2019-06-29") = yearDays + 151 + 29



**/