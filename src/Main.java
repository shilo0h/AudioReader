import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       Scanner sc=new Scanner(System.in);
        File file=new File("C:\\Users\\Lenovo\\Downloads\\Don't Hate Me.wav");
        AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioInputStream);
        String response="";
        while(!response.equals("Q")){
            System.out.println("P=play, S=stop,R=reset,Q=Quit");
            System.out.println("Enter your choice: ");

             response= sc.next();
            response=response.toUpperCase();
            switch (response){
                case ("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case("Q"):clip.close();
                break;
                default:
                    System.out.println("Not a valid command");
            }
        }
        System.out.println("Byeeee!");
    }
}