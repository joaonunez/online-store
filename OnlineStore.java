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
        double pantsPrice = 100.00;
        double shoesPrice = 30.00;

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
        } else{
            System.out.println(rejectedMessage);
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
            System.out.println(showTotalMessage + (tShirtPrice + (shoesPrice*2) + pantsPrice));
        } else{
            System.out.println(rejectedMessage);
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
        else{
            System.out.println(rejectedMessage);
        }
        System.out.println(borderInner);
        System.out.println(border);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
         // Error en el pedido de Miguel
        System.out.println("\n" + border);
        System.out.println("         ERROR EN EL PEDIDO DE MIGUEL    ");
        System.out.println(borderInner);
        System.out.println("Lo sentimos, " + customer3 + ", ha habido un error en tu compra");
        System.out.println("Te cobraron pantalones y una camiseta, pero solo deberías haber pagado por unos zapatos y un libro.");

        double totalIncorrectAmountMiguel = (pantsPrice + tShirtPrice);
        double totalCorrectAmountMiguel = (shoesPrice + bookPrice);
        double diferenceAmountsOrderMiguel = (totalIncorrectAmountMiguel - totalCorrectAmountMiguel);
        System.out.println("El total incorrecto fue: " + totalIncorrectAmountMiguel);
        System.out.println("El Total correcto es: " + totalCorrectAmountMiguel);
        System.out.println("La diferencia es: " + diferenceAmountsOrderMiguel);
        System.out.println(borderInner);
        System.out.println(border);

        
    }
}
