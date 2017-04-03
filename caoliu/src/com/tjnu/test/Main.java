package com.tjnu.test;


import com.tjnu.DataBase.Subject;
import com.tjnu.dao.TableDao;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;

import java.util.List;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Main {
    public static void main(String[] args) {
       Worker worker=new Worker();
       worker.setWno("1111");
       worker.setAge(11);
       worker.setSalary(123.123);
       worker.setName("渣渣");
        TableDao tableDao=new TableDao();
        tableDao.saveObject(worker);
    }
}
