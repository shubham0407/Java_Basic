public class EnumMainClass {
    public static void main(String[] args) {


        //1 Use of values and ordinal
        for(SampleEnum sampleEnum: SampleEnum.values()){
            System.out.println("This is enum ordinal values: "+sampleEnum.ordinal());
        }

        //2. Use of valueof() and  name()
        SampleEnum enumVariable=SampleEnum.valueOf("TUESDAY");
        System.out.println("this is tuesday value :"+enumVariable.name());



        ///  Enum With custom values
        EnumWithCustomValues enumWithCustomValues=EnumWithCustomValues.getEnumFromValue(105);
        assert enumWithCustomValues != null;
        System.out.println(" this is enum custom value for 107 :"+enumWithCustomValues.getDay());



        /// /  Method override by constant:
        MethodOverrideByEnum methodOverrideByFriday =MethodOverrideByEnum.FRIDAY;
        methodOverrideByFriday.dummyMethod();

        MethodOverrideByEnum methodOverrideByTuesday =MethodOverrideByEnum.TUESDAY;
        methodOverrideByTuesday.dummyMethod();

        EnumWithAbstractMethod enumWithAbstractMethod=EnumWithAbstractMethod.TUESDAY;
        enumWithAbstractMethod.dummyMethod();

        EnumImplementsInterface enumImplementsInterface= EnumImplementsInterface.FRIDAY;
        System.out.println(enumImplementsInterface.dummyInterfaceMethod());








    }
}
