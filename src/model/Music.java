/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



/**
 *
 * @author Fernando
 */
public class Music {
    
    Clip clip;
    String url = "/resources/sounds/";
    
    public void PlaySound(String Archivo){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(url+Archivo+".wav")));
            clip.start();
        }catch(Exception ex){
            System.out.println(""+ex);
        }
    }
    
    public void StopSound(){
        clip.close();
        clip.stop();

    }
}
