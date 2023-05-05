import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class SignUp extends JFrame implements ActionListener {

    JPanel signupform;
    JButton signupbtn;
    JTextField firstname;
    JTextField lastname;
    JTextField mobile;
    JTextField username;
    JPasswordField password;
    JPasswordField confpass;

    public SignUp()
    {
         //SignUp Panel
         signupform=new JPanel();
         signupform.setBounds(710,0,530,800);
         signupform.setBackground(Color.WHITE);
         signupform.setLayout(null);
 
         //SignUp heading
         JLabel head=new JLabel("SIGNUP");
         head.setFont(new Font("Times New Roman",Font.BOLD,50));
         head.setForeground(Color.BLACK);
         head.setBackground(Color.WHITE);
         head.setBounds(170,40,200,50);
         signupform.add(head);
 
         Font f=new Font("verdana",Font.BOLD,20);
 
        //Firstname-Label
         JLabel namelabel=new JLabel();
         namelabel.setText("Firstname :");
         namelabel.setFont(f);
         namelabel.setBounds(60,140,150,40);
         namelabel.setForeground(Color.BLACK);
         signupform.add(namelabel);
 
         //Firstname-textfield
         firstname=new JTextField();
         firstname.setFont(new Font("Times New Roman",Font.PLAIN,17));
         firstname.setBounds(200,140,250,40);
         firstname.setBackground(Color.WHITE);
         firstname.setForeground(Color.BLACK);
         signupform.add(firstname);
        
         //Lastname-Label
         JLabel lastlabel=new JLabel();
         lastlabel.setText("Lastname :");
         lastlabel.setFont(f);
         lastlabel.setBounds(60,220,150,40);
         lastlabel.setForeground(Color.BLACK);
         signupform.add(lastlabel);
 
         //Lastname-textfield
         lastname=new JTextField();
         lastname.setFont(new Font("Times New Roman",Font.PLAIN,17));
         lastname.setBounds(200,220,250,40);
         lastname.setBackground(Color.WHITE);
         lastname.setForeground(Color.BLACK);
         signupform.add(lastname);

         //Mobile-Label
         JLabel mobilelabel=new JLabel();
         mobilelabel.setText("Mobile No :");
         mobilelabel.setFont(f);
         mobilelabel.setBounds(60,300,150,40);
         mobilelabel.setForeground(Color.BLACK);
         signupform.add(mobilelabel);
 
         //Mobile-textfield
         mobile=new JTextField();
         mobile.setFont(new Font("Times New Roman",Font.PLAIN,17));
         mobile.setBounds(200,300,250,40);
         mobile.setBackground(Color.WHITE);
         mobile.setForeground(Color.BLACK);
         signupform.add(mobile);

         //Username-Label
         JLabel userlabel=new JLabel();
         userlabel.setText("Username :");
         userlabel.setFont(f);
         userlabel.setBounds(60,380,150,40);
         userlabel.setForeground(Color.BLACK);
         signupform.add(userlabel);
 
         //Username-textfield
         username=new JTextField();
         username.setFont(new Font("Times New Roman",Font.PLAIN,17));
         username.setBounds(200,380,250,40);
         username.setBackground(Color.WHITE);
         username.setForeground(Color.BLACK);
         signupform.add(username);

         //Password-Label
         JLabel passlabel=new JLabel();
         passlabel.setText("Password :");
         passlabel.setFont(f);
         passlabel.setBounds(60,460,150,40);
         passlabel.setForeground(Color.BLACK);
         signupform.add(passlabel);
 
         //Password-textfield
         password=new JPasswordField();
         password.setFont(new Font("Times New Roman",Font.PLAIN,17));
         password.setBounds(200,460,250,40);
         password.setBackground(Color.WHITE);
         password.setForeground(Color.BLACK);
         signupform.add(password);

         //Confirm Password 1-Label
         JLabel conflabel1=new JLabel();
         conflabel1.setText("Confirm :");
         conflabel1.setFont(f);
         conflabel1.setBounds(60,520,150,40);
         conflabel1.setForeground(Color.BLACK);
         signupform.add(conflabel1);

         //Confirm Password 2-Label
         JLabel conflabel2=new JLabel();
         conflabel2.setText("Password");
         conflabel2.setFont(f);
         conflabel2.setBounds(60,560,150,40);
         conflabel2.setForeground(Color.BLACK);
         signupform.add(conflabel2);
 
         //Confirm Password-textfield
         confpass=new JPasswordField();
         confpass.setFont(new Font("Times New Roman",Font.PLAIN,17));
         confpass.setBounds(200,540,250,40);
         confpass.setBackground(Color.WHITE);
         confpass.setForeground(Color.BLACK);
         signupform.add(confpass);
 
         //signupbutton
         signupbtn=new JButton();
         signupbtn.setText("Signup");
         signupbtn.setForeground(Color.WHITE);
         signupbtn.setBackground(Color.decode("#f8950c"));
         signupbtn.setFont(new Font("verdana",Font.BOLD,17));
         signupbtn.setBounds(60,630,400,50);
         signupbtn.addActionListener(this);
         signupform.add(signupbtn);
 
         //Background Image
         JLabel bgimage=new JLabel();
         bgimage.setIcon(new ImageIcon("D:\\Java Project\\LoginBG.jpg"));
         bgimage.add(signupform);
         bgimage.setBounds(0,0,1250,800);
         add(bgimage);
 
         setSize(1250,800);
         setTitle("Restaurant Management System-SignUp");
         setLayout(null);
         setVisible(true);
         setResizable(false);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==signupbtn)
        {
            String first=firstname.getText();

            String last=lastname.getText();
            String user=username.getText();
            String mob=mobile.getText();
            boolean validmobile=false;
            char[] num=mob.toCharArray();

            for(int i=0;i< num.length;i++)
            {
                String n=Character.toString(num[i]);
                try
                    {
                        Integer.parseInt(n);
                    }
                catch(NumberFormatException except)
                    {
                        validmobile=true;
                    }
            }
            char []p1=password.getPassword();
            String pass=new String(p1);
            char []p2=confpass.getPassword();
            String conf=new String(p2);
            if(!pass.equals(conf))
            {
                JOptionPane.showMessageDialog(this,"Password and Confirm Password must be same");
            }
            else if(validmobile)
            {
                JOptionPane.showMessageDialog(this,"Mobile number must contain only digits");
            }
            else
            {
                ArrayList<User> UserList=new ArrayList<User>();
                try{
                User o=null;
                FileInputStream fin=new FileInputStream("D:\\Java Project\\UserDetails.txt");
                ObjectInputStream oin=new ObjectInputStream(fin);
                while((o=(User)oin.readObject())!=null)
                {
                    UserList.add(o);
                }
                }
                catch(Exception exc)
                {

                }
                try
                {
                    User ob=new User(first,last,mob,user,pass);
                    FileOutputStream fout=new FileOutputStream("D:\\Java Project\\UserDetails.txt");
                    ObjectOutputStream out=new ObjectOutputStream(fout);
                    for(User object:UserList)
                    {
                        out.writeObject(object);
                    }
                    out.writeObject(ob);
                }
                catch(Exception ex)
                {

                }
                new Login();
                super.dispose();
            }
        }
    }

    public static void main(String args[])
    {
        new SignUp();
    }
}
