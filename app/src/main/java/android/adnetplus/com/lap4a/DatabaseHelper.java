package android.adnetplus.com.lap4a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adminis on 4/18/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static String DATABASE_NAME = "bkapshop.sqlite";
    private final static int DATABASE_VERSION = 1;

    private final String TBL_SHOP = "" +
            "CREATE TABLE tblShop (\n" +
            "    id       INTEGER      PRIMARY KEY AUTOINCREMENT,\n" +
            "    name     VARCHAR (50),\n" +
            "    quantity INTEGER (11),\n" +
            "    price    DOUBLE,\n" +
            "    date     DATE\n" +
            ");\n" +
            "";

    /**
     * Contructor of Model Database Helper
     * @param context
     */
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Neu chua co thi tao moi, tao bang tbl_shop
        db.execSQL(TBL_SHOP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Neu sai khac phien ban thi thuc hien lenh cap nhat o day.

    }
}
