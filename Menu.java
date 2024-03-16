import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class BackgroundPanel extends JPanel {
    private Image background;

    public BackgroundPanel(Image background) {
        this.background = background;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}

class Menu extends JFrame implements ActionListener {
    private final JButton playButton;
    private final JButton highScoreButton;

    public Menu() {
        setTitle("Snake Game Menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the background image
        ImageIcon icon = new ImageIcon("src/black_colorful_minimalist_artist.jpg"); // Replace with your image path
        Image background = icon.getImage();

        BackgroundPanel backgroundPanel = new BackgroundPanel(background);
        backgroundPanel.setLayout(null); // Using null layout for absolute positioning

        playButton = new JButton("Play");
        highScoreButton = new JButton("High Scores");

        playButton.addActionListener(this);
        highScoreButton.addActionListener(this);

        playButton.setBounds(100, 50, 100, 30); // x, y, width, height
        highScoreButton.setBounds(100, 100, 100, 30);

        backgroundPanel.add(playButton);
        backgroundPanel.add(highScoreButton);

        setContentPane(backgroundPanel); // Set the custom panel as content pane
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == playButton) {
            // Start the snake game
            JFrame snakeFrame = new JFrame("Snake Game");
            SnakeGame snakeGame = new SnakeGame(800, 800);
            snakeFrame.add(snakeGame);
            snakeFrame.pack();
            snakeFrame.setVisible(true);
            snakeFrame.setLocationRelativeTo(null);
            snakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Stop the gameLoop when the window is closed to prevent memory leaks
            snakeFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    snakeGame.gameLoop.stop();
                }
            });

        } else if (e.getSource() == highScoreButton) {
            HighScoreManager highScoreManager = new HighScoreManager();
            String highScores = highScoreManager.getHighScores();
            JOptionPane.showMessageDialog(this, highScores, "High Scores", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new Menu().setVisible(true));
    }
}
