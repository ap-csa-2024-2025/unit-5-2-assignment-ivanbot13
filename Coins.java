public class Coins
{
  public static void main(String[] args)
  {
    int coins = 1985;
    System.out.println(coinConverter(coins));
  }

  public static double coinConverter(int pennies)
  {
    int bills = pennies/100;
    int quarters = (pennies%100)/25;
  }

}
