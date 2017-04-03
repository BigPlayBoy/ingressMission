package com.tjnu.dao;

import com.tjnu.po.PptUrls;

import java.util.List;

/**
 * Created by 11517 on 2017/3/17.
 */
public interface PptUrlDao {
    List<PptUrls> getPptUrlsByPptId(int pptId);
}
