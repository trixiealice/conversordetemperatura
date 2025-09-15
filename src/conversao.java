import java.util.Scanner;
public class conversao {

    double temperaturaEmCelsius;
    double temperaturaEmFahrenheit;
    double temperaturaEmKelvin;

    public void calcularTemperatura() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius ");
        temperaturaEmCelsius = leitor.nextDouble();


    }

    public void calcularConversaoDeTemperatura(){
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 9 / 5) + 32;
        double temperaturaEmKelvin = temperaturaEmCelsius + 273.15;

        System.out.println(" celsius equivale a " + temperaturaEmCelsius);
        System.out.println("fahrenheit equivale a " + temperaturaEmFahrenheit);
        System.out.println( "kelvin equivale a " + temperaturaEmKelvin);

    }
}
