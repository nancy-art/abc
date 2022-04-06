package com.trainingapps.stockapp.orderms.dto;

public class OrderStockDetails {
    private long stockId;
    private int units;
    private double pricePerUnit;

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "OrderStockDetails{" +
                "stockId=" + stockId +
                ", units=" + units +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
