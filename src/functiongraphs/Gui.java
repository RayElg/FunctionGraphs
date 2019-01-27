package functiongraphs;

/**
 *
 * Group: Elgie, Morby, Peacock
 *
 * Frame class for FunctionGraph
 *
 * Will have buttons, canvas, list of functions on screen
 *
 * FunctionGraph is a program that will graph a variety of functions for
 * visualization and to express the characterstics of the equation
 *
 */
public class Gui extends javax.swing.JFrame {

    public static int numOfFunctions = 0;

    public static int zoomFactor = 0; //0 by default, +1 when zooming in or -1 when zooming out
    
    public Gui() {   
        initComponents();
        this.setVisible(true); //Set the frame to visible on construction
        
        //Labels for the rational function aren't visible from the start.
        rationalLabel1.setVisible(false);
        rationalLabel2.setVisible(false);
        rationalLabel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphButton = new javax.swing.JButton();
        fncSelectionCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aInputField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kInputField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dInputField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cInputField = new javax.swing.JTextField();
        mainPanel = new MainPanel();
        jLabel6 = new javax.swing.JLabel();
        baseInputField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sidePanel = new SidePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        propertiesArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        rationalLabel1 = new javax.swing.JLabel();
        rationalLabel2 = new javax.swing.JLabel();
        rationalLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        graphButton.setText("Graph");
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        fncSelectionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "f(x)=a*Sin(kx+d) + c", "f(x)=a*Cos(kx+d) + c", "f(x)=a*Tan(kx+d) + c", "f(x)=a*b^(kx+d) + c", "f(x)=a*(kx+d)^deg + c", "f(x)=a*(kx+d) + c", "f(x)=(n(x))/(d(x))", "f(x)=a*logb(kx+d) + c", "f(x)=a*abs(kx+d) + c" }));
        fncSelectionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fncSelectionComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Your Function:");

        jLabel2.setText("a =");

        aInputField.setText("1");
        aInputField.setMinimumSize(new java.awt.Dimension(73, 24));

        jLabel3.setText("k = ");

        kInputField.setText("1");
        kInputField.setMinimumSize(new java.awt.Dimension(73, 24));

        jLabel4.setText("d = ");

        dInputField.setText("0");
        dInputField.setMinimumSize(new java.awt.Dimension(73, 24));

        jLabel5.setText("c = ");

        cInputField.setText("0");
        cInputField.setMinimumSize(new java.awt.Dimension(73, 24));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jLabel6.setText("Degree or Base=");

        baseInputField.setText("5");
        baseInputField.setMinimumSize(new java.awt.Dimension(73, 24));

        jLabel7.setText("Selected Funtion Properties");

        jLabel8.setText("Functions");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        propertiesArea.setColumns(20);
        propertiesArea.setRows(5);
        jScrollPane1.setViewportView(propertiesArea);

        saveButton.setText("Save Graphs");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load Graphs");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        zoomInButton.setText("+");
        zoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInButtonActionPerformed(evt);
            }
        });

        zoomOutButton.setText("-");
        zoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutButtonActionPerformed(evt);
            }
        });

        rationalLabel1.setText("Clicking \"Graph\" will make a rational");

        rationalLabel2.setText("from the two previous functions. n(x)/d(x)");

        rationalLabel3.setText("in order they appear on the side panel.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fncSelectionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(baseInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveButton)
                                    .addComponent(loadButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(graphButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(zoomInButton)
                                        .addGap(2, 2, 2)
                                        .addComponent(zoomOutButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(rationalLabel1))
                                    .addComponent(rationalLabel3)
                                    .addComponent(rationalLabel2))
                                .addGap(16, 16, 16))))
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(aInputField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(kInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(dInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(cInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(baseInputField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fncSelectionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rationalLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rationalLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rationalLabel3)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(graphButton)
                                    .addComponent(saveButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(loadButton)
                                    .addComponent(zoomInButton)
                                    .addComponent(zoomOutButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButtonActionPerformed
        //Graph button pressed
        addFunc();
        sidePanel.repaint();
        mainPanel.repaint();
    }//GEN-LAST:event_graphButtonActionPerformed

    public static void funcSelected(int func){ //When a function is selected in sidePanel
        propertiesArea.setText(""); //Clear area
        
        Function selectedFunc = FunctionGraphs.functions.get(func); //Get function
        for (String propertiesString : selectedFunc.propertiesStrings()) {//Iterate through propertiesStrings for this func
            propertiesArea.append(propertiesString + "\n"); //Add string to the area, new line
        }
        
    }
    
    public void addFunc() { //Add selected function, creates a function inside FunctionGraphs
        double a,k,d,c; //Attributes from Gui input
        
        try {
            a = Double.parseDouble(aInputField.getText()); //Take akdc from frame inputs
            k = Double.parseDouble(kInputField.getText());
            d = Double.parseDouble(dInputField.getText());
            c = Double.parseDouble(cInputField.getText());

            //Calls appropriate makeFunc in FunctionGraph
            if (fncSelectionCombo.getSelectedIndex() == 0) { //Sin
                FunctionGraphs.makeNormalFunc("Sin", a, k, d, c);
            } else if (fncSelectionCombo.getSelectedIndex() == 1) { //Cos
                FunctionGraphs.makeNormalFunc("Cos", a, k, d, c);
            } else if (fncSelectionCombo.getSelectedIndex() == 2) { //Tan
                FunctionGraphs.makeNormalFunc("Tan", a, k, d, c);
            } else if (fncSelectionCombo.getSelectedIndex() == 3) { //Exponential
                double b = Double.parseDouble(baseInputField.getText()); //Get base
                FunctionGraphs.makeExponential("Exponential", a, k, d, c, b);
            } else if (fncSelectionCombo.getSelectedIndex() == 4) { //Polynomial
                double deg = Double.parseDouble(baseInputField.getText()); ///Get degree
                FunctionGraphs.makePolynomial(a, k, d, c, deg);
            } else if (fncSelectionCombo.getSelectedIndex() == 5) { //Linear
                FunctionGraphs.makeNormalFunc("Linear", a, k, d, c);
            } else if (fncSelectionCombo.getSelectedIndex() == 6) { //Rational
                try {
                    FunctionGraphs.makeRational(FunctionGraphs.functions.get(FunctionGraphs.functions.size() - 2), FunctionGraphs.functions.get(FunctionGraphs.functions.size() - 1));
                } catch (Exception e) {
                    System.out.println("You cannot make a rational right now");
                }
            } else if (fncSelectionCombo.getSelectedIndex() == 7) { //Log
                double b = Double.parseDouble(baseInputField.getText()); //Get base
                FunctionGraphs.makeExponential("Log", a, k, d, c, b);
            } else if (fncSelectionCombo.getSelectedIndex() == 8) { //Abs
                FunctionGraphs.makeNormalFunc("Abs", a, k, d, c);
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Enter only numbers!");
        }
        
        
    }

    private void fncSelectionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fncSelectionComboActionPerformed


        if (fncSelectionCombo.getSelectedIndex() == 6) {//if the rational fnc is selected the labels and combo boxes that pertain to it are set to visible
            rationalLabel1.setVisible(true);
            rationalLabel2.setVisible(true);
            rationalLabel3.setVisible(true);
 

           
        } else {
            //if anything that isnt the rational function is selected the rational labels not visible
            rationalLabel1.setVisible(false);
            rationalLabel2.setVisible(false);
            rationalLabel3.setVisible(false);

        }


    }//GEN-LAST:event_fncSelectionComboActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Save the functions in FunctionGraphs.functions to functions.FG
        FunctionGraphs.saveFuncs();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
       FunctionGraphs.loadFuncs();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void zoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInButtonActionPerformed
        //Increase zoom factor
        zoomFactor++;
        //Just tell mainPanel to repaint, it will check zoom factor
        mainPanel.repaint();
    }//GEN-LAST:event_zoomInButtonActionPerformed

    private void zoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutButtonActionPerformed
        //Decrease zoom factor
        zoomFactor--;
        //Just tell mainPanel to repaint, it will check zoom factor
        mainPanel.repaint();
    }//GEN-LAST:event_zoomOutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField aInputField;
    private javax.swing.JTextField baseInputField;
    private static javax.swing.JTextField cInputField;
    private static javax.swing.JTextField dInputField;
    private static javax.swing.JComboBox<String> fncSelectionCombo;
    private javax.swing.JButton graphButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField kInputField;
    private javax.swing.JButton loadButton;
    public static javax.swing.JPanel mainPanel;
    private static javax.swing.JTextArea propertiesArea;
    private javax.swing.JLabel rationalLabel1;
    private javax.swing.JLabel rationalLabel2;
    private javax.swing.JLabel rationalLabel3;
    private javax.swing.JButton saveButton;
    public static javax.swing.JPanel sidePanel;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    // End of variables declaration//GEN-END:variables
}
