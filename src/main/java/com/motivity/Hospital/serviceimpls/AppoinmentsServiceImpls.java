package com.motivity.Hospital.serviceimpls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.motivity.Hospital.models.Appointments;
import com.motivity.Hospital.repositorys.AppointmentsRepo;
import com.motivity.Hospital.service.AppointmentService;

@Service
public class AppoinmentsServiceImpls implements AppointmentService {

	AppointmentsRepo appointmentsRepo;
	@Override
	public Appointments saveAppointments(Appointments appointments) {
		
		return appointmentsRepo.save(appointments);
	}
	@Override
	public List<Appointments> patientsidestatus(String patientid) {
		
		return appointmentsRepo.patientsidestatus(patientid);
	}
	@Override
	public List<Appointments> showAndAcceptAppointment(String department, String status) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int acceptUpdate(String time, String date, String doctorName, String doctorGender, int appointmentId,
			String status, String doctorPhoneNo) {
		
		return 0;
	}
	

}
