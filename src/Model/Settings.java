package Model;

/**
 * Created by enoch3712. doesnt matter the date
 */
public class Settings
{

    public enum Pair
    {
        USD_EUR("USD/EUR"),
        GBP_USD("GBP/USD"),
        USD_JPY("USD/JPY"),
        XAU_USD("XAU/USD");

        private String name;

        Pair(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }
    }

}
