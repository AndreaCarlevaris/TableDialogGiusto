package ItisCuneo.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogCespiti extends JDialog implements ActionListener {

    private FrameCespiti frameCespiti;
    private JTextField fieldCodice;
    private JTextField fieldQuantita;
    private JTextField fieldData;
    private JButton btnUndo;
    private JButton btnOk;

    public DialogCespiti(FrameCespiti frameCespiti){
        this.frameCespiti=frameCespiti;
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(new Dimension(400,600));
    }

    private void initComponents() {
        setLayout(new GridLayout(4,2));

        add(new JLabel("Codice"));
        fieldCodice= new JTextField(10);
        add(fieldCodice);

        add(new JLabel("Quantita"));
        fieldQuantita= new JTextField(10);
        add(fieldQuantita);

        add(new JLabel("data acquisto"));
        fieldData= new JTextField(10);
        add(fieldData);

        btnUndo = new JButton("Annulla");
        add(btnUndo);
        btnUndo.addActionListener(this);

        btnOk = new JButton("Ok");
        add(btnOk);
        btnOk.addActionListener(this);



    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}