package com.regex.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPincodePhone {

	public static void main(String[] args) {
        String input = "{'PostOfficeName': 'Borivali', 'BranchType': 'Head Post Office', 'Region': 'Mumbai', 'District': 'Mumbai', 'State': 'Maharashtra', 'Pincode': '400091'}, "
                     + "{'Address': 'daruwala compound, s. v. road, malad west mumbai -', 'District': 'Mumbai', 'Pincode': '400064', 'Verification': 'Address is correct'}, "
                     + "Street:  Shanti Nagar, Mahakali Caves Rd, Andheri (west), City:   Mumbai, State/province/area:    Maharashtra, Phone number:  02228360068, Zip code:  400093, Country calling code:  +91, Country:  India, "
                     + "Street   17B, Monaranjan Roychoudhury Rd, Beniapukur, City/Town         Kolkata, State/Province/Region             West Bengal, Zip/Postal Code            700014, Phone Number          033 2284 2113, Country  India, Latitude               22.545654, Longitude             88.363877";

        String pincodeRegex = "\\b\\d{6}\\b";
        String phoneRegex = "\\b\\d{3}(\\s?\\d{4}){2}\\b";
        
        Pattern pincodePattern = Pattern.compile(pincodeRegex);
        Matcher pincodeMatcher = pincodePattern.matcher(input);
        
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(input);

        System.out.println("Pincodes found:");
        while (pincodeMatcher.find()) {
            System.out.println(pincodeMatcher.group());
        }
        
        System.out.println();
        System.out.println("Phone numbers found:");
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }
	}

}
