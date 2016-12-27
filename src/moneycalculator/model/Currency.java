package moneycalculator.model;

public class Currency {
    private final String symbol;
    private final String code;
    private final String name;

    public Currency(String symbol, String code, String name) {
        this.symbol = symbol;
        this.code = code;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return code; //To change body of generated methods, choose Tools | Templates.
    }
    
}
