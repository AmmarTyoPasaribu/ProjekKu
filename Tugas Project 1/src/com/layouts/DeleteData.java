package com.layouts;

import java.util.Scanner;

import com.controller.controllerDB;

public class DeleteData {
    public static void showDeleteData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("SILAHKAN PILIH DATA YANG INGIN DIHAPUS ");
        System.out.println("==============================================");
        controllerDB.getDatabase();
        System.out.println("==============================================");
        System.out.println("***Catatan: input nama produk dengan benar!!!");
        System.out.print("Pilih Nama Produk: ");
        String nama = sc.nextLine();
        System.out.println("==============================================");
       
        if (controllerDB.deletDB(nama)) {
            System.out.println("BERHASIL MENGHAPUS DATA");
            
        }else{
            System.out.println("GAGAL MENGHAPUS DATA");
            System.out.println("----------------------------------------------");
            DeleteData.showDeleteData();

        }

        System.out.println("----------------------------------------------");
        Menu.showMenu();
        sc.close();   
    }
    
}
