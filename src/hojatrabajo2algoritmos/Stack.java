/*
 Universidad del Valle de Guatemala
 Gustavo Adolfo Morales Martínez
 Carné: 13014
 Guatemala xx de xx de 201x
 Descripción: 
 */
package hojatrabajo2algoritmos;

/**
 *
 * @author Adolfo
 */
public class Stack {
    private char[] array;
    private int puntero;
    private int tamanhoArreglo;
    private int contI=0;


    public Stack(int tamanhoArreglo) {
        this.tamanhoArreglo = tamanhoArreglo;
        array = new char [tamanhoArreglo];
    }    

    public int convCaracterEntero(char caracter){
        int auxiliar =0;
        auxiliar = caracter-48;
        return auxiliar;
    } 
    public char convEnteroCaracter(int caracter){
        char auxiliar =0;
        auxiliar = (char) (caracter+48);
        return auxiliar;
    } 
    
    public void push(char valor){
       puntero= (tamanhoArreglo-1) - contI;
       array[puntero] = valor; 
       contI++;
    }

    public char pop(){
        char val = array[puntero];
        array[puntero] = 'a';
        puntero++;
        contI--;
        return val; 
    }

    public char[] getArray() {
        return array;
    }

}
