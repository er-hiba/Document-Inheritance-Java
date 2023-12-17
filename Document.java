class Document {
    private static int counter = 0;
    private final int code;
    private final String title;
    private final String date;

    public Document() {
        this("Untitled", "No date");
    }

    public Document(String title, String date) {
        counter++;
        this.code = counter;
        this.title = title;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return String.format("Document code: %d, Title: '%s', Date: '%s'", code, title, date);
    }

    public boolean Equals(Document other) {
        return this.code == other.getCode();
    }
}

