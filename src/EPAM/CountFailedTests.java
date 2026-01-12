package EPAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountFailedTests {

    public static void main(String[] args){
        List<String> testResults = Arrays.asList(
                "Logintest - PASS",
                "CheckoutTest - FAIL",
                "AddCartTest - FAIL",
                "PaymentTest - PASS"
        );

        List<String> failedTests = new ArrayList<>();
        int count = 0;


        for(String tests: testResults){
            if (tests.contains("FAIL")){
                failedTests.add(tests);
                count++;
            }
        }

        System.out.println("Failed test cases: "+failedTests);
        System.out.println("count is: " +count);

    }


}



/**
 *
 * write a Java program for the below scenario:
 * List of test cases which contains PASS and FAIL, and you need to count the number of tescases failed and fetch the failed testcases names.
 *
 * List = ["Logintest - PASS",
 *            "CheckoutTest - FAIL",
 * 		"AddCartTest - FAIL",
 * 		"PaymentTest - PASS"
 * 	   ]
 *
 *
 * Output:
 * [
 *  "CheckoutTest - FAIL",
 * "AddCartTest - FAIL",
 * ]
 *
 * count is 2.
 *
 * */