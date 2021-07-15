package Package;

public class Laptop {

    //gproperties
  String  brand="hp";
  String  software ="All";
  int ram=32;
  String processor="i5";

    public static void main(String[] args)
    {
        //how to create object?
        Laptop object = new Laptop();
        Laptop object1 = new Laptop();

        System.out.println("printing object value:brand:"+ object.brand);
        System.out.println("printing object value:software:"+ object.software);
        System.out.println(object.processor);

    }
}
