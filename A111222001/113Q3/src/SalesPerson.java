import java.util.Arrays;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01;  // Default commission rate
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        // If the orderArray is full, double the size of the array
        if (orderCount == orderArray.length) {
            orderArray = Arrays.copyOf(orderArray, orderArray.length * 2);
        }

        // Create a new Order and add it to the array
        Order newOrder = new Order(itemName, itemPrice, amount);
        orderArray[orderCount] = newOrder;
        orderCount++;  // Increment the order count

        // Update gross sales
        grossSales += newOrder.totalSale();
    }

    public double getGrossSales() {
        return grossSales;
    }

    
    public String getOrders() {

        if (orderCount == 0) {
            return "此業務員沒有訂單。";
        }

        StringBuilder ordersDetails = new StringBuilder();
        for (int i = 0; i < orderCount; i++) {
            ordersDetails.append(orderArray[i].toString()).append("\n");
        }

        return ordersDetails.toString();


    }
    
    public double salary() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
