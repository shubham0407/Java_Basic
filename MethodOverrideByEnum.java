public enum MethodOverrideByEnum {
    MONDAY,
    TUESDAY {
        @Override
        public void dummyMethod() {
            System.out.println(" this is dummy method in tuesday enum");
        }
    },
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void dummyMethod(){
        System.out.println(" this is dummy method in outside enum");
    }

}
