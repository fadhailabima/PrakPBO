/*
 *  File    : ArmadaKendaraan.java
 *  NIM     : 24060121140172
 *  Nama    : Fadhail A Bima
 */

import java.util.List;
import java.util.ArrayList;

public class ArmadaKendaraan {
    private List<Vehicle> armada;

    public ArmadaKendaraan(){
        armada = new ArrayList<>();
    }

    public void tambahArmada(List<? extends Vehicle> armada){
        for (int i=0; i<armada.size(); i++){
            this.armada.add(armada.get(i));
        }
    }

    public List<Vehicle> getAllArmada(){
        return armada;
    }
}
