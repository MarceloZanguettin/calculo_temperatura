import java.util.Scanner;
public class Temperatura {

    public static void main(String[] args) {
        double celsius;
        double temperatura;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius=leitura.nextDouble();
        temperatura = celsius + 273.15;
        System.out.println("Temperatura em Kelvin: "+temperatura+" K");
        temperatura = (celsius*1.8)+32 ;
        System.out.println("Temperatura em Fahrenheit: "+temperatura+" °F");
        temperatura = celsius*0.8;
        System.out.println("Temperatura em Réaumur: "+temperatura+" °Re");
        temperatura = (celsius+273.15)*1.8;
        System.out.println("Temperatura em Rankine: "+temperatura+" Ra");

        leitura.close();
    }
}