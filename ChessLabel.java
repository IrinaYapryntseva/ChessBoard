import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ChessLabel extends JLabel {
    Font font = new Font("Ariel", Font.PLAIN, 24);
    Color Light = new Color(222, 184, 135);
    Color Dark = new Color(139, 69, 19);

    ChessLabel(String s) {
        super(s);
    }

    void set(int i, int j) {
        setFont(font);
        setOpaque(true);
        setBackground((i + j) % 2 == 0 ? Dark : Light);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}