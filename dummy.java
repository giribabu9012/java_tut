import java.util.*;

class dummy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t WELCOME TO FORUM MALL\t\t\t");
        System.out.println("CHOOSE YOUR SHOP:");
        System.out.println("\t\t\t1. RARE RABBIT\n2. CELIO\n3. JACK n JONES");
        System.out.println("\t\t\t WHAT YOU WANT FROM THESE SHOPS:");

        int shopSelection = sc.nextInt();
        Thread.sleep(500);

        switch (shopSelection) {
            case 1: // Rare Rabbit
                rareRabbitShop();
                break;

            case 2: // Celio
                celioShop();
                break;

            case 3: // Jack n Jones
                jacknJonesShop();
                break;

            default:
                System.out.println("INVALID SHOP SELECTION");
        }
    }

    // Method for Rare Rabbit Shop
    public static void rareRabbitShop() throws Exception {
        System.out.println("WELCOME TO RARE RABBIT");
        System.out.println("COLLECTIONS OF RARE RABBIT:\n1. Dyes T-Shirt\n2. Baggy Mens\n3. Cord-Set");
        System.out.println("SELECT YOUR WEAR:");
        int wearSelection = sc.nextInt();

        switch (wearSelection) {
            case 1: // Dyes T-Shirt
                processProduct("Dyes T-Shirt", 999.0);
                break;

            case 2: // Baggy Mens
                processProduct("Baggy Mens", 1299.0);
                break;

            case 3: // Cord-Set
                processProduct("Cord-Set", 799.0);
                break;

            default:
                System.out.println("PRODUCT NOT AVAILABLE IN RARE RABBIT");
                break;
        }
    }

    // Method for Celio Shop
    public static void celioShop() throws Exception {
        System.out.println("WELCOME TO CELIO");
        System.out.println("COLLECTIONS OF CELIO:\n1. Half Sleeve Shirts\n2. Jeans");
        System.out.println("SELECT YOUR WEAR:");
        int wearSelection = sc.nextInt();

        switch (wearSelection) {
            case 1: // Half Sleeve Shirts
                processProduct("Half Sleeve Shirt", 899.0);
                break;

            case 2: // Jeans
                processProduct("Jeans", 1299.0);
                break;

            default:
                System.out.println("PRODUCT NOT AVAILABLE IN CELIO");
                break;
        }
    }

    // Method for Jack n Jones Shop
    public static void jacknJonesShop() throws Exception {
        System.out.println("WELCOME TO JACK N JONES");
        System.out.println("COLLECTIONS OF JACK N JONES:\n1. Shoes\n2. Slides");
        System.out.println("SELECT YOUR WEAR:");
        int wearSelection = sc.nextInt();

        switch (wearSelection) {
            case 1: // Shoes
                processProduct("Shoes", 3799.0);
                break;

            case 2: // Slides
                processProduct("Slides", 1999.0);
                break;

            default:
                System.out.println("PRODUCT NOT AVAILABLE IN JACK N JONES");
                break;
        }
    }

    // Method to handle product selection and payment
    public static void processProduct(String productName, double productPrice) throws Exception {
        System.out.println("SELECT QUANTITY OF " + productName + ":");
        int quantity = sc.nextInt();
        double totalPrice = productPrice * quantity;
        System.out.println("TOTAL PRICE OF " + productName + ": " + totalPrice);
        System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO REJECT:");

        char productConfirm = sc.next().charAt(0);

        if (productConfirm == 'S' || productConfirm == 's') {
            redirectToPayment(totalPrice);
        } else {
            System.out.println("\t\t\tPRODUCT DENIED");
        }
    }

    // Method to handle the payment process
    public static void redirectToPayment(double totalAmount) throws Exception {
        System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
        Thread.sleep(3000);

        System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
        System.out.println("\t\t\t1. GPAY");
        System.out.println("\t\t\t2. PHONEPE");

        int paymentMode = sc.nextInt();
        if (paymentMode == 1) {
            processGpay(totalAmount);
        } else if (paymentMode == 2) {
            processPhonepe(totalAmount);
        } else {
            System.out.println("INVALID PAYMENT MODE");
        }
    }

    // Method to process GPAY payment
    public static void processGpay(double totalAmount) throws Exception {
        System.out.println("\t\t\t********GPAY********");
        System.out.println("PLEASE ENTER YOUR TOTAL BILL: " + totalAmount);
        System.out.print("ENTER THE TOTAL AMOUNT: ");
        double userEnteredAmount = sc.nextDouble();

        if (totalAmount == userEnteredAmount) {
            System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
            int sysOtp = (int) (Math.random() * 9999 + 9999);
            Thread.sleep(4000);
            System.out.println("ENTER THE OTP: ");
            Thread.sleep(3000);
            int userOtp = sc.nextInt();

            if (sysOtp == userOtp) {
                System.out.println("\t\t\tOTP VERIFIED");
                System.out.println("\t\t\tPRODUCT PURCHASED");
            } else {
                System.out.println("\t\t\tOTP MISMATCH - PRODUCT DENIED");
            }
        } else {
            System.out.println("\t\t\tAMOUNT MISMATCH - PRODUCT DENIED");
        }
    }

    // Method to process PHONEPE payment (stub, you can implement the same logic as GPAY)
    public static void processPhonepe(double totalAmount) {
        System.out.println("\t\t\t********PHONEPE********");
        // You can implement the same logic as GPAY for PhonePe here
        System.out.println("PHONEPE payment processing is under construction...");
    }
}
