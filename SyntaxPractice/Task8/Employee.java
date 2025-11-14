class Employee {

    protected String name;
    protected String email;
    protected int experience;

    Employee(String name, String email, int experience){
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    protected String getName(){
        return name;
    }
    protected String getEmail(){
        return email;
    }
    protected int getExperience(){
        return experience;
    }
}

class Developer extends Employee {
    protected String mainLanguage;
    protected String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills){
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
    
    protected String getMainLanguage(){
        return mainLanguage;
    }

    protected String[] getSkills(){
        return skills;
    }
    @Override
    protected String getName(){
        return super.name;
    }
    @Override
    protected String getEmail(){
        return super.email;
    }
    @Override
    protected int getExperience(){
        return super.experience;
    }
}

class DataAnalyst extends Employee {
    protected String methods;
    protected boolean phd;

    DataAnalyst(String name, String email, int experience, boolean phd,  String methods){
        super(name, email, experience);
        this.methods = methods;
        this.phd = phd;
    }
    @Override
     protected String getName(){
        return super.name;
    }
    @Override
    protected String getEmail(){
        return super.email;
    }
    @Override
    protected int getExperience(){
        return super.experience;
    }
    protected String getMethods(){
        return methods;
    }
    protected boolean isPhd(){
        return phd;
    }
}
