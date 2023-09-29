
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        Pizza basePizza=new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.takeAway();
        System.out.print("--------------------"+"\n");
        basePizza.getBill();

//        DeluxPizza dPizza=new DeluxPizza(true);
//        dPizza.getBill();
        }

}