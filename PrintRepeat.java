/*13020210152*/
/*SOFIA AMANDA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

public class PrintRepeat {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* Program */

		System.out.print ("Nilai N >0 = ");
		/* Inisialisasi */
		N = masukan.nextInt();

		i = 1;
		/* First Elmt */
		System.out.print ("print i dengan REPEAT: \n");
		do{
			System.out.print (i+"\n"); /*proses*/
			i++;	/* Next Elmt */
		}

		while (i <= N); /* kondisi pengulangan */
	}
}
