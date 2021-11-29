package com.example.ddd_example.domain.iRepository;

import com.example.ddd_example.domain.entity.work;

public interface iwork {
    public boolean InsertWork();
    public work SelectWork(int workcode);
    public work SelectAllWork();
}
