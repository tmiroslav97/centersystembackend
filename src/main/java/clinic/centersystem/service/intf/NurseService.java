package clinic.centersystem.service.intf;

import clinic.centersystem.dto.response.NurseResponse;
import clinic.centersystem.dto.response.PrescriptionResponse;
import clinic.centersystem.model.Nurse;

import java.util.List;

public interface NurseService {

    Nurse findById(Long id);

    List<Nurse> findAll();

    List<Nurse> findAllOnClinic(Long clinicId);

    Nurse save(Nurse nurse);

    NurseResponse getNurseById(Long id);

}
