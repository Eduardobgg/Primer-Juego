import java.util.Scanner;
public class JuegoDecision {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int camino= 0, camino1= 0, equipamento= 0, camino2=0, camino3= 0;
        String nombre;
        System.out.print("Bienvenido Viajero, Introduzca el nombre de su personaje: ");
        nombre= entrada.nextLine();

        System.out.println("Bienvenido al juego viajero " + nombre);
        System.out.println("Era una noche lluviosa en tu casa, son las 3 de la mañana y escuchas un ruido a fuera de tu cuarto...");
        System.out.println("Qué haces?");
        System.out.println("1. Abrir la puerta para ver lo que provoco el ruido");
        System.out.println("2. Tratar de retomar el sueño");
        camino= entrada.nextInt();

        if (camino == 1){
            System.out.println("Al abrir la puerta te encuentrar un rastro de lo que parece ser sangre...");
            System.out.println("Qué haces?");
            System.out.println("1. Seguir el rastro de sangre que da a la cocina");
            System.out.println("2. Encerrarte y tratar de retomar el sueño sin darle importancia");
            camino1= entrada.nextInt();
            if (camino1== 1){
                System.out.println("Solo puedes llevar un objeto en la mano, que deseas llevar?");
                System.out.println("1. Linterna para ver mejor");
                System.out.println("2. Martillo que tenias en tu cuarto, pero tendras poca visibilidad");
                System.out.println("3. Cobija");
                equipamento= entrada.nextInt();
                if (equipamento==1){
                    System.out.println("Logras ver a lo lejos una criatura de aspecto horroroso y decides agacharte, buena elección");
                    System.out.println("Qué haces?");
                    System.out.println("1. Regresas sigilozamente a tu cuarto y pides ayuda al 911 (Tardaran en llegar 5 min y la criatura esta buscandote)");
                    System.out.println("2. Avientas la linterna y corres a la cocina para agarrar un cuchillo para tratar de herir a la criatura");
                    camino3= entrada.nextInt();
                    if (camino3== 1){
                        System.out.println("Tienes 1 min para buscar un escondite...");
                    } else if (camino3== 2) {
                        System.out.println("Logras llegar a la cocina pero te encuentras con que no hay cuchillos, mala decisión");
                    }else {
                        System.out.println("Opción incorrecta");
                    }

                } else if (equipamento== 2) {
                    System.out.println("Te acercas demasiado por la poca visibilidad y te ataco lo que fuera que te encontro primero");
                } else if (equipamento== 3) {
                    System.out.println("Te acercaste demasiado pero logras aventarle la cobija a lo que sea que te encontraste");
                    System.out.println("Qué haces?");
                    System.out.println("1. Corres de regreso a tu cuarto antes de que se pueda quitar la cobija de encima");
                    System.out.println("2. Lo tratas de someter y buscas objetos a tu alrededor para poder noquear o matar si es necesario a lo que sea que atrapaste");
                    camino2= entrada.nextInt();
                    if (camino2== 1){
                        System.out.println("Al correr a tu cuarto lo que sea que encontraste te alcanzo y te descuartizo");
                    } else if (camino2== 2) {
                        System.out.println("Al tratar de someterlo encuentras un lazo y lo amarras dentro de la cobija");
                    } else {
                        System.out.println("Opción incorrecta");
                    }
                }
            } else if (camino1== 2) {
                System.out.println("Al tratar de retomar el sueño entra una persona bruscamente a tu cuarto y se te avienta matandote brutalmente");
            } else {
                System.out.println("Opción invalida");
            }
        } else if (camino== 2) {
            System.out.println("Al tratar de retomar el sueño entra bruscamente una criatura horrenda a tu cuarto y se te avienta matandote brutalmente");
        } else {
            System.out.println("Opción invalida");
        }
    }
}
