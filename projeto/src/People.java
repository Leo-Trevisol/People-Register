public abstract class People {

    private String name;
    private String surname;
    private int age;
    private float heightcm;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeightcm() {
        return heightcm;
    }

    public void setHeightcm(float heightcm) {
        this.heightcm = heightcm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}