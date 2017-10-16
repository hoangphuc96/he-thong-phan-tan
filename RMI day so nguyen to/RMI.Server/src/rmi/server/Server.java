    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Server().run();
    }
    
    private void run() {
        String host = "localhost";
        int port = 1234;
        try {
            TinhToan tinhtoan = new TinhToan();
            Registry registry = LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/TinhToan",tinhtoan);
            System.out.println("Server is running ...");
        } catch (RemoteException | MalformedURLException ex){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
