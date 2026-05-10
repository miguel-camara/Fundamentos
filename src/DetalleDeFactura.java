import java.util.Scanner;

public class DetalleDeFactura {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nombreFactura = "";
    double producto1, producto2;
    final double IVA = 0.19;
    double totalProducto;
    double totalIva;
    double total;
    String resultado = "";
    try {
      System.out.print("Ingrese nombre de la factura: ");
      nombreFactura = sc.nextLine();

      System.out.print("\nIngrese precio producto 1: ");
      producto1 = sc.nextDouble();

      System.out.print("\nIngrese precio producto 2: ");
      producto2 = sc.nextDouble();

      totalProducto = producto1 + producto2;
      totalIva = totalProducto * IVA;
      total = totalProducto + totalIva;

      resultado = "La factura ".concat(nombreFactura).concat(" tiene un total bruto de ")
          .concat(Double.toString(totalProducto)).concat(resultado).concat(", con un impuesto de ")
          .concat(Double.toString(totalIva)).concat(" y el monto después de impuesto es de ")
          .concat(Double.toString(total));

      System.out.println(resultado);

    } catch (Exception e) {
      System.err.println("Ocurrio un error");
    }
  }
}
