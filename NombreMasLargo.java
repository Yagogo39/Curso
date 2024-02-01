import javax.swing.*;
public class NombreMasLargo {
    public static void main(String[] args) {
        String fam1;
        String fam2;
        String fam3;
        int caracteres;
        fam1 = JOptionPane.showInputDialog(null, "Ingresa el nombre COMPLETO del " +
                "familiar 1.");
        fam2 = JOptionPane.showInputDialog(null, "Ingresa el nombre COMPLETO del " +
                "familiar 2.");
        fam3 = JOptionPane.showInputDialog(null, "Ingresa el nombre COMPLETO del " +
                "familiar 3.");
        JOptionPane.showMessageDialog(null,"El nombre con más caracteres es el siguiente:");
        int i = fam1.indexOf(" ");
        int j = fam2.indexOf(" ");
        int k = fam3.indexOf(" ");
        if (i > j){
            JOptionPane.showMessageDialog(null, fam1 + " tiene el nombre mas largo");
        } else if (j > k) {
            JOptionPane.showMessageDialog(null, fam2 + " tiene el nombre mas largo");
        }else{
            JOptionPane.showMessageDialog(null, fam3 + " tiene el nombre mas largo");
        }
    }
}
