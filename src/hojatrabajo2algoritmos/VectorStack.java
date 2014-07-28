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
public class VectorStack {
    private Stack pila;
    private int tamanhoArreglo; 
    private int resultadoF; 
    private int contador; 
    private int logitudArreglo; 
    private int resultado=0;
    private int[] data;
    private char valorActual; 

public VectorStack( String expresion) {
    tamanhoArreglo = expresion.length();
    data = new int [tamanhoArreglo];
    pila = new Stack (tamanhoArreglo);
    logitudArreglo = (tamanhoArreglo-1);
    for (int i = logitudArreglo; i > -1; i--){
        pila.push(expresion.charAt(i));
    }
 }
 public int existenciaOperador (){
    contador = 0;
    valorActual = pila.pop();
    
    while((valorActual!='*')&&(valorActual!='-')&&(valorActual!='+')&&(valorActual!='/')){
        if(valorActual!=' '){
            data[contador] = pila.convCaracterEntero(valorActual);
            contador++;
            }
        valorActual = pila.pop(); 
    }
    
    
    resultadoF = econtrarOperador(data,valorActual);
    char val = pila.convEnteroCaracter(resultadoF);
    pila.push(val);
    return resultadoF;
     
 }   
 
 public int funcionSumar(int[] data){
        resultado=0;
        for (int i = 0; i < contador; i++){
            resultado = resultado + data[i];
            System.out.println("Resultado " + resultado);
        }
     return resultado;
 }
 
 public int funcionRestar(int[] data){
    resultado = data[0];
    for (int i = 1; i < contador; i++){
        resultado = resultado - data[i];
        System.out.println("Resultado " +resultado);
    }
    return resultado;
 }
 
 public int funcionMultiplicar(int[] data){
     
    resultado = 1;
    for (int i = 0; i<contador; i++){
        resultado = resultado * data[i];
        System.out.println("Resultado " + resultado);
    }
    
    return resultado;
 }
 
 public int funcionDividir(int[] data){
    resultado = data[0];
    for (int i = 1; i < contador; i++){
        resultado= ((resultado)/(data[i]));
        System.out.println("Resultado "+ resultado);
    }
    return resultado;
 }
 
 public int econtrarOperador(int[] data, char valor){
    if(valor == '*'){
        funcionMultiplicar(data);
    }
    if(valor == '+'){
        funcionSumar(data);
    }
    if(valor == '-'){
        funcionRestar(data);
    }
    if(valor == '/'){
        funcionDividir(data);
    }
    return resultado;
 }
 public int operar(){
     while(pila.getArray()[tamanhoArreglo-2] != 'a'){
       resultadoF = existenciaOperador(); 
     }
     return resultadoF;
 }

}
