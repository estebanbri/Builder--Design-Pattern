public class Main {

    public static void main(String[] args) {
        Telefono telefono = new Telefono.Builder()
                .parteFrontal("AMOLED")
                .parteTrasera("PLASTICO")
                .build();

        System.out.print(telefono);
    }


}

