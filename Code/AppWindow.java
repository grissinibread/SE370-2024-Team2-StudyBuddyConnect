import view.DiscoverPage;
import view.SignupLoginPage;

import javax.swing.*;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

public class AppWindow extends JFrame {
    public AppWindow() throws IOException {
        setTitle("Study Buddy");
        setUndecorated(true); // removes default title bar

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // rounds the corners of the window
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        // setting custom icon
        ImageIcon logo = new ImageIcon("code/view/img/logo.png");
        setIconImage(logo.getImage());

        // opens the window in the center of the screen
        setLocationRelativeTo(null);

        // adds the login screen to this window
        SignupLoginPage loginPage = new SignupLoginPage();
        add(loginPage);

        // discoverPage view
        DiscoverPage discoverPage = new DiscoverPage();
        add(discoverPage);
    }
}
