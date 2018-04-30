import java.io.Serializable;

/**
 * Function Desc: TODO
 * Date:2018/4/30 16:43
 * author:jun.chen02@hand-china.com
 */
public class User implements Serializable{


    private String name;
    private Integer old;

    public User(String name, Integer old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
}
