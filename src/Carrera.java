import java.util.Random;
import java.util.Random;
import java.util.concurrent.Semaphore;




// especificams la carrera con el maximo de corredores que vamos a tener



public class Carrera {
    Ppal prin;
    Carrera (Ppal prin){
        this.prin=prin;
    }
    public int numero= 109;
    public static final int MAX_GENTE = 9;
    public static Semaphore campo = new Semaphore(MAX_GENTE, true);

    public void empieza(Corredor corr) throws InterruptedException {
        campo.acquire();
    }
    // cosas para saber cuando ha acabado los hilos etc.
    public int hilosFinalizados = 0;

    // Cosas de puntuaciones chungas
    public Corredor jugadorConBonus = null;
    public Corredor corredorConMaximaPuntuacion = null;


    // bloque para calcular la puntuación

    public void expulsa() {
        if (hilosFinalizados == MAX_GENTE) {
            System.out.println("Hemos expulsado a los 5 ultimos...por pringados");
            for (int i = 0; i < 5; i++) {
                campo.release();
            }
        } else if (hilosFinalizados == 15) {
            System.out.println("Han acabado todos los hilos");
            System.out.println(corredorConMaximaPuntuacion.getName() + " es el que mas puntuacion ha obtenido con un total de:"
                    + corredorConMaximaPuntuacion.getPuntuacion());
        }
    }

    public synchronized void calcularPuntuacion(Corredor corredorConMaximaPuntuacion) {
        if (corredorConMaximaPuntuacion == null) {
            corredorConMaximaPuntuacion = corredorConMaximaPuntuacion;
        } else if (corredorConMaximaPuntuacion.getPuntuacion() > corredorConMaximaPuntuacion.getPuntuacion()) {
            corredorConMaximaPuntuacion = corredorConMaximaPuntuacion;
        }
    }

    public void comienzaCArr(Corredor corr){
        try {
            Random ejem = new Random();
            int dormir =ejem.nextInt(4000);
            Thread.sleep(dormir);

            int obst = 5;
            if(ejem.nextInt(9)!=obst){
                campo.release();
            }else{

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
