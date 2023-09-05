import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar a entrada do usuário para a distância física e a velocidade do
    // plano de internet
    double distanciaServidores = scanner.nextDouble();

    double velocidadePlano = scanner.nextDouble();

    // TODO: Calcule a velocidade de download estimada
    double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

    // Apresentar o resultado
    System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

    scanner.close();
  }

  public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
    // TODO: Crie a fórmula de cálculo para a velocidade de download estimada
    Double velocidadeDownload;
    velocidadeDownload = velocidadePlano / (1 + (distanciaServidores / 100));

    // Usando a formatação de strings para arredondar para 2 casas decimais
    String numeroFormatado = String.format("%.2f", velocidadeDownload);
    velocidadeDownload = Double.parseDouble(numeroFormatado);
    return velocidadeDownload;

  }
}