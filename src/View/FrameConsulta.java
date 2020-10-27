package View;

import Controller.ConsultaCtrl;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrameConsulta {

    private ConsultaCtrl consultaCtrl;

    private JFrame ventana = new JFrame("Consulta masiva");
    private JPanel panelConsulta = new JPanel(new FlowLayout());
    private JPanel panelCentral = new JPanel();

    private JLabel labelLetrasNombre = new JLabel("Letras nombre");
    private JTextField textLetrasNombre = new JTextField(2);
    private JButton buttonBuscar = new JButton("Buscar");
    private String[] columnas = {"Nombre mascota", "Nombre humano", "Edad", "Raza"};
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel)
    {public boolean isCellEditable(int row,int column)
    {return row >= 0 && column > 0 &&  column != 0 && column != 3;
    }};
    private JScrollPane scrollPane = new JScrollPane(tabla);

    public FrameConsulta(ConsultaCtrl consultaCtrl) {
        this.consultaCtrl = consultaCtrl;
        consultaCtrl.setVista(this);

        ventana.setSize(650, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        buttonBuscar.addActionListener(consultaCtrl);

        panelConsulta.add(labelLetrasNombre);
        panelConsulta.add(textLetrasNombre);

        for (int i = 0; i < columnas.length; i++) {
            tableModel.addColumn(columnas[i]);
        }

        panelCentral.add(scrollPane, BorderLayout.CENTER);

        ventana.add(panelConsulta, BorderLayout.NORTH);
        ventana.add(buttonBuscar, BorderLayout.SOUTH);
        ventana.add(panelCentral, BorderLayout.CENTER);

        tabla.getModel().addTableModelListener((TableModelListener) consultaCtrl);

    }

    public ConsultaCtrl getConsultaCtrl() {
        return consultaCtrl;
    }

    public void setConsultaCtrl(ConsultaCtrl consultaCtrl) {
        this.consultaCtrl = consultaCtrl;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanelConsulta() {
        return panelConsulta;
    }

    public void setPanelConsulta(JPanel panelConsulta) {
        this.panelConsulta = panelConsulta;
    }

    public JPanel getPanelCentral() {
        return panelCentral;
    }

    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    public JLabel getLabelLetrasNombre() {
        return labelLetrasNombre;
    }

    public void setLabelLetrasNombre(JLabel labelLetrasNombre) {
        this.labelLetrasNombre = labelLetrasNombre;
    }

    public JTextField getTextLetrasNombre() {
        return textLetrasNombre;
    }

    public void setTextLetrasNombre(JTextField textLetrasNombre) {
        this.textLetrasNombre = textLetrasNombre;
    }

    public JButton getButtonBuscar() {
        return buttonBuscar;
    }

    public void setButtonBuscar(JButton buttonBuscar) {
        this.buttonBuscar = buttonBuscar;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}
