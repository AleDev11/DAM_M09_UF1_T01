import font.alejandro.dam.m09.uf1.t01.EncriptacionMD5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean inMenu = true;

        while (inMenu) {
            System.out.println("1 | Encriptar datos");
            System.out.println("2 | Salir del programa");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    EncripDatos();
                    break;
                case 2:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private static void EncripDatos() {
        System.out.println("Introduce los datos a encriptar");
        String datos = scanner.next();

        EncriptacionMD5 encriptacionMD5 = new EncriptacionMD5();
        String encriptado = encriptacionMD5.EncriptarMD5(datos);

        System.out.println("Datos encriptados: " + encriptado);
    }
}