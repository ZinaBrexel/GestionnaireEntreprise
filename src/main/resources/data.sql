INSERT INTO users (username,password,enabled) VALUES (
                                                         'admin', '{bcrypt}$2a$10$qFxSCg1aUSRWLOck1URQB.nJPwfiOMAbzMNWKwG3VNs08N42wiGSW', 1
                                                     );
INSERT INTO authorities (username,authority) VALUES ('admin','ROLE_ADMIN');