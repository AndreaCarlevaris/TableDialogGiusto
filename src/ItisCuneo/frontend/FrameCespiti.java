package itiscuneo.frontend;

import itiscuneo.backend.Cespiti;
import itiscuneo.backend.ElencoCespiti;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCespiti extends JFrame implements ActionListener {
    private final ElencoCespiti elencoCespiti;
    private JButton btnNuovo;
    private JButton btnExportCSV;
    private JButton btnExportJSON;
    private DefaultTableModel dfmCespiti;
    private JTable tableCespiti;

    public FrameCespiti() throws HeadlessException {
        super("Gestione cespiti");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        elencoCespiti = new ElencoCespiti();
        initComponents();
    }

    public ElencoCespiti getElencoCespiti() {
        return elencoCespiti;
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        JPanel panelTable = new JPanel();

        String[] aHeaderTableCespiti = {"codice", "quantità", "data acquisto"};
        dfmCespiti = new DefaultTableModel(aHeaderTableCespiti, 0);
        tableCespiti = new JTable(dfmCespiti);
        panelTable.add(new JScrollPane(tableCespiti));

        JPanel panelCmd = new JPanel();
        btnNuovo = new JButton("Nuovo");
        btnExportCSV = new JButton("Esporta CSV");
        btnExportJSON = new JButton("Esporta JSON");

        btnNuovo.addActionListener(this);
        btnExportCSV.addActionListener(this);
        btnExportJSON.addActionListener(this);

        panelCmd.add(btnNuovo);


        this.add(panelTable, BorderLayout.CENTER);
        this.add(panelCmd, BorderLayout.EAST);
        JMenuBar menuBar = initMenu();
        this.setJMenuBar(menuBar);
    }

    private JMenuBar initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File:");
        menuBar.add(menuFile);
        JMenuItem menuItemJson = new JMenuItem("Esporta json");
        menuFile.add(menuItemJson);
        JMenuItem menuItemCsv = new JMenuItem("Esporta csv");
        menuFile.add(menuItemCsv);



        return menuBar;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNuovo) {
            DialogCespiti dialogCespiti = new DialogCespiti(this);
            dialogCespiti.setVisible(true);

        }
        if (e.getSource() == btn) {


        }


        public static void main (String[]args){
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    FrameCespiti frame = new FrameCespiti();
                    frame.setVisible(true);
                }
            });
        }
    }
}