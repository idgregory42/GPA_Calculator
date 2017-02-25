/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa_calculator;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;


import java.util.LinkedHashMap;

import javax.swing.DefaultListModel;



/**
 *
 * @author Ian
 */
public class CalcMain extends javax.swing.JFrame {

    /**
     * Creates new form CalcMain
     */
    
    private LinkedHashMap<String,Double> hours;
    private LinkedHashMap<String,Double> grades;
    
    private LinkedHashMap<Integer, String> names;
    private LinkedHashMap<Integer, Double> gradeVals;
    
    private Integer count;
    
    Double totalGrades;
    Double totalHours;
    

    Double quality;
    DefaultListModel<String> lm;

    
    public CalcMain() {
        initComponents();
        totalGrades = 0.0;
        totalHours = 0.0;
        quality = 0.0;
        count = 0;

        lm = new DefaultListModel<>();
        
        names = new LinkedHashMap<>();
        gradeVals = new LinkedHashMap<>();
        
        gradeVals.put(0, 4.0);
        gradeVals.put(1, 3.0);
        gradeVals.put(2, 2.0);
        gradeVals.put(3, 1.0);
        gradeVals.put(4, 0.0);
        
        
        hours = new LinkedHashMap<>();
        grades = new LinkedHashMap<>();
        setIcon();
        
        //error.setVisible(false);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gradeBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        hourBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        gpaText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GPA Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(getPreferredSize());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)))); // NOI18N

        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)), javax.swing.BorderFactory.createEtchedBorder()));

        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Course Grade");

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        gradeBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gradeBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gradeBoxKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Course Credit Hours");

        hourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        hourBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hourBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hourBoxKeyTyped(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton2KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Course Name");

        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "GPA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue))); // NOI18N
        jPanel6.setAlignmentX(1.0F);
        jPanel6.setAlignmentY(1.0F);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        gpaText.setEditable(false);
        gpaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gpaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaText.setText("0.00");
        gpaText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaText.setFocusCycleRoot(true);
        gpaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTextActionPerformed(evt);
            }
        });
        gpaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpaTextKeyTyped(evt);
            }
        });
        jPanel6.add(gpaText);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameText))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradeBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hourBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameText))
                .addGap(7, 7, 7)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entered Courses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 0), new java.awt.Color(102, 255, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(102, 255, 0)))); // NOI18N
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton3KeyTyped(evt);
            }
        });

        jButton4.setText("Delete All");
        jButton4.setAutoscrolls(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton4KeyTyped(evt);
            }
        });

        jList2.setFocusCycleRoot(true);
        jList2.setFocusable(false);
        jList2.setMaximumSize(jList2.getMaximumSize());
        jList2.setPreferredSize(jList2.getMaximumSize());
        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jList2KeyTyped(evt);
            }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        jPanel4.add(jPanel5);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(953, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //grades
        //hours 
        //names
        eventFunction();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void eventFunction(){
        
        if(nameText.getText().compareTo("") != 0){
            
            //error.setVisible(false);

            String name = nameText.getText();
            if(names.containsValue(name))
            {
                //error.setVisible(true);
                return;
            }
            

            String hour = hourBox.getSelectedItem().toString();
            String grade = gradeBox.getSelectedItem().toString();
            
            lm.addElement("Course : " + name + "  |  Grade: " + grade + "  |  Hour(s): " + hour);
            String index = lm.lastElement();
            jList2.setModel(lm);
            jList2.ensureIndexIsVisible(jList2.getFirstVisibleIndex());
            jList2.setSelectedValue(index, true);
            Integer k = gradeBox.getSelectedIndex();
            
            Double grade_val = gradeVals.get(k);
            
            names.put(count, name);

            
            if(k == 4)
            {
                totalHours += 0;
                totalGrades = 0.0;  
                hours.put(name, totalGrades);
                grades.put(name, totalGrades);

            }
            else
            {
                
                Double h = Double.parseDouble(hour);
            
                totalHours += h;
                totalGrades = grade_val;
            
                hours.put(name, h);
                grades.put(name, grade_val);
                quality = (grade_val * h) + quality;
            
                Double gap = calGPA();
                double y = gap;
                double r = (double) Math.round(y * 100) / 100;
                Double c = r;
                gpaText.setText(c.toString());
            
           // gpaText.setText(calGPA().toString());
            }
            count++;
            nameText.setText("");
        }
        else
        {
            //error.setVisible(true);
        }   
        
    }
    
    private Double calGPA(){
       return quality/ totalHours;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nameText.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        if(!jList2.isSelectionEmpty()){
            if(hours.isEmpty()) return;
            int select = jList2.getSelectedIndex();
            String n = names.remove(select);
            Double g = grades.remove(n);
            Double h = hours.remove(n);
            quality -= (g*h);
            
            totalGrades -= g;
            totalHours -= h;
            lm.removeElementAt(select);
            jList2.setModel(lm);
            count--;

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ValueChanged

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            eventFunction();
        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            eventFunction();
        }
    }//GEN-LAST:event_formKeyPressed

    private void nameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyTyped
        // TODO add your handling code here:
 
    }//GEN-LAST:event_nameTextKeyTyped

    private void gradeBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradeBoxKeyTyped
        // TODO add your handling code here:

               
    }//GEN-LAST:event_gradeBoxKeyTyped

    private void hourBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hourBoxKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_hourBoxKeyTyped

    private void jList2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyTyped
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jList2KeyTyped

    private void jButton3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyTyped
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton3KeyTyped

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyTyped
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyTyped

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            eventFunction();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextKeyPressed

    private void gradeBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradeBoxKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            eventFunction();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeBoxKeyPressed

    private void hourBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hourBoxKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            eventFunction();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hourBoxKeyPressed

    private void jButton4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if(!hours.isEmpty())
        {
            if( lm.isEmpty()) return;
            int select = jList2.getSelectedIndex();
            //lm.removeElementAt(select);
            //jList2.setModel(lm);
            grades.clear();
            hours.clear();
            names.clear();
            this.gpaText.requestFocusInWindow();
            gpaText.setText("0.00");
            totalGrades = 0.0;
            totalHours = 0.0;
            quality = 0.0;
            count = 0;
            lm.clear();
            jList2.setModel(lm);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void gpaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpaTextKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTextKeyTyped

    private void gpaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalcMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField gpaText;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JComboBox<String> hourBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables
  private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("file.png")));
    }
}


