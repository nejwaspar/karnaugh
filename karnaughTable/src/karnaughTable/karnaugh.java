package karnaughTable;

import java.util.Scanner;

public class karnaugh {
	static Scanner sc = new Scanner(System.in);

	public static void affichage(Boolean  a,Boolean b,Boolean c,Boolean d,Boolean e,Boolean f,Boolean g) {
		if(a==true) System.out.println(" _");
		if(f==true) {
					if(g==true) 
						{
						if(b==true) System.out.println("|_|");
						
						else System.out.println("|_");
						}

					else {
						if (b==true ) System.out.println("| |");
						
						else System.out.println("|");
					
					}
				
			}
		else {
			if(g) {
				if(b) System.out.println(" _|");
				else System.out.println(" _ ");
			}
			else {
				if(b) System.out.println("  |");
			}
		}
		if(c) {
			if(e) {
				if(d)  System.out.println("|_|");
		
					else  System.out.println("| |");
				}
			else {
				if(d) System.out.println(" _|");
				else System.out.println("  |");
				}	
			}
		else {
			if(e) {
				if(d) System.out.println("|_");
				else System.out.println("|  ");
			}
			else {
				if(d) System.out.println(" _ ");
	
			}
			
		}
		 

	}
	
	public static String hexToBin(String hex){
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }
	public static int Barre(int x ) {
		if(x==0) return 1;
		else return 0;
	}
	public static Boolean f(int[] tab) {
		if((Barre(tab[3])*Barre(tab[2])+Barre(tab[3])*tab[1]+tab[2]*(tab[0])+tab[3]*Barre(tab[1])*tab[0])==0) return false;
		else return true;
	}
	public static Boolean a(int[] tab) {
		if((Barre(tab[3])*tab[2]+tab[1]*Barre(tab[0])+tab[2]*tab[1]+Barre(tab[3])*tab[1]+tab[2]*Barre(tab[0])*Barre(tab[2])*Barre(tab[0]))==0)return false;
		else return true;
	}
	public static Boolean b(int[] tab) {
		if(Barre(tab[1])*Barre(tab[0])+Barre(tab[1])*Barre(tab[3])+tab[3]*Barre(tab[2])*tab[0]+tab[3]*tab[2]*Barre(tab[0])+Barre(tab[3])*Barre(tab[2])*Barre(tab[0])==0)return false;
		else return true;
	}
	public static Boolean c(int[] tab) {
		if(Barre(tab[1])*tab[0]+tab[1]*Barre(tab[0])+tab[3]*Barre(tab[2])+tab[3]*Barre(tab[1])+Barre(tab[2])*Barre(tab[1])==0)return false;
		else return true;
	}
	public static Boolean d(int[] tab) {
		if(Barre(tab[3])*Barre(tab[1])*Barre(tab[0])+tab[3]*tab[2]*Barre(tab[1])+Barre(tab[2])*tab[0]+Barre(tab[3])*tab[2]*tab[1]+tab[3]*Barre(tab[2])*tab[1]==0)return false;
		else return true;
	}
	public static Boolean e(int[] tab) {
		if(Barre(tab[3])*Barre(tab[1])+tab[2]*tab[0]+tab[1]*tab[0]+Barre(tab[3])*tab[2]==0)return false;
		else return true;
	}
	public static Boolean g(int[] tab) {
		if(tab[2]*Barre(tab[1])+tab[1]*tab[0]+tab[3]*tab[0]+Barre(tab[3])*tab[2]+Barre(tab[2])*Barre(tab[0])*tab[1]==0)return false;
		else return true;
	}

	public static void main(String[] args) {
		
		System.out.println("veuillez entrer un nombre de votre choix ");
		String nbr = sc.nextLine();
		
		 String temp=hexToBin(nbr);
		int a = temp.length();
		int x[]=new int[a];
		char[] tab = new char[a];
		for(int i = 0; i <a;i++){
		     tab[i] = temp.charAt(i);
		     x[i]= Character.getNumericValue(tab[i]);
		    
		   
		}
		affichage(a(x),b(x),c(x),d(x),e(x),f(x),g(x));
	}

}
