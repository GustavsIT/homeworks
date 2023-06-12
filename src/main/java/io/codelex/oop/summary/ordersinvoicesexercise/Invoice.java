package io.codelex.oop.summary.ordersinvoicesexercise;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {

    private static final BigDecimal VAT_RATE = BigDecimal.valueOf(0.21);
    private static final String LINE_SEPARATOR = System.lineSeparator();

    private String invoiceNumber;
    private List<SellableThing> items;
    private InvoiceStatus status;
    private BigDecimal totalPrice;
    private BigDecimal totalPriceWithVAT;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        this.invoiceNumber = invoiceNumber;
        this.items = order.getItems(); // Initialize the items list
        if (items.isEmpty()) {
            throw new WrongOrderException();
        }
        this.status = InvoiceStatus.APPROVED;
        this.totalPrice = calculateTotalPrice();
        this.totalPriceWithVAT = calculateTotalPriceWithVAT();
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    private BigDecimal calculateTotalPrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (SellableThing item : items) {
            BigDecimal price = item.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }

    private BigDecimal calculateTotalPriceWithVAT() {
        BigDecimal vatAmount = totalPrice.multiply(VAT_RATE);
        return totalPrice.add(vatAmount);
    }

    public String getFormattedInvoiceText() {
        StringBuilder sb = new StringBuilder();
        String invoiceNumberLine = "= INVOICE NUMBER: " + invoiceNumber;
        int invoiceNumberLineLength = invoiceNumberLine.length();

        sb.append("=".repeat(50)).append(System.lineSeparator());
        sb.append(invoiceNumberLine).append(" ".repeat(Math.max(0, 49 - invoiceNumberLineLength))).append("=").append(System.lineSeparator());

        String statusLine = "= STATUS: " + status + " ";
        int statusLineLength = statusLine.length();
        sb.append(statusLine).append(" ".repeat(Math.max(0, 49 - statusLineLength))).append("=").append(System.lineSeparator());

        for (int i = 0; i < items.size(); i++) {
            SellableThing item = items.get(i);
            String itemName = item.getName();
            BigDecimal itemPrice = item.getPrice();
            String itemDetails = item.getFullInfo();

            String line = String.format("= %d. %s", i + 1, item.getFullInfo());
            int lineLength = line.length();
            sb.append(line).append(" ".repeat(Math.max(0, 49 - lineLength))).append("=").append(System.lineSeparator());
        }

        String sumLine = String.format("= SUM: %.2f EUR", totalPrice);
        int sumLineLength = sumLine.length();
        sb.append(sumLine).append(" ".repeat(Math.max(0, 49 - sumLineLength))).append("=").append(System.lineSeparator());

        String vatLine = String.format("= VAT (21%%): %.2f EUR", totalPriceWithVAT.subtract(totalPrice));
        int vatLineLength = vatLine.length();
        sb.append(vatLine).append(" ".repeat(Math.max(0, 49 - vatLineLength))).append("=").append(System.lineSeparator());

        String totalLine = String.format("= TOTAL: %.2f EUR", totalPriceWithVAT);
        int totalLineLength = totalLine.length();
        sb.append(totalLine).append(" ".repeat(Math.max(0, 49 - totalLineLength))).append("=").append(System.lineSeparator());
        sb.append("=".repeat(50));

        return sb.toString();
    }
}
