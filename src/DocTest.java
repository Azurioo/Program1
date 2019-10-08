import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/** No klasa jak klasa mało robi. Zawsze przecież mozna spojrzeć w telefon jaki jest dzień.
 @version 0.1
 @author Jan Tuczko
 */

public class DocTest {
    /** Glowna metoda klasy uruchamiajaca test
     @param args tablica lancuchow pobierana z wiersza polecen
     @return nie zwraca wartosci
     @exception exception Brak zgłaszanych wyjatkow
     */
    public static void main(String args[]){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Dzisiejsza data: " + strDate);
    }
}
