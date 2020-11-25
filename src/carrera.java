import java.util.concurrent.Semaphore;

public class carrera {

    private static final int MAX_CORREDOR = 9;
    private static final int MAX_CORREDORES = 36;
    public static Semaphore carrera = new Semaphore(MAX_CORREDOR, true);



    // cosas para saber cuando ha acabado los hilos etc.
    public int hilosFinalizados = 0;

    public void empieza(Corredor corredor) throws InterruptedException {
        // Hacemos que el jugador entre
        carrera.acquire();
        // mostramos que jugador ha entrado.
        System.out.println(corredor.getName() + " empieza a correr...");
    }

    // expulso a los 5 primeros al hacer la tanda de los 10 primeros, LOS MATO.
    public void expulsa() {
        if (hilosFinalizados == MAX_CORREDOR) {
            System.out.println("ha acabado la carrera, que entre el siguiente ");
            for (int i = 0; i < ; i++) {
                carrera.release();
            }
        } else if (MAX_CORREDORES == 36) {
            System.out.println("Han acabado todos los los corredores");
            System.out.println(jugadorConMaximaPuntuacion.getName() + " es el que mas puntuacion ha obtenido con un total de:"
                    + jugadorConMaximaPuntuacion.getPuntuacion());
        }
    }

}
