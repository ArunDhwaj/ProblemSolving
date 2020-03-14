package com.sbp.ProblemSolving.multithreading;

public class Man
{
    String father;
    String mother;
    String name;
    String placeOfBirth;
    String schoolName;
    int age;

    public Man()
    {
        System.out.println("A man is created");
    }

    public String getFather()
    {
        return father;
    }

    public void setFather(String father)
    {
        this.father = father;
    }

    public String getMother()
    {
        return mother;
    }

    public void setMother(String mother)
    {
        this.mother = mother;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPlaceOfBirth()
    {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth)
    {
        this.placeOfBirth = placeOfBirth;
    }

    public String getSchoolName()
    {
        return schoolName;
    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void studyInSchool(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public void play()
    {

    }


}
