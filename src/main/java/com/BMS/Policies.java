package com.BMS;

public final class Policies {

    private Policies() {
        throw new AssertionError("Utility class should not be instantiated");
    }


    public static boolean isbnPolicy(String ISBN) {
        /*user input may contain user spaces and lowercase isbn
        ,the uppercase to follow code logic below
         */
        ISBN = ISBN.trim().toUpperCase();

        if (ISBN.isEmpty()) {
            return false;
        }

        if (ISBN.startsWith("ISBN:")) {
            String isbnNumber = ISBN.substring(5); // Remove "ISBN:"

            // ISBNs have 4 or 5 "-" ,10 to 13 characters
            String[] parts = isbnNumber.split("-");
            if (isbnNumber.length() >= 10 && isbnNumber.length() <= 13) {
                if (parts.length == 4 || parts.length == 5) {
                    // Check if each part is a valid number or character X , + for sequence
                    for (String part : parts) {
                        if (!part.matches("[0-9X]+")) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        return false;
    }



    public static boolean fullNamePolicy(String name) {
        // Check if name is null or empty
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        // Check if name contains at least two words
        String[] nameParts = name.trim().split("\\s+");
        if (nameParts.length < 2) {
            return false;
        }

        // Check if each part of the name contains only letters and spaces
        for (String part : nameParts) {
            if (!part.matches("[a-zA-Z]+")) {
                return false;
            }
        }

        return true;
    }
}
