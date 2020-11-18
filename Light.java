public class Light {
    private String Type;
    String Brand;
    static int count = 0;
    float length;
    float weight;

    public float getLength() {
        return length;
    }

    public void setLength(float Length) {
        length = Length;
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

    Light(int i) {
        count++;
        System.out.println("Instance Count Parameterized Constructor "+count);
    }



    public class OutdoorLighting {
        int Height=1;
        int NumberOfLights=2;
        int cost=100;

        OutdoorLighting(String LightType,String LightBrand) {
            Type=LightType;
            Brand=LightBrand;
            System.out.println("Type and Brand of the Light "+Type+" "+Brand);
        }

        void OutDoorLightingDetails(){
            System.out.println("Light is of Height "+Height+","+"Total number of lights "+NumberOfLights+",Cost of the Light "+cost);
        }
    }

    public class KitchenLight {
        int Height=2;
        int NumberOfLights=3;
        int Cost=300;


        KitchenLight(String LightType,String LightBrand) {
            Type=LightType;
            Brand=LightBrand;
            System.out.println("Type and Brand of the Light "+Type+" "+Brand);
        }

        void KitchenLightDetails(){
            System.out.println("Light is of Height "+Height+","+"Total number of lights "+NumberOfLights+",Cost of the Light "+Cost);
        }
    }

    public static void main(String[] args) {
        Light ob1=new Light(1);
        Light.OutdoorLighting ob2=ob1.new OutdoorLighting("OutdoorLighting","ZZZ");
        ob2.OutDoorLightingDetails();
        Light.KitchenLight ob3=ob1.new KitchenLight("KitchenLight","YYY");
        ob3.KitchenLightDetails();
        System.out.println("main is running successfully");
    }
}

