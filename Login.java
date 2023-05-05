import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends JFrame implements ActionListener 
{
    JPanel loginform;
    JButton loginbtn;
    JButton signbtn;
    JTextField username;
    JPasswordField password;

    public Login()
    {
        //Login Panel
        loginform=new JPanel();
        loginform.setBounds(710,0,530,800);
        loginform.setBackground(Color.WHITE);
        loginform.setLayout(null);

        //LOGIN heading
        JLabel head=new JLabel("LOGIN");
        head.setFont(new Font("Times New Roman",Font.BOLD,50));
        head.setForeground(Color.BLACK);
        head.setBackground(Color.WHITE);
        head.setBounds(175,40,200,50);
        loginform.add(head);

        Font f=new Font("verdana",Font.BOLD,20);

       //usename-Label
        JLabel userlabel=new JLabel();
        userlabel.setText("Username :");
        userlabel.setFont(f);
        userlabel.setBounds(60,170,150,40);
        userlabel.setForeground(Color.BLACK);
        loginform.add(userlabel);

        //username-textfield
        username=new JTextField();
        username.setFont(new Font("Times New Roman",Font.PLAIN,17));
        username.setBounds(200,170,250,40);
        username.setBackground(Color.WHITE);
        username.setForeground(Color.BLACK);
        loginform.add(username);

       //password-Label
        JLabel passlabel=new JLabel();
        passlabel.setText("Password :");
        passlabel.setFont(f);
        passlabel.setBounds(60,280,150,40);
        passlabel.setForeground(Color.BLACK);
        loginform.add(passlabel);

        //password-passwordfield
        password=new JPasswordField();
        password.setFont(new Font("Times New Roman",Font.PLAIN,17));
        password.setBounds(200,280,250,40);
        password.setBackground(Color.WHITE);
        password.setForeground(Color.BLACK);
        loginform.add(password);

        //loginbutton
        loginbtn=new JButton();
        loginbtn.setText("Login");
        loginbtn.setForeground(Color.WHITE);
        loginbtn.setBackground(Color.decode("#f8950c"));
        loginbtn.setFont(new Font("verdana",Font.BOLD,17));
        loginbtn.setBounds(60,450,390,50);
        loginbtn.addActionListener(this);
        loginform.add(loginbtn);

        //signup label
        JLabel signlabel=new JLabel();
        signlabel.setText("New User?");
        signlabel.setFont(f);
        signlabel.setBounds(100,550,150,40);
        signlabel.setForeground(Color.BLACK);
        loginform.add(signlabel);

        //signupbutton
        signbtn=new JButton();
        signbtn.setText("Signup");
        signbtn.setForeground(Color.WHITE);
        signbtn.setBackground(Color.decode("#f8950c"));
        signbtn.setFont(new Font("verdana",Font.BOLD,17));
        signbtn.setBounds(250,540,150,50);
        signbtn.addActionListener(this);
        loginform.add(signbtn);

        //Background Image
        JLabel bgimage=new JLabel();
        bgimage.setIcon(new ImageIcon("D:\\Java Project\\LoginBG.jpg"));
        bgimage.add(loginform);
        bgimage.setBounds(0,0,1250,800);
        add(bgimage);

        setSize(1250,800);
        setTitle("Restaurant Management System-Login");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginbtn)
        {
            String usertext=username.getText();
            char []p=password.getPassword();
            String passtext=new String(p);
            try
            {
                User ob=null;
                boolean userflag;
                FileInputStream fin=new FileInputStream("D:\\Java Project\\UserDetails.txt");
                ObjectInputStream oin=new ObjectInputStream(fin);
                while((ob=(User)oin.readObject())!=null)
                {
                    if(ob.username.equals(usertext) && ob.password.equals(passtext))
                    {
                        new Menu();
                        super.dispose();
                    }
                    else if(ob.username.equals(usertext) && (!ob.password.equals(passtext)))
                    {
                        JOptionPane.showMessageDialog(this,"Wrong Username/Password");
                    }
                }
            }
            catch(Exception ex)
            {

            }
        }
        if(e.getSource()==signbtn)
        {
            new SignUp();
            super.dispose();
        }
    }

    public static void main(String []args)
    {
        new Login();
    }
}
