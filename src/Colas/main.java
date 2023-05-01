package Colas;
import Clases.PuntoEmbarqueEquipaje;

/**
 *
 * @author roilanrodriguez55
 */
public class main {

    public static void main(String[] args) {

        PuntoEmbarqueEquipaje pee = new PuntoEmbarqueEquipaje();
        
        int c = pee.llenarCarro(70);
        System.out.println(c);

    }
}
