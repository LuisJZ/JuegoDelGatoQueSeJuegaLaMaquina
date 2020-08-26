import java.util.Scanner;

public class JgatoReseulveSolo {
	public static void main(String args[]) {
		
String[][] posicion = {{" "," "," "},{" "," "," "},{" "," "," "}};
		
		Scanner teclado = new Scanner(System.in);
		//Declaro la matriz de posiciones
		
		
		//Variables para la seleccion del jugador
		int posicionX, posicionY, aux_X,aux_Y;
		
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flagWin = false;
		
		System.out.println("          |          |          ");
		System.out.println("    " + posicion[0][0] +  "     |    " + posicion[0][1] + "     |    " + posicion[0][2] + "     ");
		System.out.println("          |          |          ");
		System.out.println("----------|----------|----------");
		System.out.println("          |          |          ");
		System.out.println("    " + posicion[1][0] +  "     |    " + posicion[1][1] + "     |    " + posicion[1][2] + "     ");
		System.out.println("          |          |          ");
		System.out.println("----------|----------|----------");
		System.out.println("          |          |          ");
		System.out.println("    " + posicion[2][0] +  "     |    " + posicion[2][1] + "     |    " + posicion[2][2] + "     ");
		System.out.println("          |          |          ");
		
		do {
			
			do {
				
				System.out.println("Selecione la coordenada X");
				posicionX = teclado.nextInt();
				
				
				System.out.println("Selecione la coordenada Y");
				posicionY = teclado.nextInt();
				//validar 0 1 2
				if(posicion[posicionX][posicionY] == " ") {
					posicion[posicionX][posicionY] ="X";
					flag1 = true;
				}else {
					System.out.println("Espacio ocupado");
				}
			}while(flag1 == false);
		
			for(int i=0; i<10; i++) {
				System.out.println("");
			}
		
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[0][0] +  "     |    " + posicion[0][1] + "     |    " + posicion[0][2] + "     ");
			System.out.println("          |          |          ");
			System.out.println("----------|----------|----------");
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[1][0] +  "     |    " + posicion[1][1] + "     |    " + posicion[1][2] + "     ");
			System.out.println("          |          |          ");
			System.out.println("----------|----------|----------");
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[2][0] +  "     |    " + posicion[2][1] + "     |    " + posicion[2][2] + "     ");
			System.out.println("          |          |          ");
			
			if((posicion[0][0] == "X" && posicion[0][1] == "X" && posicion[0][2] == "X") || (posicion[1][0] == "X" && posicion[1][1] == "X" && posicion[1][2] == "X")
					|| (posicion[2][0] == "X" && posicion[2][1] == "X" && posicion[2][2] == "X") || (posicion[0][0] == "X" && posicion[1][0] == "X" && posicion[2][0] == "X")
					|| (posicion[0][1] == "X" && posicion[1][1] == "X" && posicion[2][1] == "X") || (posicion[0][2] == "X" && posicion[1][2] == "X" && posicion[2][2] == "X")
					|| (posicion[0][0] == "X" && posicion[1][1] == "X" && posicion[2][2] == "X") || (posicion[0][2] == "X" && posicion[1][1] == "X" && posicion[2][0] == "X")) {
			
				System.out.println("Jugador Gana");
				flagWin = true;
				break;
			}
			
			if(posicion[0][0] != " " && posicion[0][1] != " " && posicion[0][2] != " " 
					&& posicion[1][0] != " " && posicion[1][1] != " " && posicion[1][2] != " "
					&& posicion[2][0] != " " && posicion[2][1] != " " && posicion[2][2] != " ") {
				
				System.out.println("Empate!!");
				break;
			}
			
			for(int i=0; i<10; i++) {
				System.out.println("");
			}
			
		
			do {
				//ASEGURAR VICTORIA
				if(posicion[0][0] == "O" && posicion[0][1] == "O" && posicion[0][2] == " ") {
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[1][0] == "O" && posicion[1][1] == "O" && posicion[1][2] == " "){
					posicion[1][2] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "O" && posicion[2][1] == "O" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "O" && posicion[1][0] == "O" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[0][1] == "O" && posicion[1][1] == "O" && posicion[2][1] == " "){
					posicion[2][1] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "O" && posicion[1][2] == "O" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "O" && posicion[1][0] == "O" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[2][1] == "O" && posicion[1][1] == "O" && posicion[0][1] == " "){
					posicion[0][1] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "O" && posicion[1][2] == "O" && posicion[0][2] == " "){
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "O" && posicion[0][1] == "O" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[1][2] == "O" && posicion[1][1] == "O" && posicion[1][0] == " "){
					posicion[1][0] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "O" && posicion[2][1] == "O" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "O" && posicion[1][1] == "O" && posicion[0][2] == " "){
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "O" && posicion[1][1] == "O" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "O" && posicion[1][1] == "O" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "O" && posicion[1][1] == "O" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "O" && posicion[1][0] == " " && posicion[2][0] == "O"){
					posicion[1][0] = "O";
					flag2 = true;
				}else if(posicion[0][1] == "O" && posicion[1][1] == " " && posicion[2][1] == "O"){
					posicion[1][1] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "O" && posicion[1][2] == " " && posicion[2][2] == "O"){
					posicion[1][2] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "O" && posicion[0][1] == " " && posicion[0][2] == "O"){
					posicion[0][1] = "O";
					flag2 = true;
				}else if(posicion[1][0] == "O" && posicion[1][1] == " " && posicion[1][2] == "O"){
					posicion[1][1] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "O" && posicion[2][1] == " " && posicion[2][2] == "O"){
					posicion[2][1] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "O" && posicion[1][1] == " " && posicion[2][2] == "O"){
						posicion[1][1] = "O";
						flag2 = true;
				}else if(posicion[0][2] == "O" && posicion[1][1] == " " && posicion[2][0] == "O"){
							posicion[1][1] = "O";
							flag2 = true;

				//TAPAR
				} else if(posicion[0][0] == "X" && posicion[0][1] == "X" && posicion[0][2] == " ") {
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[1][0] == "X" && posicion[1][1] == "X" && posicion[1][2] == " "){
					posicion[1][2] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "X" && posicion[2][1] == "X" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "X" && posicion[1][0] == "X" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[0][1] == "X" && posicion[1][1] == "X" && posicion[2][1] == " "){
					posicion[2][1] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "X" && posicion[1][2] == "X" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "X" && posicion[1][0] == "X" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[2][1] == "X" && posicion[1][1] == "X" && posicion[0][1] == " "){
					posicion[0][1] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "X" && posicion[1][2] == "X" && posicion[0][2] == " "){
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "X" && posicion[0][1] == "X" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[1][2] == "X" && posicion[1][1] == "X" && posicion[1][0] == " "){
					posicion[1][0] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "X" && posicion[2][1] == "X" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "X" && posicion[1][1] == "X" && posicion[0][2] == " "){
					posicion[0][2] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "X" && posicion[1][1] == "X" && posicion[2][0] == " "){
					posicion[2][0] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "X" && posicion[1][1] == "X" && posicion[2][2] == " "){
					posicion[2][2] = "O";
					flag2 = true;
				}else if(posicion[2][2] == "X" && posicion[1][1] == "X" && posicion[0][0] == " "){
					posicion[0][0] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "X" && posicion[1][0] == " " && posicion[2][0] == "X"){
					posicion[1][0] = "O";
					flag2 = true;
				}else if(posicion[0][1] == "X" && posicion[1][1] == " " && posicion[2][1] == "X"){
					posicion[1][1] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "X" && posicion[1][2] == " " && posicion[2][2] == "X"){
					posicion[1][2] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "X" && posicion[0][1] == " " && posicion[0][2] == "X"){
					posicion[0][1] = "O";
					flag2 = true;
				}else if(posicion[1][0] == "X" && posicion[1][1] == " " && posicion[1][2] == "X"){
					posicion[1][1] = "O";
					flag2 = true;
				}else if(posicion[2][0] == "X" && posicion[2][1] == " " && posicion[2][2] == "X"){
					posicion[2][1] = "O";
					flag2 = true;
				}else if(posicion[0][0] == "X" && posicion[1][1] == " " && posicion[2][2] == "X"){
					posicion[1][1] = "O";
					flag2 = true;
				}else if(posicion[0][2] == "X" && posicion[1][1] == " " && posicion[2][0] == "X"){
						posicion[1][1] = "O";
						flag2 = true;
				}else {
					aux_X = (int) (Math.random()*3);
					aux_Y = (int) (Math.random()*3);
					if(posicion[aux_X][aux_Y] == " ") {
						posicion[aux_X][aux_Y] ="O";
						flag2 = true;
					}
				}
				
				
			}while(flag2 == false);
		
			
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[0][0] +  "     |    " + posicion[0][1] + "     |    " + posicion[0][2] + "     ");
			System.out.println("          |          |          ");
			System.out.println("----------|----------|----------");
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[1][0] +  "     |    " + posicion[1][1] + "     |    " + posicion[1][2] + "     ");
			System.out.println("          |          |          ");
			System.out.println("----------|----------|----------");
			System.out.println("          |          |          ");
			System.out.println("    " + posicion[2][0] +  "     |    " + posicion[2][1] + "     |    " + posicion[2][2] + "     ");
			System.out.println("          |          |          ");	
			
			if((posicion[0][0] == "" && posicion[0][1] == "O" && posicion[0][2] == "O") || (posicion[1][0] == "O" && posicion[1][1] == "O" && posicion[1][2] == "O")
					|| (posicion[2][0] == "O" && posicion[2][1] == "O" && posicion[2][2] == "O") || (posicion[0][0] == "O" && posicion[1][0] == "O" && posicion[2][0] == "O")
					|| (posicion[0][1] == "O" && posicion[1][1] == "O" && posicion[2][1] == "O") || (posicion[0][2] == "O" && posicion[1][2] == "O" && posicion[2][2] == "O")
					|| (posicion[0][0] == "O" && posicion[1][1] == "O" && posicion[2][2] == "O") || (posicion[0][2] == "O" && posicion[1][1] == "O" && posicion[2][0] == "O")) {
			
				System.out.println("Maquina Gana");
				flagWin = true;
				break;
			}
			
			flag1 = false;
			flag2 = false;
		
		}while(flagWin == false);
		
		
		
		
	}
	
	
	
}
