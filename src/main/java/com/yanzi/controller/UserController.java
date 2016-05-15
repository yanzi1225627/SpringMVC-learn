package com.yanzi.controller;

import com.yanzi.db.DbConnection;
import com.yanzi.db.entities.UsersEntity;
import com.yanzi.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yanzi on 16/5/15.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model){
        Session s = DbConnection.getSession();
        List<UsersEntity> list = s.createCriteria(UsersEntity.class).addOrder(Order.desc("id")).list();
        model.addAttribute("users", list);
        s.close();
        return "users";
    }

    @RequestMapping(value = "adduser", method = RequestMethod.GET)
    public String addUser(Model model){
        User u = new User();
        u.setAge(100);
        u.setName("极客学院");
        model.addAttribute(u);
        return "add_user";
    }

    @RequestMapping(value="/result", method = RequestMethod.POST)
    public String result(Model model, @RequestParam String name, @RequestParam int age){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        Session session = DbConnection.getSession();
        Transaction transaction = session.beginTransaction();
        UsersEntity ue = new UsersEntity();
        ue.setName(name);
        ue.setAge((byte)age);
        session.save(ue);
        transaction.commit();
        session.close();
        return "result";
    }
}
