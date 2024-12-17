package emsi.ma.jee3.service;

import emsi.ma.jee3.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
        List<ComputerDTO> getComputerByProc(String proc);
        ComputerDTO save(ComputerDTO computerDTO);
}
