package hospital;

import java.sql.Connection;  
import java.util.Scanner;  

public class UserInterface {  
    private Connection conn;  
    private Scanner scanner;  

    public UserInterface(Connection conn) {  
        this.conn = conn;  
        this.scanner = new Scanner(System.in);  
    }  

    public void displayMenu() {  
        while (true) {  
            System.out.println("Hospital Management System Menu:");  
            System.out.println("1. Add Patient");  
            System.out.println("2. Update Patient");  
            System.out.println("3. Delete Patient");  
            System.out.println("4. View Patients");  
            System.out.println("5. Add Doctor");  
            System.out.println("6. View Doctors");  
            System.out.println("7. Add Nurse");  
            System.out.println("8. View Nurses");  
            System.out.println("9. Add Room");  
            System.out.println("10. View Rooms");  
            System.out.println("11. Add Equipment");  
            System.out.println("12. View Equipment");  
            System.out.println("13. Exit");  
            System.out.print("Choose an option: ");  
            int choice = scanner.nextInt();  
            scanner.nextLine(); 

            switch (choice) {  
                case 1: addPatient(); break;  
                case 2: updatePatient(); break;  
                case 3: deletePatient(); break;  
                case 4: viewPatients(); break;  
                case 5: addDoctor(); break; 
                case 6: viewDoctors(); break; 
                case 7: addNurse(); break; 
                case 8: viewNurses(); break;
                case 9: addRoom(); break;
                case 10: viewRooms(); break; 
                case 11: addEquipment(); break;
                case 12: viewEquipment(); break;
                case 13: System.exit(0);  
                default: System.out.println("Invalid choice. Please try again.");  
            }  
        }  
    }  

    private void addPatient() {  
        System.out.print("Enter SSN: ");  
        String ssn = scanner.nextLine();
        
        System.out.print("Enter Name: ");  
        String name = scanner.nextLine();  
        
        System.out.print("Enter Date of Birth (MM-DD-YYYY): ");  
        String dateOfBirth = scanner.nextLine();  
        
        System.out.print("Enter Address: ");  
        String address = scanner.nextLine();  
        
        System.out.print("Enter Phone Number: ");  
        String phone = scanner.nextLine();  
        
        System.out.print("Enter Medical Conditions: ");  
        String medicalConditions = scanner.nextLine();  

        Patient patient = new Patient(ssn, name, dateOfBirth, address, phone, medicalConditions);  
        PatientManager patientManager = new PatientManager();  
        patientManager.addPatient(conn, patient);  
    }  

    private void updatePatient() {  
    	System.out.print("Enter SSN: ");  
        String ssn = scanner.nextLine();
        
        System.out.print("Enter Name: ");  
        String name = scanner.nextLine();  
        
        System.out.print("Enter Date of Birth (MM-DD-YYYY): ");  
        String dateOfBirth = scanner.nextLine();  
        
        System.out.print("Enter Address: ");  
        String address = scanner.nextLine();  
        
        System.out.print("Enter Phone Number: ");  
        String phone = scanner.nextLine();  
        
        System.out.print("Enter Medical Conditions: ");  
        String medicalConditions = scanner.nextLine();  

        Patient patient = new Patient(patientID, name, ssn, medicalCondition, roomID, assignedDoctor, assignedNurse);  
        PatientManager patientManager = new PatientManager();  
        patientManager.updatePatient(conn, patient);  
    }  

    private void deletePatient() {  
        System.out.print("Enter Patient ID to delete: ");  
        int patientID = scanner.nextInt();  
        PatientManager patientManager = new PatientManager();  
        patientManager.deletePatient(conn, patientID);  
    }  

    private void viewPatients() {  
        PatientManager patientManager = new PatientManager();  
        patientManager.displayPatients(conn);  
    }  

    private void addDoctor() {  
        System.out.print("Enter Doctor ID: ");  
        int doctorID = scanner.nextInt();  
        scanner.nextLine();  
        
        System.out.print("Enter Name: ");  
        String name = scanner.nextLine();  
        
        System.out.print("Enter License No: ");  
        String licenseNo = scanner.nextLine();  
        
        System.out.print("Enter Specialty: ");  
        String specialty = scanner.nextLine();  

        Doctor doctor = new Doctor(doctorID, name, licenseNo, specialty);  
        DoctorManager doctorManager = new DoctorManager();  
        doctorManager.addDoctor(conn, doctor);  
    }  

    private void viewDoctors() {  
        DoctorManager doctorManager = new DoctorManager();  
        doctorManager.displayDoctors(conn);  
    }  

    private void addNurse() {  
        System.out.print("Enter Nurse ID: ");  
        int nurseID = scanner.nextInt();  
        scanner.nextLine();  
        
        System.out.print("Enter Name: ");  
        String name = scanner.nextLine();  
        
        System.out.print("Enter Shift: ");  
        String shift = scanner.nextLine();  

        Nurse nurse = new Nurse(nurseID, name, shift);  
        NurseManager nurseManager = new NurseManager();  
        nurseManager.addNurse(conn, nurse);  
    }  

    private void viewNurses() {  
        NurseManager nurseManager = new NurseManager();  
        nurseManager.displayNurses(conn);  
    }  

    private void addRoom() {  
        System.out.print("Enter Room ID: ");  
        int roomID = scanner.nextInt();  
        
        System.out.print("Enter Capacity: ");  
        int capacity = scanner.nextInt();  
        
        System.out.print("Enter Current Occupancy: ");  
        int currentOccupancy = scanner.nextInt();  
        
        System.out.print("Is Ventilator Available? (true/false): ");  
        boolean ventilatorAvailable = scanner.nextBoolean();  

        Room room = new Room(roomID, capacity, currentOccupancy, ventilatorAvailable);  
        RoomManager roomManager = new RoomManager();  
        roomManager.addRoom(conn, room);  
    }  

    private void viewRooms() {  
        RoomManager roomManager = new RoomManager();  
        roomManager.displayRooms(conn);  
    }  

    private void addEquipment() {  
        System.out.print("Enter Equipment ID: ");  
        int equipmentID = scanner.nextInt();  
        scanner.nextLine();  
        
        System.out.print("Enter Name: ");  
        String name = scanner.nextLine();  
        
        System.out.print("Enter Type: ");  
        String type = scanner.nextLine();  
        
        System.out.print("Enter Assigned Room ID: ");  
        int assignedRoom = scanner.nextInt();  
        
        System.out.print("Enter Assigned Patient ID: ");  
        int assignedPatient = scanner.nextInt();  

        Equipment equipment = new Equipment(equipmentID, name, type, assignedRoom, assignedPatient);  
        EquipmentManager equipmentManager = new EquipmentManager();  
        equipmentManager.addEquipment(conn, equipment);  
    }  

    private void viewEquipment() {  
        EquipmentManager equipmentManager = new EquipmentManager();  
        equipmentManager.displayEquipment(conn);  
    }  
}  
