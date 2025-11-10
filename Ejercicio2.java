/*
 * Nombre:Julio
 * Descripcion:Crea ua matriz de 10 x 10 y que multiplique la tabla 
 * Fecha:10/11/2025
 */
package MárquezOrtegaJulio3_11;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int columnas = 10;
		final int filas = 10;
		int[] []  matriz;
		matriz = new int [filas] [columnas];
		
		for(int i = 0;i<matriz.length;i++) {
			for(int a = 0;a<matriz.length;a++) {
				matriz[i][a] = i0*a;
				
				
			}
		}
		for (int i = 0;i<matriz.length;i++) {
			for (int a = 0;a<matriz.length;a++) {
				System.out.print(matriz[i][a] + "  ");
			}
			System.out.println();
		}
		
	}

}
