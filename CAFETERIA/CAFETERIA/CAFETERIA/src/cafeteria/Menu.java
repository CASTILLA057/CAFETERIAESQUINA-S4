/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafeteria;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Menu extends javax.swing.JFrame {

    private CAFETERIA objectCafeteria;
    private ListaReservas lista = new ListaReservas();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    public Menu(CAFETERIA cafeteria) {
        this.objectCafeteria = cafeteria;
        initComponents();

        Cliente_nuevo.setFocusPainted(false);
        gestion_reservas.setFocusPainted(false);
        Liberar_mesa.setFocusPainted(false);
        Estado_mesas.setFocusPainted(false);
        ConsultarCliente.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        Cliente_nuevo = new javax.swing.JButton();
        Estado_mesas = new javax.swing.JButton();
        gestion_reservas = new javax.swing.JButton();
        ConsultarCliente = new javax.swing.JButton();
        Liberar_mesa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CantidadClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 105, 96));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFETERÍA LA ESQUINA");
        jLabel1.setIconTextGap(10);
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setOpaque(true);

        Cliente_nuevo.setBackground(new java.awt.Color(178, 223, 219));
        Cliente_nuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cliente_nuevo.setForeground(new java.awt.Color(0, 85, 77));
        Cliente_nuevo.setText("Nuevo Cliente");
        Cliente_nuevo.setBorder(new javax.swing.border.MatteBorder(null));
        Cliente_nuevo.setOpaque(true);
        Cliente_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente_nuevoActionPerformed(evt);
            }
        });

        Estado_mesas.setBackground(new java.awt.Color(178, 223, 219));
        Estado_mesas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Estado_mesas.setForeground(new java.awt.Color(0, 85, 77));
        Estado_mesas.setText("Estado Mesas");
        Estado_mesas.setBorder(new javax.swing.border.MatteBorder(null));
        Estado_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estado_mesasActionPerformed(evt);
            }
        });

        gestion_reservas.setBackground(new java.awt.Color(178, 223, 219));
        gestion_reservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gestion_reservas.setForeground(new java.awt.Color(0, 85, 77));
        gestion_reservas.setText("Gestion Reservas");
        gestion_reservas.setBorder(new javax.swing.border.MatteBorder(null));
        gestion_reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_reservasActionPerformed(evt);
            }
        });

        ConsultarCliente.setBackground(new java.awt.Color(178, 223, 219));
        ConsultarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConsultarCliente.setForeground(new java.awt.Color(0, 85, 77));
        ConsultarCliente.setText("Consultar Cliente");
        ConsultarCliente.setBorder(new javax.swing.border.MatteBorder(null));
        ConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarClienteActionPerformed(evt);
            }
        });

        Liberar_mesa.setBackground(new java.awt.Color(178, 223, 219));
        Liberar_mesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Liberar_mesa.setForeground(new java.awt.Color(0, 85, 77));
        Liberar_mesa.setText("Liberar Mesa");
        Liberar_mesa.setBorder(new javax.swing.border.MatteBorder(null));
        Liberar_mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Liberar_mesaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 105, 96));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LA CAFETERÍA DE TODOS  ");
        jLabel2.setOpaque(true);

        CantidadClientes.setBackground(new java.awt.Color(178, 223, 219));
        CantidadClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CantidadClientes.setForeground(new java.awt.Color(0, 85, 77));
        CantidadClientes.setText("Consultar Cantidad");
        CantidadClientes.setBorder(new javax.swing.border.MatteBorder(null));
        CantidadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cliente_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(Liberar_mesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CantidadClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gestion_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(Estado_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Liberar_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CantidadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cliente_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente_nuevoActionPerformed
        objectCafeteria.nuevo_cliente();
    }//GEN-LAST:event_Cliente_nuevoActionPerformed

    private void Estado_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estado_mesasActionPerformed
        objectCafeteria.mostrarEstadoMesas();
    }//GEN-LAST:event_Estado_mesasActionPerformed

    private void gestion_reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_reservasActionPerformed
        objectCafeteria.mostrar_informacion();
    }//GEN-LAST:event_gestion_reservasActionPerformed

    private void ConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarClienteActionPerformed
        String input = JOptionPane.showInputDialog("Ingrese el documento del cliente:");
        if (input != null && !input.isEmpty()) {
            try {
                long documento = Long.parseLong(input);
                String resultado = objectCafeteria.ConsultarCliente(documento);
                JOptionPane.showMessageDialog(null, resultado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Documento inválido, debe ser numérico.");
            }
        }

    }//GEN-LAST:event_ConsultarClienteActionPerformed

    private void Liberar_mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Liberar_mesaActionPerformed
        objectCafeteria.liberarMesa();

    }//GEN-LAST:event_Liberar_mesaActionPerformed

    private void CantidadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadClientesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, """
                                                Las consultas disponibles son las siguientes:
                                                1. Total de clientes en la semana.
                                                2. Total de clientes por d\u00eda de la semana.
                                                3. Total de clientes por mesas en la semana.
                                                4. Dia de la semana que mas clientes llegan.
                                                ------Seleccione otro valor para salir-------
                                                   """);
        try {
            String input = JOptionPane.showInputDialog("Ingrese la opcion deseada").trim();
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se ingresó ningun valor valido");
                return;
            }
            int Opcion = Integer.parseInt(input);
            if (Opcion < 1 || Opcion > 4) {
                return;
            }
            ListaReservas lista = objectCafeteria.getListaReservas();
            switch (Opcion) {
                case 1:
                    JOptionPane.showMessageDialog(rootPane, "Total de clientes en la semana: " + lista.totalClientesSemana());
                    break;
                case 2:
                    String dia = JOptionPane.showInputDialog("Ingrese un dia de la semana: ");
                    if(dia!=null && !dia.isEmpty()){
                        int total = lista.totalClintesPorDia(dia);
                        if(total == 0){
                            JOptionPane.showMessageDialog(rootPane, "No hay reservas para el dia: " + dia);
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Total clientes para el dia: " + dia + ": " + lista.totalClintesPorDia(dia));
                    }
                    break;
                case 3:
                    String inputMesa = JOptionPane.showInputDialog("Ingrese el numero de la mesa");
                    if (inputMesa == null || inputMesa.trim().isEmpty()) {
                        return;
                    }
                    if (!inputMesa.trim().matches("\\d+")) {
                        JOptionPane.showMessageDialog(rootPane, "Ingrese un número válido");
                        return;
                    }

                    int NumMesa = Integer.parseInt(inputMesa.trim());

                    if (NumMesa < 1 || NumMesa > objectCafeteria.getArr_mesas().length) {
                        JOptionPane.showMessageDialog(rootPane, "Número de mesa fuera de rango. Debe ser entre 1 y " + objectCafeteria.getArr_mesas().length);
                        return;
                    }

                    JOptionPane.showMessageDialog(rootPane, "Clientes en la mesa " + NumMesa + ": " + lista.totalClientesPorMesa(NumMesa));
                    break;

                case 4:
                    
                    JOptionPane.showMessageDialog(rootPane, "Los dias con mas clientes es: " + lista.diaConMasClientes());
                    break;

                default:
                    JOptionPane.showMessageDialog(rootPane, "Opcion no valida, Intente de nuevo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Opcion no valida");
           
        }
    }//GEN-LAST:event_CantidadClientesActionPerformed

    public static void main(String args[]) {
        CAFETERIA cafeteria = new CAFETERIA();
        boolean bandera = false;

        while (!bandera) {
            bandera = cafeteria.abrir_programa();
            if (!bandera) {
                JOptionPane.showMessageDialog(null,
                        "NO SE PUEDE INICIAR EL PROGRAMA \n Digite los valores esperados");
            }
        }

        java.awt.EventQueue.invokeLater(() -> new Menu(cafeteria).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CantidadClientes;
    private javax.swing.JButton Cliente_nuevo;
    private javax.swing.JButton ConsultarCliente;
    private javax.swing.JButton Estado_mesas;
    private javax.swing.JButton Liberar_mesa;
    private javax.swing.JButton gestion_reservas;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
