package org.todo.dao;


import org.springframework.stereotype.Repository;
import org.todo.entity.Record;
import org.todo.entity.RecordStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class RecordDao {
    private final List<Record> records = new ArrayList<>(
            Arrays.asList(
                    new Record("Take a shower", RecordStatus.ACTIVE),
                    new Record("Take a game", RecordStatus.DONE),
                    new Record("Take a food", RecordStatus.ACTIVE)
            )
    );


    public List<Record> findAllRecords(){
        return records;
    }


}
