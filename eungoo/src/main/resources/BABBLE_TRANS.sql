CREATE TABLE BABBLE_TRANS (
  seq INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
  text VARCHAR(255) NULL,
  reg_date DATE NULL,
  primary key (seq)  
);
