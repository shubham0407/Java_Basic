public class SuperClassSubClass {
    public static void main(String[] args) {

        SuperClassVehicle superClassVehicle =new SuperClassVehicle();
        SubClassAudi subClassAudi =new SubClassAudi();

        SuperClassVehicle superClassVehicleAudi =new SubClassAudi();

        System.out.println("This is object of : "+ superClassVehicle.getClass());
        System.out.println("This is object of : "+ subClassAudi.getClass());
        System.out.println("This is object of : "+ superClassVehicleAudi.getClass());


    }
}

