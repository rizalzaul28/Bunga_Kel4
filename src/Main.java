/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rizan
 */
public class Main {
    public static void main(String[] args) {

        Bunga_Edelweis fr = new Bunga_Edelweis();

        fr.setnama_ilmiah("Leontopolium alpinum");
        fr.setWarna("Putih atau keperakan ditengahnya kuning");
        fr.setIklim("Sejuk hingga dingin");
        fr.setTanah("Berbatu");
        fr.setHewan_penyerbuk("Lebah dan kupu-kupu");

        System.out.println("\n\t\t\tBunga Edelweis");
        System.out.println("Nama Ilmiah       : " + fr.getnama_ilmiah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Iklim             : " + fr.getIklim());
        System.out.println("Tanah             : " + fr.getTanah());
        System.out.println("Hewan Penyerbuk   : " + fr.getHewan_penyerbuk());
        
        
        Bunga_Tulip st = new Bunga_Tulip();

        st.setnama_ilmiah("Tulipa");
        st.setWarna("Beragam(Merah, Kuning, Putih, Ungu)");
        st.setIklim("Sedang");
        st.setTanah("Berdrainase baik dan subur");
        st.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Tulip");
        System.out.println("Nama Ilmiah       : " + st.getnama_ilmiah());
        System.out.println("Warna             : " + st.getWarna());
        System.out.println("Iklim             : " + st.getIklim());
        System.out.println("Tanah             : " + st.getTanah());
        System.out.println("Hewan Penyerbuk   : " + st.getHewan_penyerbuk());
}
}