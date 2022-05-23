import java.io.PrintStream;
import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class JavaApplication10 {
    public static void main(String[] args) {
        try ( /* String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        String valor3 = JOptionPane.showInputDialog("Digite um valor:");
        String valor4 = JOptionPane.showInputDialog("Digite outro: ");
        Double vai1 = Double.parseDouble(valor3);
        Double vai2 = Double.parseDouble(valor4);
        System.out.println(valor1 + valor2);
        System.out.println(vai1+vai2);*/ 
            Scanner entrada = new Scanner(System.in)) {
            String salario1;
            String salario2;
            String salario3;
            
            System.out.println("Dite os últimos tres salarios");
            salario1=(entrada.nextLine().replace("," , "."));
            salario2=(entrada.nextLine().replace("," , "."));
            salario3=(entrada.nextLine().replace("," , "."));
            
                Double sal1 = Double.parseDouble(salario1);
                Double sal2 = Double.parseDouble(salario2);
                Double sal3 = Double.parseDouble(salario3);
            
            Double media =(sal1+sal2+sal3)/3;
            double soma = (sal1*5+(sal2/sal3)*20)/10;
            System.out.println("A média do seu salario é:" + media);
            System.out.println(soma);
            try{
                PrintStream printf = System.out.printf("A soma de ambas é %d", media + soma);
            }catch(IllegalFormatConversionException e){
                System.out.println("tentativa errada");
                System.out.println("2 tentaiva" + (media + soma));
            }
            finally{
                boolean compra = media+soma>=500;
                String resultado = compra ? "Sim" : "não";
                //System.out.println(compra);
                System.out.println("É né");
            }
            }
    }
}