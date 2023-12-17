public class Main {
    public static void main(String[] args) {
        // Creating instances of Document class
        Document doc1 = new Document("Introduction to Python", "2023-10-30");
        Document doc2 = new Document("Data Analysis Techniques", "2023-11-27");

        // Creating instances of Copy class
        Copy copy1 = new Copy("Introduction to Python", "2023-10-30", 100, "2023-11-29");
        Copy copy2 = new Copy("Data Analysis Techniques", "2023-11-27", 100, "2023-11-30");

        // Displaying document and copy information
        System.out.println(doc1);
        System.out.println(doc2);
        System.out.println();
        System.out.println(copy1);
        System.out.println(copy2);

        // Comparing documents and copies
        if (doc1.Equals(doc2)) {
            System.out.println("\nThe documents have the same code.");
        } else {
            System.out.println("\nThe documents have different codes.");
        }

        if (copy1.Equals(copy2)) {
            System.out.println("\nThe copies have the same number.");
        } else {
            System.out.println("\nThe copies have different numbers.");
        }
    }
}

