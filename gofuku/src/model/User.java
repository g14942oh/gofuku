/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

//import com.google.appengine.api.users.UserService;
//import com.google.appengine.api.users.UserServiceFactory;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author g14925mm,g14942oh
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User implements Serializable {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private String userId;
    @Persistent
    private String pass;
    @Persistent
    private String mail;
    @Persistent
    private String name;

    public User() {
		this.userId ="umeko";
		this.pass = "umePass";
		this.mail ="umeko@gm.tusda";
		this.name ="Umeko"; 	
    }
    public String getUserId() {
        return userId;
    }

    public String getPass() {
        return pass;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }
}

