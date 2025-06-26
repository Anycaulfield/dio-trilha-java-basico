import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        try{

        System.out.println("Primeiro parametro: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Segundo paramatro: ");
        int parametro2 = scanner.nextInt();

        int result = parametro2 - parametro1;
        if (parametro1 > parametro2) {
        throw new ParametrosInvalidosException( "O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i =1 ; i <= result ; i++){

            System.out.println(i);


        }


        }catch(ParametrosInvalidosException e){

         System.out.println("O segundo parametro deve ser maior que o primeiro");

        }


    }
}
