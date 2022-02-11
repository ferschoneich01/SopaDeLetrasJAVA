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
            PrintWriter pw = new PrintWriter(new FileWriter(file, false));
            pw.append(texto);
            pw.close();
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }

    public String readFile(String archivo) {
        File file = new File(archivo);
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            line = br.readLine();
            JOptionPane.showMessageDialog(null,"Jugador: "+line.replace("-", " puntos: "), "MAYOR PUNTAJE", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            System.out.println("" + ex);
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
        return line;
    }

    public void savePoints(Player p) {
        //Jugador guardado en memoria
        Player p2 = new Player();
        String flag = "";
        char aux;
        //datos en memoria
        String data = readFile("data.txt");
        //ubicacion del guion
        int separacion = 0;
        if (data != null) {
            //obtener posicion del guion

            for (int i = 0; i < data.length(); i++) {
                aux = data.charAt(i);
                if (aux == '-') {
                    separacion = i;
                }
            }

            //extraer datos
            for (int j = 0; j < data.length(); j++) {
                if (j < separacion) {
                    p2.name += data.charAt(j);
                } else if (j > separacion) {
                    flag += data.charAt(j);
                }
            }

            p2.setPoints(Integer.parseInt(flag));
            //si el puntaje nuevo es mayor al guardado se reescribe
            if ((p.getPoints() > p2.getPoints())) {
                writeOnFile("data.txt", p.getName() + "-" + p.getPoints());
                JOptionPane.showMessageDialog(null, "Nuevo Record");
            }
        } else {
  
            writeOnFile("data.txt", p.getName() + "-" + p.getPoints() + "-" + p.getLevel() + "-" + p.getTime());
            JOptionPane.showMessageDialog(null, "Nuevo Record");
        }
    }

}
