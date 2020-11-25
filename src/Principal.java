public class Principal{
    private static final int PAISESPORTIEMPO = 9;

    // con esto obtengo cuantos paises han terminado
    public int paisesTerminados = 0;

    public static Pais paisWIN;




    public Pais getPaisGanador() {
        return paisWIN;
    }

    public int getPaisesTerminados() {
        return paisesTerminados;
    }

    public synchronized void setPaisGanador(Pais ganador) {
        if(Principal.paisWIN == null){
            Principal.paisWIN = ganador;

        }
    }

    public Principal() {
        for(int i = 0;i<PAISESPORTIEMPO;i++){
            Pais pais = new Pais(this);
            pais.setName("pais "+(i+1));
            pais.start();
        }
    }

    public void incrementarPaisesTerminados(){
        this.paisesTerminados++;
        if(paisesTerminados == 9){
            System.out.println("Ha ganado el "+paisWIN.getName());
        }
    }
}
