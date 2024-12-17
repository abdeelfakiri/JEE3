package emsi.ma.jee3.dao.enitities.repository;

import emsi.ma.jee3.dao.enitities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long> {
        List<Pc> findByProc(String proc);

}
