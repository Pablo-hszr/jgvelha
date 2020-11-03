package jgvl;

import java.util.Scanner;

public class jgvl {
	
    public static char turno = 'X';
    public static int lin, col;
    public static Scanner scan = new Scanner(System.in);
    public static char [][] board = new char [3][3];

    

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        	board[i][j] = '_';
        }
        }
		
		
		Play();
		
		
	}
public static void Play() {
	boolean playing = true;
	while (playing) {
		System.out.println("Digite a linha e coluna: ");
		lin = scan.nextInt() - 1;
		col = scan.nextInt() - 1;
		board[lin][col] = turno;
		if (Fim (lin, col)) {
			playing = false;
			System.out.println("Acabou! Jogador " + turno + " venceu!");
			
		}
		Tela(); 
			
			
		if (turno == 'X')
			turno = '0';
		else 
			turno	 = 'X';
	}
	
}
	public static void Tela() {	
		for (int i = 0; i < 3; i++) {
		  System.out.println();
	    for (int j = 0; j < 3; j++) {
	    	if (j == 0)
	    		System.out.print("|  ");
		  System.out.print(board[i][j] + " | ");
	    }
		}
		System.out.println();
	}
	
	public static boolean Fim(int lMov, int cMov) {
		//win perpendicular
		
	if (board[0][cMov] == board[1][cMov]
			&& board[0][cMov] == board[2][cMov])
       return true;
    if (board[lMov][0] == board[lMov][1]
    		&& board[lMov][0] == board[lMov][2])
       return true;
       
       //win diagonal
     
    if (board[0][0] == board [1][1] && 	board[0][0] == board [2][2]
    	&& board [1][1] != '_')
       return true;
    if (board[0][2] == board [1][1] && board [0][2] == board [2][0]
    		&& board[1][1] != '_')
       return true;
		
		return false;
	}
}

	