public class Car
{
 int price;
 String name;
 String colour;
 String speed;
 void display()
{
  System.out.println("Car price is="+price);
  System.out.println("Car name is="+name);
  System.out.println("Car colour is="+colour);
  System.out.println("Car speed is="+speed);
 }
}
class CarDemo
{
 public static void main(String args[])
 
 {
  Car tatapunch=new Car();
  System.out.println("tatapunch's properties:");
  tatapunch.price=500000;
  tatapunch.name="TATAPUNCH";
  tatapunch.colour="blue";
  tatapunch.speed="100km";
  tatapunch.display();
  System.out.println("\n");

  Car audi=new Car();
  System.out.println("audi's properties:")
  audi.price=600000;
  audi.name="AUDI";
  audi.colour="black";
  audi.speed="15km";
  audi.display();
 System.out.println("\n");

 
  Car tatatiyago=new Car();
  System.out.println("tatatiyago's properties");
  tatatiyago.price=700000;
  tatatiyago.name="TATATIYAGO";
  tatatiyago.colour="white";
  tatatiyago.speed="500km";
  tatatiyago.display();
   System.out.println("\n");
  
  }
}