package gamepacman;

import java.util.Scanner;

public class mainpacman {

    public static void main(String[] args) {
        String a[][] = new String[][]{
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "@", "0", " ", " ", "0", " ", " ", " ", "#"},
            {"#", "#", " ", " ", " ", " ", "#", "#", "#", "#"},
            {"#", " ", " ", " ", "0", " ", " ", " ", " ", "#"},
            {"#", "#", "#", " ", " ", " ", "0", " ", "#", "#"},
            {"#", "#", " ", " ", " ", " ", " ", "#", "#", "#"},
            {"#", "#", "#", " ", "0", " ", " ", " ", " ", "#"},
            {"#", "#", "#", " ", " ", " ", " ", "#", "#", "#"},
            {"#", " ", " ", "0", " ", " ", " ", " ", "#", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};
        Scanner in = new Scanner(System.in);
        Classpacman pc = new Classpacman();
        pc.setPindah(20);
        
        do {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println("");
            }
            System.out.println("Move left: "+pc.getPindah());
            System.out.print("Tombol : ");
            
            String tmbl = in.nextLine();
     
            switch (tmbl) {
                case "w":
                    if (a[pc.Y()-1][pc.X()].equals(" ")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y()-1][pc.X()] = "@";
                        pc.setYnaik();
                        

                    } else if (a[pc.Y() - 1][pc.X()].equals("0")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y() - 1][pc.X()] = "@";
                        pc.setYnaik();
                        pc.setScore();
                    } else if (a[pc.Y() - 1][pc.X()].equals("#")) {
                        continue;
                    }break;
                case "a":
                    if (a[pc.Y()][pc.X() - 1].equals(" ")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y()][pc.X() - 1] = "@";
                        pc.setXkiri();

                    } else if (a[pc.Y()][pc.X() - 1].equals("0")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y()][pc.X() - 1] = "@";
                        pc.setXkiri();
                        pc.setScore();
                    } else {
                        continue;
                    }break;
                case "s":
                    if (a[pc.Y() + 1][pc.X()].equals(" ")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y() + 1][pc.X()] = "@";
                        pc.setYturun();

                    } else if (a[pc.Y()+1][pc.X()].equals("0")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y() + 1][pc.X()] = "@";
                        pc.setYturun();
                        pc.setScore();
                    } else {
                        continue;
                    }break;
                case "d":
                    if (a[pc.Y()][pc.X() + 1].equals(" ")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y()][pc.X() + 1] = "@";
                        pc.setXkanan();

                    } else if (a[pc.Y()][pc.X() + 1].equals("0")) {
                        a[pc.Y()][pc.X()] = " ";
                        a[pc.Y()][pc.X() + 1] = "@";
                        pc.setXkanan();
                        pc.setScore();
                    } else {
                        continue;

                    }break;
                default:break;
            }       System.out.println("Score : "+pc.getScore());
        }while (pc.getPindah()>0&&pc.getScore()<6);
            if (pc.getScore()==6) {
                System.out.println("YOU WIN");
        }else{
                System.out.println("YOU LOSE");
            }
        
        }

    }
