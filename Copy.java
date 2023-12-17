class Copy extends Document {
    private int number;
    private String purchaseDate;

    public Copy() {
        this("Untitled", "No date", 0, "Purchase date not specified");
    }

    public Copy(String title, String date, int number, String purchaseDate) {
        super(title, date);
        this.number = number;
        this.purchaseDate = purchaseDate;
    }

    public int getNumber() {
        return number;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return String.format("Copy code: %d, Title: '%s', Date: '%s', Number: %d, Purchase Date: '%s'",
                getCode(), getTitle(), getDate(), number, purchaseDate);
    }

    public boolean Equals(Copy other) {
        return this.number == other.getNumber();
    }
}
