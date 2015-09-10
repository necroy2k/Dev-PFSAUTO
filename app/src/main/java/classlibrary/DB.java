package classlibrary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;

public class DB  extends SQLiteOpenHelper {

    //Query para crear las tablas en la bd
    String query="CREATE TABLE user (userid INTEGER PRIMARY KEY AUTOINCREMENT, paizoID TEXT)";

    //Constructor de la clase
    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Ejecuta query para crear la tabla
      //  File database= getApplicationContext().getDatabasePath("BDpfs.db");

      //  if (!database.exists()) {
        db.execSQL(query);
      //  } else {

       // }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL("DROP TABLE IF EXISTS personas");
        db.execSQL(query);
    }

}