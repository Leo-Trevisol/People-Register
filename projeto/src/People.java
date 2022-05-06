public abstract class People implements Comparable <People>{

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

    @Override
    public int compareTo(People o) {
        if (this.age > o.getAge()) {
            return 1;
        }
        if (this.age < o.getAge()) {

            return -1;
        }
        return 0;
    }
}