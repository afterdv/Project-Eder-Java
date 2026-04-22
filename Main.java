package io.github.afterdv.pej;

import java.io.*;
import java.util.Scanner;

public class Main {
 public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
  public static void main(String []args) {
    Scanner atp = new Scanner(System.in);
    while (true) {
    	limparTela();
    System.out.println("Project Eder Java");
    System.out.println("0 - Exit");
    System.out.print("Choose option: ");

    if (atp.hasNextInt()) {
            int choose = atp.nextInt();
    
    
    if (choose == 1) {
      System.out.println("Wait, function 1 not created!");try {
    Thread.sleep(2000); 
} catch (InterruptedException e) {
}

      try {
    
    Thread.sleep(2000); 
} catch (InterruptedException e) {
    
}

    }
      else if (choose == 0) {
break;
      }
    else {
      System.out.println("Error: Its not option!");
      try {
    
    Thread.sleep(2000); 
} catch (InterruptedException e) {
    
}

    }

    }
      else {
      System.out.println("Error: Invalid input! Use numbers only.");
      try {
    
    Thread.sleep(2000); 
} catch (InterruptedException e) {
    
}

                atp.next(); 
   }  
    }
}
}
