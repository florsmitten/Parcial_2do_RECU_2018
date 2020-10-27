package Controller;

import Model.DAO.MascotasDB;
import Model.Mascotas;
import View.FrameConsulta;

import javax.swing.event.TableModelEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class ConsultaCtrl implements ActionListener {

    private FrameConsulta vista;

    public void setVista(FrameConsulta vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getButtonBuscar()) {
            String provinciaST = vista.getTextLetrasNombre().getText();

            vista.getTableModel().setRowCount(0);

            ArrayList<Mascotas> mascotasAux = Controlador.consultaMascotas(provinciaST);

            for (Mascotas mas : mascotasAux) {
                Object[] row = {mas.getNombre(), mas.getNombreHumano(),
                        mas.getEdad(), mas.getRaza().getNombreRaza()};
                vista.getTableModel().addRow(row);
            }
        }
    }

    public void tableChanged(TableModelEvent e) {

        if (e.getType() == TableModelEvent.UPDATE) {

            String registro = ((String) vista.getTabla().getValueAt(e.getFirstRow(), e.getColumn())).toUpperCase().trim();
            int columna = e.getColumn();
            String nombreMascota = (String) vista.getTabla().getValueAt(vista.getTabla().getSelectedRow(), 0);


            switch (columna) {
                case 1:

                    MascotasDB.updateNombreHumano(nombreMascota, registro);
                    break;

                case 2:

                    MascotasDB.updateEdad(nombreMascota, registro);
                    break;
            }
        }
    }
}
