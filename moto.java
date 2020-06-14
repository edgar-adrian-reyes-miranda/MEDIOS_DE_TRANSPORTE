package MEDIOS_TRANSPORTE;

public class moto extends vehiculo{
    int altura;
    int ancho; 

    public moto(int ruedas, int matricula, int puertas, int pasajeros) {
        super(ruedas, matricula, puertas, pasajeros);
    }
     public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura=altura;
    }
    public int getAncho(){
        return altura;
    }

    public void setAncho(int ancho){
        this.ancho=ancho;
    }
}
