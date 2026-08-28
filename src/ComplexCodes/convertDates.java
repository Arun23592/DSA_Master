package ComplexCodes;

public class convertDates {


    public static String convert(String input){

        //step 1: split by "/"
        String[] parts = input.split("/");

        //Step 2: Extract parts
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
    }

    public static void main(String[] args){
        String input = "1/08/26";
    }
}



/**
 *
 * 1️⃣ Write the pseudocode to convert: 1/08/26 → 1st Aug 2026 Explain the complete logic —
 * how would you split the input and build the required date format? (Java/Python/Typescript/Javascript)
 *
 *
 * Input:  "1/08/26"
 *          │  │  │
 *          │  │  └── year  → 26  → 2026
 *          │  └───── month → 08  → Aug
 *          └──────── day   → 1   → 1st
 *
 * Output: "1st Aug 2026"
 *
 *
 * FUNCTION convertDate(input):
 *
 *   STEP 1: Split input by "/"
 *           parts = ["1", "08", "26"]
 *
 *   STEP 2: Extract parts
 *           day   = parts[0]  → "1"
 *           month = parts[1]  → "08"
 *           year  = parts[2]  → "26"
 *
 *   STEP 3: Convert day → ordinal suffix
 *           1  → "1st"
 *           2  → "2nd"
 *           3  → "3rd"
 *           4+ → "4th"
 *           Special: 11,12,13 → always "th" (11th, 12th, 13th)
 *
 *   STEP 4: Convert month number → month name
 *           01 → Jan, 02 → Feb ... 08 → Aug
 *
 *   STEP 5: Convert year → full year
 *           "26" → "2026"  (prefix "20")
 *
 *   STEP 6: Build final string
 *           day + " " + monthName + " " + fullYear
 *           → "1st Aug 2026"
 *
 * END FUNCTION
 *
 * **/