package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import telas.TelaLogin;

public class Principal {       
    public static void main(String[] args) {
       
        
        TelaLogin tela = new TelaLogin();
        tocarMusica("C:\\Users\\arthu\\Desktop\\clinica-veterinaria-2.0-master\\clinica-veterinaria-2.0-master\\Clinica Veterinaria\\src\\midia\\MusicaDeFundo.wav");
        tela.setVisible(true);
 
    }


    
    public static void tocarMusica(String path){

        InputStream musica;
        
        try{
            musica = new FileInputStream(new File(path));
            AudioStream audio = new AudioStream(musica);
            AudioPlayer.player.start(audio);
        }catch(Exception e){
            System.out.println("nao foi possivel tocar a musica de fundo");               
        }

    }
    public static void pararMusica(AudioStream audio){
        AudioPlayer.player.stop(audio);
    }
        
}
