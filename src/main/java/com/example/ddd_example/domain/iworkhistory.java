package com.example.ddd_example.domain;

public interface iworkhistory {
    public boolean InsertWork();
    public work SelectWork(int workcode);
    public work SelectAllWork();

}
