import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        String datastring1 = "2023-03-01T13:00:00Z";
        String datastring2 = "2024-03-01T13:00:00Z";

        OffsetDateTime data1 = OffsetDateTime.parse(datastring1);
        OffsetDateTime data2 = OffsetDateTime.parse(datastring2);

        //Verificare che la prima data è precedente alla seconda
        boolean firstIsBefore = data1.isBefore(data2);
        System.out.println("La prima data e' precedente della seconda? " + firstIsBefore);

        //Verificare che la seconda data è successiva alla prima
        boolean secondIsAfter = data2.isAfter(data1);
        System.out.println("La seconda data e' successiva della prima? " + secondIsAfter);

        //Verificare che le due date sono uguali ad ora
        boolean isEquals = data1.isEqual(OffsetDateTime.now());
        System.out.println("le due date sono uguali ad ora? " + isEquals);

    }
}