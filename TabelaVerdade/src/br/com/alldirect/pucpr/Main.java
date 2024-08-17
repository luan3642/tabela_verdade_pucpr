package br.com.alldirect.pucpr;

import java.util.Scanner;

public class Main {

	// método que valida variável a váriavel e retorna o seu valor lógico...
	public static char processaLogica(boolean variavel) {
		if (variavel) {
			return 'V';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) throws Throwable {
		
		
		boolean p = false, q = false,  r = false;
		// metodo Scanner para ler o input do usuario
		Scanner scan = new Scanner(System.in);

		String formula = "";

		// apresentacao do Menu
		System.out.println("0 - SAIR");
		System.out.println("1 - CONTINUAR");
		// obtem resposta do usuario
		int resposta = scan.nextInt();

	// continuar perguntando ao usuario se ele deseja continuar digitando as formulas
	while (resposta != 0 && resposta <=1) {


			System.out.println();
			switch (resposta) {
			case 0:
				// caso a resposta seja 0, o programa irá sair
				System.out.println("******EXIT******");
				break;
			case 1:
				
				System.out.println("Informe sua formula");
				formula = scan.next();

				// pega o tamanho da tamanho da formula
				switch (formula.length()) {
				// caso a formula seja do tamanho 1, ira cair aqui
				case 1: 
					
					// confere caracter a caracter da formula para ver se ela e valida
					if (formula.substring(0,1).equalsIgnoreCase("p")) {
						  System.out.println("+---+"); 
						  System.out.println("| p |"); 
						  System.out.println("+---+"); 
						
						boolean pAux = false;
						// aqui percorremos variavel a variavel, atribuindo seu valor logico na tabela verdade
						for (int i = 1; i <= 1; i++) {
							// caso seja do valor 1, estaremos na primeira linha da tabela
							switch (i) {
							case 1:
							    // atribui o valor lógico da tabela verdade
								p = true;
								pAux = false;
								break;

							}
							// exbibe tabela verdade
							System.out.println("|" + processaLogica(p) + "|"  );
							System.out.println("|" + processaLogica(pAux) + "|"  );

						}
						
							
					}else {
						// caso a formula esteja incorreta ela irá cair aqui
						System.err.println("FORMULA INCORRETA");

					}
					break;
					
				// caso a formula seja do tamanho 3, ira cair aqui
				case 2:
				// compara caracter a caracter para ver se o valor é condizente com a formula
			if ((formula.substring(0, 1).equalsIgnoreCase("¬") || formula.substring(0, 1).equalsIgnoreCase("~") ) && formula.substring(1,2).equalsIgnoreCase("p")) {
					System.out.println("+---+"); 
					System.out.println("|~p|"); 
					System.out.println("+---+");
						boolean pAux = false;
						// aqui percorremos variavel a variavel, atribuindo seu valor logico na tabela verdade
						for (int i = 1; i <= 1; i++) {
							switch (i) {
							// caso seja do valor 1, estaremos na primeira linha da tabela
							case 1:
								p = true;
								pAux = false;
								break;

							}
							
							// printa o valor da tabela verdade, aqui estamos negando o valor da tabela verdade,
							// pois a formula e negacao de p = ¬p
							System.out.println("|" + processaLogica(!p) + "|"  );
							System.out.println("|" + processaLogica(!pAux) + "|"  );

						}
							
						}else {
							System.err.println("FORMULA INCORRETA");
					}
					break;

				case 3:
					// compara caracter a caracter para ver se o valor é condizente com a formula
					if (formula.substring(0,1).equalsIgnoreCase("p") && (formula.substring(1, 2).equalsIgnoreCase("V")) && formula.substring(2, 3).equalsIgnoreCase("q")){
						// exibe a formula que vai ser calculada
						  System.out.println("+---+------+"); 
						  System.out.println("| p | v | q "); 
						  System.out.println("+---+------+"); 
						  // aqui percorremos variavel a variavel, atribuindo seu valor logico na tabela verdade
						for (int i = 1; i <= 4; i++) {
							switch (i) {
								// atribui os valores lógicos da tabela verdade
							case 1:
								p = true;
								q = true;
								break;

							case 2:
								p = true;
								q = false;
								break;
								
							case 3: 
								p = false;
								q = true;
								break;
							
							case 4: 
								p = false;
								q = false;
								break;
							}
							// exibe a tabela verdade, e faz a comparação entre P ou Q.
							System.out.println("|"+" " + processaLogica(p) + " |"+ " "+ processaLogica(p || q) + " |"  + " "+processaLogica(q) );
							


						}
					}
						else  if (formula.substring(0,1).equalsIgnoreCase("p") && (formula.substring(1, 2).equalsIgnoreCase("ˆ") || formula.substring(1, 2).equalsIgnoreCase("^")) && formula.substring(2, 3).equalsIgnoreCase("q")){
							  // exibe a formula que vai ser calculada
							  System.out.println("+---+------+"); 
							  System.out.println("| p | ^ | q "); 
							  System.out.println("+---+------+"); 
							// aqui percorremos variavel a variavel, atribuindo seu valor logico na tabela verdade

							for (int i = 1; i <= 4; i++) {
								
								switch (i) {
									// atribui os valores lógicos da tabela verdade
								case 1:
									p = true;
									q = true;
									break;

								case 2:
									p = true;
									q = false;
									break;
									
								case 3: 
									p = false;
									q = true;
									break;
								
								case 4: 
									p = false;
									q = false;
									break;
								}
						       // exibe a tabela verdade, e faz a comparação entre P e Q.
								System.out.println("|"+" " + processaLogica(p) + " |"+ " "+ processaLogica(p && q) + " |"  + " "+processaLogica(q) );
								


							}
						
						
					} else{
						System.err.println("FORMULA INCORRETA");
					}
					break;

				case 4:
					if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && formula.substring(2,3).equalsIgnoreCase("V") && formula.substring(3,4).equalsIgnoreCase("q")) {
						
						  System.out.println("+---+------+"); 
						  System.out.println("| ~p | v | q "); 
						  System.out.println("+---+------+");
							for (int i = 1; i <= 4; i++) {
								switch (i) {
								case 1:
									p = false;
									q = true;
									break;

								case 2:
									p = false;
									q = false;
									break;
									
								case 3: 
									p = true;
									q = true;
									break;
								
								case 4: 
									p = true;
									q = false;
									break;
								}
								// exibe a tabela verdade, e faz a comparação entre P ou Q.

								System.out.println("|"+" " + processaLogica(p) + " |"+ " "+ processaLogica(p || q) + " |"  + " "+processaLogica(q) );

								


							}
						}
						
						
					
					
					else if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("^") || formula.substring(2,3).equalsIgnoreCase("ˆ")) && formula.substring(3,4).equalsIgnoreCase("q")) {
					
						  System.out.println("+---+------+"); 
						  System.out.println("| ~p | ^ | q "); 
						  System.out.println("+---+------+");
							for (int i = 1; i <= 4; i++) {
								switch (i) {
								case 1:
									p = false;
									q = true;
									break;

								case 2:
									p = false;
									q = false;
									break;
									
								case 3: 
									p = true;
									q = true;
									break;
								
								case 4: 
									p = true;
									q = false;
									break;
								}
								// exibe a tabela verdade, e faz a comparação entre P e Q.
								System.out.println("|"+"  " + processaLogica(p) + " |"+ " "+ processaLogica(p && q) + " |"  + " "+processaLogica(q) );

								


							}
						
						
					}
					
					else if((formula.substring(0,1).equalsIgnoreCase("p") && (formula.substring(1,2).equalsIgnoreCase("V")  || formula.substring(1,2).equalsIgnoreCase("ˆ") || formula.substring(1,2).equalsIgnoreCase("^"))) && (formula.substring(2,3).equalsIgnoreCase("¬") || formula.substring(2,3).equalsIgnoreCase("~")) && formula.substring(3,4).equalsIgnoreCase("q")) {
		
							if(formula.substring(1,2).equalsIgnoreCase("V")){
								 System.out.println("+---+------+"); 
							     System.out.println("| p | v | ~q "); 
							      System.out.println("+---+------+");
								for (int i = 1; i <= 4; i++) {
									switch (i) {
									case 1:
										p = true;
										q = false;
										break;

									case 2:
										p = true;
										q = true;
										break;
										
									case 3: 
										p = false;
										q = false;
										break;
									
									case 4: 
										p = false;
										q = true;
										break;
									}
									
									// exibe a tabela verdade, e faz a comparação entre P ou Q.
									System.out.println("|"+" " + processaLogica(p) + " |"+ " "+ processaLogica(p || q) + " |"  + " "+processaLogica(q) );

									


								}
							}
							
							if(formula.substring(1,2).equalsIgnoreCase("ˆ") || formula.substring(1,2).equalsIgnoreCase("^") ){
								 System.out.println("+---+------+"); 
							     System.out.println("| p | ^ | ~q "); 
							      System.out.println("+---+------+");
								for (int i = 1; i <= 4; i++) {
									switch (i) {
									case 1:
										p = true;
										q = false;
										break;

									case 2:
										p = true;
										q = true;
										break;
										
									case 3: 
										p = false;
										q = false;
										break;
									
									case 4: 
										p = false;
										q = true;
										break;
									}
								    // exibe a tabela verdade, e faz a comparação entre P e Q.
									System.out.println("|"+" " + processaLogica(p) + " |"+ " "+ processaLogica(p && q) + " |"  + " "+processaLogica(q) );



								}
							}	
							
							
					}else{
							System.err.println("FORMULA INCORRETA");
						}
					
					
	
					break;
					
				case 5:
				     
					if((formula.substring(0,1).equalsIgnoreCase("¬") ||(formula.substring(0,1).equalsIgnoreCase("~") ) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("V") || formula.substring(2,3).equalsIgnoreCase("^") || formula.substring(2,3).equalsIgnoreCase("ˆ")) && (formula.substring(3,4).equalsIgnoreCase("¬") || formula.substring(3,4).equalsIgnoreCase("~")) && formula.substring(4,5).equalsIgnoreCase("q")))  {
						
					
						// caso o valor da formula começe com o E lógico representado por ^ (a tabela verdade será exibida aqui)
						if(formula.substring(2,3).equalsIgnoreCase("ˆ") || formula.substring(2,3).equalsIgnoreCase("^") ){
							System.out.println("+---+------+"); 
						     System.out.println("| ~p | ^ | ~q "); 
						      System.out.println("+---+------+");
							for (int i = 1; i <= 4; i++) {
								switch (i) {
								case 1:
									p = false;
									q = false;
									break;

								case 2:
									p = false;
									q = true;
									break;
									
								case 3: 
									p = true;
									q = false;
									break;
								
								case 4: 
									p = true;
									q = true;
									break;
								}
				                // exibe a tabela verdade, e faz a comparação entre P e Q.
								System.out.println("|"+" " + processaLogica(p) + "  |"+ " "+ processaLogica(p && q) + " |"  + " "+processaLogica(q) );

								


							}
						}
						// caso o valor da formula começe com o OU lógico representado por v (a tabela verdade será exibida aqui)
						if(formula.substring(2,3).equalsIgnoreCase("v")){
							  System.out.println("+---+------+"); 
						      System.out.println("| ~p | v | ~q "); 
						      System.out.println("+---+------+");
							for (int i = 1; i <= 4; i++) {
								switch (i) {
								case 1:
									p = false;
									q = false;
									break;

								case 2:
									p = false;
									q = true;
									break;
									
								case 3: 
									p = true;
									q = false;
									break;
								
								case 4: 
									p = true;
									q = true;
									break;
								}
							    // exibe a tabela verdade, e faz a comparação entre P ou Q.
								System.out.println("|"+" " + processaLogica(p) + "  |"+ " "+ processaLogica(p || q) + " |"  + " "+processaLogica(q) );


							}
						}
						
					// aqui temos que cuidar que não podemos ter uma fórmula lógica com conectivos repetidos, por exemplo (P V Q V R) ou (P ^ Q ^ R)
					} else if((formula.substring(0,1).equalsIgnoreCase("p")) &&  (formula.substring(1,2).equalsIgnoreCase("V")) && formula.substring(2,3).equalsIgnoreCase("q") && (formula.substring(3,4).equalsIgnoreCase("^") || formula.substring(3,4).equalsIgnoreCase("ˆ")) && formula.substring(4,5).equalsIgnoreCase("r"))  {
						 
						  System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | v | q | ^ | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						  // aqui temos uma tabela verdade com 8 linhas pois é 2 elevado a 3.
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = true; r = true;
								break;

							case 2:
								p = true; q = true; r = false; 
								break;
								
							case 3: 
								p = true; q = false; r = true; 
								break;
							
							case 4: 
								p = true; q = false; r = false; 
								break;
								
							case 5:
								p = false; q = true; r = true; 
							    break; 
							
							case 6:
								p = false; q = true; r = false; 
							    break; 
							    
							
							case 7:
								p = false; q = false; r = true; 
							    break; 
							    
							case 8:
								p = false; q = false; r = false; 
								break;
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
					        // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );


						}
					} else if (formula.substring(0,1).equalsIgnoreCase("p") &&  (formula.substring(1,2).equalsIgnoreCase("ˆ") || formula.substring(1,2).equalsIgnoreCase("^")) && formula.substring(2,3).equalsIgnoreCase("q") && (formula.substring(3,4).equalsIgnoreCase("v")) && formula.substring(4,5).equalsIgnoreCase("r"))  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | ^ | q | v | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true;
								q = true;
								r = true;
								break;

