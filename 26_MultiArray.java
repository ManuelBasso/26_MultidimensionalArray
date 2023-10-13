/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di 
scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza

1 2 3
4 5 6

Matrice risultato

 1 4
 2 5
 3 6 */

public class MyClass {
    public static void main(String args[]) {
        int matriceIniz[][]={{1,2,3},{4,5,6}};
        System.out.println("Matrice iniziale:");
         for (int i=0;i<matriceIniz.length; i++){
                for (int j=0; j<matriceIniz[i].length;j++) {
                    System.out.print(matriceIniz[i][j]+ " ");
                }
                System.out.println(" ");
         }
        Invert(matriceIniz);
    }
    
    
    public static void Invert(int a[][]) {

           int[][] newMatrice = new int[3][2];
            for (int i=0;i<a.length; i++){
                for (int j=0; j<a[i].length;j++) {
                        newMatrice[j][i] = a[i][j];
                    }
            }
    
            System.out.println("new Matrice:");
                for (int i=0;i<newMatrice.length; i++){
                for (int j=0; j<newMatrice[i].length;j++) {
                    System.out.print(newMatrice[i][j] + " ");
                }
                System.out.println(" ");
        }
    }
}

