public class Principal {


    public Principal() {
        Corredor corre = new Corredor();
        for (int i = 0; i < 36; i++) {
            Corredor corre = new Corredor(Carrera);
            corre.setName("del pais " + (i + 1));
            corre.start();
        }

    }
}
