public enum EnumWithCustomValues {
    MONDAY(101, "this is mopnday"),
    TUESDAY(102, "this is tuesday"),
    WEDNESDAY(103, "this is wednesday"),
    THURSDAY(104, "this is thursday"),
    FRIDAY(105, "this is friday"),
    SATURDAY(106, "this is saturday"),
    SUNDAY(107, "this is sunday");



    private int x;
    private String day;

    EnumWithCustomValues(int i, String s) {
        this.x=i;
        this.day=s;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public static EnumWithCustomValues getEnumFromValue(int value){
        for(EnumWithCustomValues sample : EnumWithCustomValues.values()){
            if(sample.x==value){
                return sample;
            }
        }
        return null;
    }


}
