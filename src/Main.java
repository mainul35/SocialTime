
import com.socialtime.dao.UserDao;
import com.socialtime.model.Users;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.read();
    }
}
