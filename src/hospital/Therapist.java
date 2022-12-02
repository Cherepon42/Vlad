package hospital;

//ак же у терапевта создать метод, который будет назначать врача пациенту согласно плану лечения.
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод
//лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод
//лечить.
//Если план лечения имеет любой другой код – назначить терапевта и
//выполнить метод лечить.
public class Therapist extends Doctor {
    @Override
    void treat() {
        System.out.println("Therapist treat");
    }

    void giveDoctor(Patient patient) {
        int code = patient.getTreatmentPlan();
        if (code == 1) {
            Surgeon surgeon = new Surgeon();
            patient.setDoctor(surgeon);
            surgeon.treat();
        } else if (code == 2) {
            Dentist dentist = new Dentist();
            patient.setDoctor(dentist);
            dentist.treat();
        } else {
            patient.setDoctor(this);
            this.treat();
        }
    }
}
