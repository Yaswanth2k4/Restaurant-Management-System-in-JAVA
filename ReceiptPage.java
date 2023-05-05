import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Receipt extends JFrame
{
    ArrayList<Dish> SelectedMenu;
    JPanel receiptform;

    public Receipt()
    {
        Font f=new Font("verdana",Font.BOLD,18);

        try
        {
            SelectedMenu=new ArrayList<Dish>();
            Dish ob=null;
            FileInputStream fin=new FileInputStream("D:\\Java Project\\DishDetails.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            while((ob=(Dish)oin.readObject())!=null)
            {
                SelectedMenu.add(ob);
            }
        }
        catch(Exception e)
        {

        }

        float sum=0;
        //Adding the Dish prices
        for(Dish obj:SelectedMenu)
        {
            try
            {
                sum=sum+(Float.parseFloat(obj.price));
            }
            catch(NumberFormatException e)
            {
                System.out.println("Exception");
            }
        }
        float gst=4*sum/100;

        //ReceiptForm-JPanel
        receiptform=new JPanel();
        receiptform.setBackground(Color.decode("#ffffff"));
        receiptform.setLayout(null);
        receiptform.setPreferredSize(new Dimension(490,2000));


        //Adding Selected Menu Items
        JLabel []label=new JLabel[SelectedMenu.size()];
        int x=15,y=0;
        for(Dish d:SelectedMenu)
        {
            JLabel name=new JLabel(d.name);
            JLabel cost=new JLabel(d.price);
            name.setBounds(x,y,200,40);
            cost.setBounds(x+300,y,200,40);
            name.setFont(f);
            cost.setFont(f);
            receiptform.add(name);
            receiptform.add(cost);
            y=y+50;
        }

        //BILL-JLabel
        JLabel bill=new JLabel("BILL");
        bill.setBounds(585,75,150,50);
        bill.setFont(new Font("Times New Roman",Font.BOLD,50));

        //Items-JLabel
        JPanel headpanel=new JPanel();
        headpanel.setLayout(null);
        headpanel.setBounds(410,135,490,50);
        headpanel.setBackground(Color.decode("#ffffff"));
        JLabel item=new JLabel("ITEMS");
        item.setBounds(70,5,100,40);
        item.setFont(f);
        JLabel price=new JLabel("PRICE");
        price.setBounds(340,5,100,40);
        price.setFont(f);
        headpanel.add(item);
        headpanel.add(price);

        //JScrollPane
        JScrollPane scrollpane = new JScrollPane(receiptform,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setBounds(440,185,440,450);

        //Bottompanel-JPanel
        JPanel boPanel=new JPanel();
        boPanel.setBounds(440,635,440,170);
        boPanel.setBackground(Color.decode("#ffffff"));
        boPanel.setLayout(null);

        JLabel Total=new JLabel("Total = "+Float.toString(sum));
        Total.setBounds(240,5,200,35);
        Total.setFont(new Font("verdana",Font.BOLD,18));
        boPanel.add(Total);
        JLabel sgst=new JLabel("SGST(4%) = "+Float.toString(gst));
        sgst.setBounds(183,40,200,35);
        sgst.setFont(new Font("verdana",Font.BOLD,18));
        boPanel.add(sgst);
        JLabel cgst=new JLabel("CGST(4%) = "+Float.toString(gst));
        cgst.setBounds(183,75,200,35);
        cgst.setFont(new Font("verdana",Font.BOLD,18));
        boPanel.add(cgst);
        JLabel Net=new JLabel("NET PAYABLE = "+Float.toString(sum+2*gst));
        Net.setBounds(120,115,300,40);
        Net.setFont(new Font("verdana",Font.BOLD,22));
        boPanel.add(Net);

        //BG image-JLabel
        JLabel bgimage=new JLabel();
        bgimage.setIcon(new ImageIcon("D:\\Java Project\\ReceiptBG.jpg"));
        bgimage.setBounds(0,0,1250,900);
        bgimage.add(bill);
        bgimage.add(headpanel);
        bgimage.add(scrollpane);
        bgimage.add(boPanel);
        add(bgimage);

        setTitle("Bill");
        setSize(1250,900);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new Receipt();
    }
}
