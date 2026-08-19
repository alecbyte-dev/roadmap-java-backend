package scratch;
public class Main {

    public static void main(String[] args) {

        //Inicialización de variables con datos primitivos - R1
        char categoriaVehiculo = 'C';
        double tiempoPermanencia = 4.85;
        short numEspacio = 300;
        boolean estadoPago = true;

        //Narrowing del tiempo de permanencia (double -> int) - Cast explícito - R2
        int tiempoTruncado = (int) tiempoPermanencia;

        //Narrowing de número de espacio (short -> byte) - Cast explícito - R3
        byte numEspacioByte = (byte) numEspacio;

        //Bloque independiente con variable de scope reducida - R4
        {
            char turnoOperador = 'T';

            //Reporte de cierre de turno sin concatenación - R5
            System.out.println(categoriaVehiculo);
            System.out.println(tiempoPermanencia);
            System.out.println(tiempoTruncado);
            System.out.println(numEspacio);
            System.out.println(numEspacioByte);
            System.out.println(estadoPago);
            System.out.println(turnoOperador);
        }
    }
}