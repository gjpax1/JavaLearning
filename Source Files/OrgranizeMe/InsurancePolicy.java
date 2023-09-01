package OrganizeMe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class InsurancePolicy extends FinancialEntity implements Payable, Contactable, Expirable {

    SimpleDateFormat sfd = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
    private String objectedInsured;
    private boolean includesLiability;
    private double premium;
    Date startDate;
    Date expirationDate;
    private int ContractDurationinDays = (int) Math.abs((expirationDate.getTime()) - (startDate.getTime()));
    //private int durationLeftInDays = (int) Math.abs((java.time.LocalDate.now()) - (startDate.getTime()));

    public static Date todaysDate = new Date();



    @Override
    public String notifyOfExpiration() {
        return null;
    }
}
