package Clases;

import Colas.LinkedQueue;

public class PuntoEmbarqueEquipaje {

    public LinkedQueue<Equipaje> estera1;
    public LinkedQueue<Equipaje> estera2;
    public LinkedQueue<Equipaje> estera3;

    public PuntoEmbarqueEquipaje() {
        estera1 = new LinkedQueue<>();
        estera2 = new LinkedQueue<>();
        estera3 = new LinkedQueue<>();

        estera1.add(new Equipaje("01", 10));
        estera1.add(new Equipaje("02", 12));
        estera1.add(new Equipaje("03", 32));
        estera1.add(new Equipaje("04", 2));
        estera1.add(new Equipaje("05", 40));

        estera2.add(new Equipaje("06", 9));
        estera2.add(new Equipaje("07", 14));
        estera2.add(new Equipaje("08", 25));
        estera2.add(new Equipaje("09", 3));
        estera2.add(new Equipaje("10", 51));

        estera3.add(new Equipaje("11", 13));
        estera3.add(new Equipaje("12", 11));
        estera3.add(new Equipaje("13", 4));
        estera3.add(new Equipaje("14", 22));
        estera3.add(new Equipaje("15", 41));
    }

    public int llenarCarro(double capacidad) {

        int cantidadEquipajes = 0;

        while (capacidad > 0 && (!estera1.isEmpty() || !estera2.isEmpty() || !estera3.isEmpty())) {
            Equipaje equipaje1 = estera1.peek();
            Equipaje equipaje2 = estera2.peek();
            Equipaje equipaje3 = estera3.peek();

            Equipaje equipajeSeleccionado;

            if (equipaje1 == null && equipaje2 == null) {
                equipajeSeleccionado = equipaje3;
            } else if (equipaje1 == null && equipaje3 == null) {
                equipajeSeleccionado = equipaje2;
            } else if (equipaje2 == null && equipaje3 == null) {
                equipajeSeleccionado = equipaje1;
            } else if (equipaje1 == null) {
                equipajeSeleccionado = (equipaje2.getPeso() < equipaje3.getPeso()) ? equipaje2 : equipaje3;
            } else if (equipaje2 == null) {
                equipajeSeleccionado = (equipaje1.getPeso() < equipaje3.getPeso()) ? equipaje1 : equipaje3;
            } else if (equipaje3 == null) {
                equipajeSeleccionado = (equipaje1.getPeso() < equipaje2.getPeso()) ? equipaje1 : equipaje2;
            } else {
                if (equipaje1.getPeso() <= equipaje2.getPeso() && equipaje1.getPeso() <= equipaje3.getPeso()) {
                    equipajeSeleccionado = estera1.poll();
                } else if (equipaje2.getPeso() <= equipaje1.getPeso() && equipaje2.getPeso() <= equipaje3.getPeso()) {
                    equipajeSeleccionado = estera2.poll();
                } else {
                    equipajeSeleccionado = estera3.poll();
                }
            }

            if (equipajeSeleccionado.getPeso() <= capacidad) {
                cantidadEquipajes++;
                capacidad -= equipajeSeleccionado.getPeso();
            } else {
                break;
            }
        }

        return cantidadEquipajes;
    }
}
