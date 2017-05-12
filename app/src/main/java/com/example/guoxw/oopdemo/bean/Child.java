package com.example.guoxw.oopdemo.bean;

import com.example.guoxw.oopdemo.interfaces.ChildInterFaces;

/**
 * The type Child.
 */
public class Child extends Person implements ChildInterFaces {

    private String parentName;
    private String school;

    /**
     * Instantiates a new Child.
     */
    public Child() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Child.
     *
     * @param name
     *         the name
     * @param age
     *         the age
     */
    public Child(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Child.
     *
     * @param parentName
     *         the parent name
     * @param school
     *         the school
     */
    public Child(String parentName, String school) {
        super();
        this.parentName = parentName;
        this.school = school;
    }

    public Child(String name, int age, String parentName, String school) {
        super(name, age);
        this.parentName = parentName;
        this.school = school;
    }

    /**
     * Gets parent name.
     *
     * @return the parent name
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets parent name.
     *
     * @param parentName
     *         the parent name
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * Gets school.
     *
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets school.
     *
     * @param school
     *         the school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 读书
     *
     * @param bookName
     */
    public void readBook(String bookName) {
        System.out.println("孩子的方法");
        System.out.println(getName() + " is reading " + bookName);
    }

    @Override
    public String toString() {
        return "Child [name=" + getName() + ",age=" + getAge() + ",parentName=" + parentName + ", school=" + school
                + "]";
    }

    @Override
    public void examination(int lesson) {

        String examName = "语文";
        switch (lesson) {
            case 1:
                examName = "语文";
                break;
            case 2:
                examName = "数学";
                break;
            case 3:
                examName = "英文";
                break;
        }

    }

    @Override
    public void graduate(int level) {

    }
}
