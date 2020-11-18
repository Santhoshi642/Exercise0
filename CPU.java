public class CPU {
    private String Brand;
    private int Total;
    static int count = 0;


    CPU(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Ram {
        int SizeinGB = 48;
        int priceInDollars = 100;

        Ram(String brand, int total) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total number of CPU's " + Brand + " " + Total );
        }

        void Ram_Details() {
            System.out.println( " The size in GB of the Ram is " + SizeinGB + " Price is " + priceInDollars );
        }
    }

    public class Processor {
        String Speed = "1.6 GHz";
        int priceInDollars = 200;

        Processor(String brand, int total ) {
            Brand = brand;
            Total = total;
            System.out.println( " Brand and the total number of CPU's " + Brand + " " + Total );
        }

        void Processor_details() {
            System.out.println( " The speed of the processor is " + Speed + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        CPU c=new CPU(0);
        CPU.Ram R=c.new Ram( "Dell",  40 );
        R.Ram_Details();
        CPU.Processor P=c.new Processor( "HP",200);
        P.Processor_details();
        System.out.println("main is running successfully");
    }
}

