package MEDIOS_TRANSPORTE;

import java.util.Scanner;

public class PRINCI_MENU {
    public static void main(String[] args) {
        
         Scanner leer=new Scanner(System.in);

        vehiculo a[]=new vehiculo[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Ingrese  las ruedas que tiene el medio de transporte: " + i);
            int ruedas=leer.nextInt();
            System.out.println("Ingrese la matricula: " + i);
            int matricula=leer.nextInt();
            System.out.println("Total de puertas que tiene el vehiculo: " + i);
            int puertas=leer.nextInt();
            System.out.println("Ingrese cuantos pasajeros caben en el vehiculo: " + i);
            int pasajeros=leer.nextInt();
            a[i]= new vehiculo(ruedas,matricula,puertas,pasajeros);
            if(a[i].getRuedas()==4 && (a[i].getPuertas()==4 || a[i].getPuertas()==2 ) && a[i].getPasajeros()<=5){
                System.out.println("El vehiculo " + i + " es un Coche");
            }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()<=2){
                System.out.println("El vehiculo " + i + " es una Moto");
            }else if(a[i].getRuedas()==0 && a[i].getPuertas()==0 && a[i].getPasajeros()>0){
                System.out.println("El vehiculo " + i + " es una Lancha");
            }else{
                System.out.println("Puede que haya ingresado numeros negativos o el vehiculo no se encuentra registrado en este programa");
            }
    }
    
    }
    }
