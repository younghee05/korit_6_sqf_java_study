package com.study.java_study.mytest.class01;

public class NameEntity {
    private int nameId; // 이름 번호
    private String name; // 이름
    private String character; // 성격
    private String job; // 직업

    public NameEntity(int nameId, String name, String character, String job) {
        this.nameId = nameId;
        this.name = name;
        this.character = character;
        this.job = job;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NameEntity{ " +
                "nameId= " + nameId +
                ", name= '" + name + '\'' +
                ", character= '" + character + '\'' +
                ", job= '" + job + '\'' +
                '}';
    }
}
