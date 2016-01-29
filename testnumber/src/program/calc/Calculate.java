package program.calc;

/**
 * Created by Alexey on 27.01.2016.
 */

public class Calculate {

        public boolean calc (String numb)
        {
            int number = Integer.parseInt(numb);

                boolean result;
                if (number % 2 == 0)
                    result = true;
                else
                    result = false;
                return result;
        }
}
