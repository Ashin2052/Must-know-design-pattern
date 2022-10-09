import adapter.UsPinAdapter;
import facade.Facade;
import facade.HelperFacade;
import observer.Subject;
import observer.BInaryObserver;
import observer.OctalObserver;
import singleton.Singleton;
import strategy.AddOperation;
import strategy.Context;

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


//        UsPinAdapter usPinAdapter = new UsPinAdapter();
//        usPinAdapter.injectNormalPIn();
//        usPinAdapter.injectUsPin();


        // observer
//
//        Subject subject = new Subject();
//        new BInaryObserver(subject);
//        new OctalObserver(subject);
//
//        subject.setState(1);

        //strategy
        Context  contextAdd = new Context(new AddOperation());
        Context  contextSub = new Context(new AddOperation());
        contextAdd.executeStrategy(3,4);
        contextSub.executeStrategy(3,4);
    }
}