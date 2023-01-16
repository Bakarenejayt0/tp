import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

public class GovernmentInfo extends JFrame{
    

    JTextField name,address,phone,email,city,state,zip,country;
    JButton submit;
    
    JFrame fr = new JFrame();
    public void governmentSystem(){
        //title font Helvetica
        Font titleFont = new Font("Courier", Font.BOLD, 25);
        Font labelFont = new Font("Courier", Font.BOLD, 15);
        fr.getContentPane().setBackground(Color.ORANGE);
        fr.setTitle("Government Information");
        fr.setSize(450, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        JLabel title = new JLabel("Government Information");
        title.setFont(titleFont);
        title.setBounds(50, 10, 400, 30);
        fr.add(title);
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(10, 70, 300, 30);
        nameLabel.setFont(labelFont);
        fr.add(nameLabel);
        name = new JTextField();
        name.setBounds(100, 70, 300, 30);
        fr.add(name);
        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 110, 300, 30);
        addressLabel.setFont(labelFont);
        fr.add(addressLabel);
        address = new JTextField();
        address.setBounds(100, 110, 300, 30);
        fr.add(address);
        JLabel phoneLabel = new JLabel("Phone: ");
        phoneLabel.setFont(labelFont);
        phoneLabel.setBounds(10, 150, 300, 30);
        fr.add(phoneLabel);
        phone = new JTextField();
        phone.setBounds(100, 150, 300, 30);
        fr.add(phone);
        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setFont(labelFont);
        emailLabel.setBounds(10, 190, 300, 30);
        fr.add(emailLabel);
        email = new JTextField();
        email.setBounds(100, 190, 300, 30);
        fr.add(email);
        JLabel cityLabel = new JLabel("City: ");
        cityLabel.setFont(labelFont);
        cityLabel.setBounds(10, 230, 300, 30);
        fr.add(cityLabel);
        city = new JTextField();
        city.setBounds(100, 230, 300, 30);
        fr.add(city);
        JLabel stateLabel = new JLabel("State: ");
        stateLabel.setFont(labelFont);
        stateLabel.setBounds(10, 270, 300, 30);
        fr.add(stateLabel);
        state = new JTextField();
        state.setBounds(100, 270, 300, 30);
        fr.add(state);
        JLabel zipLabel = new JLabel("Zip: ");
        zipLabel.setFont(labelFont);
        zipLabel.setBounds(10, 310, 300, 30);
        fr.add(zipLabel);
        zip = new JTextField();
        zip.setBounds(100, 310, 300, 30);
        fr.add(zip);
        JLabel countryLabel = new JLabel("Country: ");
        countryLabel.setFont(labelFont);
        countryLabel.setBounds(10, 350, 300, 30);
        fr.add(countryLabel);
        country = new JTextField();
        country.setBounds(100, 350, 300, 30);
        fr.add(country);
        submit = new JButton("Submit");
        submit.setBounds(180, 400, 120, 40);
        fr.add(submit);
        submit.addActionListener(new btnSubmit());
    
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public class btnSubmit implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String Name = name.getText();
            String Address = address.getText();
            String Phone = phone.getText();
            String Email = email.getText();
            String City = city.getText();
            String State = state.getText();
            String Zip = zip.getText();
            String Country = country.getText();
            if(!Name.equals("") && !Address.equals("") && !Phone.equals("") && !Email.equals("") && !City.equals("") && !State.equals("") && !Zip.equals("") && !Country.equals("")){
                try (FileWriter fw = new FileWriter("GovernmentInfo.txt",true)) {
                    fw.write(Name + " " + Address + " " + Phone + " " + Email + " " + City + " " + State + " " + Zip + " " + Country+"\n");
                    JOptionPane.showMessageDialog(null, "Information saved successfully");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
        }
    }

    public static void main(String []args){
        GovernmentInfo gi = new GovernmentInfo();
        gi.governmentSystem();
        
    }
}