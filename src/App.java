import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    // metodosString();
    // obtenerExtension();
    // operadores();
    login();
    // ternario();
  }

  public static void operadorInstansOF() {
    String cadena = "";
    Integer entero = 200;

    var tipo = cadena instanceof String;
    System.out.println(tipo);
    tipo = entero instanceof Integer;
    System.out.println(tipo);
  }

  public static void ternario() {
    var valor = 10;
    var textMayor = "";

    textMayor = valor > 10 ? "El es mayor a ".concat("" + valor) : "El es Menor de ".concat("" + valor);

    System.out.println(textMayor);
  }

  public static void login() {

    var map = new HashMap<String, String>();
    map.put("miguel", "123");
    map.put("ordonez", "321");

    var email = "";
    var password = "";

    Scanner sc = new Scanner(System.in);
    var isValido = false;

    do {
      System.out.print("Email: ");
      email = sc.next();

      System.out.print("Password: ");
      password = sc.next();

      if (map.containsKey(email) && map.get(email).equals(password)) {
        JOptionPane.showMessageDialog(null, "Login success ".concat(email));
        break;
      }

      JOptionPane.showMessageDialog(null, "Error en credenciales");

    } while (!isValido);

  }

  private static void operadores() {
    int num1 = 5, num2 = 10, resultado;

    resultado = num1 + num2;
    System.out.println(resultado);
    resultado = num1 - num2;
    System.out.println(resultado);
    resultado = num1 * num2;
    System.out.println(resultado);
    resultado = num1 / num2;
    System.out.println(resultado);
    resultado = num1 % num2;
    System.out.println(resultado);
    resultado = 10;
    resultado += 1;
    System.out.println(resultado);
    resultado -= 1;
    System.out.println(resultado);
    resultado *= 2;
    System.out.println(resultado);
    resultado /= 2;
    System.out.println(resultado);
    resultado %= 1;
    System.out.println(resultado);

    var r = 0;

    r = -10 * -1;
    System.out.println(r);

    var logicos = false;
    logicos = num1 == num2;
    logicos = num1 != num2;
    logicos = num1 > num2;
    logicos = num1 >= num2;
    logicos = num1 < num2;
    logicos = num1 <= num2 || true;
    logicos = num1 <= num2 && num1 != 10;

    StringBuilder sb = new StringBuilder("Texto");
    System.out.println(sb.toString());
    sb.append("Nuevo texto");
    System.out.println(sb.toString());
    sb.delete(0, sb.length());
    System.out.println(sb.toString().concat("-"));

    // for (int i = 0; i < 50; i++) {
    // if (i % 2 == 0) {
    // System.out.println("El numero ".concat(i + " Es PAR"));
    // } else {
    // System.out.println("El numero ".concat(i + " Es IMPAR"));
    // }
    // }
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
    // \\. equivale a . en split
    for (String valueString : text.split(" ")) {
      System.out.println(valueString);

    }
    for (char valueChar : text.toCharArray()) {
      System.out.println(valueChar);

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
