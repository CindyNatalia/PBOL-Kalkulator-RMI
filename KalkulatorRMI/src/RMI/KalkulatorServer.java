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
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class KalkulatorServer {
    public static void main(String[]args){
        try{
            Registry reg = LocateRegistry.createRegistry(1099);
            ImplementasiKalkulator ik = new ImplementasiKalkulator();
            reg.rebind("Calc", ik);
            System.out.println("Server Ready..");
        }catch(Exception ex){
            ex.printStackTrace();
        }

}
}
