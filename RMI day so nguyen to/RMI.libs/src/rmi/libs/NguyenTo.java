/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.libs;

import java.rmi.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface NguyenTo extends Remote {
    public boolean KiemTraNT(int n) throws RemoteException;
    public ArrayList<Integer> KetQua(int a[],int n) throws RemoteException;
}
