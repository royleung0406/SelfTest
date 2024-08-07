public class AssetClass {
  public static void main(String[] args) {

    String yourName;
    yourName = "";

    double yourTotalAverageAsset;
    yourTotalAverageAsset = 3000000;
    //double yourTotalAsset;
    if (yourTotalAverageAsset >= 8000000) {
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are now upgraded to Premier Elite");
      
    } else if (yourTotalAverageAsset >= 1000000) {
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are now upgraded to Premier");
      
    } else  {
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are our Advanced Customer");
      
     }


     
// Boolean Version

Boolean result = yourTotalAverageAsset >= 8000000;
if (result = true) {
  System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are now upgraded to Premier Elite");
    } else {
      System.out.println("Good Morning" + yourName + ". Sorry your are not eligible to upgrade as Premier Elite");
    }


  }
}
