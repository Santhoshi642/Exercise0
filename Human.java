public class Human {
    private String Name;
   // private int Total;
    static int count = 0;


    Human(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Boy {
        int Height = 6;
        String Color = "Fair";
        int weight = 60;

        Boy(String name) {
            Name = name;
            System.out.println( " Name of the boy " + Name );
        }

        void Boy_Details() {
            System.out.println( " Boy is of height " + Height + " Color is " + Color + " Weight is " + weight );
        }
    }

    public class Girl {
        int Height = 5;
        String Color = "whitish";
        int weight = 50;

        Girl(String name) {
            Name = name;
            System.out.println( " Name of the girl " + Name );
        }

        void Girl_details() {
            System.out.println( " Girl is of height " + Height + " Color is " + Color + " Weight is " + weight );
        }

    }

    public static void main(String[] args) {
        Human H=new Human(0);
        Human.Boy B=H.new Boy( "John");
        B.Boy_Details();
        Human.Girl G=H.new Girl( "Kamala");
        G.Girl_details();
        System.out.println("main is running successfully");
    }
}
