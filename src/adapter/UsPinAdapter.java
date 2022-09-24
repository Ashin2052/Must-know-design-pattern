package adapter;

public class UsPinAdapter extends NormalSocket implements UsSocketInterface{
    NormalSocket normalSocket;
    @Override
    public void injectUsPin() {
        System.out.println("us pin injected using adapter");
    }

    public void injectNormalPin() {
        normalSocket.injectNormalPIn();
    }
}
