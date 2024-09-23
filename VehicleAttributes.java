 class Vehicle {
    
    String brand;
    int year;

    public Vehicle(){
        this.brand="b";
        this.year=2000;
        
    }

    public Vehicle(String b, int y)
    {
        this.brand=b;
        this.year=y;
    }
    public void display()
    {
        System.out.println("Brand is:" + brand);
        System.out.println("Year is:"+ year);
    }
   
    
}

class Car extends Vehicle{
    String model;
    public Car(){
        super();
        this.model="u";
        
    }
    

    public Car(String b, int y, String m)
    {
        this.model=m;
    }
    public void display()
    {
        System.out.println("Brand is:" + brand);
        System.out.println("Year is:"+ year);
        System.out.println("Model is:" + model);
    }
   


    
}

public class VehicleAttributes{
    public static void main(String args[]){
        
        Car c= new Car();
        c.display();
        
        
    }
}


