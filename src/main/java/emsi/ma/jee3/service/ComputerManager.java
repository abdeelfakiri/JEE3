package emsi.ma.jee3.service;

import emsi.ma.jee3.dao.enitities.Pc;
import emsi.ma.jee3.dao.enitities.repository.PcRepository;
import emsi.ma.jee3.dto.ComputerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputerManager implements ComputerService {

    @Autowired
    private PcRepository pcRepository;

    public List<ComputerDTO> getComputerByProc(String proc) {
        return pcRepository.findByProc(proc)
                .stream()
                .map(pc -> new ComputerDTO(pc.getProc(), pc.getRam(), pc.getHardDrive(), pc.getPrice()))
                .collect(Collectors.toList());
    }


    @Override
    public ComputerDTO save(ComputerDTO computerDTO) {
            Pc pc = new Pc(computerDTO.getProc(), computerDTO.getRam(), computerDTO.getHardDrive(), computerDTO.getPrice());
            pc = pcRepository.save(pc);
            return new ComputerDTO(pc.getProc(), pc.getRam(), pc.getHardDrive(), pc.getPrice());}
}