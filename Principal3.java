/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal3;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Principal3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int num = scanner.nextInt();

    Solution solution = new Solution();
    String romanNumeral = solution.intToRoman(num);
    System.out.println("O numeral romano é: " + romanNumeral);
  }
}
