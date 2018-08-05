/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;
import java.util.Scanner;

/**=====
 *
 * @author Alifiandy
 */
public class TugasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double phi, r, t, hs;

    Scanner petong = new Scanner(System.in);
    System.out.println("Masukan jari-jari : ");
    r = petong.nextDouble();
    
    System.out.println("Masukan tinggi : ");
    
    t = petong.nextDouble();
    phi = 22/7;
    hs = phi*(r*r*t);
    System.out.print("Jadi Hasilnye "+hs);
    // TODO code application logic here
    
    }
    
}
