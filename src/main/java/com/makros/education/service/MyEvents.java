package com.makros.education.service;

import com.makros.education.dao.repositories.MyDataBase;
import com.makros.education.dao.entities.Personne;
import com.makros.education.enums.Genre;
import com.makros.education.view.MyForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mohamed.iben-el-abed on 12/19/2021
 */
public class MyEvents implements ActionListener {
    MyForm myForm;
    MyDataBase myDataBase;

    public MyEvents(MyForm myForm){
        this.myForm=myForm;
        this.myDataBase=new MyDataBase();
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==myForm.ajouter) {
            Personne personne = new Personne(myForm.nomText.getText(),null);
            if(myForm.femme.isSelected()){
                personne.setGenre(Genre.FEMME);
            } else {
                personne.setGenre(Genre.HOMME);
            }
            myDataBase.ajouter(personne);
        }
    }
}
