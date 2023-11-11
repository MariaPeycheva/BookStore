public class ChildrenBook extends Book{
    private int age;

    public ChildrenBook(String title, Author author, double price, int age) {
        super(title, author, price);
        this.age = age;
    }
    public double getPrice() {
        return super.getPrice() * 0.7;
    }
}

