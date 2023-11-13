
package codigo_pokemon;

import java.util.Scanner;

public class Codigo_pokemon {

    int  nivel;
    String nombre;
    int hp;
    int ataque;
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hola entrenador");
        System.out.println("");
        System.out.println("Que es lo que quieres hacer?");
        System.out.println("1.Pelear con otro pokemon");
        System.out.println("2.Ver las estadisticas del pokemon seleccionado");
        System.out.println("3.Salir");
        int a=sc.nextInt();
        
        switch(a){
            case 1:
             System.out.println("Has elegido la opcion de pelear con otro pokemon");
             System.out.println("QUE POKEMON QUIERES ELEGIR");
                System.out.println("-----------------------------");
             System.out.println("1.Articuno"); 
             System.out.println("2.Zapdos");  
             System.out.println("3.Moltres"); 
                int b=sc.nextInt();
                    switch(b)
                {
                    case 1:
                            System.out.println("HAS ELEGIDO A ARTICUNO");
                        break;
                    case 2:
                            System.out.println("HAS ELEGIDO A ZAPDOS");
                         break;
                    case 3:
                            System.out.println("HAS ELEGIDO A MOLTRES");
                        break;
              System.out.println("QUE POKEMON QUIERES ELEGIR PARA PELEAR:");
              System.out.println("1.Articuno"); 
              System.out.println("2.Zapdos");  
              System.out.println("3.Moltres"); 
                int c=sc.nextInt();
                switch(c)
                {
                  case 1:
                    if(b=1 && c=1){
                        
                    System.out.println("HAS ELEGIDO A ARTICUNO PARA PELEAR");
                        break;
                    case 2:
                            System.out.println("HAS ELEGIDO A ZAPDOS PARA PELAR");
                         break;
                    case 3:
                            System.out.println("HAS ELEGIDO A MOLTRES PARA PELEAR");
                        break;
                }
                }
            
            
            
            }
            
          case 1:
            System.out.println("QUE POKEMON QUIERES ELEGIR");
              System.out.println("1.Articuno"); 
              System.out.println("1.Zapdos");  
              System.out.println("1.Moltres"); 
              int b=sc.nextInt();
              
              switch(b)
              {
                  case 1:
                      System.out.println("HAS ELEGIDO A ARTICUNO");
                      break;
                  case 2:
                      System.out.println("HAS ELEGIDO A ZAPDOS");
                      break;
                  case 3:
                      System.out.println("HAS ELEGIDO A MOLTRES");
                      break;
              }
          case 2:
                
        }
        
      Articuno artic1=new Articuno();
      
        
    
}
    }
