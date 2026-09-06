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

            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setInstanceFollowRedirects(true);

            int responseCode = connection.getResponseCode();

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
        System.out.println("\n:)  Valid links:");
        validLinks.forEach(u -> System.out.println("  "+ u));

        System.out.println("\n(: Invalid links:");
        invalidLinks.forEach(u -> System.out.println("  "+u));

    }
}
