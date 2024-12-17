package emsi.ma.jee3.dao.enitities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pc;
    private String proc;
    private int ram;
    private int HardDrive;
    private Double Price;
    private String macAddress;

    public Pc() {
    }

    public Pc(Long id_Pc, String proc, int ram, int HardDrive, Double Price, String macAddress) {
        this.id_Pc = id_Pc;
        this.proc = proc;
        this.ram = ram;
        this.HardDrive = HardDrive;
        this.Price = Price;
        this.macAddress = macAddress;
    }
    public Pc(String proc, int ram, int HardDrive, Double Price) {
        this.proc = proc;
        this.ram = ram;
        this.HardDrive = HardDrive;
        this.Price = Price;
    }

    public Pc(String proc, int ram, int HardDrive, Double Price, String macAddress) {
        this.proc = proc;
        this.ram = ram;
        this.HardDrive = HardDrive;
        this.Price = Price;
        this.macAddress = macAddress;
    }

    // Getters et Setters
    public Long getId_Pc() {
        return id_Pc;
    }

    public void setId_Pc(Long id_Pc) {
        this.id_Pc = id_Pc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDrive() {
        return HardDrive;
    }

    public void setHardDrive(int hardDrive) {
        HardDrive = hardDrive;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "id_Pc=" + id_Pc +
                ", proc='" + proc + '\'' +
                ", ram=" + ram +
                ", HardDrive=" + HardDrive +
                ", Price=" + Price +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
