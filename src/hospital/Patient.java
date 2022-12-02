package hospital;
// Так же предусмотреть класс «Пациент» с полем «План лечения».\
// Создать объект класса «Пациент» и добавить пациенту план лечения.
public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
