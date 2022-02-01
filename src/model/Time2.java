/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import view.DlgLose;
import view.FrmMenu;

/**
 *
 * @author Fernando
 */
public class Time2 extends Thread {
    JFrame frm;
    JLabel t;
    int i = 180;
    boolean flag = true; 
    public Time2(JLabel t,JFrame frm) {
        this.t = t;
        this.frm = frm;
    }

    public void run() {
        t.setForeground(new Color(0,255,0)); 
        while (flag) {
            try {

                i--;
                t.setText(i + "");
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
            if(i <= 10){
                t.setForeground(new Color(255, 0, 0));
            }
            if(i <= 0){
                flag = false;
                DlgLose dlose = new DlgLose(null,true);
                dlose.setVisible(true);
                finish();
            }
        }
    }
    
    public void finish(){
        FrmMenu fm = new FrmMenu();
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);
        frm.dispose();
    }
   
    public void restart(){
        i = 180;
    }
}
