package myprojects;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
	 
    public static void main(String a[]) {
 
        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("Japan");
        countryList.add("Canada");
 
        // iterate through List normal way
        Example9.iterateList(countryList);
 
        // iterate through List using forEach method
        Example9.iterateListUsingForEach(countryList);
    }
 
    public static void iterateList(List<String> countryList) {
 
        System.out.println("<-----Iterating in normal way----->");
        for(String country:countryList) {
            System.out.println(country);
        }
    }
 
    public static void iterateListUsingForEach(List<String> countryList) {
 
        System.out.println("\n<---Iterating using forEach method--->");
        countryList.forEach(country->System.out.println(country));
 
        countryList.forEach(country->{
            // you can implement some business logic here..
        });
    }
}

