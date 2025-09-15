import javax.swing.*;
import java.awt.*;

public class Ejercicio5 extends JFrame {
    public Ejercicio5() {
        setTitle("Ejercicio 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700); // ventana grande para que se vea bien
        setLocationRelativeTo(null);

        // Usamos GridBagLayout para replicar el grid de CSS
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // que ocupen toda la celda
        gbc.insets = new Insets(5, 5, 5, 5); // simula gap

        // Definimos proporciones de columnas y filas
        double[] colWeights = {1.0, 2.0, 2.0}; // 1fr 2fr 2fr
        double[] rowWeights = {1.0, 1.0, 1.0, 1.0, 1.0}; // repeat(5,1fr)

        ((GridBagLayout) panel.getLayout()).columnWeights = colWeights;
        ((GridBagLayout) panel.getLayout()).rowWeights = rowWeights;

        // Verde claro (grid-column: 1 / span 2; grid-row: 1 / span 2)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        panel.add(crearPanel(new Color(0x4CEBA9)), gbc);

        // Rojo (grid-column:1; grid-row:3)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(crearPanel(Color.RED), gbc);

        // Naranja oscuro (grid-column:1; grid-row:4 / span 2)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        panel.add(crearPanel(new Color(0xFF6D00)), gbc);

        // Morado (grid-column:2; grid-row:3 / span 3)
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        panel.add(crearPanel(new Color(0xF000FF)), gbc);

        // Verde oscuro (grid-column:3; grid-row:1)
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(crearPanel(new Color(0x387800)), gbc);

        // Azul (grid-column:3; grid-row:2 / span 3)
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        panel.add(crearPanel(new Color(0x01509F)), gbc);

        // Marrón claro (grid-column:3; grid-row:5)
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(crearPanel(new Color(0xCA9E61)), gbc);

        add(panel);
    }

    private JPanel crearPanel(Color color) {
        JPanel p = new JPanel();
        p.setBackground(color);
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio5().setVisible(true));
    }
}
