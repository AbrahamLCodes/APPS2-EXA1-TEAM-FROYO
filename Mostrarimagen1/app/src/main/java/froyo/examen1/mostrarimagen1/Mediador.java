package froyo.examen1.mostrarimagen1;

public class Mediador {

    private static int imagenSolitaria;
    private static int imagen1, imagen2, imagen3;

    public static int getImagenSolitaria() {
        return imagenSolitaria;
    }

    public static void setImagenSolitaria(int imagenSolitaria) {
        Mediador.imagenSolitaria = imagenSolitaria;
    }

    public static int getImagen1() {
        return imagen1;
    }

    public static void setImagen1(int imagen1) {
        Mediador.imagen1 = imagen1;
    }

    public static int getImagen2() {
        return imagen2;
    }

    public static void setImagen2(int imagen2) {
        Mediador.imagen2 = imagen2;
    }

    public static int getImagen3() {
        return imagen3;
    }

    public static void setImagen3(int imagen3) {
        Mediador.imagen3 = imagen3;
    }
}
