package com.torkuds.androidworld.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.torkuds.androidworld.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * des:用户信息数据库
 * Created by Administrator
 * on 2017/4/10 0010.
 */

public class UserDatabase {

    private final DatabaseHelper dbeHelper;

    private int version = 1;

    public UserDatabase(Context context) {
        dbeHelper = new DatabaseHelper(context, version);
    }

    /**
     * 增
     * @param user
     */
    public void insert(User user){
        SQLiteDatabase db = dbeHelper.getReadableDatabase();
        String sql = "insert into " + DatabaseHelper.USER_TABLE_NAME
                + "(_id, password, name) values(?, ?, ?)";
        db.execSQL(sql, new String[]{user.getPhone_num(), user.getPassword(), user.getUser_name()});
        db.close();
    }

    /**
     * 删
     * @param id
     */
    public void delete(String id){
        SQLiteDatabase db = dbeHelper.getReadableDatabase();
        String sql = "delete from " + DatabaseHelper.USER_TABLE_NAME
                + " where _id=?";
        db.execSQL(sql, new String[]{id});
        db.close();
    }

    /**
     * 改
     * @param user
     */
    public void update(User user){
        SQLiteDatabase db = dbeHelper.getReadableDatabase();
        String sql = "update from " + DatabaseHelper.USER_TABLE_NAME
                + "set password=?, name=? where _id=?";
        db.execSQL(sql, new String[]{user.getPassword(), user.getUser_name(), user.getPhone_num()});
        db.close();
    }

    /**
     * 根据id查用户信息
     * @param id
     * @return
     */
    public List<User> query(String id){
        SQLiteDatabase db = dbeHelper.getReadableDatabase();
        List<User> data = new ArrayList<>();
        String sql = "select * from " + DatabaseHelper.USER_TABLE_NAME
                + "where _id=?";
        Cursor cursor = db.rawQuery(sql, new String[]{id});
        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            User user = new User();
            user.setPhone_num(cursor.getString(0));
            user.setPassword(cursor.getString(1));
            user.setUser_name(cursor.getString(2));
            data.add(user);
        }
        if (!cursor.isClosed()){
            cursor.close();
        }
        db.close();
        return data;
    }

    /**
     * 重置数据
     * @param datas
     */
    public void reset(List<User> datas){
        if (datas != null){
            SQLiteDatabase db = dbeHelper.getReadableDatabase();
            db.execSQL("delete from " + DatabaseHelper.USER_TABLE_NAME);
            for(User user : datas){
                insert(user);
            }
            db.close();
        }
    }

    /**
     * 保存一条用户信息，若已经存在直接覆盖
     * @param user
     */
    public void save(User user){
        List<User> datas = query(user.getPhone_num());
        if (datas != null && !datas.isEmpty()){
            update(user);
        }else {
            insert(user);
        }
    }
}
