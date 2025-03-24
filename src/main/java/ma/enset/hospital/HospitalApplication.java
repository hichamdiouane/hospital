package ma.enset.hospital;

import lombok.AllArgsConstructor;
import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;


@SpringBootApplication @AllArgsConstructor
public class HospitalApplication implements CommandLineRunner {

	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"Hassan", "Hassan", LocalDate.now(), false, 12));
		patientRepository.save(new Patient(null, "Khalid", "Khalid", LocalDate.now(), true, 34));
		patientRepository.save(new Patient(null, "Diouane", "Hicham", LocalDate.now(), false, 56));
	}
}
