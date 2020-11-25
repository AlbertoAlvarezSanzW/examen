import java.util.Random;
import java.util.Random;
import java.util.concurrent.Semaphore;

// especificams la carrera con el maximo de corredores que vamos a tener
public class Carrera {

    Ppal prin;
    Carrera (Ppal prin){
        this.prin=prin;
    }
    public static final int MAX_GENTE = 9;

    public static Semaphore campo = new Semaphore(MAX_GENTE, true);

    public void empieza(Corredor corr) throws InterruptedException {
        campo.acquire();
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

    public void ambulancia(){

    }


}
