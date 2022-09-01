package yateTrabajo;


import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EnergyMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel bateriaLabel;
	private JLabel panelLabel;
	private JLabel programaLabel;
	private JLabel velocidadLabel;
	private JLabel tiempoSiml;
	
	public EnergyMainFrame ()
	{
		initComponents();
	}

	public static void main(String[] args)
	{
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnergyMainFrame().setVisible(true);
            }
        });

	}
		
	private void initComponents ()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Oculta y termina programa
		this.setResizable(false);
		this.setBounds(0, 0, 500, 550); //Limites de pantalla
		this.setLocationRelativeTo(null); // Para que la ventana se abra en un lugar especifico
		this.setLayout(null); // Libertad para elementos
		this.setBackground(Color.white);
		this.setVisible(true);	
		
		//Labels
		JLabel programaLabel = new JLabel("Simulador de Yate");
		programaLabel.setBounds(10, 10, 160, 20);
    	this.add(programaLabel); 
    	
		JLabel bateriaLabel = new JLabel("Bateria: ");
		bateriaLabel.setBounds(10, 40, 160, 20);
    	this.add(bateriaLabel); 
    	
    	JLabel bateriaInfo = new JLabel("Cantidad Bateria (No lo supe implementar)");
    	bateriaInfo.setBounds(160, 40, 400, 20);
    	this.add(bateriaInfo); 
    	
    	JLabel panelLabel = new JLabel("Panel: ");
    	panelLabel.setBounds(10, 80, 160, 20);
    	this.add(panelLabel); 
    	
    	JLabel panelInfo = new JLabel("PoderCarga (No lo supe implementar)");
    	panelInfo.setBounds(160, 80, 400, 20);
    	this.add(panelInfo); 
    	
    	JLabel velocidadLabel = new JLabel("Velocidad: ");
    	velocidadLabel.setBounds(10, 120, 160, 20);
    	this.add(velocidadLabel); 
    	
    	JLabel velocidadInfo = new JLabel("Velocidad (No lo supe implementar)");
    	velocidadInfo.setBounds(160, 120, 400, 20);
    	this.add(velocidadInfo); 
    	
    	JLabel tiempoSim = new JLabel("Tiempo Simulacion: ");
    	tiempoSim.setBounds(10, 200, 120, 30);
    	this.add(tiempoSim); 
    	
    	String[] executionTime = {"60 seg", "120 seg"};
    	JComboBox cmbMessgageList = new JComboBox(executionTime);
    	cmbMessgageList.setBounds(160, 200, 120, 30);
    	cmbMessgageList.setSelectedIndex(1);
    	this.add(cmbMessgageList);
   
    	
    	JButton btnThread = new JButton("Thread Simulacion: ");
    	btnThread.setBounds(10,280,300,50);
    	btnThread.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    		Admin dasboard = new Admin();
    		JOptionPane.showMessageDialog(null,"Boton accion prueba" + dasboard.simulacionOn());
    		}
    	});
    	
    	this.add(btnThread);
    	//Botones

    	//this.add(btnThread);
	}
}

