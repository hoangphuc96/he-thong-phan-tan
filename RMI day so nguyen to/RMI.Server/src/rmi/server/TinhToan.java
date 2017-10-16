/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmi.libs.NguyenTo;

/**
 *
 * @author Admin
 */
public class TinhToan extends UnicastRemoteObject implements NguyenTo {

    public TinhToan() throws RemoteException {
    }

    
    
    @Override
    public boolean KiemTraNT(int n) throws RemoteException {
        if(n<2)
            return false;
        else{
            if(n==2 || n==3)
                return true;
            else{
                for(int i=2; i<=Math.sqrt(n); i++){
                    if(n%i==0){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    @Override
    public ArrayList<Integer> KetQua(int a[], int n) throws RemoteException {
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(KiemTraNT(a[i])==true){
                arrList.add(a[i]);
            }
        }
        return arrList;
    }
     
}
