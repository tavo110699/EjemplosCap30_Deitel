/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej30_7_Método_concat_de_String;

/**
 *
 * @author gustavo
 */
public class ConcatenacionString {

    public static void main(String[] args) {
        String s1 = new String("Feliz ");
        String s2 = new String("Cumpleanios");

        System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
        System.out.printf("Resultado de s1.concat( s2 ) = %s\n", s1.concat(s2));
        System.out.printf("s1 despues de la concatenacion= %s\n", s1);
    }
}
