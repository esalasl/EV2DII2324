package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField priceTextField;

	public FrameView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 537);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu analysisMenu = new JMenu("Análisis");
		menuBar.add(analysisMenu);
		
		JMenuItem statisticsItem = new JMenuItem("Estadísticas");
		analysisMenu.add(statisticsItem);
		
		JMenuItem reportItem = new JMenuItem("Factura");
		analysisMenu.add(reportItem);
		
		JMenu settingsMenu = new JMenu("Ajustes");
		menuBar.add(settingsMenu);
		
		JMenuItem englishItem = new JMenuItem("Inglés");
		settingsMenu.add(englishItem);
		
		JMenuItem spanishItem = new JMenuItem("Español");
		settingsMenu.add(spanishItem);
		
		JMenuItem helpItem = new JMenuItem("Ayuda");
		settingsMenu.add(helpItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel formPanel = new JPanel();
		contentPane.add(formPanel);
		formPanel.setLayout(null);
		
		JLabel typeLabel = new JLabel("Tipo");
		typeLabel.setBounds(5, 8, 49, 14);
		formPanel.add(typeLabel);
		
		JLabel quantityLabel = new JLabel("Precio");
		quantityLabel.setBounds(5, 33, 49, 14);
		formPanel.add(quantityLabel);
		
		JComboBox typeComboBox = new JComboBox();
		typeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Vuelo", "Taxi", "Hotel", "Comida"}));
		typeComboBox.setBounds(59, 4, 132, 22);
		formPanel.add(typeComboBox);
		
		priceTextField = new JTextField();
		priceTextField.setBounds(59, 30, 132, 20);
		formPanel.add(priceTextField);
		priceTextField.setColumns(10);
		
		JButton addButton = new JButton("Añadir");
		addButton.setBounds(73, 81, 119, 23);
		formPanel.add(addButton);
		
		JButton undoButton = new JButton("Deshacer");
		undoButton.setBounds(73, 153, 118, 23);
		formPanel.add(undoButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(73, 115, 118, 23);
		formPanel.add(deleteButton);
		
		JPanel tablePanel = new JPanel();
		contentPane.add(tablePanel);
		tablePanel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tipo", "Precio"
			}
		));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 213, 427);
        tablePanel.add(scrollPane);
        
        JLabel totalLAbel = new JLabel("TOTAL:");
        totalLAbel.setBounds(93, 438, 110, 14);
        tablePanel.add(totalLAbel);

	}
}
