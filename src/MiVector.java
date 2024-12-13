/**
 * Actividad 7
 */

import java.util.Scanner;

public class MiVector {
    private int[] v;
    private int tam;

    public MiVector(int t){
        tam = t;
        v = new int[t];
    }
    public boolean compruebaVacuidad(){
        if(tam == 0){
            return true;
        }
        return false;
    }

    public void declaraV() {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<tam; i++){
            v[i] = scan.nextInt();
        }
    }

    public void printV(){
        System.out.print("v = (");
        for(int i=0; i<tam; i++){
            System.out.print(v[i]);
            if(i!=tam-1){
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    public int tamV(){
        return tam;
    }

    public void clearV(){
        for(int i = 0; i<tam; i++){
            v[i]=0;
        }
    }
}
