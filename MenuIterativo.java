import javax.swing.JOptionPane;
public class MenuIterativo {
    public static void main(String[] args) {
        int seleccion;
        do {
            String[] opciones = {"Actualizar", "Eliminar", "Crear", "Listar", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción:",
                    "Administración de Productos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            switch (seleccion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (seleccion != 4);
    }
}

