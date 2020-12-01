package tr.edu.medipol.yazilimaraclari.selimgecu;

import java.util.Scanner;

public class MuhasebeProgrami {

	public static void main(String[] args) {
			

		int hesaplananUcret = ucretHesapla(5,12);
		System.out.println("Hesaplanan ücretiniz -> "+hesaplananUcret);
    }
	public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		int sonuc = calisilanSaat * saatlikUcret;
		return sonuc;
	}

}