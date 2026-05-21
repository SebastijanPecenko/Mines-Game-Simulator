package demo;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Game extends javax.swing.JFrame {
    private boolean inGame = false;
    private int safeClicks = 0;
    private double currentBet = 0;
    private String[] gameBoard = new String[25];
    private JLabel[] labels;
    private double currentProfit = 0;
    public Game() {
        initComponents();
        try {
            java.net.URL url = getClass().getResource("/pictures/logo.png");
            if (url != null) {
                java.awt.Image ikona = new javax.swing.ImageIcon(url).getImage();
                this.setIconImage(ikona);
            }
        } catch (Exception e) {
            System.out.println("Ikone ni bilo mogoče naložiti.");
        }
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jButton2.setVisible(false);
        jLabel5.setVisible(false);
        jTextField3.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);
        jButton1.setVisible(true);
        jLabel32.setText(String.format("%.2f", Main_Page.GlobalData.balance));
        labels = new JLabel[] {
            jLabel7, jLabel8, jLabel9, jLabel10, jLabel11,
            jLabel12, jLabel13, jLabel14, jLabel15, jLabel16,
            jLabel17, jLabel18, jLabel19, jLabel20, jLabel21,
            jLabel22, jLabel23, jLabel24, jLabel25, jLabel26,
            jLabel27, jLabel28, jLabel29, jLabel30, jLabel31
        };
        this.getContentPane().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideOverlay();
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideOverlay();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINES");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BET AMOUNT:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MINES:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PROFIT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GEMS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("BET");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RANDOM PICK");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 40));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, 30));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 30));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 30));

        jComboBox1.setBackground(new java.awt.Color(35, 35, 35));
        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setMaximumRowCount(10);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 30));

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        jLabel35.setOpaque(true);
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 210, 130));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("0.00x");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("AVABILE CASH:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 70, 70));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 70, 70));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 70, 70));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 70, 70));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 70, 70));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 70, 70));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 70, 70));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 70, 70));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 70, 70));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 70, 70));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 70, 70));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 70, 70));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 70, 70));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 70, 70));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 70, 70));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 70, 70));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 70, 70));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 70, 70));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 70, 70));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 70, 70));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 70, 70));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 70, 70));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 70, 70));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 70, 70));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 70, 70));

        jLabel2.setBackground(new java.awt.Color(18, 18, 18));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background2.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 530, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        setSize(new java.awt.Dimension(816, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        jComboBox1.setEnabled(false);
        if (!inGame) {
            try {
                double amount = Double.parseDouble(jTextField1.getText());
                double balance = Main_Page.GlobalData.balance;
                if (amount <= balance && amount > 0) {
                    balance -= amount;
                    currentBet = amount;
                    inGame = true;
                    Main_Page.GlobalData.balance = balance;
                    Main_Page.Storage.save(balance);
                    jLabel32.setText(String.format("%.2f", balance));
                    jButton1.setText("CASHOUT");
                    jComboBox1.setEnabled(false);
                    jTextField1.setEnabled(false);
                    jButton2.setVisible(true);
                    jLabel5.setVisible(true);
                    jTextField3.setVisible(true);
                    startGame();
                } else {
                    JOptionPane.showMessageDialog(this, "Ni dovolj denarja!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vnesi veljavno številko!");
            }
        } else {
            endGame(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selectedNumber = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        int result = 25 - selectedNumber;
        jTextField2.setText(String.valueOf(result));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Main_Page.Storage.save(Main_Page.GlobalData.balance);
        dispose();
        new Main_Page().setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        java.util.List<Integer> available = new java.util.ArrayList<>();
        for (int i = 0; i < labels.length; i++) {
            if (labels[i].getClientProperty("clicked") == null) { 
                available.add(i);
            }
        }
        if (available.isEmpty() || !inGame) return; 
        int randomIndex = available.get(new java.util.Random().nextInt(available.size()));
        JLabel label = labels[randomIndex];
        label.putClientProperty("clicked", true);
        if (gameBoard[randomIndex].equals("M")) {
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bomb.png")));
            label.setBorder(new javax.swing.border.LineBorder(Color.RED, 1, true));
            JOptionPane.showMessageDialog(null, "You hit a mine!");
            endGame(false);
        } else {
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/gem.png")));
            label.setBorder(new javax.swing.border.LineBorder(new Color(50, 255, 0), 1, true));
            safeClicks++;
            int mines = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            double multiplier = getMultiplier(mines, safeClicks);
            currentProfit = currentBet * (multiplier - 1);
            jLabel34.setText(String.format("%.2f", multiplier) + "x");
            jTextField3.setText(String.format("%.2f", currentProfit));
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c != '\b') {
            evt.consume();
        }
        if (c == '.' && jTextField1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Game().setVisible(true));
    }
    
    private void startGame() {
        safeClicks = 0;
        jLabel34.setVisible(true);
        int totalTiles = 25;
        int minesCount = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        currentProfit = 0;
        jTextField3.setText("0.00");
        for (int i = 0; i < totalTiles; i++) gameBoard[i] = "G";
        java.util.List<Integer> indices = new java.util.ArrayList<>();
        for (int i = 0; i < totalTiles; i++) indices.add(i);
        java.util.Collections.shuffle(indices);
        for (int i = 0; i < minesCount; i++) gameBoard[indices.get(i)] = "M";
        for (int i = 0; i < labels.length; i++) {
            final int index = i;
            labels[i].setText("");
            labels[i].setEnabled(true);
            for (java.awt.event.MouseListener ml : labels[i].getMouseListeners()) {
                labels[i].removeMouseListener(ml);
            }
            labels[index].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    if (!inGame) return;
                    if (labels[index].getClientProperty("clicked") != null) return;
                    labels[index].setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background3.png")));
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    if (!inGame) return;
                    if (labels[index].getClientProperty("clicked") != null) return;
                    labels[index].setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png")));
                }
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (!inGame) return;
                    if (labels[index].getClientProperty("clicked") != null) return;
                    labels[index].putClientProperty("clicked", true);
                    if (gameBoard[index].equals("M")) {
                        labels[index].setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bomb.png")));
                        labels[index].setBorder(new javax.swing.border.LineBorder(Color.RED, 1, true));
                        JOptionPane.showMessageDialog(null, "You hit a mine!");
                        endGame(false);
                    } else {
                        labels[index].setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/gem.png")));
                        labels[index].setBorder(new javax.swing.border.LineBorder(new Color(50, 255, 0), 1, true));
                        safeClicks++;
                        int mines = Integer.parseInt(jComboBox1.getSelectedItem().toString());
                        double multiplier = getMultiplier(mines, safeClicks);
                        currentProfit = currentBet * (multiplier - 1);
                        jLabel34.setText(String.valueOf(multiplier));
                        jTextField3.setText(String.format("%.2f", currentProfit));
                    }
                }
            });    
        }
    }
    
    private void endGame(boolean won) {
        double balance = Main_Page.GlobalData.balance;
        if (won) {
            balance += currentBet + currentProfit;
            String multiplierText = jLabel34.getText() + "x";
            jLabel35.setText("<html><center>CASHOUT<br>" + "<hr>" + multiplierText + "<br>+" + String.format("%.2f", currentProfit) + "</center></html>");
            jLabel35.setVisible(true);
            jButton1.setVisible(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
        Main_Page.GlobalData.balance = balance;
        Main_Page.Storage.save(balance);
        jLabel32.setText(String.format("%.2f", balance));
        resetTiles();
        inGame = false;
        currentBet = 0;
        if (!won) {
            resetUI();
        }
    }
    
    private void resetTiles() {
        for (JLabel label : labels) {
            label.putClientProperty("clicked", null);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/background1.png")));
            label.setBorder(null);
            label.setText("");
        }
    }

    private double getMultiplier(int mines, int steps) {
        int totalTiles = 25;
        double rtp = 0.97; 
        double probability = 1.0;
        for (int i = 0; i < steps; i++) {
            probability *= (double)(totalTiles - mines - i) / (totalTiles - i);
        }
        double multiplier = (1.0 / probability) * rtp;
        return Math.floor(multiplier * 100.0) / 100.0;
    }

    private void hideOverlay() {
        if (jLabel35.isVisible()) {
            jLabel35.setVisible(false);
            resetUI();
        }
    }

    private void resetUI() {
        jButton1.setText("BET");
        jButton1.setEnabled(true);
        jButton1.setVisible(true);
        jComboBox1.setEnabled(true);
        jTextField1.setEditable(true);
        jTextField1.setEnabled(true);
        jTextField3.setVisible(false);
        jButton2.setVisible(false);
        jButton2.setEnabled(true); 
        jButton3.setEnabled(true);
        jLabel5.setVisible(false);
        jLabel34.setVisible(false);
        jLabel34.setText("0.00x");
        currentProfit = 0; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}