public class ElectricAppliances {
    private String Brand;
    static int count = 0;


    ElectricAppliances(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Laptop {
        String Color = "Silver";
        int priceInDollars = 1000;

        Laptop(String brand) {
            Brand = brand;
            System.out.println( " The Brand of the laptop  " + Brand );
        }

        void Laptop_Details() {
            System.out.println( " The color of the Laptop " + Color + " Price is " + priceInDollars );
        }
    }

    public class Mobile {
        String Color = "Red";
        int priceInDollars = 1100;

        Mobile(String brand) {
            Brand = brand;
            System.out.println( " The Brand of the Mobile " + Brand );
        }

        void Mobile_details() {
            System.out.println( " The color of the Mobile " + Color + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        ElectricAppliances E=new ElectricAppliances(0);
        ElectricAppliances.Laptop L=E.new Laptop( "Apple");
        L.Laptop_Details();
        ElectricAppliances.Mobile M=E.new Mobile( "Samsung");
        M.Mobile_details();
        System.out.println("main is running successfully");
    }
}

