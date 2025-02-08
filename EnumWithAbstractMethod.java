public enum EnumWithAbstractMethod {
    MONDAY{
        public  void dummyMethod(){
            System.out.println("Implementation of abstract method in Monday");
        }
    },
    TUESDAY{
        public  void dummyMethod(){
            System.out.println("Implementation of abstract method in Tuesday");
        }
    },
    WEDNESDAY{
        public  void dummyMethod(){
            System.out.println("Implementation of abstract method in Wednesday");
        }
    };


    public abstract void dummyMethod();
}
