public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int bagPackPrice = 20;
    private int basePizzaPrice;
    private boolean  isExtraCheeseAdded=false;
    private boolean  isExtraTooppingsAdded=false;
    private boolean  isOptedForTakeway=false;
    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

  public void addExtraCheese(){
      isExtraCheeseAdded=true;
      System.out.println("Extra cheese Added");
      this.price += extraCheesePrice;
  }

  public void addExtraTopping(){
      isExtraTooppingsAdded=true;
      System.out.println("Extra Toppings Added");
      this.price += extraToppingsPrice;
  }
  public void takeAway(){
      isOptedForTakeway=true;
      System.out.println("TakeWay Ready");
      this.price += bagPackPrice;

  }

public void getBill(){
      String bill="";
      System.out.println("Pizza: Rs."+basePizzaPrice);
      if(isExtraCheeseAdded){
          bill +="Extra Cheese Price Rs."+extraCheesePrice +"\n";
      }
      if(isExtraTooppingsAdded){
          bill +="Extra Toppings Price Rs."+extraToppingsPrice+"\n";
      }
      if(isOptedForTakeway){
          bill +="Takeway Rs."+bagPackPrice+ "\n";
      }
      bill += "Total Bill: Rs."+this.price+"\n";
      System.out.println(bill);
  }
}
