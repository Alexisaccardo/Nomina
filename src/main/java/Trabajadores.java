import java.util.Scanner;

public class Trabajadores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("***HORAS LABORALES***");

        int horastrabajadas = 0;
        int cantidadhoras = 0;
        double valorhora = 0;

        System.out.println("¿Deseas consultar nomina:");
        String respuesta = scanner.nextLine();

        while (respuesta.equals("si")) {

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el salario por hora: ");
            valorhora = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese horas trabajadas durante la semana: ");
            horastrabajadas = Integer.parseInt(scanner.nextLine());

            if (horastrabajadas>40){
                cantidadhoras = horastrabajadas - 40;
                double valorpagar = valorhora * 40 + ((valorhora*1.5)*cantidadhoras);
                System.out.println("El trabajador ha trabajado mas de 40 horas a la semana, su valor a pagar es: "+valorpagar);
                System.out.println();
                System.out.println("cantidad de horas extras trabajadas: "+cantidadhoras);
            }else {
                double valorpagar = valorhora*horastrabajadas;
                System.out.println("El trabajador no ha trabajado mas de 40 horas a la semana, su valor a pagar es: "+valorpagar);
            }
        }


        }
}

