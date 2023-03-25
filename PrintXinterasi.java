/*13020210152*/
/*SOFIA AMANDA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE  */
public class PrintXinterasi {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int Sum=0;
		int x;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();	/* First Elmt */
		if (x == 999) {
			System.out.print ("Kasus Kosong \n");
		}else{	/*Minimal ada satu data yang dijumlahkan*/
			Sum = x;	/* Inisialisasi; invariant !! */
			for (;;) {
				System.out.print ("Masukan nilai x (int), akhiri dg 999 : ");
				x = masukan.nextInt(); /* Next Elmt */
				if(x==999)
					break;
				else{
					Sum = Sum + x; 	/*proses*/
				}
			}	
		}
		System.out.println("Hasil penjumlahan = "+ Sum); 
	/*Terminasi*/
	}
}
   