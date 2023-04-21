package br.com.spotyjava.model;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import br.com.spotyjava.database.DB;

public class Model {
    protected int id;
    
    // Private constructor to avoid instantiation
    protected Model() {
    }

    public int id() {
        return id;
    }

    private String[] getFields() {

        // Fields from the parent class
        String[] parentFields = Arrays.stream(this.getClass().getSuperclass().getDeclaredFields())
            .map(Member::getName)
            .toArray(String[]::new);

        // Fields from the current class
        String[] fields = Arrays.stream(this.getClass().getDeclaredFields())
            .map(Member::getName)
            .toArray(String[]::new);
        
        // Merge the fields from the current class and the parent class starting with the id
        String[] allFields = new String[parentFields.length + fields.length + 1];
        allFields[0] = "id";
        System.arraycopy(parentFields, 0, allFields, 1, parentFields.length);
        System.arraycopy(fields, 0, allFields, parentFields.length + 1, fields.length);
        
        // Return the fields
        return allFields;
    }

    private String[] getValues() {

        // Get the values from the parent class
        String[] parentValues = Arrays.stream(this.getClass().getSuperclass().getDeclaredFields())
            .map(field -> {
                try {
                    field.setAccessible(true);
                    String fieldName = field.get(this).toString();
                    field.setAccessible(false);
                    return fieldName;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return null;
            })
            .toArray(String[]::new);
        
        // Get the values from the current class
        String[] values = Arrays.stream(this.getClass().getDeclaredFields())
            .map(field -> {
                try {
                    field.setAccessible(true);
                    String fieldName = field.get(this).toString();
                    field.setAccessible(false);
                    return fieldName;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return null;
            })
            .toArray(String[]::new);
        
        // Merge the values from the current class and the parent class starting with the id
        String[] allValues = new String[parentValues.length + values.length + 1];
        allValues[0] = Integer.toString(id);
        System.arraycopy(parentValues, 0, allValues, 1, parentValues.length);
        System.arraycopy(values, 0, allValues, parentValues.length + 1, values.length);

        // Return the values
        return allValues;
    }

    public int save() {
        String[] fields = getFields();
        String[] values = getValues();

        // Create the SQL statement
        String sql = "INSERT INTO " + this.getClass().getSimpleName() + " ("
            + String.join(", ", fields) + ") VALUES ('"
            + String.join("', '", values) + "');";
        
        // Get the connection
        Connection connection = new DB().getConnection();

        // Execute the SQL statement
        try {
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            new DB().closeConnection();
        }

        // Return the id of the inserted row
        return id;
    }
}