package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Sale{
    int productId;
    int quantity;
    double price;

    public Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", qunatity=" + quantity +
                ", price=" + price +
                '}';
    }
}


class ProductSales {
    int productId;
    double revenue;
    public ProductSales(int productId, double revenue) {
        this.productId=productId;
        this.revenue=revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "ProductSales{" +
                "productId=" + productId +
                ", revenue=" + revenue +
                '}';
    }
}
public class ProductSalesAnalysis {
    public static void main(String[] args) {
        List<Sale>list = new ArrayList<>();
        list.add(new Sale(1,70,230));
        list.add(new Sale(2,2,120));
        list.add(new Sale(3,20,23000));
        list.add(new Sale(4,12,7300));
        list.add(new Sale(5,9,2130));

        System.out.println("Quantity sold greater than 10 : ");
        List<Sale> newList = list.stream().filter(a ->a.quantity>10).collect(Collectors.toList());
        newList.forEach(System.out::println);

        System.out.println(" \nTransform :");
        List<ProductSales> newlist2= new ArrayList<>();
        for(Sale l : list){
            newlist2.add(new ProductSales(l.getProductId(),l.getQuantity()*l.getPrice()));
        }

        System.out.println("\n Sort");
        List<ProductSales> sorted = newlist2.stream().sorted((a,b)->Double.compare(b.getRevenue(),a.getRevenue())).collect(Collectors.toList());
        for(ProductSales e : sorted ){
            System.out.println(e.toString());
        }



    }
}