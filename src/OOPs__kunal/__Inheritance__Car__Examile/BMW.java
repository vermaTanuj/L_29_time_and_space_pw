package OOPs__kunal.__Inheritance__Car__Examile;

public class BMW implements Break,Engin,MediaPlayer {
    @Override
    public void brake() {
        System.out.println("BMW break");
    }

    @Override
    public void petrol() {
        System.out.println("BMW is using petrol");
    }

    @Override
    public void electric() {
        System.out.println("BMW does not use electric engin but it needs to provide the body for the unused interface");
    }

    @Override
    public void mediaPlayer() {
        System.out.println("MEdia player is on");
    }
}
