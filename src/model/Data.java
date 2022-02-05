package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Data {

    //crear archivo de almacen de datos nuevo
    public void createNewFile(String archivo) {
        File file = new File(archivo);
        if (file.exists() && !file.isDirectory()) {
            System.out.println("Datos cargados..");
        } else {
            try {
                PrintWriter pw = new PrintWriter(file);
                pw.close();
            } catch (FileNotFoundException ex) {
                System.out.println("" + ex);
            }
        }

    }

    //escribir dentro del archivo creado
    public void writeOnFile(String archivo, String texto) {
        File file = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.append(texto);
            pw.close();
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }

    public void readFile(String archivo) {
        File file = new File(archivo);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            JOptionPane.showMessageDialog(null, line, "Mensaje en la barra de titulo", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            System.out.println("" + ex);
        } catch (IOException ex) {
            System.out.println("" + ex);
        }

    }

}
