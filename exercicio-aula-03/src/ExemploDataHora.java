import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

    public static void main(String[] args) {

        LocalDate diaDeHoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataDeOntem = LocalDate.parse("19-01-2021", formatter);
        System.out.println(dataDeOntem);

    }
}
