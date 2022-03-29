 public class polymorphism{
private String title;
private double price;
private int copies;
public int getcopies(){
  return this.copies;
}
 public void setcopies(int copies){
   this.copies=copies;
}
 public void setprice(double price) {
 this.price=price;
}
public void sellcopy(int qty){
System.out.println("total pubication sell:$"+ (qty*price));
}
}

