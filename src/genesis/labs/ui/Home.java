package genesis.labs.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import genesis.lab.models.VentilationFactor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtDesignFireLoadDensity;
	private JTextField txtThermalPropertiesFactor;
	private JTextField txtVentilationFactor;
	private JTextField txtDependantMaterialFactor;
	private JTextField txtTime;

	public double ventilationFactorValue;
	VentilationFactor ventilationFactor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Design Fire Load Density");
		lblNewLabel.setBounds(20, 31, 162, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thermal Properties Factor");
		lblNewLabel_1.setBounds(20, 76, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ventilation Factor");
		lblNewLabel_2.setBounds(19, 121, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dependant Material Factor");
		lblNewLabel_3.setBounds(20, 166, 162, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Equivalent Time Fire Exposure");
		lblNewLabel_4.setBounds(20, 256, 178, 14);
		contentPane.add(lblNewLabel_4);
		
		txtDesignFireLoadDensity = new JTextField();
		txtDesignFireLoadDensity.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtDesignFireLoadDensity.setBounds(194, 27, 149, 22);
		contentPane.add(txtDesignFireLoadDensity);
		txtDesignFireLoadDensity.setColumns(10);
		
		txtThermalPropertiesFactor = new JTextField();
		txtThermalPropertiesFactor.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtThermalPropertiesFactor.setBounds(194, 72, 216, 22);
		contentPane.add(txtThermalPropertiesFactor);
		txtThermalPropertiesFactor.setColumns(10);
		
		txtVentilationFactor = new JTextField();
		txtVentilationFactor.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtVentilationFactor.setBounds(194, 117, 216, 22);
		contentPane.add(txtVentilationFactor);
		txtVentilationFactor.setColumns(10);
		
		txtDependantMaterialFactor = new JTextField();
		txtDependantMaterialFactor.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtDependantMaterialFactor.setBounds(194, 162, 216, 22);
		contentPane.add(txtDependantMaterialFactor);
		txtDependantMaterialFactor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("(MJ/m2)");
		lblNewLabel_5.setBounds(355, 30, 55, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnDesignFireLoadDensity = new JButton("Calculate");
		btnDesignFireLoadDensity.setBounds(422, 24, 90, 28);
		contentPane.add(btnDesignFireLoadDensity);
		
		JButton btnThermalPropertiesFactor = new JButton("Calculate");
		btnThermalPropertiesFactor.setBounds(422, 69, 90, 28);
		contentPane.add(btnThermalPropertiesFactor);
		
		JButton btnVentilationFactor = new JButton("Calculate");
		btnVentilationFactor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentilationFactorCalculatorUI ventilationFactorCalculatorUI = new VentilationFactorCalculatorUI();
				ventilationFactorCalculatorUI.setVisible(true);
			}
		});
		btnVentilationFactor.setBounds(422, 114, 90, 28);
		contentPane.add(btnVentilationFactor);
		
		JButton btnDependantMaterialFactor = new JButton("Calculate");
		btnDependantMaterialFactor.setBounds(422, 159, 90, 28);
		contentPane.add(btnDependantMaterialFactor);
		
		JButton btnCalculateTime = new JButton("Calculate");
		btnCalculateTime.setBounds(194, 196, 90, 28);
		contentPane.add(btnCalculateTime);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDesignFireLoadDensity.setText("");
				txtThermalPropertiesFactor.setText("");
				txtVentilationFactor.setText("");
				txtDependantMaterialFactor.setText("");
				txtTime.setText("");
			}
		});
		btnReset.setBounds(320, 196, 90, 28);
		contentPane.add(btnReset);
		
		txtTime = new JTextField();
		txtTime.setEditable(false);
		txtTime.setBounds(194, 252, 225, 22);
		contentPane.add(txtTime);
		txtTime.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("minutes");
		lblNewLabel_6.setBounds(422, 255, 55, 16);
		contentPane.add(lblNewLabel_6);
	}
}
