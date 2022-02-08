package main;

import javax.swing.JOptionPane;
import model.Data;
import view.FrmMenu;
import view.FrmEasy;

/**
 *
 * @author Daniel Diaz
 */
public class sopa_de_letras {

    public static void main(String[] args) {
        //new Principal().setVisible(true);
        Data data = new Data();
        //creamos un nuevo archivo de almacenamiento
        data.createNewFile("data.txt");
        //Iniciamos ventana menu
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        String name = "";
        
        while(name.equals("") || JOptionPane.CANCEL_OPTION == 1){
            name = JOptionPane.showInputDialog(null, "Nombre de jugador:");
            menu.guardarNombreJug(name);
        }
        

    }

}
