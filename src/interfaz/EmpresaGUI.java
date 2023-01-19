/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import BD.GestionBD;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author damm
 */
public class EmpresaGUI extends javax.swing.JFrame {

    // Objeto para conectarno a la BD
    GestionBD conexion;

    // Listados de empleados y departamentos
    Departamentos listaDepartamentos;
    Empleados listaEmpleados;

    // Modelo JList y ComboBox de Departamentoa y Empleados
    DefaultListModel modeloJlistDptos;
    DefaultComboBoxModel modeloComboDptos;
    DefaultListModel modeloJlistEmpleados;
    DefaultComboBoxModel modeloComboEmpleados;

    /**
     * Creates new form Interfaz
     */
    public EmpresaGUI() {
        // Inicializamos los datos de Modelos
        modeloJlistDptos = new DefaultListModel();
        modeloJlistEmpleados = new DefaultListModel();

        initComponents();

        // Inicializamos listado de departamentos y empleados
        listaDepartamentos = new Departamentos();
        listaEmpleados = new Empleados();

        conexion = new GestionBD("localhost", "javier",
                "javier", "empresa"
        );

        listaDepartamentos = conexion.listarDepartamentos();
        listaEmpleados = conexion.listarEmpleados();

        cargarDepartamentos();
        cargarEmpleados();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TabEmpleados = new javax.swing.JPanel();
        PanelListadoEmpleados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEmpleados = new javax.swing.JList<>();
        PanelDetalleEmpleados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JTexFieldEmpleadoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTexFieldEmpleadoNombre = new javax.swing.JTextField();
        BtGuardarEmpleado = new javax.swing.JButton();
        BtNuevoEmpleado = new javax.swing.JButton();
        BtBorrarEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTexFieldEmpleadoApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTexFieldEmpleadoEmail = new javax.swing.JTextField();
        CbEmpleadosDpto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        spinnerEmpleadoSalario = new javax.swing.JSpinner();
        TabDepartamentos = new javax.swing.JPanel();
        PanelListadoDepartamentos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDpto = new javax.swing.JList<>();
        PanelDetalleDepartamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTexFieldDptoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTexFieldDptoNombre = new javax.swing.JTextField();
        BtGuardarDpto = new javax.swing.JButton();
        BtNuevoDpto = new javax.swing.JButton();
        BtBorrarDpto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelListadoEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado:"));

        jListEmpleados.setModel(modeloJlistEmpleados);
        jScrollPane2.setViewportView(jListEmpleados);

        javax.swing.GroupLayout PanelListadoEmpleadosLayout = new javax.swing.GroupLayout(PanelListadoEmpleados);
        PanelListadoEmpleados.setLayout(PanelListadoEmpleadosLayout);
        PanelListadoEmpleadosLayout.setHorizontalGroup(
            PanelListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListadoEmpleadosLayout.setVerticalGroup(
            PanelListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDetalleEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle:"));

        jLabel3.setText("ID:");

        JTexFieldEmpleadoID.setEditable(false);
        JTexFieldEmpleadoID.setPreferredSize(new java.awt.Dimension(70, 23));

        jLabel4.setText("Nombre:");

        BtGuardarEmpleado.setText("GUARDAR");

        BtNuevoEmpleado.setText("NUEVO");

        BtBorrarEmpleado.setText("BORRAR");
        BtBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Salario");

        jLabel7.setText("Email");

        JTexFieldEmpleadoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTexFieldEmpleadoEmailActionPerformed(evt);
            }
        });

        CbEmpleadosDpto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Departamento");

        spinnerEmpleadoSalario.setModel(new javax.swing.SpinnerNumberModel(1017, 1017, null, 10));

