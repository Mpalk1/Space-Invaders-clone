import javax.swing.*;


public class Main {

    public static PlayerShip ship;


    public static void main(String[] args) {
        JFrame window = new JFrame("SpaceShip-Game");
        window.setSize(GamePanel.SCREEN_WIDTH,GamePanel.SCREEN_HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        //window.setLayout(null);
        GamePanel gamePanel = new GamePanel();
        ship = new PlayerShip(gamePanel);

        window.add(gamePanel);
        window.pack();
        gamePanel.startGameThread();
        window.setVisible(true);
    }
}
