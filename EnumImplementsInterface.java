public enum EnumImplementsInterface implements EnumInterface {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String dummyInterfaceMethod() {
        return "This is implementation of enum InterFace";
    }
}
