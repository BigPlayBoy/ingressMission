package com.tjnu.service;

import com.tjnu.dao.PptDao;
import com.tjnu.dao.PptDaoImpl;
import com.tjnu.po.Ppt;

import java.util.List;

/**
 * Created by 11517 on 2017/3/18.
 */
public class PptServiceImpl implements PptService {
    @Override
    public boolean savsPpt(Ppt ppt) {
        PptDao pptDao=new PptDaoImpl();
        return pptDao.savePpt(ppt);
    }

    @Override
    public List<Ppt> getPpt() {
        PptDao pptDao=new PptDaoImpl();
        return pptDao.getPpt();
    }
}
