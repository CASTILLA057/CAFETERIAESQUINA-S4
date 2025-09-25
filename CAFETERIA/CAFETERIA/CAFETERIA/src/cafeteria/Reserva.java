package cafeteria;

public class Reserva {
    private long clienteId;
    private int mesa;
    private String dia;
    private String fechaHora;

    public Reserva(long clienteId, int mesa, String dia, String fechaHora) {
        this.clienteId = clienteId;
        this.mesa = mesa;
        this.dia = dia;
        this.fechaHora = fechaHora;
    }

    public long getClienteId() { return clienteId; }
    public int getMesa() { return mesa; }
    public String getDia() { return dia; }
    public String getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return "Reserva ~~> Cliente ID: " + clienteId +
               ", Mesa: " + mesa +
               ", Día: " + dia +
               ", Fecha/Hora: " + fechaHora;
    }
}
