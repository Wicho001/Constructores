package constructores;

public class fecha {
    int dia, año;
    String mes, acontecimiento, notita;
    
    
    fecha(int dia, int año, String mes){
        this.dia = dia;
        this.año = año;
        this.mes = mes;
    }
    fecha(String acontecimiento, String notita){
        this.acontecimiento = acontecimiento;
        this.notita = notita;
    }
    fecha(int año, String acontecimiento){
        this.año = año;
        this.acontecimiento = acontecimiento;
    }
    fecha(String notita, int año){
        this.año = año;
        this.notita = notita;
    }
    fecha(String acontecimiento){
        this.acontecimiento =acontecimiento;
    }
}
