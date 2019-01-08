/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Nice
 */
public class KalkulatorClient {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException, IOException {
       try{
           InterfaceKalkulator ik = (InterfaceKalkulator)Naming.lookup("Calc");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        double hasil;
        int pilih;
        do{
            System.out.println("Menu Kalkulator");
            System.out.println("--------------------------");
            System.out.println("Tekan 1 Untuk Tambah");
            System.out.println("Tekan 2 Untuk Kurang");
            System.out.println("Tekan 3 Untuk Kali");
            System.out.println("Tekan 4 Untuk Bagi");
            System.out.println("Tekan 5 Untuk Keluar");
            System.out.println("\n"+"Masukan Pilihan Anda: ");
            
            pilih = Integer.parseInt(br.readLine());
            if(pilih==5)System.exit(0);
            if(pilih<0 || pilih>5){
                System.out.println("Pilihan Tidak Ada");
            }
            if(pilih>0 && pilih<5)
                System.out.println("Masukkan Angka Pertama");
                a=Integer.parseInt(br.readLine());
                System.out.println("Masukkan Angka Kedua");
                b=Integer.parseInt(br.readLine());
                hasil=ik.Kalkulator(a, b, pilih);
                System.out.println("-------------------------");
                System.out.println("Hasil : "+hasil);
                System.out.println("-------------------------");
        }while(true);
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
}

