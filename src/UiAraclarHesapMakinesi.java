import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.util.ArrayList;

public class UiAraclarHesapMakinesi extends javax.swing.JDialog{

    private int sayi=0;
    private String islem="";
    private BigDecimal ilkDeger=new BigDecimal(0);
    private BigDecimal ikinciDeger=new BigDecimal(0);
    private boolean sifirla=false;
    private boolean sifirla2=false;
    private static int seciliTema=1;
    private Boyutlandirma boyut;
    
    public UiAraclarHesapMakinesi(java.awt.Frame parent, boolean modal,int arayuz) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        svIcerik = new javax.swing.JPanel();
        svIslemSonucu = new javax.swing.JTextField();
        svSifirla = new javax.swing.JButton();
        svBol = new javax.swing.JButton();
        svCikar = new javax.swing.JButton();
        svEsittir = new javax.swing.JButton();
        svSil = new javax.swing.JButton();
        svYuzde = new javax.swing.JButton();
        svCarp = new javax.swing.JButton();
        sv9 = new javax.swing.JButton();
        svTopla = new javax.swing.JButton();
        sv6 = new javax.swing.JButton();
        sv3 = new javax.swing.JButton();
        svNokta = new javax.swing.JButton();
        sv8 = new javax.swing.JButton();
        sv5 = new javax.swing.JButton();
        sv2 = new javax.swing.JButton();
        sv00 = new javax.swing.JButton();
        sv7 = new javax.swing.JButton();
        sv4 = new javax.swing.JButton();
        sv1 = new javax.swing.JButton();
        sv0 = new javax.swing.JButton();
        svIslemSayilari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hesap Makinesi");
        setAlwaysOnTop(true);
        setIconImage(null);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        svIcerik.setPreferredSize(new java.awt.Dimension(360, 290));
        svIcerik.setLayout(null);

        svIslemSonucu.setEditable(false);
        svIslemSonucu.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        svIslemSonucu.setForeground(new java.awt.Color(102, 102, 102));
        svIslemSonucu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        svIslemSonucu.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        svIslemSonucu.setMargin(new java.awt.Insets(2, 5, 2, 5));
        svIslemSonucu.setPreferredSize(new java.awt.Dimension(270, 40));
        svIcerik.add(svIslemSonucu);
        svIslemSonucu.setBounds(10, 10, 270, 40);

