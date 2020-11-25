import java.util.Random;

public class Corredor extends Thread{


    public Pais pais;

    public Corredor(Pais pais) {
        this.pais = pais;
    }

    @Override
    public void run() {
        Random random = new Random();
        int tiempo = 0;

        tiempo = random.nextInt(4000)+1000;


        pais.next(this,tiempo);


        if(random.nextInt(100) <= 100 ){
            pais.anteriorAcaba(this);

        }else{

            System.out.println("creo que estoy lesionado");
            pais.anteriorAcaba(this);
        }

    }
}
