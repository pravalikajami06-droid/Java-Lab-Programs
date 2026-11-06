class Patient {
    String patientName;
    double height;
    double weight;

    Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Patient p = new Patient("John", 1.75, 70);

        System.out.println("Patient Name: " + p.patientName);
        System.out.println("Height: " + p.height);
        System.out.println("Weight: " + p.weight);
        System.out.println("BMI: " + p.computeBMI());
    }
}