package ComplexCodes;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindValidInvalidLinks {

    //Step 1: check single URL
    public static boolean isValidLinks(String links) throws IOException {

        try{

            HttpURLConnection connection = (HttpURLConnection) new URL(links).openConnection();

            connection.setRequestMethod("HEAD");  //lightweight check
            connection.setConnectTimeout(5000);     //5 sec connect timeout
            connection.setReadTimeout(5000);        //5 sec read timeout
            connection.setInstanceFollowRedirects(true); // follow redirects

            int responseCode = connection.getResponseCode();

            //200-399 = valid(ok, redirects etc.)
            return responseCode >= 200 && responseCode < 400;

        }catch (UnknownHostException e){
            System.out.println("DNS failure: "+links);

        }catch (SocketTimeoutException e){
            System.out.println("Timeout "+links);
        }catch (Exception e){
            System.out.println(" Error : "+e.getMessage());
        }

        return false;

    }


    public static void main(String[] args) throws IOException {

        //Step 2: List of URLs to validate
        List<String> links = Arrays.asList(

                "https://www.example.com",
                "https://www.google.co.in/",
                "https://www.invalidlink.com/abc",
                "https://www.github.com",
                "https://www.thiswebsitedoesnotexist12345.com"
        );

        List<String> validLinks = new ArrayList<>();
        List<String> invalidLinks = new ArrayList<>();

        //Step 3: Validate each URL Sequentially
        for(String url : links){
            if(isValidLinks(url)){
                validLinks.add(url);
            }else {
                invalidLinks.add(url);
            }
        }

        //Step 4: Print results
        System.out.println("\n✅  Valid links:");
        validLinks.forEach(u -> System.out.println("  "+ u));

        System.out.println("\n❌ Invalid links:");
        invalidLinks.forEach(u -> System.out.println("  "+u));

    }
}


/***
 *
 *
 * Given a list of URLs → check each one is reachable or not
 *
 * Valid   → server responds (HTTP 200, 301, 302...)
 * Invalid → no server, timeout, DNS failure, connection refused
 *
 *
 * Step 1: Store all URLs in a List
 *
 * Step 2: For each URL:
 *         a. Create a URL object
 *         b. Open an HttpURLConnection
 *         c. Set request method → "HEAD"
 *            (HEAD fetches only headers, not body → faster ✅)
 *         d. Set timeout → 5000ms (5 seconds)
 *         e. Get response code
 *               200-399 → VALID ✅
 *               400+    → INVALID ❌
 *
 * Step 3: Catch exceptions
 *         UnknownHostException → DNS failed  → INVALID
 *         SocketTimeoutException → timed out → INVALID
 *         Exception → any other failure      → INVALID
 *
 * Step 4: Print valid and invalid separately
 *
 *
 * GET  → downloads entire page body  → slow, wastes bandwidth ❌
 * HEAD → fetches only response headers → fast, lightweight  ✅
 *
 * Both return the same status code (200, 404 etc.)
 * HEAD is the standard way to check URL reachability
 */