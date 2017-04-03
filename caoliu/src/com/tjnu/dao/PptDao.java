package com.tjnu.dao;

import com.tjnu.po.Ppt;

import java.util.List;

/**
 * Created by 11517 on 2017/3/17.
 * 获取ppt资源信息
 */
public interface PptDao {
boolean savePpt(Ppt ppt);
List<Ppt> getPpt();
}
