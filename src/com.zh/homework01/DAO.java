package homework01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DAO<T> {

    public HashMap<String,T> map = new HashMap<>();

    public void save(String id , T entity){
        map.put(id,entity);
    }

    public T get (String id){
        return map.get(id);
    }

    public void update(String id , T entity){
        map.replace(id,entity);
    }

    public List<T> list(){
        ArrayList<T> users = new ArrayList<>();
        for (String s : map.keySet()) {
            users.add(map.get(s));
        }
        return users;
    }

    public void  delete (String id){
        map.remove(id);
    }

}


class user{
    private int id;

    private int age;

    private String name ;

    public user(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
