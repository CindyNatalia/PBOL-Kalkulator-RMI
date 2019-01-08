/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author Nice
 */
import java.rmi.*;

public interface InterfaceKalkulator extends Remote{
    public double Kalkulator(double a,double b,int pilih) throws RemoteException;

}

