package hospital;

import java.sql.*;

public class DatabaseManager {
    private Connection connection;

    // Constructor to establish connection
    public DatabaseManager(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the database!");
    }

    // Close connection
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Database connection closed.");
        }
    }

    // Add a new Patient
    public void addPatient(Patient patient) throws SQLException {
        String sql = "INSERT INTO Patient (SSN, Name, DateOfBirth, Address, Phone, MedicalConditions) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, patient.getSsn());
            stmt.setString(2, patient.getName());
            stmt.setDate(3, Date.valueOf(patient.getDateOfBirth()));
            stmt.setString(4, patient.getAddress());
            stmt.setString(5, patient.getPhone());
            stmt.setString(6, patient.getMedicalConditions());
            stmt.executeUpdate();
            System.out.println("Patient added successfully.");
        }
    }

    // Retrieve a Patient by SSN
    public Patient getPatient(String ssn) throws SQLException {
        String sql = "SELECT * FROM Patient WHERE SSN = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, ssn);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Patient(
                    rs.getString("SSN"),
                    rs.getString("Name"),
                    rs.getString("DateOfBirth"),
                    rs.getString("Address"),
                    rs.getString("Phone"),
                    rs.getString("MedicalConditions")
                );
            }
        }
        return null;
    }

    // Update a Patient
    public void updatePatient(Patient patient) throws SQLException {
        String sql = "UPDATE Patient SET Name = ?, DateOfBirth = ?, Address = ?, Phone = ?, MedicalConditions = ? WHERE SSN = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, patient.getName());
            stmt.setDate(2, Date.valueOf(patient.getDateOfBirth()));
            stmt.setString(3, patient.getAddress());
            stmt.setString(4, patient.getPhone());
            stmt.setString(5, patient.getMedicalConditions());
            stmt.setString(6, patient.getSsn());
            stmt.executeUpdate();
            System.out.println("Patient updated successfully.");
        }
    }

    // Delete a Patient by SSN
    public void deletePatient(String ssn) throws SQLException {
        String sql = "DELETE FROM Patient WHERE SSN = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, ssn);
            stmt.executeUpdate();
            System.out.println("Patient deleted successfully.");
        }
    }
}
