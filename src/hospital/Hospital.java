package hospital;

public class Hospital {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setTreatmentPlan(1);
        Therapist therapist = new Therapist();
        therapist.giveDoctor(patient);
    }
}
