package emsi.ma.jee3.web;

import emsi.ma.jee3.dto.ComputerDTO;
import emsi.ma.jee3.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @QueryMapping
    public List<ComputerDTO> getComputerByProc( String proc) {
        return computerService.getComputerByProc(proc);
    }

    @MutationMapping
    public ComputerDTO saveComputer(String proc,int ram,int HardDrive,Double Price) {
        ComputerDTO computerDTO = new ComputerDTO(proc, ram, HardDrive, Price);
        return computerService.save(computerDTO);
    }
}
