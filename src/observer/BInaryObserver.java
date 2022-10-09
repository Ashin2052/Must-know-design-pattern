package observer;

public class BInaryObserver extends Observer{

    public BInaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
       System.out.println("Binary Observer value"+ this.subject.getState());
    }
}
