package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.model.Currency;

public class MoneyCalculator {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame(currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay()));
    }

    private static Currency[] currencies() {
        return new Currency[] {
            new Currency("$", "USD", "Dólar Americano"),
            new Currency("$", "CAD", "Dólar Canadiense"),
            new Currency("£", "GBP", "Libra Esterlina"),
        };
    }
    
}
