package com.study.java_study.mytest.class01;

import javax.swing.*;

public class NameRepository {

    private int nameId;

    private NameEntity[] names;

    public NameRepository() {
       names = new NameEntity[0];
    }

    public void autoIncrementNameId() {
        nameId++;
    }

    private void extendNames() {
        NameEntity[] newName = new NameEntity[names.length - 1];
        for(int i = 0; i < names.length; i++) {
            newName[i] = names[i];
        }
        names = newName;
    }

    private int getLastIndex() {
        return names.length - 1;
    }

    private void saveName(NameEntity name) {
        // 배열 확장
        extendNames();

        names[getLastIndex()] = name;

    }



}
