public class Furniture {
    private String Brand;
    private int Total;
    static int count = 0;


    Furniture(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Sofa {
        int weight = 200;
        String Color = "Black";
        int priceInDollars = 400;

        Sofa(String brand, int total) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total number of the Sofa " + Brand + " " + Total );
        }

        void Sofa_Details() {
            System.out.println( " The weight of the Sofa is " + weight + " Color is " + Color + " Price is " + priceInDollars );
        }
    }

    public class DiningTable {
        int weight = 200;
        String Color = "Black";
        int priceInDollars = 400;

        DiningTable(String brand, int total ) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total number of the Dining table " + Brand + " " + Total );
        }

        void DiningTable_details() {
            System.out.println( " The weight of the Sofa is " + weight + " Color is " + Color + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        Furniture f=new Furniture(0);
        Furniture.Sofa s=f.new Sofa( "XYZ",  2 );
        s.Sofa_Details();
        Furniture.DiningTable D=f.new DiningTable( "ABC",5);
        D.DiningTable_details();
        System.out.println("main is running successfully");
    }
}
