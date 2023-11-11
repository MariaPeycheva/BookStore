class ComicBook extends Book {
    private String characterName;

    public ComicBook(String title, Author author, double price, String characterName) {
        super(title, author, price);
        this.characterName = characterName;
    }

    public double getPrice(double discount) {
        double discPrice = getPrice() * (1 - discount / 100);
        System.out.println("Price of the comic book '" + getTitle() + "' with character '" + characterName + "' is: " + discPrice);
        return discPrice;
    }

    public double getPrice() {
        return super.getPrice() * 0.6;
    }
}

