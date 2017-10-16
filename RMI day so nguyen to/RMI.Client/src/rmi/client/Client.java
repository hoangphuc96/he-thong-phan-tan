/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.libs.NguyenTo;

/**
 *
 * @author Admin
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Client().run();
    }
    
    private void run() {
        int port = 1234;
        int n;
        Scanner scn = new Scanner(System.in);
        Scanner ptu = new Scanner(System.in);
        try {
            NguyenTo nguyento = (NguyenTo) Naming.lookup("rmi://localhost:"+port+"/TinhToan");
            
            System.out.println("nhap so phan tu:");
            n=scn.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                System.out.println("nhap gia tri phan tu thu "+i+" ");
                 a[i] = ptu.nextInt();
            }
            
            System.out.println("cac so nguyen to trong mang:");
            for(int i=0; i<nguyento.KetQua(a,n).size();i++){
                System.out.println(nguyento.KetQua(a,n).get(i)+" ");
            }
            System.out.println("");
            
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
