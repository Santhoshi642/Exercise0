public class Painting {
    private String type;
    private String theme;
    static int count = 0;


    Painting(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }
    public class Portrait {
        int colorsUsed = 12;
       // String Color = "Red";
        int priceInDollars = 80;

        Portrait(String Type, String Theme) {
            type = Type;
            theme = Theme;
            System.out.println( " The type of colors used and the Theme is " + Type + " " + Theme );
        }

        void Portrait_Details() {
            System.out.println( " The total colors used " + colorsUsed + " Price is " + priceInDollars );
        }
    }

    public class Acrylic {
        int colorsUsed = 20;
        // String Color = "Red";
        int priceInDollars = 100;

        Acrylic(String Type, String Theme ) {
            type = Type;
            theme = Theme;
            System.out.println( " The type of colors used and the Theme is " + Type + " " + Theme );
        }

        void Acrylic_details() {
            System.out.println( " The total colors used " + colorsUsed + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        Painting p=new Painting(0);
        Painting.Portrait T=p.new Portrait( "Water Painting",  "Sunset" );
        T.Portrait_Details();
        Painting.Acrylic A=p.new Acrylic( "Oil Painting","Buddha");
        A.Acrylic_details();
        System.out.println("main is running successfully");
    }
}

