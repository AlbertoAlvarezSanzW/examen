import java.util.concurrent.Semaphore;

public class Pais extends Thread {

    private static final int MAXIMODECORREDORES = 1;
    private static final int GRUPO = 4;
    public int acabados = 0;
    public Semaphore corredorDentro = new Semaphore(MAXIMODECORREDORES, true);

    Principal call;

    public Pais(Principal callback) {
        this.call = callback;
    }


    @Override
    public void run() {
        for (int i = 0; i < GRUPO; i++) {

            Corredor corre = new Corredor(this);
            corre.setName("El Corredor " + (i + 1));
            corre.start();

        }
    }

    public void next(Corredor corredor, int tiempoCarrera) {
        try {
            corredorDentro.acquire();

            System.out.println(corredor.getName() + " del pais " + this.getName() + " esta en ello" );
            sleep(tiempoCarrera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void anteriorAcaba(Corredor corredor) {
        acabados++;
        corredorDentro.release();
        System.out.println(corredor.getName() + " del pais" + this.getName() + " ha acabado su parte");

        if (acabados >= 4) {
            System.out.println("SE HA FINALIZADO " + this.getName());
            call.setPaisGanador(this);
            call.incrementarPaisesTerminados();
        }
    }
}
