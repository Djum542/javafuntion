import java.util.Scanner;

public class Buoi5 {
    private static int PizzaCheese;

    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();
        Scanner in = new Scanner(System.in);
        int order = in.nextInt(PizzaCheese);
        System.out.println(order);
    }
}
