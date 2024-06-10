package com.study.java_study.mytest.class01;

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



}
