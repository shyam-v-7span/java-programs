public class StringExample {
    public static void main(String[] args) {
        // Creating a String
        String name = "shyam vachhani";
        System.out.println("Original String: " + name);

        // find Length of the String
        System.out.println("Length of String: " + name.length());

        // concatenation
        String greeting = "Hello, " + name;
        System.out.println("After concatenation: " + greeting);

        //Extract a character at a specific index
        char firstChar = name.charAt(0);
        System.out.println("First character: " + firstChar);

        //comparing strings
        String anotherName = "shyam patel";
        boolean isEqual = name.equals(anotherName);
        boolean isEqualIgnoreCase = name.equalsIgnoreCase(anotherName);
        System.out.println("case-sensitive Comparison: " + isEqual);
        System.out.println("case-insensitive Comparison: " + isEqualIgnoreCase);

        //Extract a substring
        String lastName = name.substring(5);
        System.out.println("Extract: " + lastName);

        //Split a String
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        System.out.println("Words in Sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Reversing a String using StringBuilder
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
