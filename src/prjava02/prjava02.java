package prjava02;

import java.io.*;
import java.net.*;


public class prjava02 {
	public static void main(String[] args) {
        System.out.println("versi� 0.1 del projecte prjava02"); 
        try {
            InetAddress adre�a = InetAddress.getLocalHost();
            String hostname = adre�a.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versi�  OS: " + System.getProperty("os.version"));
            System.out.println("Creaci� d'una branca del projecte prjava02");            
        }
        catch (IOException e) {
        }  
    }

}
