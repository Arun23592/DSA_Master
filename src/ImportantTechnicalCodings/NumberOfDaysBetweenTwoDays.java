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


Approach -- Brute force

Optimized O(1) Solution

LeetCode 1360 — Number of Days Between Two Dates
Understanding the Problem
Input:  date1 = "2019-06-29"
        date2 = "2019-06-30"
Output: 1

Input:  date1 = "2020-01-15"
        date2 = "2019-12-31"
Output: 15

Format: YYYY-MM-DD
Range:  1971 to 2100


DSA Approach — Convert to Days Since Epoch
Key Insight:
  Don't subtract dates directly.
  Convert EACH date → total days since a fixed reference point (epoch)
  Then subtract → absolute difference

Reference point = Jan 1, 1971 (given constraint starts 1971)

date1 → totalDays1
date2 → totalDays2
answer = |totalDays1 - totalDays2|

How to Count Days Since Epoch
totalDays = days from all FULL years before this year
           + days from all FULL months before this month
           + day of month

Step 1: Years → add 365 per year + 1 extra for leap years
Step 2: Months → add days per month (28/29/30/31)
Step 3: Add the day

Leap Year Rule:
A year is a LEAP year if:
  divisible by 4     → candidate
  BUT if divisible by 100 → NOT leap
  BUT if divisible by 400 → IS leap

Examples:
  2000 → divisible by 400 → LEAP ✅
  1900 → divisible by 100 but not 400 → NOT leap ❌
  2024 → divisible by 4, not 100 → LEAP ✅
  2019 → not divisible by 4 → NOT leap ❌

Java:
  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

DRY Run - "2019-06-29"
Parse: year=2019, month=6, day=29

Step 1: Add days for years 1971 → 2018 (all full years before 2019)
        Each year = 365 days + 1 if leap

Step 2: Add days for months Jan → May (full months before June)
        Jan=31, Feb=28(2019 not leap), Mar=31, Apr=30, May=31
        = 31+28+31+30+31 = 151

Step 3: Add day = 29

totalDays("2019-06-29") = yearDays + 151 + 29
**/