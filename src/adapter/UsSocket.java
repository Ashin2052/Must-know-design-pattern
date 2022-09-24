package adapter;

public class UsSocket implements UsSocketInterface{
    @Override
    public void injectUsPin() {
        System.out.println("us pin injected");
    }
}
