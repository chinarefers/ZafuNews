package cn.edu.zafu.news.ui.app;

import cn.edu.zafu.corepage.core.CoreConfig;

/**
 * User: lizhangqu(513163535@qq.com)
 * Date: 2015-09-19
 * Time: 11:00
 * FIXME
 */
public class App extends com.activeandroid.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CoreConfig.init(this);
    }
}
