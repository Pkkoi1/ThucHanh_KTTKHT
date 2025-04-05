package iuh.fit.desginPattern;

public class Order {
    private String orderID;
    private String customerName;
    private String orderDate;
    private String orderTime;
    private String orderStatus;
    private String orderTotal;
    private String orderPaymentMethod;
    private String orderDeliveryMethod;
    private String orderDeliveryAddress;
    private String orderDeliveryTime;
    private String orderNote;

    public Order(String orderID, String customerName, String orderDate, String orderTime, String orderStatus, String orderTotal, String orderPaymentMethod, String orderDeliveryMethod, String orderDeliveryAddress, String orderDeliveryTime, String orderNote) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        this.orderTotal = orderTotal;
        this.orderPaymentMethod = orderPaymentMethod;
        this.orderDeliveryMethod = orderDeliveryMethod;
        this.orderDeliveryAddress = orderDeliveryAddress;
        this.orderDeliveryTime = orderDeliveryTime;
        this.orderNote = orderNote;
    }


    public Order() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderPaymentMethod() {
        return orderPaymentMethod;
    }

    public void setOrderPaymentMethod(String orderPaymentMethod) {
        this.orderPaymentMethod = orderPaymentMethod;
    }

    public String getOrderDeliveryMethod() {
        return orderDeliveryMethod;
    }

    public void setOrderDeliveryMethod(String orderDeliveryMethod) {
        this.orderDeliveryMethod = orderDeliveryMethod;
    }

    public String getOrderDeliveryAddress() {
        return orderDeliveryAddress;
    }

    public void setOrderDeliveryAddress(String orderDeliveryAddress) {
        this.orderDeliveryAddress = orderDeliveryAddress;
    }

    public String getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(String orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderTotal='" + orderTotal + '\'' +
                ", orderPaymentMethod='" + orderPaymentMethod + '\'' +
                ", orderDeliveryMethod='" + orderDeliveryMethod + '\'' +
                ", orderDeliveryAddress='" + orderDeliveryAddress + '\'' +
                ", orderDeliveryTime='" + orderDeliveryTime + '\'' +
                ", orderNote='" + orderNote + '\'' +
                '}';
    }
}
