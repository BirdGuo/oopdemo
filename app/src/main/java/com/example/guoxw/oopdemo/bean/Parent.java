package com.example.guoxw.oopdemo.bean;

/**
 * The type Parent.
 */
public class Parent extends Person {

    private String company;

    /**
     * Instantiates a new Parent.
     */
    public Parent() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Parent.
     *
     * @param name
     *         the name
     * @param age
     *         the age
     */
    public Parent(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Parent.
     *
     * @param company
     *         the company
     */
    public Parent(String company) {
        super();
        this.company = company;
    }

    public Parent(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    /**
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets company.
     *
     * @param company
     *         the company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 工作
     *
     * @param projectName
     */
    public void doWoking(String projectName) {
        System.out.println(getName() + " is in the " + company + " to do" + projectName);
    }

    @Override
    public String toString() {
        return "Parent [company=" + company + "]";
    }

}
