
package MFWP;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import MFWP_Classes_PKG.*;
import java.util.HashSet;

/**
 *
 * @author Feras
 */
public class KSA_Weather_Homepage extends javax.swing.JFrame {

    /**
     * Creates new form KSA_Weather_Homepage
     */
    public KSA_Weather_Homepage() {
        initComponents();
    }
    
    
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        JawfLabel = new javax.swing.JLabel();
        MadinahLabel = new javax.swing.JLabel();
        NajranLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        SharqiyahLabel = new javax.swing.JLabel();
        HumidityBtn = new javax.swing.JButton();
        CloudyBtn = new javax.swing.JButton();
        RiyadLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TemperatureBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KSA Weather Map");
        setMaximumSize(new java.awt.Dimension(700, 517));
        setMinimumSize(new java.awt.Dimension(700, 517));
        setPreferredSize(new java.awt.Dimension(700, 517));
        getContentPane().setLayout(null);

        JawfLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JawfLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(JawfLabel);
        JawfLabel.setBounds(120, 130, 140, 20);
        JawfLabel.getAccessibleContext().setAccessibleName("JawfLabel");

        MadinahLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MadinahLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(MadinahLabel);
        MadinahLabel.setBounds(130, 260, 140, 20);
        MadinahLabel.getAccessibleContext().setAccessibleName("MadinahLabel");

        NajranLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NajranLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(NajranLabel);
        NajranLabel.setBounds(280, 420, 150, 20);
        NajranLabel.getAccessibleContext().setAccessibleName("NajranLabel");

        TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleLabel.setText("KSA Weather Forcast");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(30, 20, 450, 22);
        TitleLabel.getAccessibleContext().setAccessibleName("TitleLabel");

        SharqiyahLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SharqiyahLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(SharqiyahLabel);
        SharqiyahLabel.setBounds(380, 340, 140, 20);
        SharqiyahLabel.getAccessibleContext().setAccessibleName("SharqiyahLabel");

        HumidityBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HumidityBtn.setText("Humidity");
        HumidityBtn.setToolTipText("");
        HumidityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumidityBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HumidityBtn);
        HumidityBtn.setBounds(550, 110, 120, 30);
        HumidityBtn.getAccessibleContext().setAccessibleName("HumidityBtn");

        CloudyBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CloudyBtn.setText("Cloudy");
        CloudyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloudyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloudyBtn);
        CloudyBtn.setBounds(550, 160, 120, 30);
        CloudyBtn.getAccessibleContext().setAccessibleName("CloudyBtn");

        RiyadLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RiyadLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(RiyadLabel);
        RiyadLabel.setBounds(270, 310, 120, 20);
        RiyadLabel.getAccessibleContext().setAccessibleName("RiyadLabel");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MFWP/Kas map.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 500, 410);

        TemperatureBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TemperatureBtn1.setText("Temperature");
        TemperatureBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperatureBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(TemperatureBtn1);
        TemperatureBtn1.setBounds(550, 60, 120, 30);

        pack();
    }// </editor-fold>                        

    private void TemperatureBtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                                

        Jawf_City  Jawf = new  Jawf_City();
        JawfLabel.setText(Jawf.getTemperature());
        //----------------------------------------
        Madinah_City Madinah = new Madinah_City();
        MadinahLabel.setText(Madinah.getTemperature());
        //----------------------------------------
       Riyad_City Riyad = new Riyad_City();
       RiyadLabel.setText(Riyad.getTemperature());
        //----------------------------------------
       Sharqiyah_City Sharqiyah = new Sharqiyah_City();
       SharqiyahLabel.setText(Sharqiyah.getTemperature());
        //----------------------------------------
       Najran_City Najran = new Najran_City();
       NajranLabel.setText(Najran.getTemperature());
       //-----------------------------------------
       TitleLabel.setText("KSA Weather Forcast (Temperature)");
        
       
    }                                               

    private void HumidityBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
        Jawf_City  Jawf = new  Jawf_City();
        JawfLabel.setText( Jawf.getHumidity());
        //-------------------------------------
        Madinah_City Madinah = new Madinah_City();
        MadinahLabel.setText(Madinah.getHumidity());
        //-------------------------------------
       Riyad_City Riyad = new Riyad_City();
       RiyadLabel.setText(Riyad.getHumidity());
        //-------------------------------------
       Sharqiyah_City Sharqiyah = new Sharqiyah_City();
       SharqiyahLabel.setText(Sharqiyah.getHumidity());
        //----------------------------------------
       Najran_City Najran = new Najran_City();
       NajranLabel.setText(Najran.getHumidity());
       //-----------------------------------------
       TitleLabel.setText("KSA Weather Forcast (Humidity)");
  
    }                                           

    private void CloudyBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
       Jawf_City  Jawf = new  Jawf_City();
        JawfLabel.setText( Jawf.getCloudy());
        //-------------------------------------
        Madinah_City Madinah = new Madinah_City();
        MadinahLabel.setText(Madinah.getCloudy());
        //-------------------------------------
         Riyad_City Riyad = new Riyad_City();
         RiyadLabel.setText(Riyad.getCloudy());
        //-------------------------------------
        Sharqiyah_City Sharqiyah = new Sharqiyah_City();
        SharqiyahLabel.setText(Sharqiyah.getCloudy());
        //------------------------------------
        Najran_City Najran = new Najran_City();
        NajranLabel.setText(Najran.getCloudy());
        //-----------------------------------------
        TitleLabel.setText("KSA Weather Forcast (Cloudy)");
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KSA_Weather_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KSA_Weather_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KSA_Weather_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KSA_Weather_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KSA_Weather_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CloudyBtn;
    private javax.swing.JButton HumidityBtn;
    private javax.swing.JLabel JawfLabel;
    private javax.swing.JLabel MadinahLabel;
    private javax.swing.JLabel NajranLabel;
    private javax.swing.JLabel RiyadLabel;
    private javax.swing.JLabel SharqiyahLabel;
    private javax.swing.JButton TemperatureBtn1;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}
