public class OnlineStore {
    public static void main(String[] args) {
        // messages:
        String welcomeMessage = "Bienvenido a nuestra tienda online, ";
        String confirmationMessage = ", tu pedido ha sido confirmado";
        String rejectedMessage = ", lamentablemente el artículo seleccionado está agotado";
        String showTotalMessage = "El total de tu compra es: $";

        // products:
        double bookPrice = 15.99;
        double tShirtPrice = 25.50;
        double pantsPrice = 40.00;
        double shoesPrice = 50.00;

        // customers:
        String customer1 = "Ana";
        String customer2 = "Alex";
        String customer3 = "Miguel";

        // orders status:
        boolean confirmOrderCustomer1 = true;
        boolean confirmOrderCustomer2 = true;
        boolean confirmOrderCustomer3 = true;


        String border = "==========================================";
        String borderInner = "------------------------------------------";

        // pedido de cliente 1
        System.out.println(border);
        System.out.println("         PEDIDO DE CLIENTE 1            ");
        System.out.println(borderInner);
        System.out.println(welcomeMessage + customer1);
        if (confirmOrderCustomer1) {
            System.out.println(customer1 + confirmationMessage);
            System.out.println(showTotalMessage + pantsPrice);
        }
        System.out.println(borderInner);
        System.out.println(border);


        // pedido de cliente 2
        System.out.println(border);
        System.out.println("         PEDIDO DE CLIENTE 2            ");
        System.out.println(borderInner);
        System.out.println(welcomeMessage + customer2);
        if (confirmOrderCustomer2) {
            System.out.println(customer2 + confirmationMessage);
            System.out.println(showTotalMessage + (bookPrice + shoesPrice));
        }
        System.out.println(borderInner);
        System.out.println(border);

        // pedido de cliente 3
        System.out.println(border);
        System.out.println("         PEDIDO DE CLIENTE 3            ");
        System.out.println(borderInner);
        System.out.println(welcomeMessage + customer3);
        if (confirmOrderCustomer3) {
            System.out.println(customer3 + confirmationMessage);
            System.out.println(showTotalMessage + (tShirtPrice + pantsPrice));
        }
        System.out.println(borderInner);
        System.out.println(border);

        
    }
}
