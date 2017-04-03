package com.cui.dao;

import com.cui.Utils.Page;
import com.cui.bean.Url;

import java.util.List;

/**
 * Created by 11517 on 2017/4/2.
 */
public interface UrlDao {
    boolean saveUrl(Url url);
List<Url> getUrlListByPage(Page page);
}
