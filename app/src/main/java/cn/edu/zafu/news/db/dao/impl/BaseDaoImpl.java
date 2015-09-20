package cn.edu.zafu.news.db.dao.impl;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.edu.zafu.news.db.dao.BaseDao;

/**
 * BaseDao泛型实现类
 * User:lizhangqu(513163535@qq.com)
 * Date:2015-08-26
 * Time: 13:51
 */
public class BaseDaoImpl<T,Integer> extends BaseDao<T,Integer> {
    private Dao<T, Integer> mDao;
    private Class<T> clazz;
    public BaseDaoImpl(Context context,Class<T> clazz) {
        super(context);
        this.clazz=clazz;
    }

    @Override
    public Dao<T, Integer> getDao() throws SQLException {
        if (null==mDao){
            mDao=mDatabaseHelper.getDao(clazz);
        }
        return mDao;
    }
}