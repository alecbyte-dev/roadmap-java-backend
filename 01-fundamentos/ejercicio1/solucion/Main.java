package scratch.ejercicio1;
public class Main {

    public static void main(String[] args) {

        //Inicializacion de variables con datos primitivos - R1
        char idSensor = 'A';
        double lecturaTemp = 23.78;
        short lote = 200;
        boolean estadoCalibracion = true;

        //Narrowing del valor de la temperatura (double -> int) cast explícito - R2
        int tempInt = (int) lecturaTemp;

        //Narrowing del numero del lote (short -> byte) cast explícito - R3
        byte loteCast = (byte) lote;

        {
            //Bloque independiente con variable con scope reducido - R4
            char turnoInstalacion = 'M';

            //Reporte del turno de instalación sin concatenación - R5
            System.out.println(idSensor);
            System.out.println(lecturaTemp);
            System.out.println(tempInt);
            System.out.println(lote);
            System.out.println(loteCast);
            System.out.println(estadoCalibracion);
            System.out.println(turnoInstalacion);
        }
    }
}