        svSifirla.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svSifirla.setForeground(new java.awt.Color(255, 255, 255));
        svSifirla.setText("C");
        svSifirla.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svSifirla.setFocusPainted(false);
        svSifirla.setPreferredSize(new java.awt.Dimension(62, 40));
        svSifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSifirlaActionPerformed(evt);
            }
        });
        svIcerik.add(svSifirla);
        svSifirla.setBounds(290, 60, 62, 40);

        svBol.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svBol.setForeground(new java.awt.Color(255, 255, 255));
        svBol.setText("/");
        svBol.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svBol.setFocusPainted(false);
        svBol.setPreferredSize(new java.awt.Dimension(62, 36));
        svBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svBolActionPerformed(evt);
            }
        });
        svIcerik.add(svBol);
        svBol.setBounds(290, 110, 62, 36);

        svCikar.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svCikar.setForeground(new java.awt.Color(255, 255, 255));
        svCikar.setText("-");
        svCikar.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svCikar.setFocusPainted(false);
        svCikar.setPreferredSize(new java.awt.Dimension(62, 36));
        svCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svCikarActionPerformed(evt);
            }
        });
        svIcerik.add(svCikar);
        svCikar.setBounds(290, 155, 62, 36);

        svEsittir.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svEsittir.setForeground(new java.awt.Color(255, 255, 255));
        svEsittir.setText("=");
        svEsittir.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svEsittir.setFocusPainted(false);
        svEsittir.setPreferredSize(new java.awt.Dimension(62, 81));
        svEsittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svEsittirActionPerformed(evt);
            }
        });
        svIcerik.add(svEsittir);
        svEsittir.setBounds(290, 201, 62, 81);

        svSil.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svSil.setForeground(new java.awt.Color(255, 255, 255));
        svSil.setText("<<");
        svSil.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svSil.setFocusPainted(false);
        svSil.setPreferredSize(new java.awt.Dimension(62, 40));
        svSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSilActionPerformed(evt);
            }
        });
        svIcerik.add(svSil);
        svSil.setBounds(290, 10, 62, 40);

        svYuzde.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svYuzde.setForeground(new java.awt.Color(255, 255, 255));
        svYuzde.setText("%");
        svYuzde.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svYuzde.setFocusPainted(false);
        svYuzde.setPreferredSize(new java.awt.Dimension(62, 36));
        svYuzde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svYuzdeActionPerformed(evt);
            }
        });
        svIcerik.add(svYuzde);
        svYuzde.setBounds(220, 110, 62, 36);

        svCarp.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svCarp.setForeground(new java.awt.Color(255, 255, 255));
        svCarp.setText("x");
        svCarp.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svCarp.setFocusPainted(false);
        svCarp.setPreferredSize(new java.awt.Dimension(62, 36));
        svCarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svCarpActionPerformed(evt);
            }
        });
        svIcerik.add(svCarp);
        svCarp.setBounds(220, 155, 62, 36);

        sv9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv9.setText("9");
        sv9.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv9.setFocusPainted(false);
        sv9.setPreferredSize(new java.awt.Dimension(62, 36));
        sv9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv9ActionPerformed(evt);
            }
        });
        svIcerik.add(sv9);
        sv9.setBounds(150, 110, 62, 36);

        svTopla.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svTopla.setForeground(new java.awt.Color(255, 255, 255));
        svTopla.setText("+");
        svTopla.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svTopla.setFocusPainted(false);
        svTopla.setPreferredSize(new java.awt.Dimension(62, 81));
        svTopla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svToplaActionPerformed(evt);
            }
        });
        svIcerik.add(svTopla);
        svTopla.setBounds(220, 201, 62, 81);

        sv6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv6.setText("6");
        sv6.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv6.setFocusPainted(false);
        sv6.setPreferredSize(new java.awt.Dimension(62, 36));
        sv6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv6ActionPerformed(evt);
            }
        });
        svIcerik.add(sv6);
        sv6.setBounds(150, 155, 62, 36);

        sv3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv3.setText("3");
        sv3.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv3.setFocusPainted(false);
        sv3.setPreferredSize(new java.awt.Dimension(62, 36));
        sv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv3ActionPerformed(evt);
            }
        });
        svIcerik.add(sv3);
        sv3.setBounds(150, 201, 62, 36);

        svNokta.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        svNokta.setText(".");
        svNokta.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        svNokta.setFocusPainted(false);
        svNokta.setPreferredSize(new java.awt.Dimension(62, 36));
        svNokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svNoktaActionPerformed(evt);
            }
        });
        svIcerik.add(svNokta);
        svNokta.setBounds(150, 246, 62, 36);

        sv8.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv8.setText("8");
        sv8.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv8.setFocusPainted(false);
        sv8.setPreferredSize(new java.awt.Dimension(62, 36));
        sv8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv8ActionPerformed(evt);
            }
        });
        svIcerik.add(sv8);
        sv8.setBounds(80, 110, 62, 36);

        sv5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv5.setText("5");
        sv5.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv5.setFocusPainted(false);
        sv5.setPreferredSize(new java.awt.Dimension(62, 36));
        sv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv5ActionPerformed(evt);
            }
        });
        svIcerik.add(sv5);
        sv5.setBounds(80, 155, 62, 36);

        sv2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv2.setText("2");
        sv2.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv2.setFocusPainted(false);
        sv2.setPreferredSize(new java.awt.Dimension(62, 36));
        sv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv2ActionPerformed(evt);
            }
        });
        svIcerik.add(sv2);
        sv2.setBounds(80, 201, 62, 36);

        sv00.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv00.setText("00");
        sv00.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv00.setFocusPainted(false);
        sv00.setPreferredSize(new java.awt.Dimension(62, 36));
        sv00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv00ActionPerformed(evt);
            }
        });
        svIcerik.add(sv00);
        sv00.setBounds(80, 246, 62, 36);

        sv7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv7.setText("7");
        sv7.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv7.setFocusPainted(false);
        sv7.setPreferredSize(new java.awt.Dimension(62, 36));
        sv7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv7ActionPerformed(evt);
            }
        });
        svIcerik.add(sv7);
        sv7.setBounds(10, 110, 62, 36);

        sv4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv4.setText("4");
        sv4.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv4.setFocusPainted(false);
        sv4.setPreferredSize(new java.awt.Dimension(62, 36));
        sv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv4ActionPerformed(evt);
            }
        });
        svIcerik.add(sv4);
        sv4.setBounds(10, 155, 62, 36);

        sv1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv1.setText("1");
        sv1.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv1.setFocusPainted(false);
        sv1.setPreferredSize(new java.awt.Dimension(62, 36));
        sv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv1ActionPerformed(evt);
            }
        });
        svIcerik.add(sv1);
        sv1.setBounds(10, 201, 62, 36);

        sv0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        sv0.setText("0");
        sv0.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        sv0.setFocusPainted(false);
        sv0.setPreferredSize(new java.awt.Dimension(62, 36));
        sv0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv0ActionPerformed(evt);
            }
        });
        svIcerik.add(sv0);
        sv0.setBounds(10, 246, 62, 36);

        svIslemSayilari.setEditable(false);
        svIslemSayilari.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        svIslemSayilari.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        svIslemSayilari.setMargin(new java.awt.Insets(2, 2, 2, 5));
        svIslemSayilari.setPreferredSize(new java.awt.Dimension(270, 40));
        svIcerik.add(svIslemSayilari);
        svIslemSayilari.setBounds(10, 60, 270, 40);

        getContentPane().add(svIcerik, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        boyut.boyutlandir(svIslemSonucu,true,true);
        boyut.boyutlandir(svIslemSayilari,true,true);
        boyut.boyutlandir(svSil,true,true);
        boyut.boyutlandir(svSifirla,true,true);
        boyut.boyutlandir(svBol,true,true);
        boyut.boyutlandir(svCikar,true,true);
        boyut.boyutlandir(svEsittir,true,true);
        boyut.boyutlandir(svTopla,true,true);
        boyut.boyutlandir(svCarp,true,true);
        boyut.boyutlandir(svYuzde,true,true);
        boyut.boyutlandir(sv9,true,true);
        boyut.boyutlandir(sv8,true,true);
        boyut.boyutlandir(sv7,true,true);
        boyut.boyutlandir(sv6,true,true);
        boyut.boyutlandir(sv5,true,true);
        boyut.boyutlandir(sv4,true,true);
        boyut.boyutlandir(sv3,true,true);
        boyut.boyutlandir(sv2,true,true);
        boyut.boyutlandir(sv1,true,true);
        boyut.boyutlandir(sv0,true,true);
        boyut.boyutlandir(sv00,true,true);
        boyut.boyutlandir(svNokta,true,true);
        this.getContentPane().revalidate();
    }
    
    private void svSifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSifirlaActionPerformed
        svIslemSayilari.setText("");
        svIslemSonucu.setText("");
        islem="";
        sayi=0;
    }//GEN-LAST:event_svSifirlaActionPerformed

    private void svBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svBolActionPerformed
        if(sifirla2){
            svIslemSonucu.setText("");
            sifirla2=false;
        }
        if(!svIslemSonucu.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(",")){
                String[] degerlerr=deger.split(",");
                deger=degerlerr[0]+"."+degerlerr[1];
            }
            ikinciDeger=new BigDecimal(deger);
            svIslemSonucu.setText(svIslemSonucu.getText()+svIslemSayilari.getText()+"/");
            if(islem.equals("+")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                ilkDeger=ilkDeger.add(ikinciDeger);
            }
            else if(islem.equals("-")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                ilkDeger=ilkDeger.subtract(ikinciDeger);
            }
            else if(islem.equals("x")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                ilkDeger=ilkDeger.multiply(ikinciDeger);
            }
            else if(islem.equals("/")){
                BigDecimal sifir=new BigDecimal(0);
                double sonuc1=0;
                if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                    sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                }
                svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                ilkDeger=new BigDecimal(sonuc1);
            }
            else{
                BigDecimal yuz=new BigDecimal(100);
                BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                double sonuc1=sonucc.divide(yuz).doubleValue();
                svIslemSayilari.setText(String.valueOf(sonuc1));
                ilkDeger=sonucc.divide(yuz);
            }
            ikinciDeger=ilkDeger;
            sayi=0;
        }
        else{
            if(!svIslemSayilari.getText().equals("")){
                sayi=0;
                String deger=svIslemSayilari.getText();
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
                ilkDeger=new BigDecimal(deger);
                svIslemSonucu.setText(ilkDeger+"/");
                svIslemSayilari.setText("");
            }
        }
        islem="/";
        sifirla=true;
    }//GEN-LAST:event_svBolActionPerformed

    private void svCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svCikarActionPerformed
        if(sifirla2){
            svIslemSonucu.setText("");
            sifirla2=false;
        }
        if(!svIslemSonucu.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(",")){
                String[] degerlerr=deger.split(",");
                deger=degerlerr[0]+"."+degerlerr[1];
            }
            ikinciDeger=new BigDecimal(deger);
            svIslemSonucu.setText(svIslemSonucu.getText()+svIslemSayilari.getText()+"-");
            if(islem.equals("+")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                ilkDeger=ilkDeger.add(ikinciDeger);
            }
            else if(islem.equals("-")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                ilkDeger=ilkDeger.subtract(ikinciDeger);
            }
            else if(islem.equals("x")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                ilkDeger=ilkDeger.multiply(ikinciDeger);
            }
            else if(islem.equals("/")){
                BigDecimal sifir=new BigDecimal(0);
                double sonuc1=0;
                if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                    sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                }
                svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                ilkDeger=new BigDecimal(sonuc1);
            }
            else{
                BigDecimal yuz=new BigDecimal(100);
                BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                double sonuc1=sonucc.divide(yuz).doubleValue();
                svIslemSayilari.setText(String.valueOf(sonuc1));
                ilkDeger=sonucc.divide(yuz);
            }
            ikinciDeger=ilkDeger;
            sayi=0;
        }
        else{
            if(!svIslemSayilari.getText().equals("")){
                sayi=0;
                String deger=svIslemSayilari.getText();
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
                ilkDeger=new BigDecimal(deger);
                svIslemSonucu.setText(ilkDeger+"-");
                svIslemSayilari.setText("");
            }
        }
        islem="-";
        sifirla=true;
    }//GEN-LAST:event_svCikarActionPerformed

    private void svEsittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svEsittirActionPerformed
        if(!svIslemSayilari.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(".")){
                String[] degerler=deger.split("[.]+");
                String deger2="";
                for(int i=0;i<degerler.length;i++){
                    deger2=deger2+degerler[i];
                }
                if(deger.contains(",")){
                    String[] degerler1=deger2.split(",");
                    deger2=degerler1[0]+"."+degerler1[1];
                }
                deger=deger2;
            }
            else{
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
            }
            BigDecimal sonuc=new BigDecimal(deger);
            if(sonuc.compareTo(ikinciDeger)!=0){
                ikinciDeger=sonuc;
                if(islem.equals("+")){
                    svIslemSonucu.setText(svIslemSonucu.getText()+ikinciDeger+"=");
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                    ilkDeger=ilkDeger.add(ikinciDeger);
                }
                else if(islem.equals("-")){
                    svIslemSonucu.setText(svIslemSonucu.getText()+ikinciDeger+"=");
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                    ilkDeger=ilkDeger.subtract(ikinciDeger);
                }
                else if(islem.equals("x")){
                    svIslemSonucu.setText(svIslemSonucu.getText()+ikinciDeger+"=");
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                    ilkDeger=ilkDeger.multiply(ikinciDeger);
                }
                else if(islem.equals("/")){
                    BigDecimal sifir=new BigDecimal(0);
                    double sonuc1=0;
                    if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                        sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                    }
                    svIslemSonucu.setText(svIslemSonucu.getText()+ikinciDeger+"=");
                    svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                    ilkDeger=new BigDecimal(sonuc1);
                }
                else{
                    BigDecimal yuz=new BigDecimal(100);
                    BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                    double sonuc1=sonucc.divide(yuz).doubleValue();
                    svIslemSonucu.setText(svIslemSonucu.getText()+ikinciDeger+"=");
                    svIslemSayilari.setText(String.valueOf(sonuc1));
                    ilkDeger=sonucc.divide(yuz);
                }
            }
            else{
                if(islem.equals("+")){
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                    ilkDeger=ilkDeger.add(ikinciDeger);
                }
                else if(islem.equals("-")){
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                    ilkDeger=ilkDeger.subtract(ikinciDeger);
                }
                else if(islem.equals("x")){
                    svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                    ilkDeger=ilkDeger.multiply(ikinciDeger);
                }
                else if(islem.equals("/")){
                    BigDecimal sifir=new BigDecimal(0);
                    double sonuc1=0;
                    if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                        sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                    }
                    svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                    ilkDeger=new BigDecimal(sonuc1);
                }
                else{
                    BigDecimal yuz=new BigDecimal(100);
                    BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                    double sonuc1=sonucc.divide(yuz).doubleValue();
                    svIslemSayilari.setText(String.valueOf(sonuc1));
                    ilkDeger=sonucc.divide(yuz);
                }
            }
        }
        else{
            if(!svIslemSonucu.getText().equals("")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger));
            }
        }
        sifirla2=true;
        sifirla=true;
    }//GEN-LAST:event_svEsittirActionPerformed

    private void svSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSilActionPerformed
        if(!svIslemSayilari.getText().equals("")){
            String islemS=svIslemSayilari.getText().substring(0,svIslemSayilari.getText().length()-1);
            svIslemSayilari.setText(islemS);
            sayi--;
        }
    }//GEN-LAST:event_svSilActionPerformed

    private void svYuzdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svYuzdeActionPerformed
        if(sifirla2){
            svIslemSonucu.setText("");
            sifirla2=false;
        }
        if(!svIslemSonucu.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(",")){
                String[] degerlerr=deger.split(",");
                deger=degerlerr[0]+"."+degerlerr[1];
            }
            ikinciDeger=new BigDecimal(deger);
            svIslemSonucu.setText(svIslemSonucu.getText()+svIslemSayilari.getText()+"%");
            if(islem.equals("+")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                ilkDeger=ilkDeger.add(ikinciDeger);
            }
            else if(islem.equals("-")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                ilkDeger=ilkDeger.subtract(ikinciDeger);
            }
            else if(islem.equals("x")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                ilkDeger=ilkDeger.multiply(ikinciDeger);
            }
            else if(islem.equals("/")){
                BigDecimal sifir=new BigDecimal(0);
                double sonuc1=0;
                if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                    sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                }
                svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                ilkDeger=new BigDecimal(sonuc1);
            }
            else{
                BigDecimal yuz=new BigDecimal(100);
                BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                double sonuc1=sonucc.divide(yuz).doubleValue();
                svIslemSayilari.setText(String.valueOf(sonuc1));
                ilkDeger=sonucc.divide(yuz);
            }
            ikinciDeger=ilkDeger;
            sayi=0;
        }
        else{
            if(!svIslemSayilari.getText().equals("")){
                sayi=0;
                String deger=svIslemSayilari.getText();
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
                ilkDeger=new BigDecimal(deger);
                svIslemSonucu.setText(ilkDeger+"%");
                svIslemSayilari.setText("");
            }
        }
        islem="%";
        sifirla=true;
    }//GEN-LAST:event_svYuzdeActionPerformed

    private void svCarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svCarpActionPerformed
        if(sifirla2){
            svIslemSonucu.setText("");
            sifirla2=false;
        }
        if(!svIslemSonucu.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(",")){
                String[] degerlerr=deger.split(",");
                deger=degerlerr[0]+"."+degerlerr[1];
            }
            ikinciDeger=new BigDecimal(deger);
            svIslemSonucu.setText(svIslemSonucu.getText()+svIslemSayilari.getText()+"x");
            if(islem.equals("+")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                ilkDeger=ilkDeger.add(ikinciDeger);
            }
            else if(islem.equals("-")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                ilkDeger=ilkDeger.subtract(ikinciDeger);
            }
            else if(islem.equals("x")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                ilkDeger=ilkDeger.multiply(ikinciDeger);
            }
            else if(islem.equals("/")){
                BigDecimal sifir=new BigDecimal(0);
                double sonuc1=0;
                if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                    sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                }
                svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                ilkDeger=new BigDecimal(sonuc1);
            }
            else{
                BigDecimal yuz=new BigDecimal(100);
                BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                double sonuc1=sonucc.divide(yuz).doubleValue();
                svIslemSayilari.setText(String.valueOf(sonuc1));
                ilkDeger=sonucc.divide(yuz);
            }
            ikinciDeger=ilkDeger;
            sayi=0;
        }
        else{
            if(!svIslemSayilari.getText().equals("")){
                sayi=0;
                String deger=svIslemSayilari.getText();
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
                ilkDeger=new BigDecimal(deger);
                svIslemSonucu.setText(ilkDeger+"x");
                svIslemSayilari.setText("");
            }
        }
        islem="x";
        sifirla=true;
    }//GEN-LAST:event_svCarpActionPerformed

    private void svToplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svToplaActionPerformed
        if(sifirla2){
            svIslemSonucu.setText("");
            sifirla2=false;
        }
        if(!svIslemSonucu.getText().equals("")){
            String deger=svIslemSayilari.getText();
            if(deger.contains(",")){
                String[] degerlerr=deger.split(",");
                deger=degerlerr[0]+"."+degerlerr[1];
            }
            ikinciDeger=new BigDecimal(deger);
            svIslemSonucu.setText(svIslemSonucu.getText()+svIslemSayilari.getText()+"+");
            if(islem.equals("+")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.add(ikinciDeger)));
                ilkDeger=ilkDeger.add(ikinciDeger);
            }
            else if(islem.equals("-")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.subtract(ikinciDeger)));
                ilkDeger=ilkDeger.subtract(ikinciDeger);
            }
            else if(islem.equals("x")){
                svIslemSayilari.setText(String.format("%,.2f", ilkDeger.multiply(ikinciDeger)));
                ilkDeger=ilkDeger.multiply(ikinciDeger);
            }
            else if(islem.equals("/")){
                BigDecimal sifir=new BigDecimal(0);
                double sonuc1=0;
                if(ilkDeger.compareTo(sifir)!=0&&ikinciDeger.compareTo(sifir)!=0){
                    sonuc1=ilkDeger.doubleValue()/ikinciDeger.doubleValue();
                }
                svIslemSayilari.setText(String.format("%,.2f", sonuc1));
                ilkDeger=new BigDecimal(sonuc1);
            }
            else{
                BigDecimal yuz=new BigDecimal(100);
                BigDecimal sonucc=ilkDeger.multiply(ikinciDeger);
                double sonuc1=sonucc.divide(yuz).doubleValue();
                svIslemSayilari.setText(String.valueOf(sonuc1));
                ilkDeger=sonucc.divide(yuz);
            }
            ikinciDeger=ilkDeger;
            sayi=0;
        }
        else{
            if(!svIslemSayilari.getText().equals("")){
                sayi=0;
                String deger=svIslemSayilari.getText();
                if(deger.contains(",")){
                    String[] degerlerr=deger.split(",");
                    deger=degerlerr[0]+"."+degerlerr[1];
                }
                ilkDeger=new BigDecimal(deger);
                svIslemSonucu.setText(ilkDeger+"+");
                svIslemSayilari.setText("");
            }
        }
        islem="+";
        sifirla=true;
    }//GEN-LAST:event_svToplaActionPerformed

    private void sv9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv9ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"9");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"9");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv9ActionPerformed

    private void sv6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv6ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"6");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"6");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv6ActionPerformed

    private void sv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv3ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"3");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"3");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv3ActionPerformed

    private void svNoktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svNoktaActionPerformed
        if(!sifirla){
            String islem=svIslemSayilari.getText();
            int lastIndex=islem.length()-1;
            char islem1=islem.charAt(lastIndex);
            if(Character.isDigit(islem1)){
                svIslemSayilari.setText(svIslemSayilari.getText()+".");
            }
        }
    }//GEN-LAST:event_svNoktaActionPerformed

    private void sv8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv8ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"8");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"8");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv8ActionPerformed

    private void sv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv5ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"5");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"5");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv5ActionPerformed

    private void sv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv2ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"2");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"2");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv2ActionPerformed

    private void sv00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv00ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"00");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"00");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv00ActionPerformed

    private void sv7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv7ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"7");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"7");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv7ActionPerformed

    private void sv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv4ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"4");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"4");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv4ActionPerformed

    private void sv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv1ActionPerformed
        if(sayi!=12){
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"1");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText("");
                svIslemSayilari.setText(svIslemSayilari.getText()+"1");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv1ActionPerformed

    private void sv0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv0ActionPerformed
        if(sayi!=12){    
            if(!sifirla){
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                sayi++;
                svIslemSayilari.setText(svIslemSayilari.getText()+"0");
            }
            else{
                if(sifirla2){
                    svIslemSonucu.setText("");
                    sifirla2=false;
                }
                svIslemSayilari.setText(svIslemSayilari.getText()+"0");
                sifirla=false;
            }
        }
        else{
            
        }
    }//GEN-LAST:event_sv0ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UiAraclarHesapMakinesi dialog = new UiAraclarHesapMakinesi(new javax.swing.JFrame(), true,seciliTema);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sv0;
    private javax.swing.JButton sv00;
    private javax.swing.JButton sv1;
    private javax.swing.JButton sv2;
    private javax.swing.JButton sv3;
    private javax.swing.JButton sv4;
    private javax.swing.JButton sv5;
    private javax.swing.JButton sv6;
    private javax.swing.JButton sv7;
    private javax.swing.JButton sv8;
    private javax.swing.JButton sv9;
    private javax.swing.JButton svBol;
    private javax.swing.JButton svCarp;
    private javax.swing.JButton svCikar;
    private javax.swing.JButton svEsittir;
    private javax.swing.JPanel svIcerik;
    private javax.swing.JTextField svIslemSayilari;
    private javax.swing.JTextField svIslemSonucu;
    private javax.swing.JButton svNokta;
    private javax.swing.JButton svSifirla;
    private javax.swing.JButton svSil;
    private javax.swing.JButton svTopla;
    private javax.swing.JButton svYuzde;
    // End of variables declaration//GEN-END:variables
}
