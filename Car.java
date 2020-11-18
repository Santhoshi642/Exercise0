public class Car {
    private String Brand;
    private String CEO;
    static int count = 0;


    Car(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Engine {
        double weightInPounds = 8;
        String Type = "Inline Engine";
        int priceInDollars = 100;

        Engine(String brand, String ceo) {
            Brand = brand;
            CEO = ceo;
            System.out.println( " Brand and CEO of the car is " + Brand + " " + CEO );
        }

        void Engine_Details() {
            System.out.println( "Engine weight is " + weightInPounds + " Type is " + Type + " Price is " + priceInDollars );
        }
    }

    public class GearType {
        double weightInPounds = 9;
        String Type = "Automatic Transimission";
        int priceInDollars = 200;

        GearType(String brand, String ceo) {
            Brand = brand;
            CEO = ceo;
            System.out.println( " Brand and CEO of the car is " + Brand + " " + ceo );
        }

        void Gear_details() {
            System.out.println( "Engine weight is " + weightInPounds + " Type is " + Type + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        Car c=new Car(0);
        Car.Engine E=c.new Engine( "Benz",  "Dieter Zetsche" );
        E.Engine_Details();
        Car.GearType GT=c.new GearType( "Audi","Markus Duesmann" );
        GT.Gear_details();
        System.out.println("main is running successfully");
    }
}
