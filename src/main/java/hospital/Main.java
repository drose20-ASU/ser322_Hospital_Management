package hospital;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseManager db = new DatabaseManager("jdbc:mysql://localhost:3306/hospital_db", "root", "password");

            Patient newPatient = new Patient("123-45-6789", "Phillip J. Fry", "03-17-1971", "742 Evergreen Terrace", "555-1234", "That Brain Thing");
            db.addPatient(newPatient);

            Patient fetchedPatient = db.getPatient("123-45-6789");
            System.out.println("Fetched Patient: " + fetchedPatient.getName());

            newPatient.setAddress("742 Evergreen Terrace");
            db.updatePatient(newPatient);

            db.deletePatient("123-45-6789");

            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}