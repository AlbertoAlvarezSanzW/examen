

public class Corredor extends Thread{
    Carrera car;

    public Corredor(Carrera car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            car.empieza(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName());
    }
}
