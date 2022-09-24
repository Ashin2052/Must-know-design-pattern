import adapter.UsPinAdapter;
import facade.Facade;
import facade.HelperFacade;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


////        Singleton Design Pattenn
//        Singleton singleton1 = Singleton.getInstance("1");
//        System.out.println(singleton1.value);
//        Singleton singleton2 = Singleton.getInstance("2");
//        System.out.println(singleton2.value);
//
//
//        new Facade().generateReport();


        UsPinAdapter usPinAdapter = new UsPinAdapter();
        usPinAdapter.injectNormalPIn();
        usPinAdapter.injectUsPin();



    }
}