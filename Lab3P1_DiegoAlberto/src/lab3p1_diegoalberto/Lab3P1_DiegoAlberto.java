package lab3p1_diegoalberto;

import java.util.Scanner;

public class Lab3P1_DiegoAlberto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. ¡OK Boomer!");
            opcion = sc.nextInt();

            while (opcion != 4) {
                switch (opcion) {

                    case 1: {
                        System.out.println("Ingrese el valor Limite");
                        int lim = sc.nextInt();
                        double x = 0;
                        double y = 0;
                        double sum = 0;//suma
                        double cua = 0;//potencia
                        double ans = 0; // respuesta
                        for (int i = 0; i < lim ; i++) {
                            
                            System.out.println("Ingrese x");
                            x = sc.nextInt();
                            System.out.println("Ingrese y");
                            y = sc.nextInt();
                            
                            sum = (x -y ) ;
                            cua = Math.pow(sum , 2);
                            ans += cua;
                            
                            
                        }//fin
                        System.out.println(Math.sqrt(ans));

                    }
                    break;
                    case 2: { 
                        System.out.println("Ingrese el tamaño");
                        int num = sc.nextInt();
                        for (int i = 1; i <=num; i++) {
                            for (int j = 1; j <=(num*2)-1; j++) {
                                if(i == 1||i == num||j == 1||j == (num*2)-1){ 
                                    System.out.print("*");
                                }else{
                                System.out.print(" ");
                                }
                                
                            }
                           System.out.println(" ");
                        }
                        break;

                    }
                    
                    case 3: {
                        System.out.println("Ingrese su año de nacimiento");
                        int eda = sc.nextInt();
                        while (eda <= 0 && eda > 1946) {
                            System.out.println("Error");
                            System.out.println("Ingrese su año de nacimiento");
                            eda = sc.nextInt();
                        }
                        if (eda <= 2025 && eda >= 2013) {
                            System.out.println("Eres de la generacion Alpha");
                        } else if (eda <= 2012 && eda >= 1990) {
                            System.out.println("Eres de la generacion Z");
                        } else if (eda <= 1980 && eda >= 1994) {
                            System.out.println("Eres de la generacion Millenials");
                        } else if (eda >= 1975 && eda <= 1985) {
                            System.out.println("Eres de la generacion Xennials ");
                        } else if (eda <= 1979 && eda >= 1960) {
                            System.out.println("Eres de la generacion X ");
                        } else if (eda <= 1964 && eda >= 1946) {
                            System.out.println("Eres de la generacion Baby Boomer ");
                        }else{ System.out.println("O no has nacido y ya se murio uste joven (o a eso va");
                        }
                        break;

                    }
                }

            }
        }

    }
}
