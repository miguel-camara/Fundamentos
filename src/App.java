import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    // metodosString();
    obtenerExtension();
  }

  public static void metodosString() {
    var text = "Texto de prueba en java";
    System.out.println(text.toLowerCase());
    System.out.println(text.toUpperCase());
    System.out.println(text.charAt(0));
    System.out.println(text.substring(0, 5));
    System.out.println(text.substring(5));
    System.out.println(text.compareTo("Otro texto"));
    System.out.println(text.endsWith("java"));
    System.out.println(text.contains("prueba"));
    System.out.println(text.isBlank());
    System.out.println(text.isEmpty());
    System.out.println(text.length());
    for (String valueString : text.split(" ")) {
      System.out.println(valueString);

    }
    System.out.println(text.concat(", ").concat("algo nuevo"));
    System.out.println(text.transform(c -> c + ", algo nuevo"));
    System.out.println(text.replace("a", "-"));
    System.out.println(text.indexOf("a")); // Si no exite -1 sino posicion
    System.out.println(text.lastIndexOf("a"));
  }

  private static void obtenerExtension() {
    var nombreArchivo = "mi archivo.pdf";
    var ext = "";

    if (!nombreArchivo.contains(".")) {
      System.out.println("Extension no valida");
      return;
    }
    var i = nombreArchivo.lastIndexOf(".");
    ext = nombreArchivo.substring(i + 1);
    System.err.println(ext);

  }

  public static void jOptionPane() {
    int value = 0;
    try {
      value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese"));

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ocurrio un error");

      // main(args);
      System.exit(0);
    }
    System.out.println(value);
  }

  public static void variables() {
    // Cadena
    String cadena = "Cadena";
    // Decimal
    double decimalDouble = 10.25d;
    float decimalFloat = 20.44f;
    // Enteros
    byte enteroByte = 1;
    short enteroShord = 10;
    int entero = 100;
    long enteroLong = 1000;
    // Char
    char caracter = 'A';
    // Boolean
    boolean esBoleano = true;
    // var para asiganar cualquier tipo de forma dinamica pero se tiene que
    // inicializar
    var nombre = "Hola Mundo\n";

  }
}
