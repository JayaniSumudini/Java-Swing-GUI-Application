package com.gui.app;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JSumudini on 11/22/2017.
 */
public class MainWindow extends JFrame{
    JFrame frame;
    JPanel mainContainerPanel;
    JPanel inputPanel;
    JPanel buttonPanel;
    JPanel searchCriteriaPanel;
    JPanel patientListViewPanel;

    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;

    public static void main(String[] args) {
        new MainWindow();
    }

    MainWindow(){

        JButton l = new JButton("inputPanel1");
        JButton h = new JButton("buttonPanel");
        JButton j = new JButton("searchCriteriaPanel");
        JButton k = new JButton("patientListViewPanel");


        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();

        mainContainerPanel = new JPanel();
        mainContainerPanel.setLayout(gridBagLayout);

        inputPanel = new InputPanel();
        buttonPanel = new JPanel();
        searchCriteriaPanel = new JPanel();
        patientListViewPanel = new JPanel();

        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(l);

        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(h);

        searchCriteriaPanel.setLayout(new BorderLayout());
        searchCriteriaPanel.add(j);

        patientListViewPanel.setLayout(new BorderLayout());
        patientListViewPanel.add(k);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        mainContainerPanel.add(inputPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        mainContainerPanel.add(buttonPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        mainContainerPanel.add(searchCriteriaPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        mainContainerPanel.add(patientListViewPanel, gridBagConstraints);

        getContentPane().add(mainContainerPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cockatoo Panels inside a JFrame (GridBagLayout)");
        pack();
        setResizable(true);
        setSize(600,800);
        setLocationRelativeTo(null);
        setVisible(true);


//
//        setTitle("Patient Registration");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setSize(600,800);
//        setVisible(true);
    }
}
