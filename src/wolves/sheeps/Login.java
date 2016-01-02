package wolves.sheeps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;


public class Login implements ActionListener {
    JLabel name;
    JTextField tname;
    String sname;
    JButton accept;

    public void Labels(){
        name = new JLabel("Wpisz imię gracza: ");
        name.setBounds(350,350,120,25);
        name.setVisible(true);
    }

    public void JTextField(){
        tname = new JTextField();
        tname.setBounds(470,350,120,25);
        tname.setVisible(true);
    }

    public void JButton(){
        accept = new JButton("Akceptuj");
        accept.setBounds(470,400,120,25);
        accept.setVisible(true);
        accept.addActionListener(this);
    }

    public void PutLogin() throws IOException {
        sname = tname.getText();
        Save_To_File(sname,"");
    }

    public void Save_To_File(String name ,String txt) throws IOException, NullPointerException{
        PrintWriter writer = new PrintWriter(name+".txt", "UTF-8");
        writer.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object bSource = e.getSource();
        if(bSource == accept){
            try {
                PutLogin();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                Save_To_File(sname,"");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}