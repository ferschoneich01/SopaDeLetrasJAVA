/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import jmapps.ui.MessageDialog;
import view.DlgLose;
import view.FrmHard;
import view.FrmMedium;
import view.FrmMenu;
import view.MsgLike;

/**
 *
 * @author 
 */
public class Time extends Thread {
    Data d = new Data();
    FrmHard frm;
    JLabel t;
    Player p;
    int i = 10;
    boolean flag = true;
    
    public Time(JLabel t, FrmHard frm) {
        this.t = t;
        this.frm = frm;
    }

    public void run() {
       t.setForeground(new Color(0, 255, 0));
        while (flag) {
            try {

                i--;
                t.setText(i + "");
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
            if (i <= 10) {
                t.setForeground(new Color(255, 0, 0));
            }
            if (i <= 0) {
                flag = false;
                DlgLose dlose = new DlgLose(null, true);
                dlose.asignarDatos(frm.p.getName(), frm.p.getPoints() + "");
                dlose.setVisible(true);
                frm.m.StopSound();
                finish();
            }
        }
    }
    
    public void finish() {
        FrmMenu fm = new FrmMenu();
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);
        d.savePoints(frm.p);
        frm.dispose();
    }

    public void setPlayer(Player p) {
        this.p = p;
    }
    
    public void restart(){
        i = 90;
    }
}
