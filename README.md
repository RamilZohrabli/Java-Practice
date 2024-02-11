# Student: Ramil Zohrabli
# Student ID: P000020069
# CRN: 20420

# Week02

### 1. Sum.java
- **Description:** Takes two integer inputs from the user using the Scanner class, calculates their sum, and prints the result.

### 2. Calc.java
- **Description:** Command-line calculator that takes two integer arguments and performs arithmetic operations such as sum, subtraction, multiplication, division, and remainder. Prints the results.

### 3. MonthInfo.java
- **Description:** Uses the Scanner class to take a user-inputted month number, categorizes it, and prints its number of days using a switch statement.

### 4. Fact.java
- **Description:** Contains a for loop that iterates through the input number, calculates the factorial, and prints the result.

### 5. Average.java
- **Description:** Uses Scanner inside a while loop to read integers until the end of the file. Calculates the sum of numbers using a loop and tracks the number of them with a counter. Prints the average, and if no numbers are included, prints an "error" message.

### 6. Harmonic.java
- **Description:** Uses a for loop that iterates from 1 to the user-inputted number, accumulating the sum of reciprocals. Prints the result.

### 7. Digits.java
- **Description:** Iterates through the digits of a user-inputted number, calculates the sum, product, and average of the digits, and prints the result.

### 8. CoinToss.java
- **Description:** Uses a for loop to iterate through coin tosses, employing Math.random() for determining heads or tails. Calculates and prints probabilities of heads and tails.

### 9. RandomPointsInCircle.java
- **Description** Geterates and prints the random points inside the circle that its radius is 1 and center is (0,0). It uses Scanner class for obtaining the number of points.Random class is for generating random point within the range of [-1;1]. For loop is for iteration in "n" times and it checks each point that is inside the circle. If it is in, program prints this point in the "(x,y)" format.


# Week03

# Geometry Package
There are geometric entities exist in this package.

## 1. Point Class 
This class represents the point with (x, y) coordinates.
**Methods in this package:**
- `get(x)`: Retrieves the x-coordinate of the point.
- `getY()`: Retrieves the y- coordinate of the point.
- `setX(float x)`: Sets the x-coordinate of the point.
- `setY(float y)`: Sets the y-coordinate of the point.
- `translate(float dX, float dY)`: Translates the point by adding displacement to the coordinates.
- `distance(Point p)`: It calculates the distance between the current and another points.
- `equals(Point p)`: It is for checking the equality of points
**Constructors:**
- `Point()`: It is for initializing the constructors as default
- `Point(float x, float y)`: Initializes the point to the coordinates that are specified;
- `Point(Point p)`: it copies constructor and creates a new point as another point

# Segment Class
The `Segment` class represents a line segment defined by two endpoints.

**Constructors:**
- `Segment(Point p1, Point p2)`: Constructor initializes the segment's two points.
- `Segment(float x1, float y1, float x2, float y2)`: Initializes the segment's coordinates.

**Methods:**
- `getp1()`: It retreaves segment's first point.
- `getp2()`: It retreaves segment's second point
- `setp1()`: Sets the first point.
- `setp2()`: Sets the second point.
- `translate(float dX, float dY)`: Translates the segment's edpoints.
- `length()`: It is for calculation of the length of the segment.
- `equals(Segment s)`: Checks if the segment is equals to another segment.
- `getSlope()`: It is for calculation of the slope.
- `getIntercept()`: Computes y-intercept. 
- `isOnline(Point p)`: Checks if the point is on the line that contains segment.
- `isOnSegment(Point p)`: Checks if the point is on segment.

# invoice package
## 1.Invoice Class
The `Invoice` class represents the imformation about a invoice include part number, quantity, description and price per item by the use of methods for manipulation of information about the invoice
**Constructor:**
- `Invoice(String partNumber, String description, int quantityOfItem, double pricePerItem)`: Constructs an `Invoice ` object with the part number, description, quantity and price of items.
**Other Methods:**
- `getInvoiceAmount()`: Calculates and returns the total amount of the invoice (quantity * price per item).
## 2. InvoiceTest Class
The `InvoiceTest` class is responsible for testing the functionality of the `Invoice` class. It allows users to create invoice objects, set their attributes, and calculate the invoice amount.

# datetime package
## 1. CustomDate Class
There is a representation of a custom date with month, day and year and the class manimulates dates, calculates date differences and compares them.
**Constructor:**
 - `CustomDate(int month, int day, int year)`: It constructs the object named `CustomDate` with specific month, day and year.
 **Getter and setter methods:**
 - `getMonth()`, `getDay()`, `getYear()`methods are for retreaving and `setMonth(int month)`, `setDay(int day)`, `setYear(int year)`methods set the components of the date respectively.
 **Display Methods:**
 - `displayDate()`: Prints the date in the 'MM/DD/YYYY' format.
 - `displayFormatted()`: Prints the date in the format `DD Month YYYY`. 

 ## 2.CustomDateTest Class
 This class is for implementation of the processes that are in CustomDate Class. It reads two dates from the user, displays the dates in standard and formatted way, calculates and prints the difference of days between two dates and compares the dates and determines the chronological order.

# math package
## 1. ComplexNumber Class
The class include the representation and manipulation of complex numbers.
**Constructor:**
- `ComplexNumber(double real, double imag)`: It initializes the imaginary and real parts.
**Methods:**
- `equals(ComplexNumber number)`: Checks the equality of the complex number with the provided complex number.
- `toString()`: It returns the complex number in the "real + imag*i" form.
- `re()`: Returns the complex number's real part.
- `imag()`: Returns the complex number's imaginary part.
- `conjugate()`: Calculates the conjugate of the number by neglecting the imaginary part.
- `abs()`: Calculates absolute value of complex number.
-`add(ComplexNumber number)`,`sub(ComplexNumber number)`,`mult(ComplexNumber number)` are for arithmetic operations between provided and current complex number.
- `exponentiation(int n)`: Raises the complex number to the power of n.

## 2. ComplexNumberTest Class

The `ComplexNumberTest` class is a test application to demonstrate the capabilities of the `ComplexNumber` class.

**Functionality:**
1. Reads real and imaginary parts of a complex number from the user.
2. Performs addition, subtraction, and multiplication with predefined complex numbers.
3. Computes and displays the conjugate of the entered complex number.
4. Calculates the result of exponentiation for the entered complex number.






