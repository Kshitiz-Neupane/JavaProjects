enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED
}

public class EnumExample {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " + status);

    }
}


