public class Main {
    public static void main(String[] args) {
        int numeroif = -2;

        if (numeroif == 0){
            System.out.println("El numero es 0");
        }else if (numeroif > 0){
            System.out.println("El nuemero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile + " while");
            numeroWhile++;
        }

        int numeroDoWhile = 0;
        int contador = 1;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile + " do While");
            //agrego un contador para que se pueda cambiar el numero de vez que se haga el bucle
            contador++;
        }while (contador <= 1);

        int numeroFor = 0;
        for (int i = 0; numeroFor <= 3; i++){
            numeroFor++;
            System.out.println(numeroFor + " for");
        }

        int estacion = 6;
        switch (estacion){
            case 1:
                System.out.println("verano");
            break;
            case 2:
                System.out.println("otoño");
            break;
            case 3:
                System.out.println("invierno");
            break;
            case 4:
                System.out.println("primavera");
            break;
            default:
                System.out.println("El numero de la variable no es una estacion");
        }

    }
}