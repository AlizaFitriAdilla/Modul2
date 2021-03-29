package Matriks;
public class No2 {
    public static void main(String[] args) {
        int[][] N = {
            {6,5},
            {6,8},
            {7,9}
        };
        
        int [][] M = {
            {21,22},
            {23,24},
            {25,26}
        };
        int baris_x =N.length;
        int kolom_x =N[0].length;
        int [][] Hasil = new int [baris_x][kolom_x];
        for (int i=0; i<baris_x; i++){
            for (int j=0; j<kolom_x; j++){
                Hasil [i][j] = M[i][j] - N[i][j];
                System.out.print(Hasil[i][j]+ " ");
            }
            System.out.println();
               
                
        }
        System.out.println("Aliza Fitri Adilla");
    }
    
}



