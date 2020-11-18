public class Clothes {
    private String Brand;
    private int Total;
    static int count = 0;


    Clothes(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Trousers {
        int size = 36;
        String Color = "Red";
        int priceInDollars = 20;

        Trousers(String brand, int total) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total count of the cloths " + Brand + " " + Total );
        }

        void Trousers_Details() {
            System.out.println( " The size of the Trousers is " + size + " Color is " + Color + " Price is " + priceInDollars );
        }
    }

    public class Dress {
        int size = 32;
        String Color = "Orange";
        int priceInDollars = 40;

        Dress(String brand, int total ) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total count of the cloths " + Brand + " " + Total );
        }

        void Dress_details() {
            System.out.println( " The size of the Trousers is " + size + " Color is " + Color + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        Clothes c=new Clothes(0);
        Clothes.Trousers T=c.new Trousers( "Levis",  3 );
        T.Trousers_Details();
        Clothes.Dress D=c.new Dress( "Puma",10);
        D.Dress_details();
        System.out.println("main is running successfully");
    }
}


