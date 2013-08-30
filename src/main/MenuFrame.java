package main;

import java.awt.Toolkit;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuFrame extends javax.swing.JFrame {

    public MenuFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("images/logo.png"));
        setResizable(true);
        setLocationRelativeTo(null);
        pack();
        welcomeLabel.setText("Welcome to Fabflix employee \"back-end\" system! Please select one of the menu items.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        listMoviesItem = new javax.swing.JMenuItem();
        insertMovieItem = new javax.swing.JMenuItem();
        insertStarItem = new javax.swing.JMenuItem();
        insertCustomerItem = new javax.swing.JMenuItem();
        deleteCustomerItem = new javax.swing.JMenuItem();
        metadataItem = new javax.swing.JMenuItem();
        enterSqlItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        exitProgramItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fabflix");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addGap(0, 780, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addGap(0, 557, Short.MAX_VALUE))
        );

        menu.setText("Menu");

        listMoviesItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        listMoviesItem.setIcon(new javax.swing.ImageIcon("images/m1.png"));
        listMoviesItem.setText("List the movies featuring a given star");
        listMoviesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMoviesItemActionPerformed(evt);
            }
        });
        menu.add(listMoviesItem);

        insertMovieItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        insertMovieItem.setIcon(new javax.swing.ImageIcon("images/m1.png"));
        insertMovieItem.setText("Insert a movie into the database");
        insertMovieItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMovieItemActionPerformed(evt);
            }
        });
        menu.add(insertMovieItem);

        insertStarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        insertStarItem.setIcon(new javax.swing.ImageIcon("images/m2.png"));
        insertStarItem.setText("Insert a new star into the database");
        insertStarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStarItemActionPerformed(evt);
            }
        });
        menu.add(insertStarItem);

        insertCustomerItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        insertCustomerItem.setIcon(new javax.swing.ImageIcon("images/m3.png"));
        insertCustomerItem.setText("Insert a customer into the database");
        insertCustomerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCustomerItemActionPerformed(evt);
            }
        });
        menu.add(insertCustomerItem);

        deleteCustomerItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        deleteCustomerItem.setIcon(new javax.swing.ImageIcon("images/m4.png"));
        deleteCustomerItem.setText("Delete a customer from the database");
        deleteCustomerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerItemActionPerformed(evt);
            }
        });
        menu.add(deleteCustomerItem);

        metadataItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        metadataItem.setIcon(new javax.swing.ImageIcon("images/m5.png"));
        metadataItem.setText("Provide the metadata of the database");
        metadataItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metadataItemActionPerformed(evt);
            }
        });
        menu.add(metadataItem);

        enterSqlItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        enterSqlItem.setIcon(new javax.swing.ImageIcon("images/m6.png"));
        enterSqlItem.setText("Enter a valid SELECT/UPDATE/INSERT/DELETE SQL command");
        enterSqlItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSqlItemActionPerformed(evt);
            }
        });
        menu.add(enterSqlItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon("images/m7.png"));
        exitMenuItem.setText("Exit the menu");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menu.add(exitMenuItem);

        exitProgramItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.CTRL_MASK));
        exitProgramItem.setIcon(new javax.swing.ImageIcon("images/m8.png"));
        exitProgramItem.setText("Exit the program");
        exitProgramItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramItemActionPerformed(evt);
            }
        });
        menu.add(exitProgramItem);

        menubar.add(menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMoviesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMoviesItemActionPerformed
        clearMenuPanel();

        enterStarLabel = new javax.swing.JLabel();
        enterStarPanel = new javax.swing.JPanel();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        orLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        listMoviesButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        listMovieLabel = new javax.swing.JLabel();
        listMovieScrollPane = new javax.swing.JScrollPane();
        listMovieTable = new javax.swing.JTable();

        enterStarLabel.setText("List the movies featuring a given star");
        fnameLabel.setText("Star First Name");
        lnameLabel.setText("Star Last Name");
        orLabel.setText("or");
        idLabel.setText("Star ID");
        listMoviesButton.setText("List Movies");
        listMoviesButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMoviesButtonActionPerformed(evt);
            }
        });
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout enterStarPanelLayout = new javax.swing.GroupLayout(enterStarPanel);
        enterStarPanel.setLayout(enterStarPanelLayout);
        enterStarPanelLayout.setHorizontalGroup(
                enterStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(enterStarPanelLayout.createSequentialGroup().addContainerGap().addComponent(fnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(lnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(orLabel).addGap(18, 18, 18).addComponent(idLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(listMoviesButton).addGap(18, 18, 18).addComponent(cancelButton).addContainerGap(64, Short.MAX_VALUE)));
        enterStarPanelLayout.setVerticalGroup(
                enterStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(enterStarPanelLayout.createSequentialGroup().addContainerGap().addGroup(enterStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(enterStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(fnameLabel).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lnameLabel).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(enterStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(orLabel).addComponent(idLabel).addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cancelButton).addComponent(listMoviesButton))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        listMovieLabel.setText("");
        listMovieTable.setModel(new UneditableDefaultTableModel(null, null));
        listMovieScrollPane.setViewportView(listMovieTable);
        listMovieScrollPane.setVisible(false);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(enterStarLabel).addComponent(listMovieLabel)).addContainerGap()).addComponent(enterStarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(listMovieScrollPane));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(enterStarLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(enterStarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(listMovieLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(listMovieScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)));

        fnameField.requestFocus();
    }//GEN-LAST:event_listMoviesItemActionPerformed

    private void insertStarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStarItemActionPerformed
        clearMenuPanel();

        insertStarLabel = new javax.swing.JLabel();
        insertStarPanel = new javax.swing.JPanel();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        photoLabel = new javax.swing.JLabel();
        photoField = new javax.swing.JTextField();
        birthLabel = new javax.swing.JLabel();
        birthField = new javax.swing.JTextField();
        insertStarButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        insertedStarLabel = new javax.swing.JLabel();


        insertStarLabel.setText("Insert a new star into the database");
        fnameLabel.setText("Star First Name");
        lnameLabel.setText("Star Last Name");
        photoLabel.setText("Photo URL");
        birthLabel.setText("Birthdate");
        insertStarButton.setText("Insert Star");
        insertStarButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStarButtonActionPerformed(evt);
            }
        });
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout insertStarPanelLayout = new javax.swing.GroupLayout(insertStarPanel);
        insertStarPanel.setLayout(insertStarPanelLayout);
        insertStarPanelLayout.setHorizontalGroup(
                insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertStarPanelLayout.createSequentialGroup().addGap(14, 14, 14).addGroup(insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(insertStarPanelLayout.createSequentialGroup().addComponent(insertStarButton).addGap(18, 18, 18).addComponent(cancelButton)).addGroup(insertStarPanelLayout.createSequentialGroup().addComponent(fnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(lnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(birthLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(photoLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(91, Short.MAX_VALUE)));
        insertStarPanelLayout.setVerticalGroup(
                insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertStarPanelLayout.createSequentialGroup().addContainerGap().addGroup(insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lnameLabel).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(birthLabel).addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(photoLabel).addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(fnameLabel).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18).addGroup(insertStarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cancelButton).addComponent(insertStarButton)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        insertedStarLabel.setText("");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertStarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(menuPanelLayout.createSequentialGroup().addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertStarLabel).addComponent(insertedStarLabel)).addGap(0, 0, Short.MAX_VALUE)));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(insertStarLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(insertStarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(insertedStarLabel).addContainerGap(422, Short.MAX_VALUE)));

        fnameField.requestFocus();
    }//GEN-LAST:event_insertStarItemActionPerformed

    private void insertCustomerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCustomerItemActionPerformed
        clearMenuPanel();

        insertCustomerLabel = new javax.swing.JLabel();
        insertCustomerPanel = new javax.swing.JPanel();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        addrLabel = new javax.swing.JLabel();
        addrField = new javax.swing.JTextField();
        creditLabel = new javax.swing.JLabel();
        creditField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        insertCustomerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        insertedCustomerLabel = new javax.swing.JLabel();

        insertCustomerLabel.setText("Insert a customer into the database");
        fnameLabel.setText("First Name");
        lnameLabel.setText("Last Name");
        addrLabel.setText("Address");
        creditLabel.setText("Credit Card");
        emailLabel.setText("Email");
        passLabel.setText("Password");
        insertCustomerButton.setText("Insert Customer");
        insertCustomerButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCustomerButtonActionPerformed(evt);
            }
        });
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout insertCustomerPanelLayout = new javax.swing.GroupLayout(insertCustomerPanel);
        insertCustomerPanel.setLayout(insertCustomerPanelLayout);
        insertCustomerPanelLayout.setHorizontalGroup(
                insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertCustomerPanelLayout.createSequentialGroup().addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(insertCustomerPanelLayout.createSequentialGroup().addGap(14, 14, 14).addComponent(fnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(lnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(insertCustomerPanelLayout.createSequentialGroup().addContainerGap().addComponent(creditLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(emailLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(addrLabel).addComponent(passLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(insertCustomerPanelLayout.createSequentialGroup().addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(insertCustomerButton).addGap(18, 18, 18).addComponent(cancelButton)).addComponent(addrField)).addContainerGap(79, Short.MAX_VALUE)));
        insertCustomerPanelLayout.setVerticalGroup(
                insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertCustomerPanelLayout.createSequentialGroup().addContainerGap().addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lnameLabel).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(addrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(addrLabel)).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(fnameLabel).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cancelButton).addComponent(insertCustomerButton)).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(passLabel).addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(insertCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(creditLabel).addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(emailLabel))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        insertedCustomerLabel.setText("");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(menuPanelLayout.createSequentialGroup().addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertCustomerLabel).addComponent(insertedCustomerLabel)).addGap(0, 0, Short.MAX_VALUE)));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(insertCustomerLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(insertCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(insertedCustomerLabel).addContainerGap(422, Short.MAX_VALUE)));

        fnameField.requestFocus();
    }//GEN-LAST:event_insertCustomerItemActionPerformed

    private void deleteCustomerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerItemActionPerformed
        clearMenuPanel();

        deleteCustomerLabel = new javax.swing.JLabel();
        deleteCustomerPanel = new javax.swing.JPanel();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        orLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        deleteCustomerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        deletedCustomerLabel = new javax.swing.JLabel();

        deleteCustomerLabel.setText("Delete a customer from a database");
        fnameLabel.setText("First Name");
        lnameLabel.setText("Last Name");
        orLabel.setText("or");
        idLabel.setText("ID");
        deleteCustomerButton.setText("Delete Customer");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout deleteCustomerPanelLayout = new javax.swing.GroupLayout(deleteCustomerPanel);
        deleteCustomerPanel.setLayout(deleteCustomerPanelLayout);
        deleteCustomerPanelLayout.setHorizontalGroup(
                deleteCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(deleteCustomerPanelLayout.createSequentialGroup().addContainerGap().addComponent(fnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(lnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(orLabel).addGap(18, 18, 18).addComponent(idLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(deleteCustomerButton).addGap(18, 18, 18).addComponent(cancelButton).addContainerGap(155, Short.MAX_VALUE)));
        deleteCustomerPanelLayout.setVerticalGroup(
                deleteCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(deleteCustomerPanelLayout.createSequentialGroup().addContainerGap().addGroup(deleteCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(deleteCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(fnameLabel).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lnameLabel).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(deleteCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(orLabel).addComponent(idLabel).addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cancelButton).addComponent(deleteCustomerButton))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        deletedCustomerLabel.setText("");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(deleteCustomerLabel).addComponent(deletedCustomerLabel)).addContainerGap()).addComponent(deleteCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(deleteCustomerLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(deletedCustomerLabel).addContainerGap(460, Short.MAX_VALUE)));

        fnameField.requestFocus();
    }//GEN-LAST:event_deleteCustomerItemActionPerformed

    private void metadataItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metadataItemActionPerformed
        clearMenuPanel();

        // provide database metadata
        try {
            returnMetadata();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error retrieving database metadata", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_metadataItemActionPerformed

    private void enterSqlItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSqlItemActionPerformed
        clearMenuPanel();

        enterSqlLabel = new javax.swing.JLabel();
        sqlPanel = new javax.swing.JPanel();
        sqlScrollPane = new javax.swing.JScrollPane();
        sqlTextArea = new javax.swing.JTextArea();
        queryButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        sqlResultLabel = new javax.swing.JLabel();
        sqlResultScrollPane = new javax.swing.JScrollPane();
        sqlResultTable = new javax.swing.JTable();

        enterSqlLabel.setText("Enter a valid SELECT/UPDATE/INSERT/DELETE SQL command");

        sqlTextArea.setColumns(20);
        sqlTextArea.setRows(5);
        sqlScrollPane.setViewportView(sqlTextArea);

        queryButton.setText("Execute SQL");
        queryButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSqlButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear SQL");
        clearButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSqlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sqlPanelLayout = new javax.swing.GroupLayout(sqlPanel);
        sqlPanel.setLayout(sqlPanelLayout);
        sqlPanelLayout.setHorizontalGroup(
                sqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(sqlScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE).addGroup(sqlPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(queryButton).addGap(18, 18, 18).addComponent(clearButton).addGap(18, 18, 18).addComponent(cancelButton)));
        sqlPanelLayout.setVerticalGroup(
                sqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(sqlPanelLayout.createSequentialGroup().addComponent(sqlScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(sqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cancelButton).addComponent(queryButton).addComponent(clearButton))));

        sqlResultLabel.setText("");
        sqlResultTable.setModel(new UneditableDefaultTableModel(null, null));
        sqlResultScrollPane.setViewportView(sqlResultTable);
        sqlResultScrollPane.setVisible(false);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(enterSqlLabel).addContainerGap(536, Short.MAX_VALUE)).addComponent(sqlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(menuPanelLayout.createSequentialGroup().addComponent(sqlResultLabel).addGap(0, 742, Short.MAX_VALUE)).addComponent(sqlResultScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(enterSqlLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(sqlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(sqlResultLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(sqlResultScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)));

        sqlTextArea.requestFocus();
    }//GEN-LAST:event_enterSqlItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        clearMenuPanel();

        try {
            Fabflix.connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error closing database connection", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        // exit menu
        dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void exitProgramItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramItemActionPerformed
        clearMenuPanel();

        try {
            Fabflix.connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error closing database connection", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        // exit program
        System.exit(0);
    }//GEN-LAST:event_exitProgramItemActionPerformed

    private void insertMovieItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMovieItemActionPerformed
        clearMenuPanel();

        insertMovieLabel = new javax.swing.JLabel();
        insertMoviePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        directorLabel = new javax.swing.JLabel();
        directorField = new javax.swing.JTextField();
        genreLabel = new javax.swing.JLabel();
        genreField = new javax.swing.JTextField();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        birthLabel = new javax.swing.JLabel();
        birthField = new javax.swing.JTextField();
        photoLabel = new javax.swing.JLabel();
        photoField = new javax.swing.JTextField();
        bannerLabel = new javax.swing.JLabel();
        bannerField = new javax.swing.JTextField();
        trailerLabel = new javax.swing.JLabel();
        trailerField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        insertMovieButton = new javax.swing.JButton();
        insertedMovieLabel = new javax.swing.JLabel();


        insertMovieLabel.setText("Insert a movie into the database");
        titleLabel.setText("Title");
        yearLabel.setText("Year");
        directorLabel.setText("Director");
        genreLabel.setText("Genre");
        fnameLabel.setText(" First Name");
        lnameLabel.setText(" Last Name");
        birthLabel.setText("Birthdate");
        photoLabel.setText("Photo URL");
        bannerLabel.setText("Banner URL");
        trailerLabel.setText("Trailer URL");
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        insertMovieButton.setText("Insert Movie");
        insertMovieButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMovieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insertMoviePanelLayout = new javax.swing.GroupLayout(insertMoviePanel);
        insertMoviePanel.setLayout(insertMoviePanelLayout);
        insertMoviePanelLayout.setHorizontalGroup(
                insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertMoviePanelLayout.createSequentialGroup().addContainerGap().addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(fnameLabel).addComponent(bannerLabel).addComponent(titleLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(bannerField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(insertMoviePanelLayout.createSequentialGroup().addGap(39, 39, 39).addComponent(lnameLabel)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertMoviePanelLayout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(trailerLabel, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(trailerField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(insertMoviePanelLayout.createSequentialGroup().addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(insertMoviePanelLayout.createSequentialGroup().addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(53, 53, 53).addComponent(directorLabel)).addGroup(insertMoviePanelLayout.createSequentialGroup().addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(birthLabel))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGap(10, 10, 10).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(insertMoviePanelLayout.createSequentialGroup().addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(photoLabel).addComponent(genreLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(insertMoviePanelLayout.createSequentialGroup().addComponent(insertMovieButton).addGap(18, 18, 18).addComponent(cancelButton))).addContainerGap(138, Short.MAX_VALUE)));
        insertMoviePanelLayout.setVerticalGroup(
                insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertMoviePanelLayout.createSequentialGroup().addContainerGap().addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(yearLabel).addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(genreLabel).addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(directorLabel).addComponent(titleLabel)).addGap(18, 18, 18).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lnameLabel).addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(birthLabel).addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(photoLabel).addComponent(fnameLabel)).addGap(18, 18, 18).addGroup(insertMoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(bannerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(bannerLabel).addComponent(trailerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(trailerLabel).addComponent(cancelButton).addComponent(insertMovieButton)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        insertedMovieLabel.setText("");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertMoviePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(menuPanelLayout.createSequentialGroup().addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(insertMovieLabel).addComponent(insertedMovieLabel)).addGap(0, 0, Short.MAX_VALUE)));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(insertMovieLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(insertMoviePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(insertedMovieLabel).addContainerGap(396, Short.MAX_VALUE)));

        titleField.requestFocus();

    }//GEN-LAST:event_insertMovieItemActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteCustomerItem;
    private javax.swing.JMenuItem enterSqlItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exitProgramItem;
    private javax.swing.JMenuItem insertCustomerItem;
    private javax.swing.JMenuItem insertMovieItem;
    private javax.swing.JMenuItem insertStarItem;
    private javax.swing.JMenuItem listMoviesItem;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem metadataItem;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel enterStarLabel;
    private javax.swing.JPanel enterStarPanel;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel orLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JButton listMoviesButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel listMovieLabel;
    private javax.swing.JScrollPane listMovieScrollPane;
    private javax.swing.JTable listMovieTable;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JLabel deleteCustomerLabel;
    private javax.swing.JPanel deleteCustomerPanel;
    private javax.swing.JLabel deletedCustomerLabel;
    private javax.swing.JButton insertCustomerButton;
    private javax.swing.JLabel insertCustomerLabel;
    private javax.swing.JPanel insertCustomerPanel;
    private javax.swing.JLabel insertedCustomerLabel;
    private javax.swing.JLabel enterSqlLabel;
    private javax.swing.JPanel sqlPanel;
    private javax.swing.JScrollPane sqlScrollPane;
    private javax.swing.JTextArea sqlTextArea;
    private javax.swing.JButton queryButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel sqlResultLabel;
    private javax.swing.JScrollPane sqlResultScrollPane;
    private javax.swing.JTable sqlResultTable;
    private javax.swing.JLabel metaLabel;
    private javax.swing.JTabbedPane metaTabbedPane;
    private javax.swing.JLabel addrLabel;
    private javax.swing.JTextField addrField;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTextField creditField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel insertStarLabel;
    private javax.swing.JPanel insertStarPanel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField photoField;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JTextField birthField;
    private javax.swing.JButton insertStarButton;
    private javax.swing.JLabel insertedStarLabel;
    private javax.swing.JLabel insertMovieLabel;
    private javax.swing.JPanel insertMoviePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearField;
    private javax.swing.JLabel directorLabel;
    private javax.swing.JTextField directorField;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextField genreField;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JTextField bannerField;
    private javax.swing.JLabel trailerLabel;
    private javax.swing.JTextField trailerField;
    private javax.swing.JButton insertMovieButton;
    private javax.swing.JLabel insertedMovieLabel;

    protected javax.swing.JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    private static class UneditableDefaultTableModel extends DefaultTableModel {

        public UneditableDefaultTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    }

    // list movies by star first and/or last name or star id
    private void listMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        listMovieLabel.setText("");
        listMovieTable.setModel(new UneditableDefaultTableModel(null, null));
        listMovieScrollPane.setViewportView(listMovieTable);
        listMovieScrollPane.setVisible(false);

        String fname = fnameField.getText().trim();
        String lname = lnameField.getText().trim();
        String id = idField.getText().trim();

        boolean invalidID = false;
        if (!id.isEmpty()) {
            try {
                Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                invalidID = true;
            }
        }
        boolean isInvalid = false;
        int invalidCnt = 0;
        StringBuilder message = new StringBuilder();
        if ((fname.isEmpty() && lname.isEmpty() && id.isEmpty())
                || ((!fname.isEmpty() || !lname.isEmpty()) && !id.isEmpty())) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Star First and/or Last Name or Star ID\n");
        }
        if (isInvalid) {
            message.insert(0, String.format("The following %s required:\n", invalidCnt > 1 ? "fields are" : "field is"));
            JOptionPane.showMessageDialog(null, message.toString(), "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else if (invalidID) {
            JOptionPane.showMessageDialog(null, "Star ID must be numeric", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean selectSuccess = true;
            try {
                // select movie by star id
                if (fname.isEmpty() && lname.isEmpty() && !id.isEmpty()) {
                    selectMovie(Integer.parseInt(id));
                } // select movie by star first and/or last name
                else if ((!fname.isEmpty() || !lname.isEmpty()) && id.isEmpty()) {
                    selectMovie(fname, lname);
                }
            } catch (SQLException ex) {
                selectSuccess = false;
                JOptionPane.showMessageDialog(null, "Error listing movies", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            if (selectSuccess) {
                fnameField.setText("");
                lnameField.setText("");
                idField.setText("");
                fnameField.requestFocus();
            }
        }
    }

    // select movie by star id
    private void selectMovie(int starID) throws SQLException {
        PreparedStatement selectMovieStatement;
        String selectMovieQuery = "SELECT  m.* FROM movies m "
                + "JOIN stars_in_movies sim ON m.id = sim.movie_id "
                + "JOIN stars s ON sim.star_id = s.id "
                + "WHERE s.id = ?";
        selectMovieStatement = Fabflix.connection.prepareStatement(selectMovieQuery);
        selectMovieStatement.setInt(1, starID);
        ResultSet result = selectMovieStatement.executeQuery();
        ResultSetMetaData metadata = result.getMetaData();
        result.last();
        int rows = result.getRow();
        int cols = metadata.getColumnCount();
        int index = 0;
        Object[][] data = new Object[rows][cols];
        result.beforeFirst();
        while (result.next()) {
            Object[] subdata = new Object[cols];
            for (int i = 0; i < cols; i++) {
                subdata[i] = result.getObject(i + 1);
            }
            data[index] = subdata;
            index++;
        }
        Object[] columnNames = new Object[cols];
        for (int i = 0; i < cols; i++) {
            columnNames[i] = metadata.getColumnName(i + 1);
        }
        if (rows == 0) {
            listMovieLabel.setText(String.format("List of movies featuring a star with id = %s (empty set)", starID));
        } else if (rows == 1) {
            listMovieLabel.setText(String.format("List of movies featuring a star with id = %s (%s row in set)", starID, rows));
        } else {
            listMovieLabel.setText(String.format("List of movies featuring a star with id = %s (%s rows in set)", starID, rows));
        }
        listMovieTable.setModel(new UneditableDefaultTableModel(data, columnNames));
        listMovieScrollPane.setViewportView(listMovieTable);
        listMovieScrollPane.setVisible(true);
    }

    // select movie by star first and/or last name
    private void selectMovie(String fname, String lname) throws SQLException {
        PreparedStatement selectMovieStatement = null;
        if (!fname.isEmpty() && !lname.isEmpty()) { // search by star first and last name
            String selectMovieQuery = "SELECT  m.* FROM movies m "
                    + "JOIN stars_in_movies sim ON m.id = sim.movie_id "
                    + "JOIN stars s ON sim.star_id = s.id "
                    + "WHERE s.first_name = ? AND s.last_name = ?";
            selectMovieStatement = Fabflix.connection.prepareStatement(selectMovieQuery);
            selectMovieStatement.setString(1, fname);
            selectMovieStatement.setString(2, lname);
        } else if (!fname.isEmpty() && lname.isEmpty()) { // search by star first name
            String selectMovieQuery = "SELECT  m.* FROM movies m "
                    + "JOIN stars_in_movies sim ON m.id = sim.movie_id "
                    + "JOIN stars s ON sim.star_id = s.id "
                    + "WHERE s.first_name = ?";
            selectMovieStatement = Fabflix.connection.prepareStatement(selectMovieQuery);
            selectMovieStatement.setString(1, fname);
        } else if (fname.isEmpty() && !lname.isEmpty()) { // search by star last name
            String selectMovieQuery = "SELECT  m.* FROM movies m "
                    + "JOIN stars_in_movies sim ON m.id = sim.movie_id "
                    + "JOIN stars s ON sim.star_id = s.id "
                    + "WHERE s.last_name = ?";
            selectMovieStatement = Fabflix.connection.prepareStatement(selectMovieQuery);
            selectMovieStatement.setString(1, lname);
        }
        ResultSet result = selectMovieStatement.executeQuery();
        ResultSetMetaData metadata = result.getMetaData();
        result.last();
        int rows = result.getRow();
        int cols = metadata.getColumnCount();
        int index = 0;
        Object[][] data = new Object[rows][cols];
        result.beforeFirst();
        while (result.next()) {
            Object[] subdata = new Object[cols];
            for (int i = 0; i < cols; i++) {
                subdata[i] = result.getObject(i + 1);
            }
            data[index] = subdata;
            index++;
        }
        Object[] columnNames = new Object[cols];
        for (int i = 0; i < cols; i++) {
            columnNames[i] = metadata.getColumnName(i + 1);
        }
        // star first and last name
        if ((!fname.isEmpty() && !lname.isEmpty())) {
            if (rows == 0) {
                listMovieLabel.setText(String.format("List of movies featuring a star with name = %s %s (empty set)", fname, lname));
            } else if (rows == 1) {
                listMovieLabel.setText(String.format("List of movies featuring a star with name = %s %s (%s row in set)", fname, lname, rows));
            } else {
                listMovieLabel.setText(String.format("List of movies featuring a star with name = %s %s (%s rows in set)", fname, lname, rows));
            }
        } // star first name
        else if ((!fname.isEmpty() && lname.isEmpty())) {
            if (rows == 0) {
                listMovieLabel.setText(String.format("List of movies featuring a star with first name = %s (empty set)", fname));
            } else if (rows == 1) {
                listMovieLabel.setText(String.format("List of movies featuring a star with first name = %s (%s row in set)", fname, rows));
            } else {
                listMovieLabel.setText(String.format("List of movies featuring a star with first name = %s (%s rows in set)", fname, rows));
            }
        } // star last name
        else if ((fname.isEmpty() && !lname.isEmpty())) {
            if (rows == 0) {
                listMovieLabel.setText(String.format("List of movies featuring a star with last name = %s (empty set)", lname));
            } else if (rows == 1) {
                listMovieLabel.setText(String.format("List of movies featuring a star with last name = %s (%s row in set)", lname, rows));
            } else {
                listMovieLabel.setText(String.format("List of movies featuring a star with last name = %s (%s rows in set)", lname, rows));
            }
        }

        listMovieTable.setModel(new UneditableDefaultTableModel(data, columnNames));
        listMovieScrollPane.setViewportView(listMovieTable);
        listMovieScrollPane.setVisible(true);
    }

    // clear menupanel
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clearMenuPanel();
    }

    // clear menupanel
    private void insertMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {
        insertedMovieLabel.setText("");

        String title = titleField.getText().trim();
        String year = yearField.getText().trim();
        String director = directorField.getText().trim();
        String genre = genreField.getText().trim();
        String fname = fnameField.getText().trim();
        String lname = lnameField.getText().trim();
        String dob = birthField.getText().trim();
        String photo = photoField.getText().trim();
        String banner = bannerField.getText().trim();
        String trailer = trailerField.getText().trim();

        Calendar cal = Calendar.getInstance();
        int currYear = cal.get(Calendar.YEAR);
        int currMonth = cal.get(Calendar.MONTH) + 1;
        int currDate = cal.get(Calendar.DATE);

        boolean isInvalid = false;
        int invalidCnt = 0;
        StringBuilder message = new StringBuilder();
        if (title.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Movie Title\n");
        }
        if (year.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Movie Year\n");
        } else if (!year.isEmpty()) {
            int yearToInt = -1;
            try {
                yearToInt = Integer.parseInt(year);
            } catch (NumberFormatException ex) {
                isInvalid = true;
                invalidCnt++;
                message.append("    - Invalid Movie Year\n");
            }
            if (yearToInt != -1 && (yearToInt < 1900 || yearToInt > currYear)) {
                isInvalid = true;
                invalidCnt++;
                message.append("    - Movie Year must be between 1900 and ").append(currYear).append("\n");
            }
        }
        if (director.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Movie Director\n");
        }
        if (genre.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Movie Genre\n");
        }
        if (lname.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            if (fname.isEmpty()) {
                message.append("    - Star First and Last Name or Star Single Name as Last Name\n");
            } else {
                message.append("    - Star Last Name or Star Single Name as Last Name\n");
            }
        }
        if (!dob.isEmpty()) {
            if (!dob.matches("^([0-9]{4})-([0-9]{2})-([0-9]{2})$")) {
                isInvalid = true;
                invalidCnt++;
                message.append("    - Birthdate must be in YYYY-MM-DD format\n");
            } else {
                boolean isInvalidDate = false;
                String date[] = dob.split("-");
                int y = Integer.parseInt(date[0]);
                int m = Integer.parseInt(date[1]);
                int d = Integer.parseInt(date[2]);
                if (y < 1900 || y > currYear) {
                    isInvalidDate = true;
                }
                if (m < 1 || m > 12) {
                    isInvalidDate = true;
                }
                if (d < 1 || d > 31) {
                    isInvalidDate = true;
                }
                if (isInvalidDate) {
                    invalidCnt++;
                    message.append("    - Birthdate must be be between 1900-01-01 and ").append(String.format("%04d-%02d-%02d", currYear, currMonth, currDate)).append("\n");
                }
            }
        } else {
            dob = null;
        }
        if (isInvalid) {
            message.insert(0, String.format("The following %s required:\n", invalidCnt > 1 ? "fields are" : "field is"));
            JOptionPane.showMessageDialog(null, message.toString(), "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean insertSuccess = true;
            try {
                CallableStatement cstmt = Fabflix.connection.prepareCall("CALL add_movie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                cstmt.setString(1, title);
                cstmt.setString(2, year);
                cstmt.setString(3, director);
                cstmt.setString(4, banner);
                cstmt.setString(5, trailer);
                cstmt.setString(6, genre);
                cstmt.setString(7, fname);
                cstmt.setString(8, lname);
                cstmt.setString(9, dob);
                cstmt.setString(10, photo);
                cstmt.registerOutParameter(11, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(12, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(13, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(14, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(15, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(16, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(17, java.sql.Types.INTEGER);
                cstmt.registerOutParameter(18, java.sql.Types.INTEGER);
                cstmt.executeUpdate();
                int movie_count = cstmt.getInt(11);
                int genre_count = cstmt.getInt(12);
                int star_count = cstmt.getInt(13);
                int tmp_movie_id = cstmt.getInt(14);
                int tmp_genre_id = cstmt.getInt(15);
                int tmp_star_id = cstmt.getInt(16);
                int genres_in_movies_count = cstmt.getInt(17);
                int stars_in_movies_count = cstmt.getInt(18);
                
//                System.out.println("movie_count : " + movie_count);
//                System.out.println("genre_count : " + genre_count);
//                System.out.println("star_count : " + star_count);
//                System.out.println("tmp_movie_id : " + tmp_movie_id);
//                System.out.println("tmp_genre_id : " + tmp_genre_id);
//                System.out.println("tmp_star_id : " + tmp_star_id);
//                System.out.println("genres_in_movies_count : " + genres_in_movies_count);
//                System.out.println("stars_in_movies_count : " + stars_in_movies_count);

                //insertedMovieLabel.setText(String.format("<HTML>%s has been<BR>successfully<BR>inserted with star id %d</HTML>", title, tmp_movie_id));
                StringBuilder status = new StringBuilder("<HTML>");
                if (movie_count > 0) {
                    status.append(String.format("The movie %s (%s) already exists in the database.<BR>", title, year));
                    //System.out.println("MOVIE ALREADY EXISTS! NOT INSERTED");
                } else {
                    status.append(String.format("The movie %s (%s) has been entered into the database with movie_id = %d.<BR>", title, year, tmp_movie_id));
                    //System.out.println("MOVIE DOES NOT EXIST! INSERTED INTO DB AS MOVIE_ID = " + tmp_movie_id);
                }
                if (genre_count > 0) {
                    status.append(String.format("The genre %s already exists in the database.<BR>", genre));
                    //System.out.println("GENRE ALREADY EXISTS! NOT INSERTED");
                } else {
                    status.append(String.format("The genre %s has been entered into the database with genre_id = %d.<BR>", genre, tmp_genre_id));
                    //System.out.println("GENRE DOES NOT EXIST! INSERTED INTO DB AS GENRE_ID = " + tmp_genre_id);
                }
                if (genres_in_movies_count == 0) {
                    status.append(String.format("The movie %s (%s) with movie_id = %d has been linked with genre %s with genre_id = %d.<BR>", title, year, tmp_movie_id, genre, tmp_genre_id));
                    //System.out.println("MOVIE IS NOW LINKED TO GENRE");
                } else {
                    status.append(String.format("The movie %s (%s) with movie_id = %d was already linked with genre %s with genre_id = %d.<BR>", title, year, tmp_movie_id, genre, tmp_genre_id));
                    //System.out.println("MOVIE WAS ALREADY LINKED TO GENRE!");
                }
                if (star_count > 0) {
                    status.append(String.format("The star %s already exists in the database.<BR>", (fname + " " + lname).trim()));
                    //System.out.println("STAR ALREADY EXISTS! NOT INSERTED");
                } else {
                    status.append(String.format("The star %s has been entered into the database with star_id = %d.<BR>", (fname + " " + lname).trim(), tmp_star_id));
                    //System.out.println("STAR DOES NOT EXIST! INSERTED INTO DB AS STAR_ID = " + tmp_star_id);
                }
                if (stars_in_movies_count == 0) {
                    status.append(String.format("The movie %s (%s) with movie_id = %d has been linked with star %s with star_id = %d.<BR>", title, year, tmp_movie_id, (fname + " " + lname).trim(), tmp_star_id));
                    //System.out.println("MOVIE IS NOW LINKED TO STAR");
                } else {
                    status.append(String.format("The movie %s (%s) with movie_id = %d was already linked with star %s with star_id = %d.<BR>", title, year, tmp_movie_id, (fname + " " + lname).trim(), tmp_star_id));
                    //System.out.println("MOVIE WAS ALREADY LINKED TO STAR!");
                }
                status.append("</HTML>");
                insertedMovieLabel.setText(status.toString());
                
                
                

            } catch (SQLException ex) {
                insertSuccess = false;
                Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (insertSuccess) {
                titleField.setText("");
                yearField.setText("");
                directorField.setText("");
                genreField.setText("");
                fnameField.setText("");
                lnameField.setText("");
                birthField.setText("");
                photoField.setText("");
                bannerField.setText("");
                trailerField.setText("");
                titleField.requestFocus();
            }
        }


    }

    // insert a new star into the database
    private void insertStarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        insertedStarLabel.setText("");

        String fname = fnameField.getText().trim();
        String lname = lnameField.getText().trim();
        String dob = birthField.getText().trim();
        String photo = photoField.getText().trim();

        boolean isInvalid = false;
        int invalidCnt = 0;
        StringBuilder message = new StringBuilder();
        if (fname.isEmpty() && lname.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Star First and Last Name or Star Single Name as Last Name\n");
        } else if (lname.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Star Last Name or Star Single Name as Last Name\n");
        }
        if (isInvalid) {
            message.insert(0, String.format("The following %s required:\n", invalidCnt > 1 ? "fields are" : "field is"));
            JOptionPane.showMessageDialog(null, message.toString(), "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean insertSuccess = true;
            try {
                String insertStarQuery = "INSERT INTO stars (first_name, last_name , dob , photo_url) VALUES (?,?,?,?) ";
                PreparedStatement insertStarStatement = Fabflix.connection.prepareStatement(insertStarQuery);
                insertStarStatement.setString(1, fname);
                insertStarStatement.setString(2, lname);
                if (dob.isEmpty()) {
                    insertStarStatement.setNull(3, Types.DATE);
                } else {
                    insertStarStatement.setString(3, dob);
                }
                insertStarStatement.setString(4, photo);
                insertStarStatement.executeUpdate();
                String selectStarQuery = "SELECT id, first_name, last_name FROM stars JOIN (SELECT max(id) AS maximum FROM stars) AS big ON id = big.maximum";
                PreparedStatement selectStarStatement = Fabflix.connection.prepareStatement(selectStarQuery);
                ResultSet result = selectStarStatement.executeQuery();
                result.next();
                insertedStarLabel.setText(String.format("%s has been successfully inserted with star id %d",
                        (result.getString(2) + " " + result.getString(3)).trim(), result.getInt(1)));
            } catch (SQLException ex) {
                insertSuccess = false;
                JOptionPane.showMessageDialog(null, "Birthdate must be a valid date in the form of YYYY-MM-DD", "Warning Message", JOptionPane.WARNING_MESSAGE);
            }
            if (insertSuccess) {
                fnameField.setText("");
                lnameField.setText("");
                birthField.setText("");
                photoField.setText("");
                fnameField.requestFocus();
            }
        }
    }

    // insert a customer into the database
    private void insertCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        insertedCustomerLabel.setText("");

        String fname = fnameField.getText().trim();
        String lname = lnameField.getText().trim();
        String address = addrField.getText().trim();
        String credit = creditField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passField.getPassword());

        boolean isInvalid = false;
        int invalidCnt = 0;
        StringBuilder message = new StringBuilder();
        if (fname.isEmpty() && lname.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - First and Last Name or Single Name as Last Name\n");
        } else if (lname.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Last Name or Single Name as Last Name\n");
        }
        if (address.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Address\n");
        }
        if (credit.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Credit Card\n");
        }
        if (email.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Email\n");
        }
        if (password.isEmpty()) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Password");
        }
        if (isInvalid) {
            message.insert(0, String.format("The following %s required:\n", invalidCnt > 1 ? "fields are" : "field is"));
            JOptionPane.showMessageDialog(null, message, "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean insertSuccess = true;
            try {
                String insertCustomerQuery = "INSERT INTO customers "
                        + "(first_name, last_name, cc_id, address, email, password) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement insertCustomerStatement = Fabflix.connection.prepareStatement(insertCustomerQuery);
                insertCustomerStatement.setString(1, fname);
                insertCustomerStatement.setString(2, lname);
                insertCustomerStatement.setString(3, credit);
                insertCustomerStatement.setString(4, address);
                insertCustomerStatement.setString(5, email);
                insertCustomerStatement.setString(6, password);
                insertCustomerStatement.executeUpdate();
                String selectCustomerQuery = "SELECT id, first_name, last_name FROM customers JOIN (SELECT max(id) AS maximum FROM customers) AS big ON id = big.maximum";
                PreparedStatement selectStarStatement = Fabflix.connection.prepareStatement(selectCustomerQuery);
                ResultSet result = selectStarStatement.executeQuery();
                result.next();
                insertedCustomerLabel.setText(String.format("%s has been successfully inserted with customer id %d",
                        (result.getString(2) + " " + result.getString(3)).trim(), result.getInt(1)));
            } catch (SQLException ex) {
                insertSuccess = false;
                JOptionPane.showMessageDialog(null, "Credit Card must exist in database", "Warning Message", JOptionPane.WARNING_MESSAGE);
            }
            if (insertSuccess) {
                fnameField.setText("");
                lnameField.setText("");
                creditField.setText("");
                addrField.setText("");
                emailField.setText("");
                passField.setText("");
                fnameField.requestFocus();
            }
        }
    }

    // delete a customer from the database
    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        deletedCustomerLabel.setText("");

        String fname = fnameField.getText().trim();
        String lname = lnameField.getText().trim();
        String id = idField.getText().trim();

        boolean invalidID = false;
        if (!id.isEmpty()) {
            try {
                Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                invalidID = true;
            }
        }
        boolean isInvalid = false;
        int invalidCnt = 0;
        StringBuilder message = new StringBuilder();
        if ((fname.isEmpty() && lname.isEmpty() && id.isEmpty())
                || ((!fname.isEmpty() || !lname.isEmpty()) && !id.isEmpty())) {
            isInvalid = true;
            invalidCnt++;
            message.append("    - Customer First and/or Last Name or Customer ID\n");
        }
        if (isInvalid) {
            message.insert(0, String.format("The following %s required:\n", invalidCnt > 1 ? "fields are" : "field is"));
            JOptionPane.showMessageDialog(null, message.toString(), "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else if (invalidID) {
            JOptionPane.showMessageDialog(null, "Customer ID must be numeric", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean deleteSuccess = true;
            try {
                // delete customer by customer id
                if (fname.isEmpty() && lname.isEmpty() && !id.isEmpty()) {
                    deleteCustomer(Integer.parseInt(id));
                } // delete customer by customer first and/or last name
                else if ((!fname.isEmpty() || !lname.isEmpty()) && id.isEmpty()) {
                    deleteCustomer(fname, lname);
                }
            } catch (SQLException ex) {
                deleteSuccess = false;
                JOptionPane.showMessageDialog(null, "Error deleting customer", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            if (deleteSuccess) {
                fnameField.setText("");
                lnameField.setText("");
                idField.setText("");
                fnameField.requestFocus();
            }
        }
    }

    // delete customer by id
    private void deleteCustomer(int customerID) throws SQLException, NumberFormatException {
        String deleteCustomerQuery = "DELETE FROM customers WHERE id = ?";
        PreparedStatement deleteCustomerStatement = Fabflix.connection.prepareStatement(deleteCustomerQuery);
        deleteCustomerStatement.setInt(1, customerID);
        int result = deleteCustomerStatement.executeUpdate();
        if (result == 1) {
            deletedCustomerLabel.setText(String.format("Delete customer with id = %d from the database (Query OK, 1 row affected)", customerID));
        } else {
            deletedCustomerLabel.setText(String.format("Delete customer with id = %d from the database (Query OK, %d rows affected)", customerID, result));
        }
    }

    // delete customer by first and/or last name
    private void deleteCustomer(String fname, String lname) throws SQLException {
        if (!fname.isEmpty() && !lname.isEmpty()) { // delete by customer first and last name
            String deleteCustomerQuery = "DELETE FROM customers WHERE first_name = ? AND last_name = ?";
            PreparedStatement deleteCustomerStatement = Fabflix.connection.prepareStatement(deleteCustomerQuery);
            deleteCustomerStatement.setString(1, fname);
            deleteCustomerStatement.setString(2, lname);
            int result = deleteCustomerStatement.executeUpdate();
            if (result == 1) {
                deletedCustomerLabel.setText(String.format("Delete customer with name = %s %s from the database (Query OK, 1 rows affected)", fname, lname));
            } else {
                deletedCustomerLabel.setText(String.format("Delete customer with name = %s %s from the database (Query OK, %d rows affected)", fname, lname, result));
            }
        } else if (!fname.isEmpty() && lname.isEmpty()) { // delete by customer first name
            String deleteCustomerQuery = "DELETE FROM customers WHERE first_name = ?";
            PreparedStatement deleteCustomerStatement = Fabflix.connection.prepareStatement(deleteCustomerQuery);
            deleteCustomerStatement.setString(1, fname);
            int result = deleteCustomerStatement.executeUpdate();
            if (result == 1) {
                deletedCustomerLabel.setText(String.format("Delete customer with first name = %s from the database (Query OK, 1 row affected)", fname));
            } else {
                deletedCustomerLabel.setText(String.format("Delete customer with first name = %s from the database (Query OK, %d rows affected)", fname, result));
            }
        } else if (fname.isEmpty() && !lname.isEmpty()) { // delete by customer last name
            String deleteCustomerQuery = "DELETE FROM customers WHERE last_name = ?";
            PreparedStatement deleteCustomerStatement = Fabflix.connection.prepareStatement(deleteCustomerQuery);
            deleteCustomerStatement.setString(1, lname);
            int result = deleteCustomerStatement.executeUpdate();
            if (result == 1) {
                deletedCustomerLabel.setText(String.format("Delete customer with last name = %s from the database (Query OK, 1 row affected)", lname));
            } else {
                deletedCustomerLabel.setText(String.format("Delete customer with last name = %s from the database (Query OK, %d rows affected)", lname, result));
            }
        }
    }

    // execute database metadata query and list database metadata result
    private void returnMetadata() throws SQLException {
        metaLabel = new javax.swing.JLabel();
        metaTabbedPane = new javax.swing.JTabbedPane();
        cancelButton = new javax.swing.JButton();

        metaLabel.setText("Provide the metadata of the database");

        String showTablesQuery = "SHOW TABLES";
        Statement showTables = Fabflix.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet showTablesResult = showTables.executeQuery(showTablesQuery);
        ResultSetMetaData showTablesMetaData = showTablesResult.getMetaData();
        showTablesResult.last();
        int showTablesRows = showTablesResult.getRow();
        int showTablesCols = showTablesMetaData.getColumnCount();
        int showTablesIndex = 0;
        JScrollPane[] metaScrollPanes = new JScrollPane[showTablesRows];
        JTable[] metaTables = new JTable[showTablesRows];
        showTablesResult.beforeFirst();
        while (showTablesResult.next()) {
            String describeTableQuery = String.format("DESCRIBE %s", showTablesResult.getString(showTablesCols));
            Statement describeTable = Fabflix.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet describeTableResult = describeTable.executeQuery(describeTableQuery);
            ResultSetMetaData describeTablesMetaData = describeTableResult.getMetaData();
            describeTableResult.last();
            int describeTableRows = describeTableResult.getRow();
            int describeTableCols = describeTablesMetaData.getColumnCount();
            int describeTableIndex = 0;
            Object[][] data = new Object[describeTableRows][describeTableCols];
            describeTableResult.beforeFirst();
            while (describeTableResult.next()) {
                Object[] subdata = new Object[describeTableCols];
                for (int i = 0; i < describeTableCols; i++) {
                    if (describeTableResult.getObject(i + 1) == null) {
                        subdata[i] = "NULL";
                    } else {
                        subdata[i] = describeTableResult.getObject(i + 1).toString();
                    }
                }
                data[describeTableIndex] = subdata;
                describeTableIndex++;
            }
            Object[] columnNames = new Object[describeTableCols];
            for (int i = 0; i < describeTableCols; i++) {
                columnNames[i] = describeTablesMetaData.getColumnLabel(i + 1);
            }

            metaTables[showTablesIndex] = new javax.swing.JTable();
            metaTables[showTablesIndex].setModel(new UneditableDefaultTableModel(data, columnNames));
            metaScrollPanes[showTablesIndex] = new javax.swing.JScrollPane();
            metaScrollPanes[showTablesIndex].setViewportView(metaTables[showTablesIndex]);
            metaTabbedPane.addTab(showTablesResult.getString(showTablesCols), metaScrollPanes[showTablesIndex]);
        }

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(cancelButton)).addGroup(menuPanelLayout.createSequentialGroup().addComponent(metaLabel).addGap(0, 0, Short.MAX_VALUE)).addComponent(metaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(menuPanelLayout.createSequentialGroup().addComponent(metaLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(metaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(cancelButton)));

    }

    // execute a SQL query
    private void enterSqlButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sqlResultLabel.setText("");
        sqlResultTable.setModel(new UneditableDefaultTableModel(null, null));
        sqlResultScrollPane.setViewportView(sqlResultTable);
        sqlResultScrollPane.setVisible(false);

        String sqlQuery = sqlTextArea.getText().trim();
        String queryType = sqlQuery.split("\\s+")[0];

        if (sqlQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a SQL command", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else if (!queryType.equalsIgnoreCase("SELECT") && !queryType.equalsIgnoreCase("UPDATE")
                && !queryType.equalsIgnoreCase("INSERT") && !queryType.equalsIgnoreCase("DELETE")) {
            JOptionPane.showMessageDialog(null, "Invalid SQL query", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean sqlSuccess = true;
            try {
                if (queryType.equalsIgnoreCase("SELECT")) {
                    // PERFORM SELECT QUERY
                    returnQueryResult(sqlQuery);
                } else {
                    // PERFORM UPDATE/INSERT/DELETE QUERY
                    returnUpdateResult(sqlQuery);
                }
            } catch (SQLException ex) {
                sqlSuccess = false;
                if (queryType.equalsIgnoreCase("SELECT")) {
                    JOptionPane.showMessageDialog(null, "Invalid SELECT query", "Warning Message", JOptionPane.WARNING_MESSAGE);
                } else if (queryType.equalsIgnoreCase("UPDATE")) {
                    JOptionPane.showMessageDialog(null, "Invalid UPDATE query", "Warning Message", JOptionPane.WARNING_MESSAGE);
                } else if (queryType.equalsIgnoreCase("INSERT")) {
                    JOptionPane.showMessageDialog(null, "Invalid INSERT query", "Warning Message", JOptionPane.WARNING_MESSAGE);
                } else if (queryType.equalsIgnoreCase("DELETE")) {
                    JOptionPane.showMessageDialog(null, "Invalid DELETE query", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
            }
//            if (sqlSuccess) {
//                sqlTextArea.setText("");
//                sqlTextArea.requestFocus();
//            }
        }
    }

    private void clearSqlButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sqlTextArea.setText("");
        sqlTextArea.requestFocus();
        sqlResultLabel.setText("");
        sqlResultTable.setModel(new UneditableDefaultTableModel(null, null));
        sqlResultScrollPane.setViewportView(sqlResultTable);
        sqlResultScrollPane.setVisible(false);
    }

    // execute select query and list result
    private void returnQueryResult(String sqlQuery) throws SQLException {
        ResultSet result = Fabflix.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sqlQuery);
        ResultSetMetaData metadata = result.getMetaData();
        result.last();
        int rows = result.getRow();
        int cols = metadata.getColumnCount();
        int index = 0;
        Object[][] data = new Object[rows][cols];
        result.beforeFirst();
        while (result.next()) {
            Object[] subdata = new Object[cols];
            for (int i = 0; i < cols; i++) {
                if (result.getObject(i + 1) == null) {
                    subdata[i] = "NULL";
                } else {
                    subdata[i] = result.getObject(i + 1);
                }
            }
            data[index] = subdata;
            index++;
        }
        Object[] columnNames = new Object[cols];
        for (int i = 0; i < cols; i++) {
            columnNames[i] = metadata.getColumnName(i + 1);
        }
        if (rows == 0) {
            sqlResultLabel.setText("SQL result: Empty set");
        } else if (rows == 1) {
            sqlResultLabel.setText("SQL result: 1 row in set");
        } else {
            sqlResultLabel.setText(String.format("SQL result: %s rows in set", rows));
        }
        sqlResultTable.setModel(new UneditableDefaultTableModel(data, columnNames));
        sqlResultScrollPane.setViewportView(sqlResultTable);
        sqlResultScrollPane.setVisible(true);

    }

    // execute update/insert/delete query and list result
    private void returnUpdateResult(String sqlQuery) throws SQLException {
        int rows = Fabflix.connection.createStatement().executeUpdate(sqlQuery);

        if (rows == 1) {
            sqlResultLabel.setText("SQL result: Query OK, 1 row affected");
        } else {
            sqlResultLabel.setText(String.format("SQL result: Query OK, %s rows affected", rows));
        }
        sqlResultTable.setModel(new UneditableDefaultTableModel(null, null));
        sqlResultScrollPane.setViewportView(sqlResultTable);
        sqlResultScrollPane.setVisible(false);
    }

    // clear the menu panel
    private void clearMenuPanel() {
        menuPanel.removeAll();
        menuPanel.revalidate();
        repaint();
    }
}
