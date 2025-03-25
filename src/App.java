import GUI.Ventana;

public class App {
    public static void main(String[] args) throws Exception {
        // Esto es un comentario
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
