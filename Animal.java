import com.sun.jdi.PathSearchingVirtualMachine;

public class Animal {
    private String AnimalType;
    String AnimalSound;
    static int count = 0;
    float Height;
    float weight;

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String Name;
    String color;
    int age;

   Animal(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }



    public class Dog {
        int DogHeightinFeet=3;
        int DogAge=1;
        String DogBreed="Lab";

        Dog(String Type,String Sound) {
            AnimalSound=Sound;
            AnimalType=Type;
            System.out.println("Type and Sound of the Dog "+Type+" "+Sound);
        }

        void DogDetails(){
            System.out.println("Dog is of Height "+DogHeightinFeet+" feet"+","+"Dog is of age "+DogAge+",Dog's Breed is "+DogBreed);
        }
    }

    public class Cat {
        int CatHeightinFeet=2;
        int CatAge=3;
        String CatBreed="RagDoll";


        Cat(String Type,String Sound) {
            AnimalSound=Sound;
            AnimalType=Type;
            System.out.println("Type and Sound of the Cat "+Type+" "+Sound);
        }

        void CatDetails(){
            System.out.println("Cat is of Height "+CatHeightinFeet+" feet"+","+"Cat is of age "+CatAge+",Cat's Breed is "+CatBreed);
        }
    }

    public static void main(String[] args) {
        Animal ob1=new Animal(1);
        Animal.Dog Dogob=ob1.new Dog("Mammal","Bark");
        Dogob.DogDetails();
        //Dogob.dogSound();
        Animal.Cat Catob=ob1.new Cat("Mammal","meow");
        Catob.CatDetails();
       // Catob.CatSound();

        System.out.println("main is running successfully");
    }
}
