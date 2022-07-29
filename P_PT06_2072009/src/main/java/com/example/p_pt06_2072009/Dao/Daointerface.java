package com.example.p_pt06_2072009.Dao;

import javafx.collections.ObservableList;

public interface Daointerface<T>{
    ObservableList<T> getData();
    void addData(T data);
    void deleteData(T data);
    int updateData(T data);
}
