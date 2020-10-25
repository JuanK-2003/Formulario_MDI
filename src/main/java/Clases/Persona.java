package Clases;

/**
 *
 * @author Juan_K
 */
public class Persona {
    private String name;
    private String DPI;
    private int age;
    
    public Persona(){
        
    }
    public Persona(String name, String DPI, int age) {
        this.name = name;
        this.DPI = DPI;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Object[] getinfo(){
        Object[] inf = new Object[3];
        inf[0] = this.name;
        inf[1] = this.DPI;
        inf[2] = this.age;
        return inf;
    }
}
