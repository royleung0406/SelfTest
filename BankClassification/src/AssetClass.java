public class AssetClass {
  public static void main(String[] args) {

    String yourName;
    yourName = "";

    double yourTotalAverageAsset;
    yourTotalAverageAsset = 3000000;
    //double yourTotalAsset;
    if (yourTotalAverageAsset >= 8000000) {
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are now upgraded to Premier Elite");
      
    } if (yourTotalAverageAsset >= 1000000) {
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are now upgraded to Premier");
      
    } if (yourTotalAverageAsset < 1000000){
      System.out.println("Good Morning" + yourName + ". Welcome to HSBC, you are our Advanced Customer");
    }
    
     CustomerData cm1 = new CustomerData("Kashing", "Lee", 1000000000);
     System.out.println(cm1.qualifaction());
}


  }
