package main.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ghawsiharoon on 4/29/17.
 */
public class GUIProgram extends Frame implements ActionListener {

    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public GUIProgram(){
        setLayout(new FlowLayout());
    }

    lblCount = new Label("Counter");
    add(lblCount);

    tfCount = new TextField("0", 10);
    tfCount = setEditable(false);
    add(tfCount);

    btnCount = new Button("Counter");
    add(btnCount);

    btnCount.addActionListener(this);
    setTitle("GUI Program");
    setSize(250, 100);
    setVisible(true);

    public static void main(String[] args){
        GUIProgram guiProgram = new GUIProgram();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        tfCount.setText(count + "");
    }
}
