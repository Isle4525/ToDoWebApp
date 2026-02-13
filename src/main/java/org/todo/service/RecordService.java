package org.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todo.dao.RecordDao;
import org.todo.entity.Record;

import java.util.List;

@Service
public class RecordService {
    private final RecordDao recordDao;

    @Autowired
    public RecordService(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    public List<Record> findAllRecords(){
        return recordDao.findAllRecords();
    }

}