							case 2:
								p = true; q = true; r = false; 
								break;
								
							case 3: 
								p = true; q = false; r = true; 
								break;
							
							case 4: 
								p = true; q = false; r = false; 
								break;
								
							case 5:
								p = false; q = true; r = true; 
							    break; 
							
							case 6:
								p = false; q = true; r = false; 
							    break; 
							    
							
							case 7:
								p = false; q = false; r = true; 
							    break; 
							    
							case 8:
								p = false; q = false; r = false; 
								break;
							}
						     // aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );


						}
					} 
					else{
						System.err.println("FORMULA INCORRETA");
					}
					break;
					
					
				case 6:
					if((formula.substring(0,1).equalsIgnoreCase("¬") || (formula.substring(0,1).equalsIgnoreCase("~") ) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("V")) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("ˆ") || formula.substring(4,5).equalsIgnoreCase("^") ) && formula.substring(5,6).equalsIgnoreCase("r") ))  {
						  System.out.println("+---+---+---+-------+"); 
						  System.out.println("|¬p | v | q | ^ | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = true; r = true;
								break;

							case 2:
								p = false; q = true; r = false; 
								break;
								
							case 3: 
								p = false; q = false; r = true; 
								break;
							
							case 4: 
								p = false; q = false; r = false; 
								break;
								
							case 5:
								p = true; q = true; r = true; 
							    break; 
							
							case 6:
								p = true; q = true; r = false; 
							    break; 
							    
							
							case 7:
								p = true; q = false; r = true; 
							    break; 
							    
							case 8:
								p = true; q = false; r = false; 
								break;
							}	
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
			                // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.

							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );


						}
					} else if ((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("ˆ") || formula.substring(2,3).equalsIgnoreCase("^")) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("v")) && formula.substring(5,6).equalsIgnoreCase("r") )  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | ^ | q | v | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = true; r = true;
								break;

							case 2:
								p = false; q = true; r = false; 
								break;
								
							case 3: 
								p = false; q = false; r = true; 
								break;
							
							case 4: 
								p = false; q = false; r = false; 
								break;
								
							case 5:
								p = true; q = true; r = true; 
							    break; 
							
							case 6:
								p = true; q = true; r = false; 
							    break; 
							    
							
							case 7:
								p = true; q = false; r = true; 
							    break; 
							    
							case 8:
								p = true; q = false; r = false; 
								break;
							
							}
				           // aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.

							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );


						}
						
						
						
					} else if((formula.substring(0,1).equalsIgnoreCase("p")) &&  (formula.substring(1,2).equalsIgnoreCase("V")) && (formula.substring(2,3).equalsIgnoreCase("¬") || formula.substring(2,3).equalsIgnoreCase("~") ) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("^") || formula.substring(4,5).equalsIgnoreCase("ˆ")) && formula.substring(5,6).equalsIgnoreCase("r"))  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | v | ¬q | ^ | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = false; r = true;
								break;

							case 2:
								p = true; q = false; r = false; 
								break;
								
							case 3: 
								p = true; q = true; r = true; 
								break;
							
							case 4: 
								p = true; q = true; r = false; 
								break;
								
							case 5:
								p = false; q = false; r = true; 
							    break; 
							
							case 6:
								p = false; q = false; r = false; 
							    break; 
							    
							
							case 7:
								p = false; q = true; r = true; 
							    break; 
							    
							case 8:
								p = false; q = true; r = false;
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
	                        // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );

						}
					
					} else if((formula.substring(0,1).equalsIgnoreCase("p")) &&  (formula.substring(1,2).equalsIgnoreCase("ˆ") || formula.substring(1,2).equalsIgnoreCase("^")) && (formula.substring(2,3).equalsIgnoreCase("¬") || formula.substring(2,3).equalsIgnoreCase("~"))  && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("v")) && formula.substring(5,6).equalsIgnoreCase("r"))  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | ^ | ¬q | v | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = false; r = true;
								break;

							case 2:
								p = true; q = false; r = false; 
								break;
								
							case 3: 
								p = true; q = true; r = true; 
								break;
							
							case 4: 
								p = true; q = true; r = false; 
								break;
								
							case 5:
								p = false; q = false; r = true; 
							    break; 
							
							case 6:
								p = false; q = false; r = false; 
							    break; 
							    
							
							case 7:
								p = false; q = true; r = true; 
							    break; 
							    
							case 8:
								p = false; q = true; r = false;
								break;
							
							}
						     // aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );


						}
						
						
					} else if (formula.substring(0,1).equalsIgnoreCase("p") &&  (formula.substring(1,2).equalsIgnoreCase("ˆ") || formula.substring(1,2).equalsIgnoreCase("^")) && formula.substring(2,3).equalsIgnoreCase("q") && formula.substring(3,4).equalsIgnoreCase("v") && (formula.substring(4,5).equalsIgnoreCase("¬") || formula.substring(4,5).equalsIgnoreCase("~")) && formula.substring(5,6).equalsIgnoreCase("r"))  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | ^ | q | v | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = true; r = false;
								break;

							case 2:
								p = true; q = true; r = true; 
								break;
								
							case 3: 
								p = true; q = false; r = false; 
								break;
							
							case 4: 
								p = true; q = false; r = true; 
								break;
								
							case 5:
								p = false; q = true; r = false; 
							    break; 
							
							case 6:
								p = false; q = true; r = true; 
							    break; 
							    
							
							case 7:
								p = false; q = false; r = false; 
							    break; 
							    
							case 8:
								p = false; q = false; r = true; 
								break;
							
							}
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );


						}
					} 
					
				  else if (formula.substring(0,1).equalsIgnoreCase("p") &&  (formula.substring(1,2).equalsIgnoreCase("v") ) && formula.substring(2,3).equalsIgnoreCase("q") && (formula.substring(3,4).equalsIgnoreCase("ˆ") || formula.substring(3,4).equalsIgnoreCase("^")) && (formula.substring(4,5).equalsIgnoreCase("¬") || formula.substring(4,5).equalsIgnoreCase("~"))  && formula.substring(5,6).equalsIgnoreCase("r"))  {
						 System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | v | q | ^ | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = true; r = false;
								break;

							case 2:
								p = true; q = true; r = true; 
								break;
								
							case 3: 
								p = true; q = false; r = false; 
								break;
							
							case 4: 
								p = true; q = false; r = true; 
								break;
								
							case 5:
								p = false; q = true; r = false; 
							    break; 
							
							case 6:
								p = false; q = true; r = true; 
							    break; 
							    
							
							case 7:
								p = false; q = false; r = false; 
							    break; 
							    
							case 8:
								p = false; q = false; r = true; 
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );
					} 
				 }
					
					else{
						System.err.println("FORMULA INCORRETA");
					}
					break;
					
				case 7:
					
					if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("V")) && (formula.substring(3,4).equalsIgnoreCase("¬") || formula.substring(3,4).equalsIgnoreCase("~")) && formula.substring(4,5).equalsIgnoreCase("q") && (formula.substring(5,6).equalsIgnoreCase("^") || formula.substring(5,6).equalsIgnoreCase("ˆ") ) && formula.substring(6,7).equalsIgnoreCase("r") )  {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | v | ¬q | ^ | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = false; r = true;
								break;

							case 2:
								p = false; q = false; r = false; 
								break;
								
							case 3: 
								p = false; q = true; r = true; 
								break;
							
							case 4: 
								p = false; q = true; r = false; 
								break;
								
							case 5:
								p = true; q = false; r = true; 
							    break; 
							
							case 6:
								p = true; q = false; r = false; 
							    break; 
							    
							
							case 7:
								p = true; q = true; r = true; 
							    break; 
							    
							case 8:
								p = true; q = true; r = false; 
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
						    // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + "  |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );
						}
					
					} 
					
					else if ((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("^") || formula.substring(2,3).equalsIgnoreCase("ˆ")) && (formula.substring(3,4).equalsIgnoreCase("¬") || formula.substring(3,4).equalsIgnoreCase("~")) && formula.substring(4,5).equalsIgnoreCase("q") && (formula.substring(5,6).equalsIgnoreCase("v")) && formula.substring(6,7).equalsIgnoreCase("r")) {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | ^ | ¬q | v | R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = false; r = true;
								break;

							case 2:
								p = false; q = false; r = false; 
								break;
								
							case 3: 
								p = false; q = true; r = true; 
								break;
							
							case 4: 
								p = false; q = true; r = false; 
								break;
								
							case 5:
								p = true; q = false; r = true; 
							    break; 
							
							case 6:
								p = true; q = false; r = false; 
							    break; 
							    
							
							case 7:
								p = true; q = true; r = true; 
							    break; 
							    
							case 8:
								p = true; q = true; r = false; 
								break;
							
							}
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );

						}
					} 
					else if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("V")) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("^") || formula.substring(4,5).equalsIgnoreCase("ˆ")  ) && (formula.substring(5,6).equalsIgnoreCase("¬") || formula.substring(5,6).equalsIgnoreCase("~") ) && formula.substring(6,7).equalsIgnoreCase("r") )  {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | v | q | ^ | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = true; r = false;
								break;

							case 2:
								p = false; q = true; r = true; 
								break;
								
							case 3: 
								p = false; q = false; r = false; 
								break;
							
							case 4: 
								p = false; q = false; r = true; 
								break;
								
							case 5:
								p = true; q = true; r = false; 
							    break; 
							
							case 6:
								p = true; q = true; r = true; 
							    break; 
							    
							
							case 7:
								p = true; q = false; r = false; 
							    break; 
							    
							case 8:
								p = true; q = false; r = true; 
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + "  |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );

						}
					}
					else if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~") ) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("^") || formula.substring(2,3).equalsIgnoreCase("ˆ") ) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("v") ) && (formula.substring(5,6).equalsIgnoreCase("¬") || formula.substring(5,6).equalsIgnoreCase("~") ) && formula.substring(6,7).equalsIgnoreCase("r") )  {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | ^ | q | v | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = true; r = false;
								break;

							case 2:
								p = false; q = true; r = true; 
								break;
								
							case 3: 
								p = false; q = false; r = false; 
								break;
							
							case 4: 
								p = false; q = false; r = true; 
								break;
								
							case 5:
								p = true; q = true; r = false; 
							    break; 
							
							case 6:
								p = true; q = true; r = true; 
							    break; 
							    
							
							case 7:
								p = true; q = false; r = false; 
							    break; 
							    
							case 8:
								p = true; q = false; r = true; 
								break;
							
							}
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );

						}
					}
					else if(formula.substring(0,1).equalsIgnoreCase("p") && formula.substring(1,2).equalsIgnoreCase("v") && (formula.substring(2,3).equalsIgnoreCase("¬") || formula.substring(2,3).equalsIgnoreCase("~")) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("^") || formula.substring(4,5).equalsIgnoreCase("ˆ") ) && (formula.substring(5,6).equalsIgnoreCase("¬") || formula.substring(5,6).equalsIgnoreCase("~") ) && formula.substring(6,7).equalsIgnoreCase("r") )  {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | v | ¬q | ^ | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = false; r = false;
								break;

							case 2:
								p = true; q = false; r = true; 
								break;
								
							case 3: 
								p = true; q = true; r = false; 
								break;
							
							case 4: 
								p = true; q = true; r = true; 
								break;
								
							case 5:
								p = false; q = false; r = false; 
							    break; 
							
							case 6:
								p = false; q = false; r = true; 
							    break; 
							    
							
							case 7:
								p = false; q = true; r = false; 
							    break; 
							    
							case 8:
								p = false; q = true; r = true; 
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
						    // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + "  |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );

						}
					}
					else if(formula.substring(0,1).equalsIgnoreCase("p") && (formula.substring(1,2).equalsIgnoreCase("^") || formula.substring(1,2).equalsIgnoreCase("ˆ") ) && (formula.substring(2,3).equalsIgnoreCase("¬") || formula.substring(2,3).equalsIgnoreCase("~")) && formula.substring(3,4).equalsIgnoreCase("q") && (formula.substring(4,5).equalsIgnoreCase("v")) && (formula.substring(5,6).equalsIgnoreCase("¬") || formula.substring(5,6).equalsIgnoreCase("~")) && formula.substring(6,7).equalsIgnoreCase("r") )  {
						  System.out.println("+---+---+---+-------+"); 
						  System.out.println("| p | ^ | ¬q | v | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = true; q = false; r = false;
								break;

							case 2:
								p = true; q = false; r = true; 
								break;
								
							case 3: 
								p = true; q = true; r = false; 
								break;
							
							case 4: 
								p = true; q = true; r = true; 
								break;
								
							case 5:
								p = false; q = false; r = false; 
							    break; 
							
							case 6:
								p = false; q = false; r = true; 
							    break; 
							    
							
							case 7:
								p = false; q = true; r = false; 
							    break; 
							    
							case 8:
								p = false; q = true; r = true; 
								break;
							
							}
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + " |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   " |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );

						}
					}
					
					else {
						System.err.println("FORMULA INCORRETA");
					}
					
					break;
					
				case 8:
					if((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~") ) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("V")) && (formula.substring(3,4).equalsIgnoreCase("¬") || formula.substring(3,4).equalsIgnoreCase("~")) && formula.substring(4,5).equalsIgnoreCase("q") && (formula.substring(5,6).equalsIgnoreCase("^") || formula.substring(5,6).equalsIgnoreCase("ˆ") ) && (formula.substring(6,7).equalsIgnoreCase("¬") || formula.substring(6,7).equalsIgnoreCase("~")) && formula.substring(7,8).equalsIgnoreCase("r") )  {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | v | ¬q | ^ | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = false; r = false;
								break;

							case 2:
								p = false; q = false; r = true; 
								break;
								
							case 3: 
								p = false; q = true; r = false; 
								break;
							
							case 4: 
								p = false; q = true; r = true; 
								break;
								
							case 5:
								p = true; q = false; r = false; 
							    break; 
							
							case 6:
								p = true; q = false; r = true; 
							    break; 
							    
							
							case 7:
								p = true; q = true; r = false; 
							    break; 
							    
							case 8:
								p = true; q = true; r = true; 
								break;
							
							}
							// aqui depois de debugar o código, descobrimos que precisamos realizar o calculo de Q e R, primeiro.
							processaLogica(result = q && r);
						    // aqui exibimos a tabela verdade, fazemos a comparação primeiro de q && r, em seguida comparamos esse resultado com a variável P.
							System.out.println("| " + processaLogica(p) + "  |" + " " +processaLogica(result2 = p || result) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result = q && r))+ " |" + " "+ processaLogica(r) );

						}
						
				    }  else if ((formula.substring(0,1).equalsIgnoreCase("¬") || formula.substring(0,1).equalsIgnoreCase("~")) && formula.substring(1,2).equalsIgnoreCase("p") && (formula.substring(2,3).equalsIgnoreCase("^") || formula.substring(2,3).equalsIgnoreCase("ˆ")) && (formula.substring(3,4).equalsIgnoreCase("¬") || formula.substring(3,4).equalsIgnoreCase("~"))  && formula.substring(4,5).equalsIgnoreCase("q") && (formula.substring(5,6).equalsIgnoreCase("v")) && (formula.substring(6,7).equalsIgnoreCase("~")) && formula.substring(7,8).equalsIgnoreCase("r")) {
						System.out.println("+---+---+---+-------+"); 
						  System.out.println("| ¬p | ^ | ¬q | v | ¬R"); 
						  System.out.println("+---+---+---+-------+"); 
						  boolean result = false, result2 = false;
						for (int i = 1; i <= 8; i++) {
							switch (i) {
							case 1:
								p = false; q = false; r = false;
								break;

							case 2:
								p = false; q = false; r = true; 
								break;
								
							case 3: 
								p = false; q = true; r = false; 
								break;
							
							case 4: 
								p = false; q = true; r = true; 
								break;
								
							case 5:
								p = true; q = false; r = false; 
							    break; 
							
							case 6:
								p = true; q = false; r = true; 
							    break; 
							    
							
							case 7:
								p = true; q = true; r = false; 
							    break; 
							    
							case 8:
								p = true; q = true; r = true; 
								break;
							
							}
							// aqui exibimos a tabela verdade, fazemos a comparação primeiro de p && q, em seguida comparamos esse resultado com a variável R.
							System.out.println("| " + processaLogica(p) + "  |" + " " +processaLogica(result = p && q) + " |" +" "+  processaLogica(q) +   "  |"+ " "+ (processaLogica(result2 = result || r))+ " |" + " "+ processaLogica(r) );
						}
						
					
				    }
				    else {
						System.err.println("FORMULA INCORRETA");
					}
					
					break;
					
				default:
					System.err.println("FORMULA INCORRETA, ultrapassando limite....");

				
			
			}

				System.out.println();
				
				Thread.sleep(1000);
				System.out.println("SAIR OU CONTINUAR?");
				resposta=scan.nextInt();
			



}
	
	}
	
	System.err.println("SAIU.......");

	}
}
