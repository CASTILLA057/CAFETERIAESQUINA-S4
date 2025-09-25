package cafeteria;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ListaReservas {

    private Nodo cabeza;

    
    private static class Nodo {
        Reserva reserva;
        Nodo siguiente;

        public Nodo(Reserva reserva) {
            this.reserva = reserva;
            this.siguiente = null;
        }
    }

    public ListaReservas() {
        this.cabeza = null;
    }

    public void agregarReserva(Reserva reserva) {
        Nodo nuevo = new Nodo(reserva);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temporal = cabeza;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo;
        }
    }

    public void mostrarReservas() {
        Nodo actual = cabeza;
        if (actual == null) {
            JOptionPane.showMessageDialog(null, "No hay reservas aún");
        }
        while (actual != null) {
            JOptionPane.showMessageDialog(null, actual.reserva);
            actual = actual.siguiente;
        }
    }
    
    public int totalClientesSemana(){
        int total = 0;
        Nodo actual = cabeza;
        while(actual != null){
            total++;
            actual = actual.siguiente;
        }
        return total;
    }
    
    public int totalClintesPorDia(String dia){
        int total = 0;
        Nodo actual = cabeza;
        while(actual != null){
            if(actual.reserva.getDia().equalsIgnoreCase(dia)){
                total++;
            }
            actual = actual.siguiente;
        }
        return total;
    
    }
    
    public int totalClientesPorMesa(int NumMesa){
        int total = 0;
        Nodo actual = cabeza;
        while(actual != null){
        if(actual.reserva.getMesa() == NumMesa){
            total++; 
        }
        actual = actual.siguiente;
        }
        return total;
    }
    
    public String diaConMasClientes() {
        if (cabeza == null) return "No hay reservas aún.";
        Map<String, Integer> conteo = new HashMap<>();
        Nodo actual = cabeza;
        while (actual != null) {
            String d = actual.reserva.getDia();
            if (d != null) {
                d = d.trim();
                conteo.put(d, conteo.getOrDefault(d, 0) + 1);
            }
            actual = actual.siguiente;
        }
        if (conteo.isEmpty()) return "No hay reservas con día definido.";
        String mejorDia = null;
        int max = -1;
        for (Map.Entry<String, Integer> e : conteo.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                mejorDia = e.getKey();
            }
        }
        return mejorDia + " (" + max + " clientes)";
    }
  
public String consultarCliente(long clienteId) {
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.reserva.getClienteId() == clienteId) {
            int mesa = actual.reserva.getMesa();
            String dia = actual.reserva.getDia();
            int totalMesaDia = 0;

            Nodo aux = cabeza;
            while (aux != null) {
                if (aux.reserva.getMesa() == mesa &&
                    aux.reserva.getDia() != null &&
                    aux.reserva.getDia().equalsIgnoreCase(dia)) {
                    totalMesaDia++;
                }
                aux = aux.siguiente;
            }

            return "Cliente con documento " + clienteId +
                   " reservado en mesa " + mesa +
                   " el día " + dia +
                   ". Total de clientes en esa mesa ese día: " + totalMesaDia;
        }
        actual = actual.siguiente;
    }

    return null;
}
}
