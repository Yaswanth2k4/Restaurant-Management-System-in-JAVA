import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*; 

class Dish implements Serializable
{
    String name;
    String price;
}

public class Menu extends JFrame implements ActionListener,ItemListener
{
    ArrayList<Dish> SelectedMenu;
    JButton orderButton;

    ArrayList<JCheckBox> Teabox;
    ArrayList<Dish> TeaDishList;
    ArrayList<JLabel> TeaPriceList;
    Dish TeaDish[];

    ArrayList<JCheckBox> BreakBox;
    ArrayList<Dish> BreakDishList;
    ArrayList<JLabel> BreakPriceList;
    Dish BreakDish[];

    ArrayList<JCheckBox> SoupBox;
    ArrayList<Dish> SoupDishList;
    ArrayList<JLabel> SoupPriceList;
    Dish SoupDish[];

    ArrayList<JCheckBox> MainBox;
    ArrayList<Dish> MainDishList;
    ArrayList<JLabel> MainPriceList;
    Dish MainDish[];

    ArrayList<JCheckBox> RiceBox;
    ArrayList<Dish> RiceDishList;
    ArrayList<JLabel> RicePriceList;
    Dish RiceDish[];

    ArrayList<JCheckBox> RotiBox;
    ArrayList<Dish> RotiDishList;
    ArrayList<JLabel> RotiPriceList;
    Dish RotiDish[];

