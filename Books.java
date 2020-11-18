public class Books {
    private String Name;
    private String Author;
    static int count = 0;


    Books(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }

    public class StoryBook {
        double weightInPounds = 2.3;
        String shape = "rectangle";
        int priceInDollars = 10;

        StoryBook(String name, String author) {
            Name = name;
            Author = author;
            System.out.println( " Name and Author of the book is " + Name + " " + Author );
        }

        void Storybook_details() {
            System.out.println( "Story book weight is " + weightInPounds + " shape is " + shape + " Price is " + priceInDollars );
        }
    }

    public class Textbook {
        double weightInPounds = 4.8;
        String shape = "circle";
        int priceInDollars = 20;

        Textbook(String name, String author) {
            Name = name;
            Author = author;
            System.out.println( " Name and Author of the book is " + Name + " " + Author );
        }

        void Textbook_details() {
            System.out.println( "Story book weight is " + weightInPounds + " shape is " + shape + " Price is " + priceInDollars );
        }

    }

    public static void main(String[] args) {
        Books b=new Books(0);
        Books.StoryBook Sb=b.new StoryBook( "Disney Land","Michel John" );
        Sb.Storybook_details();
        Books.Textbook Tb=b.new Textbook( "Geography","Win Matt" );
        Tb.Textbook_details();
        System.out.println("main is running successfully");
    }
}

