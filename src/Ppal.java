
public class Ppal {

    int MAX = 36;
    int MAX_PAISES = 9;
    int num=100;


    public String paises[]={"España","Alemania","Francia","Andorra","Austria","Brasil","Venezuela","Cataluña","Italia"};


    public Ppal(){
        Carrera carrerita = new Carrera(this);
        int aux= 0;
        for (int i=0;i<MAX;i++){
            Corredor corr = new Corredor(carrerita);
            if(aux==9)
                aux=0;
            corr.setName(paises[aux]+" "+(num+1));
            corr.start();
            num++;
            aux++;
        }
    }
}
