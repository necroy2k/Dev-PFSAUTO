package controller;

import android.app.Application;
import android.content.Context;

import entities.ReturnEntity;
import model.UsuarioData;
import entities.UsuarioEntity;

public class UsuarioBiz extends Application {
    private UsuarioData Odata;

    public ReturnEntity SaveUser(UsuarioEntity user, Context c) {
        try
        {
            Odata = new UsuarioData();
            return Odata.SaveUser(user,c);
        }
        catch (Exception e)
        {
            return new ReturnEntity(1,e.getMessage());
        }
    }
}