package emsi.ma.jee3.mapper;

import emsi.ma.jee3.dao.enitities.Pc;
import emsi.ma.jee3.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class ComputerMapper {
    private final ModelMapper modelMapper;


    public ComputerMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ComputerDTO toDto(Pc pc) {
        return modelMapper.map(pc, ComputerDTO.class);
    }

    public Pc toEntity(ComputerDTO dto) {
        return modelMapper.map(dto, Pc.class);
    }
}