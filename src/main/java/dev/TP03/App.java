package dev.TP03;

import java.util.Scanner;

/**
 * Pizza world!!! Exercice where we practice loops, and tables.
 *@author Paupau
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String [][] pizzas= new String [20][];
    	pizzas[0]= new String[] {"0","PEP","Peperoni","12.5"};
    	pizzas[1]= new String[] {"1","MAR","Margherita","14"};
    	pizzas[2]= new String[] {"2","REI","La Reine","11.5"};
    	pizzas[3]= new String[] {"3","FRO","La 4 fromages","12"};
    	pizzas[4]= new String[] {"4","CAN","La Cannibale","12.5"};
    	pizzas[5]= new String[] {"5","SAV","La savoyarde","13.0"};
    	pizzas[6]= new String[] {"6","ORI","L'orientale","13.5"};
    	pizzas[7]= new String[] {"7","IND","L'indienne","14"};
    	
    	int numPizzas = 8;
    	
        System.out.println( "***** Pizzeria Administration *****" );

        
        System.out.println( "1. Lister les pizzas" );
        System.out.println( "2. Ajouter une nouvelle pizza" );
        System.out.println( "3. Mettre à jour une pizza" );
        System.out.println( "4. Supprimer une pizza" );
        System.out.println( "99. Sortir" );
        
        
        Scanner scann= new Scanner(System.in) ;
        int a=scann.nextInt();
        
        
        while (a!=99){
        	
        	switch(a){
        	
        		case (1):
        		int i=0;
        		while (i<numPizzas){
        		System.out.println( pizzas[i][1]+ "-->" +pizzas[i][2]+'('+pizzas[i][3]+"€)");
        		i++;}
        		break;
        		
        		case (2):
        			pizzas[numPizzas]= new String[4];
        		pizzas[numPizzas][0]=Integer.toString(numPizzas);
        		 System.out.println( "Veuillez saisir le code" );
        		 pizzas[numPizzas][1]=scann.next();
        		 System.out.println( "Veuillez saisir le nom (sans espace)" );
        		 pizzas[numPizzas][2]=scann.next();
        		 System.out.println( "Veuillez saisir le prix" );
        		 pizzas[numPizzas][3]=scann.next();
        		 numPizzas++;
        		 break;
        	
        		case (3):
        		System.out.println( "Veuillez saisir le code de la pizza a modifier:" );
        		System.out.println( "99 pour abandonner" );
        		a=scann.nextInt();
        			if (a!=99){
        		a--;
        		System.out.println( "Introduisez le noveau code" );
       		 	pizzas[a][1]=scann.next();
       		 	System.out.println( "Introduisez le noveau nom (sans espace)" );
       		 	pizzas[a][2]=scann.next();
       		 	System.out.println( "Introduisez le noveau prix" );
       		 	pizzas[a][3]=scann.next();}

        		case (4):
        			System.out.println( "Veuillez saisir le code de la pizza a eliminer:" );
        		System.out.println( "99 pour abandonner" );
        		String code =scann.next();
        		
        		
        	
		
        			if (a!=99){
        			
        				/*Busqueda del codigo */
        				a=0;
                		boolean c=false;
                		do{
                			
                			if (code.equals(pizzas[a][1])){
                				c=true;}
                			else {a++;}
                			
                		}while (c==false);
                		
        				//Reestructuracion de la tabla
        				while(a<(numPizzas-1)) {
        					
        					int b=a+1;
        					pizzas[a][1]=pizzas[b][1];
            				pizzas[a][2]=pizzas[b][2];
            				pizzas[a][3]=pizzas[b][3];
            				a++;
        					
        				}
        				
        				pizzas[a][1]=null;
        				pizzas[a][2]=null;
        				pizzas[a][3]=null;
        				numPizzas--;
        			}
        			break;
        		default :}
        	
            System.out.println( "1. Lister les pizzas" );
            System.out.println( "2. Ajouter une nouvelle pizza" );
            System.out.println( "3. Mettre à jour une pizza" );
            System.out.println( "4. Supprimer une pizza" );
            System.out.println( "99. Sortir" );
        	
            a=scann.nextInt();
            
        }
        
    }
}
