package com.makros.education.view;

import com.makros.education.dao.repositories.MyDataBase;
import com.makros.education.components.MyComponent;
import com.makros.education.service.MyThread;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by mohamed.iben-el-abed on 12/19/2021
 */
public class MyList {
    public MyDataBase myDataBase;
    MyThread myThread;
    public MyComponent myComponent;

    private JFrame frame;
    String[] entete ={"Id","Nom","Genre"};
    public DefaultTableModel model=new DefaultTableModel(entete,0);
    JPanel panel=new JPanel();
    JTable table=new JTable(model);
    JScrollPane sp=new JScrollPane();

    public MyList(){

        this.myDataBase=new MyDataBase();
        myDataBase.remplirTab(model);
        sp.getViewport().add(table);

        Border borderWithTitle = BorderFactory.createTitledBorder("Liste des utilisateurs");
        sp.setBorder(borderWithTitle);

        frame = new JFrame("Examen");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(1200,600);

        myComponent=new MyComponent(null,"Genre","Nombre d'utilisateurs");
        panel.setLayout(new GridLayout(2,1));
        panel.add(sp);
        panel.add(myComponent);

        Container c=frame.getContentPane();
        c.setLayout(new BorderLayout());
        c.add("Center",panel);
        frame.setVisible(true);
        myThread=new MyThread(this);
        myThread.run();

    }

}
