package InheritanceProblems.Problem1;

public class DeviceApp
{
    public static void main(String [ ] args)
    {
        MyDevice Note7 = new MyPhone();
        System.out.println(Note7);
        
        MyDevice iPhone7 = new MyPhone("Apple", "Iphone 7", "Mat Black");
        System.out.println(iPhone7);
        
        MyDevice Nexus6P = new MyPhone("Huawei", "Nexus 6P", "Silver");
        System.out.println(Nexus6P);
    }
}
