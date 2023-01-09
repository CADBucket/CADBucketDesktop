package io.github.cadbucket;

import javax.swing.JFrame;

public final class MainWindow extends JFrame {
    private static final String TITLE = "CADBucket";
    private static final int INITIAL_WIDTH = 1000;
    private static final int INITIAL_HEIGHT = 600;

    public MainWindow() {
        super(TITLE);
        setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    }
}
