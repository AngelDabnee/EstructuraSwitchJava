import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //El ejercicio presentado es para conocer si un numero es par o impar en java,
        //Para ello, utilizaremos un while que nos permitirá ciclar las veces que queramos, se rompera
        //Cuando el usuario capture x o continuará con y. 
        //Además, valoraremos la condición del numero que insertó con un if/else.
        //Utilizaremos la estructura switch, para valorar cada caso que captura el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        String iniciar;
        System.out.println("Iniciar con y");
        iniciar = sc.nextLine();
        String exit = "x";
        while(exit == "x")
        {
            int num = 0;
            System.out.println("Captura el número que deseas conocer si es par");
            num = sc.nextInt();
            if(num % 2 == 0)
            {
                num = 0;
            }
            else
            {
                num = 1;
            }
            switch(num)
            {
                case 0: 
                System.out.println("El número es par");
                break;
                case 1: 
                System.out.println("El numeor es impar");
                break;
            }
            //System.out.println("Presiona " + iniciar + "Si desea continuar");
        }
        //System.out.println("No quisite iniciar el programa");

    }
}
