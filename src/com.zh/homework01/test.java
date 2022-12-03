package homework01;

import java.util.Map;

public class test {
    public static void main(String[] args) {

        DAO<user> userDAO = new DAO<>();

        userDAO.save("1",new user(1,1,"张三"));
        userDAO.save("2",new user(1,1,"张三"));
        userDAO.save("3",new user(1,1,"张三"));
        userDAO.save("4",new user(1,1,"张三"));

        userDAO.delete("1");


        userDAO.update("2",new user(2,2,"zhangsan"));


        for (user user : userDAO.list()) {
            System.out.println(user);
        }

        for (Map.Entry<String, user> stringuserEntry : userDAO.map.entrySet()) {
            System.out.println(stringuserEntry);
        }
//        userDAO.delete();
    }
}
