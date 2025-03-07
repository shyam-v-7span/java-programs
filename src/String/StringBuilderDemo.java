public class StringBuilderDemo {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder StringBuilderObject = new StringBuilder("Hello");
        System.out.println("Original String: " + StringBuilderObject);

        //Append (Add text at the end)
        StringBuilderObject.append(" world");
        System.out.println("After Append: " + StringBuilderObject);

        //Insert text at a specific position
        StringBuilderObject.insert(5, ",");
        System.out.println("After Insert: " + StringBuilderObject);

        //Replace part of the string
        StringBuilderObject.replace(6, 12, " shyam");
        System.out.println("After Replace: " + StringBuilderObject);

        //Delete a portion of the string
        StringBuilderObject.delete(5, 6);
        System.out.println("After Delete: " + StringBuilderObject);

        // Reverse
        StringBuilderObject.reverse();
        System.out.println("After Reverse: " + StringBuilderObject);
    }
}
