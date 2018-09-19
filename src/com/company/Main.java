package com.company;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // write your code her
        String url = "http://erdani.com/tdpl/hamlet.txt";
        String script;
        script = urlToString(url);
        script = script.toLowerCase();
        String[] scriptSplit = script.split(" ");
        int count = 0;
      //  for (String val : scriptSplit) {
        //    System.out.println(val);
        //
        for (int i = 0; i < scriptSplit.length; i++) {
            if (scriptSplit[i].contains("prince")) {
                count++;
            }
        }
        System.out.println(count);
    }
}