package ExercicioRepita;
import javax.swing.JOptionPane;

public class AtividadeAula12 {
    public static void main(String[] args) {
        int n = 0, s = 0;
        int par = 0, impar = 0;
        int maior100 = 0;
        int media = 0;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            if(n != 0){
                s++;
                if(n%2 == 0){
                    par++;
                }else{
                    impar++;
                }
                if(n > 100){
                    maior100++;
                }
            }

            media +=n;

        }while(n != 0);
        if (s != 0) {
            media /= s;
        }
        JOptionPane.showMessageDialog(null, "<html>Resultado<br><hr>" + "Total de Valores: " + s + "<br>Total de pares: " + par+ "<br>Total de impares: " + impar + "<br>Acima de 100: " + maior100 + "<br>Média de valores: " + media + "</html>");
    }
}
