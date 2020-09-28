package froyo.examen1.formulas;

public class Mediador {

    private static int idImagen;
    private static String titulo;
    private static String hint1, hint2;

    public static int getIdImagen() {
        return idImagen;
    }

    public static void setIdImagen(int idImagen) {
        Mediador.idImagen = idImagen;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static void setTitulo(String titulo) {
        Mediador.titulo = titulo;
    }

    public static String getHint1() {
        return hint1;
    }

    public static void setHint1(String hint1) {
        Mediador.hint1 = hint1;
    }

    public static String getHint2() {
        return hint2;
    }

    public static void setHint2(String hint2) {
        Mediador.hint2 = hint2;
    }
}
