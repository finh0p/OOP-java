/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ncfu.lr1;

import java.util.Scanner;

/**
 *
 * @author kira
 */
public class LR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of elements: ");
        int countOfElems = sc.nextInt();
        Solver solver = new Solver(countOfElems);
        solver.solveProblem();
    }
}
