public class CustomerData {
  private int id;
  private String firstName;
  private String lastName;
  private double savings;

  public CustomerData (String firsName, String lastName, double savings){
      this.firstName = firsName;
      this.lastName = lastName;
      this.savings = savings;
  }

  public String qualifaction (){
          String preiE = this.firstName + " " + this.lastName +" You are Premier Elite Customer";
          String pre  = this.firstName + " " + this.lastName +" You are Premier Customer";
          String adv = this.firstName + " " + this.lastName +" You are Advanced Customer";
          if(this.savings >= 8000000){
          return preiE;
          }
          if (this.savings >= 1000000) {
          return pre;
          }
          return adv;
  }

}
