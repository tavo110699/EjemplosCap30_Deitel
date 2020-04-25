/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej30_5_Metodos_busqueda_de_clase_String;

/**
 *
 * @author gustavo
 */
public class MetodosIndexString {
    public static void main(String[] args) {
       
       String letras = "abcdefghijklmabcdefghijklm"; 
         // prueba indexOf para localizar un carácter en una cadena
      System.out.printf(
         "'c' se encuentra en el indice \n", letras.indexOf( 'c' ) );
      System.out.printf(
         "'a' se encuentra en el indice \n", letras.indexOf( 'a', 1 ) );
      System.out.printf(
         "'$' se encuentra en el indice \n\n", letras.indexOf( '$' ) );
      // prueba lastIndexOf para buscar un carácter en una cadena
      System.out.printf( "La ultima 'c' se encuentra en el indice \n",
         letras.lastIndexOf( 'c' ) );
      System.out.printf( "La ultima 'a' se encuentra en el indice \n",
         letras.lastIndexOf( 'a', 25 ) );
      System.out.printf( "La ultima '$' se encuentra en el indice \n\n",
         letras.lastIndexOf( '$' ) );
      // prueba indexOf para localizar una subcadena en una cadena
      System.out.printf( "\"def\" se encuentra en el indice \n",
         letras.indexOf( "def" ) );
      System.out.printf( "\"def\" se encuentra en el indice \n",
         letras.indexOf( "def", 7 ) );
      System.out.printf( "\"hola\" se encuentra en el indice \n\n",
         letras.indexOf( "hola" ) );
      // prueba lastIndexOf para buscar una subcadena en una cadena
         System.out.printf("La ultima ocurrencia de \"def\" se encuentra en el indice: "+  letras.lastIndexOf( "def" ));
         System.out.printf("La ultima ocurrencia de \"def\" se encuentra en el indice: "+letras.lastIndexOf( "def", 25 ) );
         System.out.printf("La ultima ocurrencia de \"hola\" se encuentra en el indice: "+letras.lastIndexOf( "hola" ));
         
    }
}
