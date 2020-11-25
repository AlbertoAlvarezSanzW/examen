

public class Corredor extends Thread{

    Carrera car;
    int puntuacion;

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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