    public Menu()
    {
        SelectedMenu=new ArrayList<Dish>();
        Font f=new Font("verdana",Font.BOLD,20);
        
        //HOT TEA Items
        Teabox=new ArrayList<JCheckBox>(); //ArrayList that stores JCheckBoxes
        TeaDishList=new ArrayList<Dish>(); //ArrayList that stores Dish class Objects
        TeaPriceList=new ArrayList<JLabel>(); //ArrayList that stores price attributes of Dish class objects as Jlabel
        TeaDish=new Dish[7];
        String Tname[]={"Tea","Black Tea","Elachi Tea","Lemon Tea","Coffee","Capuccino","Espresso"};
        String Tprice[]={"20.00","15.00","30.00","20.00","20.00","100.00","90.00"};

        for(int i=0;i<7;i++)
        {
            TeaDish[i]=new Dish();
            TeaDish[i].name=Tname[i];
            TeaDish[i].price=Tprice[i];
            JCheckBox checkbox=new JCheckBox(TeaDish[i].name);
            checkbox.setOpaque(false);
            checkbox.addItemListener(this);
            JLabel label=new JLabel(TeaDish[i].price);
            TeaPriceList.add(label);
            Teabox.add(checkbox);  //Storing JCheckBoxes in ArrayList
        }
        //Tea-Label
        JLabel HotTea=new JLabel("HOT TEA");
        HotTea.setFont(new Font("aldhabi",Font.BOLD,32));
        HotTea.setBounds(90,140,200,40);
        int y1=200,y2=200;
        for(JCheckBox box:Teabox)
        {
            box.setBounds(90,y1,200,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:TeaPriceList)
        {
            label.setBounds(310,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        //BREAKFAST ITEMS
        BreakBox=new ArrayList<JCheckBox>();
        BreakDishList=new ArrayList<Dish>();
        BreakPriceList=new ArrayList<JLabel>();
        BreakDish=new Dish[8];
        String BreakName[]={"Sambar Idly","Upma","Masala Dosa","Onion Dosa","Mysore Bonda","Aloo Parata","Paneer Parata","Poori"};
        String BreakPrice[]={"40.00","50.00","50.00","50.00","40.00","30.00","35.00","50.00"};
        //BREAKFAST-JLabel
        y1=y1+40;
        y2=y2+40;
        JLabel BreakFast=new JLabel("BREAKFAST");
        BreakFast.setFont(new Font("aldhabi",Font.BOLD,32));
        BreakFast.setBounds(90,y1,200,40);

        for(int i=0;i<8;i++)
        {
            BreakDish[i]=new Dish();
            BreakDish[i].name=BreakName[i];
            BreakDish[i].price=BreakPrice[i];
            JCheckBox box=new JCheckBox(BreakDish[i].name);
            box.setOpaque(false);
            box.addItemListener(this);
            BreakBox.add(box);
            JLabel label=new JLabel(BreakDish[i].price);
            BreakPriceList.add(label);
        }
        y1=y1+65;
        y2=y2+65;
        for(JCheckBox box:BreakBox)
        {
            box.setBounds(90,y1,200,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:BreakPriceList)
        {
            label.setBounds(310,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        //  SOUP ITEMS
        SoupBox=new ArrayList<JCheckBox>();
        SoupDishList=new ArrayList<Dish>();
        SoupPriceList=new ArrayList<JLabel>();
        SoupDish=new Dish[7];
        String SoupName[]={"Sweet Corn Soup","Vegetable Soup","Hot & Sour Soup","Tomato Soup","Lemon Coriander","Veg Machow","Cream of Tomato"};
        String SoupPrice[]={"90.00","85.00","90.00","85.00","90.00","90.00","90.00"};
        y1=y1+40;
        y2=y2+40;
        //SOUP-JLabel
        JLabel Soup=new JLabel("SOUP");
        Soup.setBounds(500,140,200,40);
        Soup.setFont(new Font("aldhabi",Font.BOLD,32));

        for(int i=0;i<7;i++)
        {
            SoupDish[i]=new Dish();
            SoupDish[i].name=SoupName[i];
            SoupDish[i].price=SoupPrice[i];
            JCheckBox box=new JCheckBox(SoupDish[i].name);
            box.setOpaque(false);
            box.addItemListener(this);
            SoupBox.add(box);
            JLabel label=new JLabel(SoupDish[i].price);
            SoupPriceList.add(label);
        }
        y1=200;
        y2=200;
        for(JCheckBox box:SoupBox)
        {
            box.setBounds(500,y1,250,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:SoupPriceList)
        {
            label.setBounds(770,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        //MAIN COURSE Items
        MainBox=new ArrayList<JCheckBox>();
        MainDishList=new ArrayList<Dish>();
        MainPriceList=new ArrayList<JLabel>();
        MainDish=new Dish[9];
        String MainName[]={"Dum Aloo","Bhindi Fry","Dal Tadka","Kadai Paneer","Paneer Butter Masala","Paneer Burji","Paneer Tikka","Mushroom Matar","Kadai Mushroom"};
        String MainPrice[]={"140.00","150.00","140.00","150.00","170.00","170.00","180.00","145.00","145.00"};
        for(int i=0;i<9;i++)
        {
            MainDish[i]=new Dish();
            MainDish[i].name=MainName[i];
            MainDish[i].price=MainPrice[i];
            JCheckBox box=new JCheckBox(MainDish[i].name);
            box.setOpaque(false);
            box.addItemListener(this);
            MainBox.add(box);
            JLabel label=new JLabel(MainPrice[i]);
            MainPriceList.add(label);
        }
        y1=y1+40;
        y2=y2+40;
        //Main Course-JLabel
        JLabel MainCourse=new JLabel("MAIN COURSE");
        MainCourse.setFont(new Font("aldhabi",Font.BOLD,32));
        MainCourse.setBounds(500,y1,250,32);
        y1=y1+65;
        y2=y2+65;
        for(JCheckBox box:MainBox)
        {
            box.setBounds(500,y1,275,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:MainPriceList)
        {
            label.setBounds(795,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        RiceBox=new ArrayList<JCheckBox>();
        RiceDishList=new ArrayList<Dish>();
        RicePriceList=new ArrayList<JLabel>();
        RiceDish=new Dish[7];
        String RiceName[]={"Veg Biryani","Veg Pulao","Tomato Rice","Lemon Rice","Jeera Rice","Veg Fried Rice","Curd Rice"};
        String RicePrice[]={"200.00","170.00","170.00","150.00","100.00","90.00","50.00"};
        y1=200;
        y2=200;
        //Rice Dish-JLabel
        JLabel Rice=new JLabel("RICE DISHES");
        Rice.setBounds(980,140,200,40);
        Rice.setFont(new Font("aldhabi",Font.BOLD,32));
        for(int i=0;i<7;i++)
        {
            RiceDish[i]=new Dish();
            RiceDish[i].name=RiceName[i];
            RiceDish[i].price=RicePrice[i];
            JCheckBox box=new JCheckBox(RiceDish[i].name);
            box.setOpaque(false);
            box.addItemListener(this);
            RiceBox.add(box);
            JLabel label=new JLabel(RiceDish[i].price);
            RicePriceList.add(label);
        }
        for(JCheckBox box:RiceBox)
        {
            box.setBounds(980,y1,250,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:RicePriceList)
        {
            label.setBounds(1250,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        RotiBox=new ArrayList<JCheckBox>();
        RotiDishList=new ArrayList<Dish>();
        RotiPriceList=new ArrayList<JLabel>();
        RotiDish=new Dish[7];
        String RotiName[]={"Phulka Roti","Butter Roti","Tawa Butter Roti","Tandoori Roti","Plain Naan","Butter Naan","Lacha Parata"};
        String RotiPrice[]={"10.00","15.00","15.00","20.00","35.00","40.00","50.00"};
        y1=y1+40;
        y2=y2+40;
        //Rice Dish-JLabel
        JLabel Roti=new JLabel("ROTI");
        Roti.setBounds(980,y1,200,40);
        Roti.setFont(new Font("aldhabi",Font.BOLD,32));
        for(int i=0;i<7;i++)
        {
            RotiDish[i]=new Dish();
            RotiDish[i].name=RotiName[i];
            RotiDish[i].price=RotiPrice[i];
            JCheckBox box=new JCheckBox(RotiDish[i].name);
            box.setOpaque(false);
            box.addItemListener(this);
            RotiBox.add(box);
            JLabel label=new JLabel(RotiDish[i].price);
            RotiPriceList.add(label);
        }
        y1=y1+65;
        y2=y2+65;
        for(JCheckBox box:RotiBox)
        {
            box.setBounds(980,y1,250,25);
            box.setFont(f);
            y1=y1+35;
        }
        for(JLabel label:RotiPriceList)
        {
            label.setBounds(1250,y2,80,25);
            label.setFont(f);
            y2=y2+35;
        }

        orderButton=new JButton("Order");
        orderButton.setBounds(600,y1+100,175,50);
        orderButton.setFont(f);
        orderButton.addActionListener(this);
        orderButton.setBackground(Color.decode("#cf8e39"));

        //Menu Name-JLabel
        JLabel MenuName=new JLabel();
        MenuName.setText("Menu");
        MenuName.setFont(new Font("aldhabi",Font.BOLD,50));
        MenuName.setBounds(623,25,150,50);

        //BackGround Image-JLabel
        JLabel bgimage=new JLabel();
        bgimage.setIcon(new ImageIcon("D:\\Java Project\\MenuBG.jpg"));
        bgimage.setBounds(0,0,1423,1050);
        bgimage.add(MenuName);
        bgimage.add(HotTea);
        bgimage.add(BreakFast);
        bgimage.add(Soup);
        bgimage.add(MainCourse);
        bgimage.add(Rice);
        bgimage.add(Roti);
        bgimage.add(orderButton);
        for(JCheckBox box:Teabox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:TeaPriceList)
        {
            bgimage.add(label); //Adding JLabels
        }

        for(JCheckBox box:BreakBox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:BreakPriceList)
        {
            bgimage.add(label); //Adding JLabels
        }
        for(JCheckBox box:SoupBox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:SoupPriceList)
        {
            bgimage.add(label); //Adding JLabels
        }
        for(JCheckBox box:MainBox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:MainPriceList)
        {
            bgimage.add(label); //Adding JLabels
        }
        for(JCheckBox box:RiceBox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:RicePriceList)
        {
            bgimage.add(label); //Adding JLabels
        }
        for(JCheckBox box:RotiBox)
        {
            bgimage.add(box);   //Adding JCheckboxes
        }
        for(JLabel label:RotiPriceList)
        {
            bgimage.add(label); //Adding JLabels
        }
        add(bgimage);

        setSize(1423,1050);
        setTitle("Menu Card");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("D:\\Java Project\\DishDetails.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            for(Dish ob:SelectedMenu)
            {
                out.writeObject(ob);
            }
            new Receipt();
            super.dispose();
        }
        catch(Exception ex)
        {

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        for(JCheckBox box:Teabox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:TeaDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }
        for(JCheckBox box:BreakBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:BreakDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }
        for(JCheckBox box:SoupBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:SoupDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }
        for(JCheckBox box:MainBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:MainDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }
        for(JCheckBox box:RiceBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:RiceDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }
        for(JCheckBox box:RotiBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.SELECTED))
            {
                for(Dish ob:RotiDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.add(ob);
                    }
                }
            }
        }


        //Removing the items that are added into the arraylist,which are Deselected

        for(JCheckBox box:Teabox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:TeaDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
        for(JCheckBox box:BreakBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:BreakDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
        for(JCheckBox box:SoupBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:SoupDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
        for(JCheckBox box:MainBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:MainDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
        for(JCheckBox box:RiceBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:RiceDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
        for(JCheckBox box:RotiBox)
        {
            if((e.getSource()==box) && (e.getStateChange()==ItemEvent.DESELECTED))
            {
                for(Dish ob:RotiDish)
                {
                    if(box.getText().equals(ob.name))
                    {
                        SelectedMenu.remove(ob);
                    }
                }
            }
        }
    }

    public static void main(String args[])
    {
        new Menu();
    }
}
