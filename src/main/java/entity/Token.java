package entity;

import com.google.gson.annotations.Expose;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sheol on 10/31/17 at 2:46 PM
 * @project SpringRestDemo
 */
@Entity
@Table(name = "token")
public class Token {
    @Expose
    private String token;
    @Expose
    private String username;
    @Expose
    private String token_type = "Bearer";
    @Expose
    private int ttl = 3600;

    public Token() {

    }

    public String getUsername() {
        return username;
    }

    public int getTtl() {
        return ttl;
    }

    public String getToken() {
        return token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
