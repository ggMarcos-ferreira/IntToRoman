/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author aluno
 */
public class Solution {
  public String intToRoman(int num) {
    int[] valores = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] simbolos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    String resultado = "";

    for (int i = 0; i < valores.length; i++) {
      while (num >= valores[i]) {
        resultado += simbolos[i];
        num -= valores[i];
      }
    }

    return resultado;
  }
}
