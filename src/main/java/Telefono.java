public class Telefono {

    // Paso 1 : creamos clase Builder
    public static class Builder{

        private String parteFrontal;
        private String parteTrasera;

        // Paso 2 : metodos para setear valores al builder .XXX()
        public Builder parteFrontal(String parteFrontal){
            this. parteFrontal = parteFrontal;
            return this;
        }
        public Builder parteTrasera(String parteTrasera){
            this. parteTrasera = parteTrasera;
            return this;
        }

        // Paso 3 : ultimo metodo que calleo asi me retorna un obj Telefono
        public Telefono build(){
            return new Telefono(this);
        }
    }

    private String parteFrontal;
    private String parteTrasera;

    // Paso 4: A cada Telefono property las instanciamos con el valor del objeto Builder
    private Telefono(Builder builder){
        this.parteFrontal = builder.parteFrontal;
        this.parteTrasera = builder.parteTrasera;
    }

    public String toString(){
        return this.parteFrontal +", "+ this.parteTrasera;
    }


}
