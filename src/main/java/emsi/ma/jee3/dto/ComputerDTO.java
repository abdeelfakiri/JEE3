package emsi.ma.jee3.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ComputerDTO {
        private String proc;
        private int ram;
        private int HardDrive;
        private Double Price;

        public ComputerDTO() {
        }

        public ComputerDTO(String proc, int ram, int HardDrive, Double Price) {
                this.proc = proc;
                this.ram = ram;
                this.HardDrive = HardDrive;
                this.Price = Price;
        }
        // Getters et Setters
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

        public void setHardDrive(int HardDrive) {
                this.HardDrive = HardDrive;
        }

        public Double getPrice() {
                return Price;
        }

        public void setPrice(Double Price) {
                this.Price = Price;
        }


        @Override
        public String toString() {
                return "ComputerDTO{" +
                        "proc='" + proc + '\'' +
                        ", ram=" + ram +
                        ", HardDrive=" + HardDrive +
                        ", Price=" + Price +
                        '}';
        }

}
