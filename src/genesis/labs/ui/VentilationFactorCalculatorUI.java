package genesis.labs.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import genesis.lab.models.VentilationFactor;
import genesis.labs.controllers.VentilationFactorController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class VentilationFactorCalculatorUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtVentilationFactorValue;
	private JTextField txtFloorArea;
	private JTextField txtVentilationArea;
	private JTextField txtHeightOfVentilationOpening;
	private JTextField txtHeightOfCompartment;
	private JTextField txtAreaOfHorizontalOpening;

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
					VentilationFactorCalculatorUI frame = new VentilationFactorCalculatorUI();
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
	public VentilationFactorCalculatorUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Floor Area (Af)");
		lblNewLabel.setBounds(10, 27, 181, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ventilation Area (Av)");
		lblNewLabel_1.setBounds(10, 63, 181, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Height of Ventilation Opening");
		lblNewLabel_2.setBounds(10, 103, 181, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Height of Compartment (H)");
		lblNewLabel_3.setBounds(10, 145, 181, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Area of Horizontal Opening (Ah)");
		lblNewLabel_4.setBounds(10, 180, 181, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ventilation Factor");
		lblNewLabel_5.setBounds(54, 241, 127, 14);
		contentPane.add(lblNewLabel_5);
		
		txtVentilationFactorValue = new JTextField();
		txtVentilationFactorValue.setEditable(false);
		txtVentilationFactorValue.setHorizontalAlignment(SwingConstants.TRAILING);
		txtVentilationFactorValue.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtVentilationFactorValue.setBounds(193, 237, 172, 22);
		contentPane.add(txtVentilationFactorValue);
		txtVentilationFactorValue.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFloorArea.setText("");
				txtVentilationArea.setText("");
				txtHeightOfVentilationOpening.setText("");
				txtHeightOfCompartment.setText("");
				txtAreaOfHorizontalOpening.setText("");
				txtVentilationFactorValue.setText("");
			}
		});
		btnReset.setBounds(32, 286, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				VentilationFactor ventilationFactor = new VentilationFactor();
				ventilationFactor.setFloorArea(Double.parseDouble(txtFloorArea.getText()));
				ventilationFactor.setVentilationArea(Double.parseDouble(txtVentilationArea.getText()));
				ventilationFactor.setHeightOfVentilationOpening(Double.parseDouble(txtHeightOfVentilationOpening.getText()));
				ventilationFactor.setHeightOfCompartment(Double.parseDouble(txtHeightOfCompartment.getText()));
				ventilationFactor.setAreaOfHorizontalOpening(Double.parseDouble(txtAreaOfHorizontalOpening.getText()));
				
				VentilationFactorController ventilationFactorCalculator = new VentilationFactorController();
				ventilationFactorCalculator.ventilationFactor(ventilationFactor);
				txtVentilationFactorValue.setText(String.valueOf(ventilationFactor.getVentilationFactorValue()));
			}
		});
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentilationFactor ventilationFactor = new VentilationFactor();
				ventilationFactor.setFloorArea(Double.parseDouble(txtFloorArea.getText()));
				ventilationFactor.setVentilationArea(Double.parseDouble(txtVentilationArea.getText()));
				ventilationFactor.setHeightOfVentilationOpening(Double.parseDouble(txtHeightOfVentilationOpening.getText()));
				ventilationFactor.setHeightOfCompartment(Double.parseDouble(txtHeightOfCompartment.getText()));
				ventilationFactor.setAreaOfHorizontalOpening(Double.parseDouble(txtAreaOfHorizontalOpening.getText()));
				
				VentilationFactorController ventilationFactorCalculator = new VentilationFactorController();
				ventilationFactorCalculator.ventilationFactor(ventilationFactor);
				txtVentilationFactorValue.setText(String.valueOf(ventilationFactor.getVentilationFactorValue()));
			}
		});
		btnCalculate.setBounds(153, 286, 89, 23);
		contentPane.add(btnCalculate);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnDone.setBounds(274, 286, 89, 23);
		contentPane.add(btnDone);
		
		txtFloorArea = new JTextField();
		txtFloorArea.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFloorArea.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtFloorArea.setBounds(191, 23, 172, 22);
		contentPane.add(txtFloorArea);
		txtFloorArea.setColumns(10);
		
		txtVentilationArea = new JTextField();
		txtVentilationArea.setHorizontalAlignment(SwingConstants.TRAILING);
		txtVentilationArea.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtVentilationArea.setBounds(191, 59, 172, 22);
		contentPane.add(txtVentilationArea);
		txtVentilationArea.setColumns(10);
		
		txtHeightOfVentilationOpening = new JTextField();
		txtHeightOfVentilationOpening.setHorizontalAlignment(SwingConstants.TRAILING);
		txtHeightOfVentilationOpening.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtHeightOfVentilationOpening.setBounds(191, 99, 172, 22);
		contentPane.add(txtHeightOfVentilationOpening);
		txtHeightOfVentilationOpening.setColumns(10);
		
		txtHeightOfCompartment = new JTextField();
		txtHeightOfCompartment.setHorizontalAlignment(SwingConstants.TRAILING);
		txtHeightOfCompartment.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtHeightOfCompartment.setBounds(191, 141, 172, 22);
		contentPane.add(txtHeightOfCompartment);
		txtHeightOfCompartment.setColumns(10);
		
		txtAreaOfHorizontalOpening = new JTextField();
		txtAreaOfHorizontalOpening.setHorizontalAlignment(SwingConstants.TRAILING);
		txtAreaOfHorizontalOpening.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtAreaOfHorizontalOpening.setBounds(191, 176, 172, 22);
		contentPane.add(txtAreaOfHorizontalOpening);
		txtAreaOfHorizontalOpening.setColumns(10);
	}
}
