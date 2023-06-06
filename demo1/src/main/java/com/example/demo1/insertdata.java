package com.example.demo1;

import java.sql.*;
public class insertdata {
public static void main(String[] args) throws SQLException {
try {
// Establishing a database connection
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Marvel@3000");

// Checking if the connection is successful
if(conn!=null) {
System.out.println("Succesfully Connceted");
}
else {
System.out.println("Not Connected");
}
// Creating a statement object to execute SQL queries
Statement st=conn.createStatement();

// Inserting a record into the database
st.execute("insert into student(name) values ('Arti')");
System.out.println("Inserted Successfully");
// Retrieving and printing data before the update
System.out.println("Before Update");
ResultSet r1=st.executeQuery("select * from student");
while(r1.next()) {
System.out.println(r1.getString("name"));
};

// Updating the inserted data
st.execute("update student set name='sable' where name='Arti'");
// Retrieving and printing data after the update
ResultSet r2=st.executeQuery("select * from student");
System.out.println("After Update");
while(r2.next()) {
System.out.println(r2.getString("name"));
};
// Closing the result sets, statement, and connection
r1.close();
r2.close();
st.close();
conn.close();
}
catch (SQLException e) {
// Handling any SQL exceptions that may occur
System.out.println(e);
}
}
}