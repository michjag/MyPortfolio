/*
Program wczytujący dwa pliki csv/txt z wpisami odzielonymi średnikiem i wyświetlający 
wpisy, które są do pierwszego średnika identyczne oraz zawierają się w pierwszym pliku,
a nie zawierają się w drugim.

@autor Michał Jagieło
*/


package praktykiunikatowemaile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.*;

public class Window extends JFrame
        
{

    public Window() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFileChooserOtworzPlik = new javax.swing.JFileChooser();
        jFileChooserOtworzDrugiPlik = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jFileChooserOtworzDrugiPlik.setApproveButtonText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parse Excel");
        setResizable(false);

        jButton1.setText("Wspólne");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Wcztytaj plik 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Wczytaj plik 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("Unique A not in B");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Zamknij");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(23, 23, 23)))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
         
    private String [] wczytywanieDoTablicy(String [] wczytanaTablica,File file) throws FileNotFoundException, IOException
    {
        BufferedReader zliczanieLini = new BufferedReader(new FileReader(file.getAbsolutePath()));  //Wczytanie pliku ze ścieżki
        int liczbaLini = (int) zliczanieLini.lines().count();
        System.out.println(liczbaLini);
        
        wczytanaTablica = new String[liczbaLini];
        int index = 0;
        BufferedReader plik = null;
        plik = new BufferedReader(new FileReader(file.getAbsolutePath()));
        String odczytPliku = plik.readLine();

        while (odczytPliku != null) 
        {
            wczytanaTablica[index] = odczytPliku;
            odczytPliku = plik.readLine();
            index++;
        }

        if (plik != null) 
        {
            plik.close();
        }

        return wczytanaTablica;
    }


    public static String[] split (String wczytanaTablica[]) //obcinanie z linii reszty po ";"
    {
        String [] tablicaReturn = new String[wczytanaTablica.length];
        
        for (int i = 0; i < wczytanaTablica.length; i++) 
        {
           String [] temp = wczytanaTablica[i].split(Pattern.quote(";"));
           tablicaReturn[i] = temp[0]; 
        }
           
        return tablicaReturn;
    }
    
    
    
    public String compareWspolne(String[] tabl1, String[] tabl2) // pokazuje elementy wspólne
    {
       tabl1 = split(tabl1);
       tabl2 = split(tabl2);
       
        for (int i = 0; i < tabl1.length; i++) 
        {
            System.out.println(tabl1[i]);    
        }

        for (int i = 0; i < tabl1.length; i++) 
        {
            for (int j = 0; j < tabl2.length; j++)
            {
                if ((tabl1[i].equalsIgnoreCase(tabl2[j]))) 
                {
                   System.out.println(tabl1[i]);
                   jTextArea1.setText(jTextArea1.getText() + "\n" + tabl1[i]);
                }
            }
        }
  
      return null;  
    }
    
    public String compareUnikalne(String[] tabl1, String[] tabl2) // A is not B
    {
       tabl1 = split(tabl1);
       tabl2 = split(tabl2);
       
       int licznikTablicyWyniki = tabl1.length;
     
       String [] tablicaWyniki = new String[licznikTablicyWyniki]; 
       int licznik = 0;

        for (int i = 0; i < tabl1.length; i++) 
        {
            boolean finded = false;
            
            for (int j = 0; j < tabl2.length; j++)
            {
                if ((tabl1[i].equalsIgnoreCase(tabl2[j]))) 
                {
                   //System.out.println(i+" true:" + j);
                    finded = true;
                   //System.out.println(tabl1[i]);
                   //jTextArea1.setText(jTextArea1.getText() + "\n" + tabl1[i]);
                }
            }
            
            if (finded == false)
            {
                tablicaWyniki[licznik] = tabl1[i]; 
                licznik++;
            }
        }

        for (int i = 0; i < tablicaWyniki.length; i++) 
        {
            if (tablicaWyniki[i] != null) 
            {
                System.out.println(tablicaWyniki[i]);  
                jTextArea1.setText(jTextArea1.getText() + "\n" + tablicaWyniki[i]);
            }
        }

        return null;
    }
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      int odpowiedz = jFileChooserOtworzPlik.showOpenDialog(this);
      if (odpowiedz == jFileChooserOtworzPlik.APPROVE_OPTION) 
      {
          File file = jFileChooserOtworzPlik.getSelectedFile();
          
          try 
          {
              tablicaPierwsza = wczytywanieDoTablicy(tablicaPierwsza, file);
          
            for (int i = 0; i < tablicaPierwsza.length; i++) 
            {
                System.out.println("tablica PIERWSZA: " + tablicaPierwsza[i]);    
            }
              
              jTextArea2.read( new FileReader(file.getAbsolutePath()), null );
          } 
          
          catch (IOException e) 
          {
              System.out.println("Nie mogę otworzyć pliku: "+file.getAbsolutePath());
              System.out.println("Problem: "+e);
          }
      } 
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      int odpowiedzDwa = jFileChooserOtworzDrugiPlik.showOpenDialog(this);
          if (odpowiedzDwa == jFileChooserOtworzDrugiPlik.APPROVE_OPTION) 
        {
          File file = jFileChooserOtworzDrugiPlik.getSelectedFile();
          try 
          {
            tablicaDruga = wczytywanieDoTablicy(tablicaDruga, file);
            
            for (int i = 0; i < tablicaDruga.length; i++) 
            {
                System.out.println("tablica DRUGA: " + tablicaDruga[i]);    
            }
            
            jTextArea3.read(new FileReader(file.getAbsolutePath()), null);
           } 
          
          catch (IOException e) 
          {
              System.out.println("Nie mogę otworzyć pliku: "+file.getAbsolutePath());
              System.out.println("Problem: "+e);
          }
      }
    }                                        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextArea1.setText("");
        compareWspolne(tablicaPierwsza, tablicaDruga);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextArea1.setText("");
        compareUnikalne(tablicaPierwsza, tablicaDruga);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooserOtworzDrugiPlik;
    private javax.swing.JFileChooser jFileChooserOtworzPlik;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration                   
    String [] tablicaPierwsza; 
    String [] tablicaDruga; 
}
