package OOPs__kunal.__Inheritance__Car__Examile;

public class Tesla implements Break,Engin,MediaPlayer{
    @Override
    public void brake() {
        System.out.println("Tesla break");
    }

    @Override
    public void petrol() {
        System.out.println("Tesla does not use petrol but it needs to provide the body for the unused interface ");
    }

    @Override
    public void electric() {
        System.out.println("Tesla is electric engin");
    }

    @Override
    public void mediaPlayer() {
        System.out.println("MEdia player is on");
    }
}
