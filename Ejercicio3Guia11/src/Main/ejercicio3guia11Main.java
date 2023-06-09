package Main;

import Enridad.Carta;
import Enridad.Mazo;
import Servicio.CartaServicio;
import Servicio.MazoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
public class ejercicio3guia11Main {

    public static void main(String[] args) {
        MazoServicio maso1 = new MazoServicio();
        CartaServicio cs = new CartaServicio();
        ArrayList<Carta> listaCartas = new ArrayList();
        Mazo masoCartas = new Mazo();
        cs.crearCarta(listaCartas);
        //maso1.llenarMazo(listaCartas, masoCartas);
        maso1.barajar(listaCartas);
        maso1.siguienteCarta(listaCartas, masoCartas);
        maso1.mostrarRepartidas(masoCartas);
        
        
    }

}
