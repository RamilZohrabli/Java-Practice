-----------------------------------------
|               Invoice                 |
-----------------------------------------
| - partNumber: String                  |
| - description: String                 |
| - quantityOfItem: int                 |
| - pricePerItem: double                |
-----------------------------------------
| + Invoice(String, String, int, double)|
| + getPartNumber(): String             |
| + getPartDescription(): String        |
| + getQuantity(): int                  |
| + getPrice(): double                  |
| + setPartNumber(String): void         |
| + setPartDescription(String): void    |
| + setQuantity(int): void              |
| + setPriceItem(double): void         |
| + getInvoiceAmount(): double         |
-----------------------------------------
-----------------------------------------
|            InvoiceTest                |
-----------------------------------------
| + main(String[]): void              |
-----------------------------------------
