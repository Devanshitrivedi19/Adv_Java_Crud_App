package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;

public class StudentDao {
    
    public int insertStudent(StudentBean sbean) {
        String insertQuery = "INSERT INTO student(name,std,marks,hobbies) VALUES(?,?,?,?)";
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        int rowsAffected = 0;
        if (conn != null) {
            try {
                
                pstmt = conn.prepareStatement(insertQuery);
                pstmt.setString(1, sbean.getName());
                pstmt.setString(2, sbean.getStd());
                pstmt.setInt(3, sbean.getMarks());
                pstmt.setString(4, String.join(",", sbean.getHobbies())); 
                
                rowsAffected = pstmt.executeUpdate();

                
            } catch (SQLException e) {
            
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            
            System.out.println("StudentDao : DB not connected: " + conn);
        }
        
        return rowsAffected;
    }
    
    public ArrayList<StudentBean> getAllRecords() {
        String selectQuery = "SELECT * FROM student";
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StudentBean s = null;
        ArrayList<StudentBean> list = new ArrayList<StudentBean>();
        if (conn != null) {
            try {
                
                pstmt = conn.prepareStatement(selectQuery);
                
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    int rno = rs.getInt(1);
                    String name = rs.getString(2);
                    String std = rs.getString(3);
                    int marks = rs.getInt(4);
                    String hobbiesStr = rs.getString(5); 
                    String[] hobbies = null; 
                    
                    if (hobbiesStr != null) 
                    { 
                        hobbies = hobbiesStr.split(",");
                    }
                    
                    s = new StudentBean(rno, name, std, marks, hobbies);
                    list.add(s);
                }
            } catch (SQLException e) {
            
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            
            System.out.println("StudentDao : DB not connected: " + conn);
        }
        return list;
    }
    
    public int deleteStudent(int rno) {
        
        String deleteQuery = "DELETE FROM student WHERE rno = ?";
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        int rowsAffected = 0;
        if (conn != null) {
            try {
                
                pstmt = conn.prepareStatement(deleteQuery);
                pstmt.setInt(1, rno);
                rowsAffected = pstmt.executeUpdate();

                
            } catch (SQLException e) {
            
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            
            System.out.println("StudentDao : DB not connected: " + conn);
        }
        
        return rowsAffected;
    }

	public StudentBean getStudentByrno(int rno) {
		
		String selectQuery = "SELECT * FROM student WHERE rno = ?";
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       StudentBean s=null;
        if (conn != null) {
            try {
                pstmt = conn.prepareStatement(selectQuery);
                pstmt.setInt(1, rno);
                rs = pstmt.executeQuery();
                
                	rs.next();
                    String name = rs.getString("name");
                    String std = rs.getString("std");
                    int marks = rs.getInt("marks");
                    String hobbiesStr = rs.getString("hobbies");
                    String[] hobbies = null;
                    
                    if (hobbiesStr != null) {
                        hobbies = hobbiesStr.split(",");
                    }
                    
                    s = new StudentBean(rno, name, std, marks, hobbies);
                
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("StudentDao : DB not connected: " + conn);
        }
        return s;
	}

	public int updateStudent(StudentBean sbean) 
	{
		String updateQuery = "UPDATE student SET name=?, std=?, marks=?, hobbies=? WHERE rno=?";
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        int rowsAffected = 0;
        
        if (conn != null) {
            try {
                pstmt = conn.prepareStatement(updateQuery);
                pstmt.setString(1, sbean.getName());
                pstmt.setString(2, sbean.getStd());
                pstmt.setInt(3, sbean.getMarks());
                pstmt.setString(4, String.join(",", sbean.getHobbies()));
                pstmt.setInt(5, sbean.getRno());
                
                rowsAffected = pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("StudentDao : DB not connected: " + conn);
        }
        
        return rowsAffected;
    }
}
