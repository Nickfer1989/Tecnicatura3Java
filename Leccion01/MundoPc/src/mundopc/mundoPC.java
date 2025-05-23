package mundopc;

import ar.com.system2025.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        // Crear objetos para computadora HP
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        // Crear objetos para computadora Gamer
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        // Crear más computadoras con todos sus elementos
        Computadora computadora3 = new Computadora("Computadora Dell", new Monitor("Dell", 24), new Teclado("USB", "Dell"), new Raton("USB", "Dell"));
        Computadora computadora4 = new Computadora("Computadora Asus", new Monitor("Asus", 27), new Teclado("Bluetooth", "Asus"), new Raton("Bluetooth", "Asus"));
        Computadora computadora5 = new Computadora("Computadora Lenovo", new Monitor("Lenovo", 21), new Teclado("USB", "Lenovo"), new Raton("USB", "Lenovo"));
        Computadora computadora6 = new Computadora("Computadora Mac", new Monitor("Apple", 27), new Teclado("Bluetooth", "Apple"), new Raton("Bluetooth", "Apple"));
        Computadora computadora7 = new Computadora("Computadora Acer", new Monitor("Acer", 20), new Teclado("USB", "Acer"), new Raton("USB", "Acer"));
        Computadora computadora8 = new Computadora("Computadora MSI", new Monitor("MSI", 34), new Teclado("Bluetooth", "MSI"), new Raton("Bluetooth", "MSI"));
        Computadora computadora9 = new Computadora("Computadora Samsung", new Monitor("Samsung", 28), new Teclado("USB", "Samsung"), new Raton("USB", "Samsung"));
        Computadora computadora10 = new Computadora("Computadora Mixta", new Monitor("HP", 19), new Teclado("Bluetooth", "Asus"), new Raton("USB", "Logitech"));

        // Crear ordenes
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        // Agregar 10 computadoras a orden1
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora5);
        orden1.agregarComputadora(computadora6);
        orden1.agregarComputadora(computadora7);
        orden1.agregarComputadora(computadora8);
        orden1.agregarComputadora(computadora9);
        orden1.agregarComputadora(computadora10);

        // Agregar otra computadora a orden2
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);

        // Mostrar órdenes
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
}
