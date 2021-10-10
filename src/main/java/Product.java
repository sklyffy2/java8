public class Product {
    private int price;
    public Product(int price) {
        this.price = price;
    }

 public int getPrice(){
    return price;
}
@Override
    public String toString(){
        return Integer.toString(price);
}
}
