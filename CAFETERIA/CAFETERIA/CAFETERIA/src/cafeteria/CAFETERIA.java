package cafeteria;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CAFETERIA {

    private long id;
    private int mesas;
    private boolean estado;
    private String numero_mesas;
    private String[] arr_mesas;
    private String[] arr_semana;
    private String[][] matriz;
    private final ListaReservas listaReservas = new ListaReservas();
    
    public String obtenerHoraActual() {
        
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm a");
        
        
        return ahora.format(formato);
        
    }

    public boolean nuevo_cliente() {
        
        boolean id_valido = false;
        while (!id_valido) {
            try {
                String ingreso_id = JOptionPane.showInputDialog("Ingresa número de identificación (o escribe 'salir' para cancelar):");

                if (ingreso_id == null || ingreso_id.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ingresó el ID.");
                    continue;
                }

                ingreso_id = ingreso_id.trim();

                if (ingreso_id.equalsIgnoreCase("salir")) {
                    JOptionPane.showMessageDialog(null, "Proceso cancelado.");
                    break;
                }
                

                setId(Long.parseLong(ingreso_id));
                id_valido = true;

                registrarMesa();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.");
            }   
        }
        return id_valido;
        
    }

public void registrarMesa() {
    
    
    StringBuilder Estado = new StringBuilder("Estado de las mesas en la semana:\n\n");
    for (int f = 0; f < getArr_mesas().length; f++) {
        Estado.append("Mesa ").append(f + 1).append(":\n");
        for (int c = 0; c < getArr_semana().length; c++) {
            Estado.append("   ")
                  .append(getArr_semana()[c])
                  .append(": ")
                  .append(getMatriz()[f][c])
                  .append("\n");
        }
        Estado.append("\n");
    }

    JTextArea textArea = new JTextArea(Estado.toString(), 20, 50);
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    JOptionPane.showMessageDialog(null, scrollPane, "Estado de las Mesas", JOptionPane.INFORMATION_MESSAGE);

    int input_mesa_int = -1;
    int indice_dia = -1;
    String dia = "";

    
    while (true) {
        try {
            String input_mesa_string = JOptionPane.showInputDialog("Ingrese el número de la mesa (1 - " + getArr_mesas().length + ")");
            if (input_mesa_string == null) return; 

            input_mesa_int = Integer.parseInt(input_mesa_string.trim());

            if (input_mesa_int >= 1 && input_mesa_int <= getArr_mesas().length) {
                break; 
            } else {
                JOptionPane.showMessageDialog(null, "️Número de mesa incorrecto.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "️Ingrese un número válido.");
        }
    }

    while (true) {
        dia = JOptionPane.showInputDialog("Ingrese el día (lunes - sabado)");
        if (dia == null) return; 

        for (int i = 0; i < getArr_semana().length; i++) {
            if (getArr_semana()[i].equalsIgnoreCase(dia)) {
                indice_dia = i;
                break;
            }
        }

        if (indice_dia != -1) {
            break; 
        } else {
            JOptionPane.showMessageDialog(null, "️ Los días válidos son de lunes a sabado.");
        }
    }

    if (getMatriz()[input_mesa_int - 1][indice_dia].equals("libre")) {
        getMatriz()[input_mesa_int - 1][indice_dia] = "Perfecto reserva por cliente id: " + getId();

        Reserva guardar = new Reserva(getId(), input_mesa_int, dia, obtenerHoraActual());
        listaReservas.agregarReserva(guardar);

        JOptionPane.showMessageDialog(null, "Mesa " + input_mesa_int + " ocupada el " + dia 
            + " por cliente con id: " + getId() + " a las " + obtenerHoraActual());
    } else {
        JOptionPane.showMessageDialog(null, "️La mesa ya está ocupada ese día.");
    }
}

    public void mostrar_informacion(){
        listaReservas.mostrarReservas();
    
    }

    public boolean abrir_programa() {
        
        try {
            setNumero_mesas(JOptionPane.showInputDialog(
                null,
                "Bienvenido a la CAFETERÍA LA ESQUINA\nPor favor ingrese el número de mesas"
            ));

            if (getNumero_mesas() == null || getNumero_mesas().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ingresó ningún valor");
                return false;
            }

            int mesas = Integer.parseInt(getNumero_mesas().trim());
            if (mesas <= 0) {
                JOptionPane.showMessageDialog(null, "El número de mesas debe ser mayor a cero.");
                return false;
            }
            

            setMesas(mesas);
            inicializarEstructuras();

            return true;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde al formato numérico indicado");
            return false;
        }
    }
    
    private void inicializarEstructuras() {
        setArr_mesas(new String[getMesas()]);

        setArr_semana(new String[6]);
        getArr_semana()[0] = "lunes";
        getArr_semana()[1] = "martes";
        getArr_semana()[2] = "miercoles";
        getArr_semana()[3] = "jueves";
        getArr_semana()[4] = "viernes";
        getArr_semana()[5] = "sabado";

        setMatriz(new String[getArr_mesas().length][getArr_semana().length]);
        for (int i = 0; i < getArr_mesas().length; i++) {
            for (int j = 0; j < getArr_semana().length; j++) {
                getMatriz()[i][j] = "libre";
            }
        }
    }

    public void mostrarEstadoMesas() {
        StringBuilder estado = new StringBuilder("Estado de las mesas en la semana:\n");
        for (int f = 0; f < getArr_mesas().length; f++) {
            estado.append("Mesa ").append(f + 1).append("\n");
            for (int c = 0; c < getArr_semana().length; c++) {
                estado.append("  ").append(getArr_semana()[c]).append(": ").append(getMatriz()[f][c]).append("\n");
            }
            estado.append("\n");
        }
        
        javax.swing.JTextArea textArea = new javax.swing.JTextArea(estado.toString());
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400)); // Tamaño más grande de la ventana

    
        JOptionPane.showMessageDialog(null, scrollPane, "Estado de Mesas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void liberarMesa() {
        
        boolean hayReservas = false;
        for (int i = 0; i < getArr_mesas().length; i++) {
            for (int j = 0; j < getArr_semana().length; j++) {
                if (!getMatriz()[i][j].equalsIgnoreCase("libre")) {
                    hayReservas = true;
                    break;}
            }
            if (hayReservas) break;
        }
        
        if (!hayReservas) {
            JOptionPane.showMessageDialog(null, "No hay reservas registradas. No se puede liberar ninguna mesa.");
            return;
        }
    
    
        int numeroMesa = -1;
        int indiceDia = -1;
        String dia = "";
        
        
        while (true) {
            try {
                String inputMesa = JOptionPane.showInputDialog("Ingrese el número de la mesa a liberar (1 - " + getArr_mesas().length + "):");
                if (inputMesa == null || inputMesa.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número de mesa.");
                    continue;
                }
                inputMesa = inputMesa.trim();
                
                if (!inputMesa.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                    continue;
                }
                numeroMesa = Integer.parseInt(inputMesa);
                
                if (numeroMesa < 1 || numeroMesa > getArr_mesas().length) {
                    JOptionPane.showMessageDialog(null, "Número de mesa fuera de rango. Debe ser entre 1 y " + getArr_mesas().length);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Número de mesa no válido.");
            }
        }
        
        
        
        while (true) {
            dia = JOptionPane.showInputDialog("Ingrese el día de la semana de la mesa a liberar:");
            if (dia == null || dia.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un día.");
                continue;
            }
            
            dia = dia.trim();
            for (int i = 0; i < getArr_semana().length; i++) {
                if (getArr_semana()[i].equalsIgnoreCase(dia)) {
                    indiceDia = i;
                    break;
                }
            }
            
            if (indiceDia == -1) {
                JOptionPane.showMessageDialog(null, "Día no válido. Ingrese uno de lunes a sábado.");
                continue;
            }
            break;
        }
        
        if (getMatriz()[numeroMesa - 1][indiceDia].equalsIgnoreCase("libre")) {
            JOptionPane.showMessageDialog(null, "La mesa " + numeroMesa + " ya está libre el día " + getArr_semana()[indiceDia]);
            return;
        }
        
        getMatriz()[numeroMesa - 1][indiceDia] = "libre";
        
        JOptionPane.showMessageDialog(null, "La mesa " + numeroMesa + " ha sido liberada el día " + getArr_semana()[indiceDia]);
}
    
    

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public int getMesas() {
        return mesas;
    }


    public void setMesas(int mesas) {
        this.mesas = mesas;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String getNumero_mesas() {
        return numero_mesas;
    }

    public void setNumero_mesas(String numero_mesas) {
        this.numero_mesas = numero_mesas;
    }

    public String[] getArr_mesas() {
        return arr_mesas;
    }

    public void setArr_mesas(String[] arr_mesas) {
        this.arr_mesas = arr_mesas;
    }


    public String[] getArr_semana() {
        return arr_semana;
    }

    public void setArr_semana(String[] arr_semana) {
        this.arr_semana = arr_semana;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public ListaReservas getListaReservas() {
        return listaReservas;
    }

    String ConsultarCliente(long documento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}