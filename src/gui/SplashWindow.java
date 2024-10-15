package gui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
//import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class SplashWindow extends javax.swing.JFrame {

    /**
     * Creates new form SplashWindow
     */
    public SplashWindow() {
        initComponents();
        setSvg();
        lodingProgressAnimation();
    }
    
    public void setSvg() {
        FlatSVGIcon logo = new FlatSVGIcon("resources//logo.svg", jLabel1.getWidth(), jLabel1.getHeight());
        jLabel1.setIcon(logo);
        FlatSVGIcon splash = new FlatSVGIcon("resources//splash.svg", jLabel2.getWidth(), jLabel2.getHeight());
        jLabel2.setIcon(splash);
    }
    
    private void lodingProgressAnimation() {
        Thread lodingThread = new Thread(new Runnable() {
            public void run() {
                for (int x = 0; x <= 100; x++) {

                    jProgressBar1.setValue(x);

                    switch (x) {

                        case 10:
                            jLabel4.setText("Connecting to Inernet . . .");
                            break;

                        case 15:
                            jLabel4.setText("Connected to the Inernet");
                            break;

                        case 18:
                            jLabel4.setText("Loding Files . . .");
                            break;

                        case 23:
                            jLabel4.setText("File Loaded");
                            break;
                            
                        case 25:
                            jLabel4.setText("Finding Libraries . . . .");
                            break;

                        case 30:
                            jLabel4.setText("Loading Libraries . . . .");
                            break;

                        case 40:
                            jLabel4.setText("Libraries Completely Loaded.");
                            break;

                        case 45:
                            jLabel4.setText("Loding Resourses . . .");
                            break;

                        case 55:
                            jLabel4.setText("Resorses Loaded");
                            break;

                        case 60:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 61:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 62:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 63:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 64:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 65:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 66:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 67:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 68:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 69:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 70:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 71:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 72:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 73:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 74:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 75:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 76:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 77:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 78:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 79:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 80:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 81:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 82:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 83:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 84:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 85:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 86:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 87:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;

                        case 88:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 89:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 90:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 91:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;
                        case 92:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 93:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 94:
                            jLabel4.setText("Connectiong to Database . . . ");
                            break;

                        case 95:
                            jLabel4.setText("Connectiong to Database . . . . ");
                            break;
                        case 96:
                            jLabel4.setText("Connectiong to Database . ");
                            break;

                        case 97:
                            jLabel4.setText("Connectiong to Database . . ");
                            break;

                        case 98:
                            jLabel4.setText("Successfully Connected to Database.");
                            break;

                        case 99:
                            jLabel4.setText("Done  ");
                            break;

                    }

                    try {
                        Thread.sleep(10);  ///// loading time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                splashWindow.dispose();
//                home = new Home();
//                home.setVisible(true);
//                home.signInWindow();

            }
        });
        lodingThread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jProgressBar1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setStringPainted(true);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to BookHive...!\nYour Digital Library Assistant\n\nBuilt for librarians, it simplifies\nmanaging collections, monitoring\ndue dates, and generating reports,\nensuring smooth and efficient\nlibrary operations.");
        jTextArea1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
