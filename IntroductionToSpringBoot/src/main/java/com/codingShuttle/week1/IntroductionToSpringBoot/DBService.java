package com.codingShuttle.week1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
//    private DevDB db;

  //  @Autowired
    private DB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData() {
        return db.getData();
    };
}
