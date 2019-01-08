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
import java.rmi.server.UnicastRemoteObject;
public class ImplementasiKalkulator extends UnicastRemoteObject implements InterfaceKalkulator{
    public ImplementasiKalkulator() throws RemoteException{
        
    }

    @Override
    public double Kalkulator(double a, double b, int pilih) throws RemoteException {
        double result=0;
        switch(pilih){
            case 1:
                result=a+b;
                break; 
            case 2:
                result=a-b;
                break; 
            case 3:
                result=a*b;
                break; 
            case 4:
                result=a/b;
                break; 
            default:
                System.out.println("Pilihan Tidak Ada");
        }
        return result;
        
    }
    
}
