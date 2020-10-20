package com.unq.copistas.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@EntityListeners(AuditingEntityListener.class)

    public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String user;
        private String pwd;
        private String token;
        private String email;

    public Usuario(){
    }

    public Usuario(long id, String user, String pwd, String email, String token) {
        this.id = id;
        this.user = user;
        this.pwd = pwd;
        this.email = email;
        this.token = token;
    }


    public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getEmail() {
        return email;
    }

        public void setEmail(String email) {
            this.email = email;
        }

    }

