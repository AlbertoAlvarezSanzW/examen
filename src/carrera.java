import java.util.concurrent.Semaphore;

public class carrera {

    private static final int MAX_CORREDOR = 9;
    private static final int MAX_CORREDORES = 36;
    public static Semaphore carrera = new Semaphore(MAX_CORREDOR, true);



    // cosas para saber cuando ha acabado los hilos etc.
    public int hilosFinalizados = 0;
}
