/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SplashScreenAplikasi;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.border.LineBorder;
//deklarasi class
/**
 *
 * @author ajengnur
 */
public class SIP1 extends JWindow{
 private Dimension dimensi=Toolkit.getDefaultToolkit().getScreenSize();
	private JLabel lblLogo=new JLabel(new ImageIcon("Gambar/sip.jpg"));
	private JProgressBar barisProgres = new JProgressBar();
	private int time=0;
	private Timer timer;
	//deklarasi konstruktor
public SIP1 (){
   //menyiapkan variabel warna
        Color Warna = Color.blue;
	//mengatur baris progress
	barisProgres.setValue(0);
	barisProgres.setPreferredSize(new Dimension(100,15));
	barisProgres.setBackground(Color.white);
	barisProgres.setForeground(Color.red);
	barisProgres.setStringPainted(true);
	//mengatur warna garis pinggir
	barisProgres.setBorder(new LineBorder(Warna,1));
	lblLogo.setBorder(new LineBorder(Warna,1));
	//meletakkan objek ke kontainer
	getContentPane().add(lblLogo,BorderLayout.NORTH);
	getContentPane().add(barisProgres,BorderLayout.CENTER);
	//mengatur lama window logo tampil pada layar monitor
	timer = new Timer(50,new ActionListener(){
		public void actionPerformed(ActionEvent evt){
		time++;	
		barisProgres.setValue(time);
		if(barisProgres.getPercentComplete()==1.0){
		timer.stop();
		setVisible(false);
		//menjalankan menu utama
		// new Menu_Utama();
		}
	}
});
timer.start();
//menempatkan objek ke memori sebelum ditampilkan 
pack();
//mengatur lokasi window tepat di tengah layar monitor
setLocation(dimensi.width/2-getWidth()/2,dimensi.height/2-getHeight()/2);
//menempaktkan window ke layar monitor\
show ();
}
//deklarasi metode utama
public static void main(String args[]){
	new SIP();
 
}   
}
