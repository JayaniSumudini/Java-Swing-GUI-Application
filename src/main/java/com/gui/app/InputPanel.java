package com.gui.app;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JSumudini on 11/22/2017.
 */
public class InputPanel extends JPanel {
    JPanel inputPanel;
    public InputPanel(){
        JButton g = new JButton("inputPanel2");
        inputPanel = new JPanel();
        inputPanel.add(g);
        inputPanel.setVisible(true);
    }

}
