public class Main {
    public static void main(String[] args)

    {
      double itemPrice = 101;
      double shipping = itemPrice*0.02;
      double totalPrice = shipping + itemPrice;

      if(itemPrice>=100)
          System.out.println("your total price is "+itemPrice);
          else {
              System.out.println("your total price is " + totalPrice);
      }


    }
}