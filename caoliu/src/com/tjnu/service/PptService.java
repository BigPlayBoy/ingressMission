package com.tjnu.service;

import com.tjnu.po.Ppt;

import java.util.List;

/**
 * Created by 11517 on 2017/3/18.
 */
public interface PptService {
    boolean savsPpt(Ppt ppt);
    List<Ppt> getPpt();
}
