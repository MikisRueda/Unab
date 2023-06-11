package conjuntos;
import java.util.*;
public class Conjuntos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int numero = 0;
        
        System.out.println("- Test de conjuntos | Matematicas computacionales -");
        System.out.println("- 1) Unión                                        -");
        System.out.println("- 2) Intersección                                 -");
        System.out.println("\n- Ingresa una opción: ");
        
        n = input.nextInt();
        int n2 = 0;

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        
        switch (n){
            case 1:
                
                System.out.println("- ¿Cuantos numeros quieres poner al conjunto A? -");
                n = input.nextInt();
                if(n < 0){
                    System.out.println("- ERROR - Entrada no valida");
                    break;
                }else{

                    while(n2 != n){
                        System.out.println("- Ingresa un numero entero positivo -");
                        numero = input.nextInt();
                        if(numero < 0){
                            System.out.println("- ERROR - Solo se admiten numeros enteros positivos");
                        }else{
                            listA.add(numero);
                            n2 = n2 + 1;
                        }
                    }
                    
                    System.out.println("- Conjunto A: " + listA);
                    n2 = 0;
                    System.out.println("- ¿Cuantos numeros quieres poner al conjunto B? -");
                    n = input.nextInt();
    
                    while(n2 != n){
                        System.out.println("- Ingresa un numero entero positivo -");
                        numero = input.nextInt();
                        if(numero < 0){
                            System.out.println("- ERROR - Solo se admiten numeros enteros positivos");
                        }else{
                            listB.add(numero);
                            n2 = n2 + 1;
                        }
                    }
    
                    System.out.println("- Conjunto B: " + listB);
                    
                    for(int i = 0; i < listA.size(); i++){
                        listC.add(listA.get(i));
                    }
                
                    for(int j = 0; j < listB.size(); j++){
                        listC.add(listB.get(j));
                    }
                
                    System.out.println("\n- La union de los conjuntos A y B es: " + listC) ;
                    break;
                }
            
            // --------------------------------------------------------------------------- //

            case 2:
                System.out.println("- ¿Cuantos numeros quieres poner al conjunto A? -");
                n = input.nextInt();
                if(n < 0){
                    System.out.println("- ERROR - Entrada no valida");
                    break;
                }else{

                    while(n2 != n){
                        System.out.println("- Ingresa un numero entero positivo -");
                        numero = input.nextInt();
                        if(numero < 0){
                            System.out.println("- ERROR - Solo se admiten numeros enteros positivos");
                        }else{
                            listA.add(numero);
                            n2 = n2 + 1;
                        }
                    }
                    
                    System.out.println("- Conjunto A: " + listA);
                    n2 = 0;
                    System.out.println("- ¿Cuantos numeros quieres poner al conjunto B? -");
                    n = input.nextInt();
    
                    while(n2 != n){
                        System.out.println("- Ingresa un numero entero positivo -");
                        numero = input.nextInt();
                        if(numero < 0){
                            System.out.println("- ERROR - Solo se admiten numeros enteros positivos");
                        }else{
                            listB.add(numero);
                            n2 = n2 + 1;
                        }
                    }
    
                    System.out.println("- Conjunto B: " + listB);

                    for(int i = 0; i < listA.size(); i++){
                        for(int j = 0; j < listB.size(); j++){
                            if(listA.get(i) == listB.get(j)){
                                listC.add(listA.get(i));
                            }
                        }
                    }

                    System.out.println("\n- La intersección de los conjuntos A y B es: " + listC) ;
                    break;
                }
            // --------------------------------------------------------------------------- //
        }      
    }
}