        javax.swing.GroupLayout PanelDetalleEmpleadosLayout = new javax.swing.GroupLayout(PanelDetalleEmpleados);
        PanelDetalleEmpleados.setLayout(PanelDetalleEmpleadosLayout);
        PanelDetalleEmpleadosLayout.setHorizontalGroup(
            PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDetalleEmpleadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDetalleEmpleadosLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(BtGuardarEmpleado)))
                        .addGap(18, 18, 18)
                        .addComponent(BtNuevoEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(BtBorrarEmpleado))
                    .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JTexFieldEmpleadoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTexFieldEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTexFieldEmpleadoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTexFieldEmpleadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbEmpleadosDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerEmpleadoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelDetalleEmpleadosLayout.setVerticalGroup(
            PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTexFieldEmpleadoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTexFieldEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTexFieldEmpleadoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerEmpleadoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTexFieldEmpleadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbEmpleadosDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGuardarEmpleado)
                    .addComponent(BtNuevoEmpleado)
                    .addComponent(BtBorrarEmpleado))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout TabEmpleadosLayout = new javax.swing.GroupLayout(TabEmpleados);
        TabEmpleados.setLayout(TabEmpleadosLayout);
        TabEmpleadosLayout.setHorizontalGroup(
            TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpleadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(PanelListadoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDetalleEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        TabEmpleadosLayout.setVerticalGroup(
            TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelListadoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDetalleEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", TabEmpleados);

        PanelListadoDepartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado:"));

        jListDpto.setModel(modeloJlistDptos);
        jScrollPane1.setViewportView(jListDpto);

        javax.swing.GroupLayout PanelListadoDepartamentosLayout = new javax.swing.GroupLayout(PanelListadoDepartamentos);
        PanelListadoDepartamentos.setLayout(PanelListadoDepartamentosLayout);
        PanelListadoDepartamentosLayout.setHorizontalGroup(
            PanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListadoDepartamentosLayout.setVerticalGroup(
            PanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoDepartamentosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDetalleDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle:"));

        jLabel1.setText("ID:");

        JTexFieldDptoID.setEditable(false);
        JTexFieldDptoID.setPreferredSize(new java.awt.Dimension(70, 23));

        jLabel2.setText("Nombre:");

        BtGuardarDpto.setText("GUARDAR");

        BtNuevoDpto.setText("NUEVO");

        BtBorrarDpto.setText("BORRAR");
        BtBorrarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarDptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDetalleDepartamentoLayout = new javax.swing.GroupLayout(PanelDetalleDepartamento);
        PanelDetalleDepartamento.setLayout(PanelDetalleDepartamentoLayout);
        PanelDetalleDepartamentoLayout.setHorizontalGroup(
            PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                .addGroup(PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(JTexFieldDptoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTexFieldDptoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtGuardarDpto)
                        .addGap(18, 18, 18)
                        .addComponent(BtNuevoDpto)
                        .addGap(18, 18, 18)
                        .addComponent(BtBorrarDpto)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelDetalleDepartamentoLayout.setVerticalGroup(
            PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTexFieldDptoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTexFieldDptoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGuardarDpto)
                    .addComponent(BtNuevoDpto)
                    .addComponent(BtBorrarDpto))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout TabDepartamentosLayout = new javax.swing.GroupLayout(TabDepartamentos);
        TabDepartamentos.setLayout(TabDepartamentosLayout);
        TabDepartamentosLayout.setHorizontalGroup(
            TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDepartamentosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(PanelListadoDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDetalleDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        TabDepartamentosLayout.setVerticalGroup(
            TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDepartamentosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelListadoDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelDetalleDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Departamentos", TabDepartamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtBorrarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarDptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBorrarDptoActionPerformed

    private void BtBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBorrarEmpleadoActionPerformed

    private void JTexFieldEmpleadoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTexFieldEmpleadoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTexFieldEmpleadoEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBorrarDpto;
    private javax.swing.JButton BtBorrarEmpleado;
    private javax.swing.JButton BtGuardarDpto;
    private javax.swing.JButton BtGuardarEmpleado;
    private javax.swing.JButton BtNuevoDpto;
    private javax.swing.JButton BtNuevoEmpleado;
    private javax.swing.JComboBox<String> CbEmpleadosDpto;
    private javax.swing.JTextField JTexFieldDptoID;
    private javax.swing.JTextField JTexFieldDptoNombre;
    private javax.swing.JTextField JTexFieldEmpleadoApellidos;
    private javax.swing.JTextField JTexFieldEmpleadoEmail;
    private javax.swing.JTextField JTexFieldEmpleadoID;
    private javax.swing.JTextField JTexFieldEmpleadoNombre;
    private javax.swing.JPanel PanelDetalleDepartamento;
    private javax.swing.JPanel PanelDetalleEmpleados;
    private javax.swing.JPanel PanelListadoDepartamentos;
    private javax.swing.JPanel PanelListadoEmpleados;
    private javax.swing.JPanel TabDepartamentos;
    private javax.swing.JPanel TabEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListDpto;
    private javax.swing.JList<String> jListEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spinnerEmpleadoSalario;
    // End of variables declaration//GEN-END:variables

    private void cargarDepartamentos() {
        // Debemos recoger los datos de listaDepartamentos y cargarlas en su jList
        for (Departamento d : listaDepartamentos.getListaDepartamentos()) {
            modeloJlistDptos.addElement(d.getNombre());
        }
    }

    private void cargarEmpleados() {
        // Debemos recoger los datos de listaEmpleados y cargarlas en su jList
        for (Empleado e : listaEmpleados.getListaEmpleados()) {
            modeloJlistEmpleados.addElement(e.getNombre());
        }
    }
}
