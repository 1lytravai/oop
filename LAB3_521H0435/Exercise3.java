public class Exercise3 {

    // Function to return the first name and last name, except the middle name
    public static String getFirstAndLastName(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length < 3) {
            return fullName; // Return full name if it doesn't have a middle name
        }
        return parts[0] + " " + parts[parts.length - 1];
    }

    // Function to return the middle name
    public static String getMiddleName(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length < 3) {
            return ""; // Return empty string if there's no middle name
        }
        StringBuilder middleName = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            middleName.append(parts[i]);
            if (i < parts.length - 2) {
                middleName.append(" ");
            }
        }
        return middleName.toString();
    }

    // Function to capitalize the full name
    public static String capitalizeFullName(String fullName) {
        StringBuilder result = new StringBuilder();
        String[] parts = fullName.split(" ");
        for (String part : parts) {
            result.append(part.substring(0, 1).toUpperCase())
                    .append(part.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }

    public static String manipulateName(String fullName) {
        StringBuilder result = new StringBuilder();
        for (char c : fullName.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String fullName = "Nguyen Van Chien";

        System.out.println("First and last name except middle name: " + getFirstAndLastName(fullName));
        System.out.println("Middle name: " + getMiddleName(fullName));
        System.out.println("Capitalized full name: " + capitalizeFullName(fullName));
        System.out.println("Manipulated name: " + manipulateName(fullName));
    }
}
