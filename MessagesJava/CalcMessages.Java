import javax.swing.JOptionPane;

public class CalcMessages{
    public static void main(String[] args) {
        String NumeroString1 =	JOptionPane.showInputDialog(null, "Enter a value for A");
        String NumeroString2 =	JOptionPane.showInputDialog(null, "Enter a value for B");
        JOptionPane.showMessageDialog(null, Integer.parseInt(NumeroString1)+Integer.parseInt(NumeroString2));

        System.Exit(0);
    }
}