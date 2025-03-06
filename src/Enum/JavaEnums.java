public class JavaEnums {
    enum Status{
        Running,Failed,Pending,Success;
    }

    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
    }
}
