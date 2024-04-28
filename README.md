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

# Week04
## Task 1
## Main Method
### Performs following tasks:
- Prints the command line arguments provided by user with the implementation of for loop that iterates through the integers and prints them in each iteration
- Converts comand-line arguments to integers and stores them in the array
- Calls `printIntArray` method and prints the integers that stored inside the array
- For calculation of sum of integers and printing it, main method calls the `Sum` method 
## Secondary Methods
###  `printIntArray(int[] array)`
This method prints the integers as an array.

### `Sum(int[] arrayIntegers)`
This method calculates and prints the sum of integers in an array with for loop. The function of for loop is its iteration until the length of array and adding all integers inside it to sum which is initialized as 0 at the beginning

## Task 2

### Main Method

The main method is the entry point of the program. It performs the following tasks:

- It checks if any command-line arguments are provided. If yes, it parses the integers from the arguments. Otherwise, it prompts the user to input the size of the array and its elements.
- After obtaining the array of integers, it calls three methods to calculate the maximum, minimum, and both minimum and maximum integers.
- Finally, it prints the results.

### Methods

#### `maximumInteger(int[] Integers)`

- This method takes an array of integers as input and returns the maximum integer in the array.
- It initializes the maximum variable with the first element of the array.
- It iterates through the array and updates the maximum variable if it finds a larger integer.
- Finally, it returns the maximum integer.

#### `minimumInteger(int[] Integers)`

- This method calculates the minimum integer in the array.
- It initializes the minimum variable with the first element of the array.
- It iterates through the array and updates the minimum variable if it finds a smaller integer.
- Finally, it returns the minimum integer.

#### `bothMinimumAndMaximum(int[] Integers)`

- This method calculates both the minimum and maximum integers in the array simultaneously.
- It initializes the minimum and maximum variables with the first element of the array.
- It iterates through the array and updates the minimum and maximum variables accordingly.
- Finally, it returns an array containing both the minimum and maximum integers.

### Usage

- To run the program, compile the `Task2.java` file and execute the generated class file.
- If providing command-line arguments, use the format: `java Task2 <integer1> <integer2> ...`.
- If not providing command-line arguments, follow the prompts to input the size of the array and its elements.

### Example

- Input: `java Task2 3 5 1 7 2`
- Output:
  - Maximum: 7
  - Minimum: 1
  - Both Minimum and Maximum: [1, 7]

## Task 3

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It initializes an `ArrayList` to store grades input by the user.
- It reads integers from the user until no more integers are entered, adding them to the `gradesList`.
- It converts the `gradesList` to an array of integers.
- It calls the `findMeanMedianAndMode` method to calculate the mean, median, and mode of the grades.
- It prints the mean, median, and mode of the grades.
- It calls the `calculateHistogram` method to calculate the histogram of the grades.
- It prints the histogram.

### Methods

#### `findMeanMedianAndMode(int[] numbers)`

- This method takes an array of integers as input and returns an array of doubles containing the mean, median, and mode of the numbers.
- It first sorts the array of numbers.
- It calculates the median by checking if the number of elements is even or odd and computing accordingly.
- It calculates the mean by summing up all the numbers and dividing by the total count.
- It calculates the mode by finding the most frequently occurring number in the array.
- It returns an array containing the mean, median, and mode.

#### `calculateHistogram(int[] grades)`

- This method takes an array of integers representing grades as input and returns an array representing the histogram of the grades.
- It initializes an array to store the frequency of each grade (histogram).
- It iterates through the grades array and increments the corresponding index in the histogram array.
- It returns the histogram array.

### Usage

- Compile the `Task3.java` file and execute the generated class file.
- Input the grades separated by spaces.
- After entering all grades, press `Enter`.
- The program will output the mean, median, and mode of the grades, followed by the histogram.

### Example

- Input: `85 90 75 85 90 80 75 85 90`
- Output: `Mean:83.33333333`
          `Median:85.0`
          `Mode:85`

## Task 4

### Main Method

The `main` method reads input from the user to create an adjacency matrix representing a graph. It performs the following steps:

1. Creates a `Scanner` object to read input.
2. Reads the number of vertices (`n`) and edges (`m`) from the user.
3. Initializes an `n x n` matrix to represent the adjacency matrix, setting all elements to 0.
4. Reads each edge from the user, updating the adjacency matrix accordingly.
5. Prints the resulting adjacency matrix to the console.
6. Closes the `Scanner` object.

### Usage

1. Compile the `Task4.java` file.
2. Execute the generated class file.
3. Input the number of vertices (`n`) followed by the number of edges (`m`).
4. Enter each edge in the format `vertex1 vertex2`.
5. After entering all edges, the program will print the resulting adjacency matrix.

### Example

Input:
`3 3`
`1 2`
`2 3`
`1 3`

Output:
`011`
`101`
`110`

## Task 5

### Main Method

The `main` method serves as the entry point of the program. It performs the following tasks:

1. Creates a `Scanner` object to read input from the user.
2. Instantiates an object of the `Task5` class to access its methods.
3. Reads the number of rounds to play from the user.
4. Calls the `playRounds` method of the `Task5` object, passing the number of rounds as an argument.
5. Closes the `Scanner` object to prevent resource leaks.

### Task5 Class

#### Fields

- `Random random`: Instance variable of type `Random` to generate random numbers for rolling dice.

#### Constructor

- `public Task5()`: Constructor method initializes the `random` field with a new instance of `Random`.

#### Methods

- `public int rollDice()`: Simulates rolling two dice and returns the sum of their values.
- `public boolean comeOutRoll(int roll)`: Checks if a given roll is a come-out roll (7 or 11).
- `public boolean crapsOut(int roll)`: Checks if a given roll results in crapping out (2, 3, or 12).
- `public boolean playRound()`: Simulates playing a round of the game of Craps. It handles come-out rolls, crapping out, and establishing points.
- `public void playRounds(int N)`: Plays a specified number of rounds of the game. It calls the `playRound` method for each round and prints the result.

### Usage

1. Compile the `Task5.java` file.
2. Execute the generated class file.
3. Enter the number of rounds to play when prompted.
4. The program will simulate playing the specified number of rounds of the game of Craps and display the results.

### Example

Input:
`5`

Sample output(Random):
`Round 1:`
`Come-out roll: 9`
`Point established: 9`
`Next roll: 7`
`Seven out! Player loses!`

`Round 2:`
`Come-out roll: 8`
`Point established: 8`
`Next roll: 5`
`Next roll: 9`
`Next roll: 8`
`Player wins!`
`Round 3:`
`Come-out roll: 4`
`Point established: 4`
`Next roll: 10`
`Next roll: 3`
`Next roll: 6`
`Next roll: 9`
`Next roll: 4`
`Player wins!`

`Round 4:`
`Come-out roll: 10`
`Point established: 10`
`Next roll: 6`
`Next roll: 7`
`Seven out! Player loses!`

`Round 5:`
`Come-out roll: 11`
`Player wins!`

## Task 6

### Sieve of Eratosthenes

The `Task6` program implements the Sieve of Eratosthenes algorithm to find prime numbers up to a given limit `n`.

#### `sieve(int n)`

- This method takes an integer `n` as input and returns a list of prime numbers up to `n`.
- It initializes a boolean array `isPrime` of size `n + 1`, where each element represents whether the corresponding number is prime.
- It marks all numbers from 2 to `n` as prime initially.
- It iterates from 2 to the square root of `n`, marking multiples of each prime number as not prime.
- It collects all prime numbers into a list and returns it.

### Main Method

The `main` method reads an integer `n` from the user and prints all prime numbers up to `n`.

### Usage

1. Compile the `Task6.java` file.
2. Execute the generated class file.
3. Enter an integer `n` to find all prime numbers up to `n`.
4. The program will output the prime numbers up to `n`.

### Example

Input:
`30`
Output:
`Prime numbers up to 30: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]`

## Task 7

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads a string input from the user using `scan.nextLine()`.
- It calls the `reverseString` method and passes the input string to it.
- It prints the reversed string.
- It closes the scanner.

### Methods

#### `reverseString(String input)`

- This method takes a string input and returns the reversed version of the input string.
- It initializes a `StringBuilder` named `reversedBuilder` to store the reversed string.
- It iterates through the characters of the input string from the end to the beginning.
- Within the loop, it appends each character to the `reversedBuilder`.
- After iterating through all characters, it converts the `StringBuilder` to a string using `toString()` method and returns it.

### Usage

- Compile the `Task7.java` file and execute the generated class file.
- Input the string you want to reverse.
- The program will output the reversed string.

### Example

- Input: `"Hello"`
- Output: `"olleH"`

## Task 8

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads a string input from the user using `scan.nextLine()`.
- It calls the `explodeAndPrint` method and passes the input string to it.
- It closes the scanner.

### Methods

#### `explodeAndPrint(String input)`

- This method takes a string input and prints substrings obtained by progressively adding characters from the input string.
- It initializes a `StringBuilder` named `substr` to store each substring.
- It iterates through the characters of the input string.
- Within the loop, it appends the current character to the `substr`, prints the resulting substring, and then prints a newline.
- This process continues until all characters in the input string have been processed.

### Usage

- Compile the `Task8.java` file and execute the generated class file.
- Input the string from which you want to generate substrings.
- The program will output each substring obtained by progressively adding characters from the input string.

### Example

- Input: `"abc"`
- Output: `"aababc"`

## Task 9

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads a string input from the user using `scan.nextLine()`.
- It calls the `sortString` method and passes the input string to it.
- It closes the scanner.

### Methods

#### `sortString(String input)`

- This method takes a string input and sorts its characters in ascending order.
- It converts the input string to a character array using `toCharArray()` method.
- It sorts the character array using `Arrays.sort()` method.
- It iterates through the sorted character array and prints each character.

### Usage

- Compile the `Task9.java` file and execute the generated class file.
- Input the string you want to sort.
- The program will output the sorted characters of the input string in ascending order.

### Example

- Input: `"cba"`
- Output: `"abc"`

## Task 10

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads two strings, `word1` and `word2`, from the user using `scanner.nextLine()`.
- It calls the `areAnagrams` method with `word1` and `word2` as arguments.
- If the `areAnagrams` method returns `true`, it prints "YES". Otherwise, it prints "NO".
- It closes the scanner.

### Methods

#### `areAnagrams(String word1, String word2)`

- This method takes two strings, `word1` and `word2`, and checks if they are anagrams of each other.
- It converts both strings to character arrays using `toCharArray()` method.
- It sorts both character arrays using `Arrays.sort()` method.
- It returns `true` if the sorted character arrays are equal using `Arrays.equals()` method. Otherwise, it returns `false`.

### Usage

- Compile the `Task10.java` file and execute the generated class file.
- Input two strings, `word1` and `word2`, separated by newlines.
- The program will output "YES" if the strings are anagrams of each other, and "NO" otherwise.

### Example

- Input:`listen`
        `silent`
- Output:`"YES"`
- Input: `hello`
         `world`
-Output: `"NO"`

## Task 11

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads a sentence input from the user using `scan.nextLine()`.
- It calls the `swapFirstAndLastLetter` method and passes the input sentence to it.
- It prints the modified sentence obtained after swapping the first and last letters of each word.
- It closes the scanner.

### Methods

#### `swapFirstAndLastLetter(String sentence)`

- This method takes a sentence as input and swaps the first and last letters of each word in the sentence.
- It initializes a `StringBuilder` named `modifiedSentence` to store the modified sentence.
- It splits the input sentence into words using the regular expression `\\s+`, which matches one or more whitespace characters.
- It iterates through each word in the sentence.
  - If the word is not empty, it retrieves the first and last characters of the word.
  - It appends the last character, followed by the substring of the word excluding the first and last characters, and then the first character to the `modifiedSentence`, separated by a space.
  - If the word is empty, it appends a space to the `modifiedSentence`.
- It trims any leading or trailing whitespace from the `modifiedSentence`.
- It returns the modified sentence as a string.

### Usage

- Compile the `Task11.java` file and execute the generated class file.
- Input the sentence you want to modify.
- The program will output the modified sentence where the first and last letters of each word are swapped.

### Example

- Input: `"hello world"`
- Output: `"oellh dlrow"`

## Task 12

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads two strings, `string` and `sub`, from the user using `scan.nextLine()`.
- It calls the `findSubstringIndex` method with `string` and `sub` as arguments.
- If the `findSubstringIndex` method returns a valid index, it prints the index. Otherwise, it prints "-1".
- It closes the scanner.

### Methods

#### `findSubstringIndex(String string, String sub)`

- This method takes two strings, `string` and `sub`, and finds the index of the first occurrence of the substring `sub` in the string `string`.
- It iterates through the characters of the string `string`, starting from index 1.
- Within the loop, it checks if the substring of `string` starting from the current index and having the same length as `sub` matches `sub` using `regionMatches()` method.
- If a match is found, it returns the current index.
- If no match is found, it returns -1.

### Usage

- Compile the `Task12.java` file and execute the generated class file.
- Input the string and the substring you want to search for.
- The program will output the index of the first occurrence of the substring in the string, or "-1" if the substring is not found.

### Example

- Input: `banana`
- Output: `"2"`

## Task 13

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads a word input from the user using `scan.nextLine()`.
- It calls the `printingAllSlices` method and passes the input word to it.
- It closes the scanner.

### Methods

#### `printingAllSlices(String word)`

- This method takes a word as input and prints all possible slices of the word.
- It iterates through the characters of the word, starting from index 1.
- Within the loop, it extracts two substrings from the word: the first slice from index 0 to the current index, and the second slice from the current index to the end of the word.
- It prints the combination of the first and second slices.
- After the loop, it prints the original word.
- This method effectively prints all possible prefix-suffix pairs of the word.

### Usage

- Compile the `Task13.java` file and execute the generated class file.
- Input the word for which you want to print all slices.
- The program will output all possible prefix-suffix pairs of the word.

### Example

- Input: `"hello"`
- Output: `"h ello"`
          `"he llo"`
          `"hel lo"`
          `"hell o"`
          `"hello "`

## Task 15

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads the number of invoices from the user using `scan.nextInt()`.
- It consumes the newline character after reading the integer input using `scan.nextLine()` to prepare for reading the invoice details.
- It initializes an array of `Invoice` objects with the size specified by the user.
- It iterates through each invoice:
  - It reads the part number, description, quantity of item, and price per item for each invoice from the user.
  - It creates a new `Invoice` object with the provided details and stores it in the array.
- It iterates through the array of invoices and prints the invoice amount for each invoice using `getInvoiceAmount()` method.
- It closes the scanner.

### Usage

- Compile the `Task15.java` file along with the `Invoice` class (it's defined in `week03.invoice` package).
- Execute the generated class file.
- Input the number of invoices followed by the details of each invoice as specified by the prompts.
- The program will output the invoice amount for each invoice.

### Example

- Input: 
`2`
`ABC123`
`Widget`
`2`
`10.5`
`XYZ456`
`Gadget`
`3`
`20.75`

- Output: 
`21.0`
`62.25`

## Task 16

### Main Method

The `main` method is the entry point of the program. It performs the following tasks:

- It creates a `Scanner` object to read input from the user.
- It reads the number of points from the user using `scanner.nextInt()`.
- It consumes the newline character after reading the integer input using `scanner.nextLine()` to prepare for reading the point details.
- It initializes an array of `Point` objects with the size specified by the user.
- It iterates through each point:
  - It reads the x-coordinate and y-coordinate for each point from the user.
  - It creates a new `Point` object with the provided coordinates and stores it in the array.
- It initializes four `Point` objects to store the extreme points (northernmost, southernmost, westernmost, easternmost) and assigns the first point in the array to each extreme point initially.
- It iterates through the array of points and updates the extreme points if a point with a higher/lower y-coordinate (for northernmost/southernmost) or x-coordinate (for westernmost/easternmost) is found.
- It calls the `printExtremePoints` method for each extreme point to print the points with the same x-coordinate or y-coordinate as the extreme point.
- It closes the scanner.

### Methods

#### `printExtremePoints(Point[] points, float value)`

- This method takes an array of points `points` and a float value `value` (representing either x-coordinate or y-coordinate of an extreme point) as input.
- It iterates through the array of points.
- Within the loop, it checks if the x-coordinate or y-coordinate of each point matches the provided value.
- If a match is found, it prints the coordinates of the point.

### Usage

- Compile the `Task16.java` file with the `Point` class (it's defined in `week03.geometry` package).
- Execute the generated class file.
- Input the number of points followed by the coordinates.
- The program will output the extreme points (northernmost, southernmost, westernmost, easternmost) and the points with the same x-coordinate or y-coordinate as each extreme point.

### Example

- Input:
`5`
`1.0 2.0`
`3.0 4.0`
`5.0 6.0`
`7.0 8.0`
`9.0 10.0`

- Output:
`(1.0, 2.0)`
`(3.0, 4.0)`
`(5.0, 6.0)`
`(7.0, 8.0)`
`(9.0, 10.0)`
`(1.0, 2.0)`
`(9.0, 10.0)`
`(1.0, 2.0)`
`(9.0, 10.0)`
`(1.0, 2.0)`
`(9.0, 10.0)`
`(1.0, 2.0)`

## Task 17

### Main Method

- The `main` method is the entry point of the program.
- It initializes a `Scanner` object to read input from the user.
- Reads the number of segments from the user using `scanner.nextInt()`.
- Consumes the newline character after reading the integer input.
- Initializes an array of `Segment` objects with the size specified by the user.
- Iterates through each segment:
  - Reads the coordinates for each point of the segment from the user.
  - Creates a new `Segment` object with the provided coordinates and stores it in the array.
- Calls the `findSegmentsWithMinimumLength` method to find segments with the minimum length.
- Outputs the segments with the minimum length.

### `findSegmentsWithMinimumLength(Segment[] segments)` Method

- This method takes an array of `Segment` objects `segments` as input.
- It iterates through the array of segments to find the minimum length.
- It keeps track of the minimum length and the count of segments with that length.
- Then, it creates an array to store the segments with the minimum length and fills it with those segments.
- Finally, it returns the array containing segments with the minimum length.

### Usage

- Compile the `Task17.java` file along with the `Segment` class (assuming it's defined in `week03.geometry` package).
- Execute the generated class file.
- Input the number of segments followed by the coordinates of each segment as specified by the prompts.
- The program will output the segments with the minimum length.

### Example

- Input:
`3`
`0.0 0.0 2.0 2.0`
`1.0 1.0 3.0 3.0`
`2.0 2.0 4.0 4.0`
- Output:
`(0.0, 0.0) - (2.0, 2.0)`
`(1.0, 1.0) - (3.0, 3.0)`
`(2.0, 2.0) - (4.0, 4.0)`

## Task 18
In this task I included `toString()` method to every class in week03. **Therefore I did not included week03 into git ignore file** 

### `toString()` Method Explanation

The `toString()` method in Java provides a way to convert an object into a string representation. It's like giving each object a way to describe itself in words.

#### Why It's Useful

When you call `toString()` on an object, it gives you a string that tells you about the object's attributes. This can be helpful for debugging, logging, or just understanding what an object contains.

#### How It Works

1. **Creating a String**: Inside the `toString()` method, a `StringBuilder` is often used to build the string efficiently.

2. **Adding Object Information**: The method adds information about the object's attributes to the string, like its part number, description, quantity, and price in the case of an Invoice object.

3. **Returning the String**: Finally, the method returns the constructed string.

#### Example

If you call `toString()` on an Invoice object, it might give you a string like "Part Number: 12345, Description: Widget, Quantity: 5, Price: $10.50".

#### Benefits

Implementing `toString()` makes it easier to understand and work with objects in Java code.

# Week05 
## Task 1 
When we create instance of `Y`. we call the constructor of `Y`. Before the execution of `Y`'s constructor, another constructor in the super class `X` invokes to the execution which is automatically inserted as default constructor of the super class. Thus, this constructor called first and prints "In constructor X.". After this, the constructor of `Y` subclass involves execution and prints "In constructor Y.".
This is one of the main concepts of Java inheritance that, the constructors of subclasses and superclasses are called in hierarchical order which means that super class constructor always involves the execution initially.

## Task 2
The program implements several classes. Class A is a super class and class B is a sub class or extension of the A class. When we run the program, it prints like in the sequence below:
`In static init block of A`
`In static init block of B`
`In instance init block of A`
`In constructor A.`
`In instance init block of B`
`In constructor B.`
First, the static initialization blocks are executed, because they are in class level and with the class itself, the blocks are loaded to Java Virtual Machine before the creation of the instances of classes. Also they are sequentially printed because their sequential initialization: First static block A and second static block B.

On the other hand, instance intialization blocks are executed after static ones in the period of creation of instance. They are responsible for performation of actions that are specific to every object.

Finally, the constructors are called after static and instance blocks have been executed. The constructors are responsible for ensurance of the complete initialization of object.

## Task 3
In this code, there are two concepts called method overriding and overloading. The `calcValue(int a)` method in the `Parent` class overridden in the `Child` class which is subclass of `Parent` class. In the concept of method overriding, the specific implementation of the method that is overridden is applied in subclass. Also the method overloading happened in the same method. So the `calcValue(int a)` method in the super class is overloaded with different parameters in the `Child` subclass like `calcValue(int a, int b)`. 

After the creation of instance by constructor `Child()`, the `child.calcValue(5)` is called and the method in Parent class invokes to the execution and prints:
`Super`
`10`
Then the `child.calcValue(5,10)` is called which obtains two arguments in the `Child` class. It means that the method in `Child` class is overridden and it has two arguments passed to the method call. After execution, it prints:
`Subclass`
`30`

## Task 4
The code defines class `A` and `GeneralType` (second one is subclass of first one). There are static blocks, instance initialization blocks and special constructors in these classes. The output of the code is:
`AS`
`GTS`
`A`
`5 AC`
`GT`
`GTC`
1) Lets look at the output. The first printed one is `AS` which is inside the static block as it is explained that these blocks are executed initially when the class is loaded.

2) `GTS` is also inside static block of subclass `GeneralType`, so it comes next. 

3) So, for code's executability and for observation of the output, I added the instance `GeneralType obj = new GeneralType();` in the main class that I created and it is calling for the constructor `GeneralType`. The constructor of `GeneralType` first implicitly calls `super();` which invokes the no-argument constructor of class `A`. This results in printing `A`. 

4) Then the `super(5);` statement inside the constructor parametrized constructor of class `A` with `5`. The result is `5 AC`

5) After that, in the constructor of `A`, the instance initialization block `{ System.out.println("A"); }` is executed, printing `A`.

6) Then, in the constructor of `GeneralType`, the instance initialization block `{ System.out.println("GT"); }` is executed, printing GT.

7) Finally, in the constructor of `GeneralType`, `System.out.println("GTC");` is executed, printing `GTC`.

## Task 5
Inheritance is a speciality of Java and also OOP that by which one sub class can inherit the properties of its super class. There are different types of inheritance:
1) Single Inheritance: This type occurs when one subclass inherits the qualities from only one super class:
```java
class A{

}
class B extends A{

}
```
It is as simpla as above. Only one bound between classes

2) Multi-level inheritance: We have several classes that have parent-child relationship with each other in particular way. For example:
```java
class A{

}
class B extends A{

}
class C extends B{

}
```
3) Hierarchical inheritance: This structure refers to the situation where a super class can have multiple sub classes and it forms hierarchical structure. For example:
```java
class A{

}
class B extends A{

}
class C extends A{

}
```
In this simple example, B and C are the derivations of A superclass which is especially defined as hierarchical inheritance.
4) Multiple inheritance: This is some kind different. Here, one or many subclasses can inherit properties of multiple super classes at the same time. This is not directly supported in java because of the "diamond problem". For example:
```java
class A {
  void method(){
    System.out.println("class A");
  }
}

class B extends A {
  void method() {
          System.out.println("class B");
      }
}

class C extends A {
   void method() {
          System.out.println("class C");
      }
}

class D extends B, C { // This line causes compilation error in Java
}
```
The compiler can not know which classes' method to use. This challenges the compiler to choose the correct method to call. 
5) Hybrid inheritance: This is a type of inheritance that collects characteristics of another different inheritance types. For example:
```java
class A{

}
class B{

}
class C extends A{

}
class D extends B{

}
class E extends C{

}
```
In this example, we can see the combination of single and multilevel inheritance types which creates hybrid inheritance structure.


## Task 6
In the code, the `ClassB` extends `ClassA` which means that `ClassB` inherits properties of `ClassA`. There are several methods in each class. The `methodTwo(int i)` is overridden in `ClassB` and the `methodOne(int i)` and `methodThree(int i)` hide the same named methods in `ClassA` , however, they are in different static or instance nature. Particularly, `methodFour(int i)` hides the static method `methodFour(int i)` of `ClassA`.

## Task 7 
The initialization of methods in static type is their class level behavior that they are loaded into the memory once and it is efficient for memory saving. Additioanlly, static methods are effective for higher performance that they are resolved in compile time.

## Task 8
This program represents several classes: `Person`, `Teacher`, `Student`, and `PhdStudent`. There are specific attributes in every class like first name, last name, gender, and additional attributes that are specific for some of them. There is a strong inheritance in this code(single, hierarchical and multilevel). All of the classes extend to `Person` which is a direct representation of hierarchical structure. Single one is also between each sub class and super class. Another type of inheritance called multilevel one is associated between `Student`, `PhdStudent` and `Person` classes.

## Task 9
In the code, ther are different OOP aspects:
1) Inheritance - The class `Account` extends `Customer` class and inherits properties
2) Method Overriding - The `toString` method overridden in both classes for representation of objects in a string format
3) Constructor Overloading - The class `Account` have multiple constructors which is the aspect of overloading with different parameters.
4) Encapsulation - I think as the main aspect of OOP, the instances that are defined as private are encapsulated and with getter and setter methods, they are accessable.

## Task 10
As it is required in this task, I overridden the methods `toString()` and `equals()` in week03.geometry, in Point and Segment classes.

## Task 11
The `Rectangle` class defines attributes which are the width and heigth of rectangles. There is an overriding process of `equals()` method for comparison of dimensions of rectangles. 

## Task 12
The `Square` class extends to `Rectangle` class as explained previously. It has properties of `Rectangle` class and it adopted them by `super()` keyword. As discussed in the previous explanation, there is an ongoing comparison of dimension of rectangles and also the square.


# Week06

## Task 4
We implemented `clone()` method for copying objects of `Rectangle` class. The declaration of `clone()` method in protected access modifier ensure its visibility as protected from the outside of `Object` class and restricts the access from outside classes. This method represents encapsulation. Protected is the best option. For example if we become more restrictive like we use `private`, we can not be able to override it in subclasses.

## Task 5
The implementation of `clone()` method in the `Point` and `Segment` classes is the shallow clone because the objects are cloned and the references of objects are copied, not the objects themselves. To fix this, we can consider deep cloning. For example:
For `Point`:
```java
@Override
protected Point clone() {
    try {
        Point clonedPoint = (Point) super.clone();
        return new Point(this.x, this.y);
    } catch (CloneNotSupportedException e) {
        throw new Error("This can't happen!");
    }
}
```
For `Segment`:
```java
@Override
protected Segment clone() {
    try {
        Segment clonedSegment = (Segment) super.clone();
        clonedSegment.p1 = this.p1.clone();
        clonedSegment.p2 = this.p2.clone();
        return clonedSegment;
    } catch (CloneNotSupportedException e) {
        throw new Error("This can't happen!");
    }
}
```
When we clone the `Segment` and `Point` objects, new instances of them are created with the exactly same coordinates and ensures deep cloning. And it means that the changes do not affect original objects.
## Task 6
As the first step, we need to import `Point` and `Segment` classes from `week03` because we will work with these class. Then we create Movable interface which contains 4 methods. For the application of `Point` class, we create `MovePoint` class which implements Movable interface and apply all methods on the `point` member of `Point` class by overriding the methods and also we do the same thing for `Segment` class in the `week03`. As the next step, we create `Circle` class which has radius and coordinate instances and we implement interface methods in it. At the testing process, we scan variables and first execute the `Circle`. Then we create array of `movableObjects` and fill it with `Point`, `Segment` and `Circle` classes. As the last stage, we create method `moveAllOfThem` for the instructions that manages the points in specific direction. We implement this method by putting the input objects and direction in string format.

## Task 7
Initially, we create interface `Resizable` with method resize. We override this method in subclasses of abstract class `Shape`. Then, we declare `Shape` class with its attributes, constructors, getter setter and additional methods for functionality. There are abstract methods that their functionality is performed in sub classes of abstract class. The `circle`, `rectangle` and its subclass `square` have their pecuilar functionality, however they are related to each other because of the attribute dependence. We find the area of the circle in the `getArea()` method by the formula pi* radius ^2. The perimeter is the circumstance of the circle with formula 2*pi* radius. And the rectangle and square are similar to each other. `Square` is subclass of `Rectangle` super class, for this, we have an access to `Rectangle` properties with `super()` keyword. We also should override `toString` method because it is repeatedly declared in every class.

## Task 8
We import classes `Scanner` and `BigInteger`. `BigInteger` class is for the implementation of problems that can be revealed by limitation. We can work with this class for unlimited functionality. We scan integers and create methods for the calculuation of factorial and the power. 
`BigInteger factorial = BigInteger.ONE` this statement represents the integer value `1` for calculation of factorial.

## Task 9
We implement `BigDecimal` class by importing it. It is very dimilar to the function of `BigInteger` class but it performs calculations on the decimal point values. It is very useful in the dealing with calculations of decimal point values for high precision.

## Task 10
The provided code in the exercise is the representation of one of the Binary operation type adding. It implements the sum of 3 objects that are created in the main class. It is required to create another operations - subtraction, multiplication and division. I created the methods which are very similar to `Sum` method but their functionality is different. Then I created Unvary operator abstract class as it is required. I established some methods like `SquareRoot` and `Factorial` methods as unary operations. Then I implemented all of these methods in the main class. With the help of only 1 interface, we can easily implement different operations. 

# Week07

## Task1
I simply used `try` and `catch` blocks to handle the exception and to ignore the error for the normal flow of the code. 

## Task2
I used `try` and `catch` blocks for showing the `IllegalArgumentException` error. When the user include negative number, the program automaticly says `Negative input is included`. Also it is not mandatory to use `try` and `catch`. And handling exceptions in the main method allows programmer to catch and handle these exceptions before they cause your program to terminate unexpectedly. So the reason I think is that, it guarantees the code's reliability and robustness

## Task3 
I copy pasted `Invoice` class from `week03` folder and modified its methods. I included the `IllegalArgumentException`. If the quantity and the price of item is negative, the program will show the message that `Quantity cannot be negative` and `Price per item cannot be negative` relatively

## Task4
I copied `Customer` and its subclass `Amount` classes from week05 folder and I changed functionality. I created `InvalidAmountException` for handling the error. If included withdraw amount is more than the balance, the program shows the message: `Withdrawal amount cannot be more than the balance`

## Task5
In the code provided, I included `IllegalArgumentException` to the `createUser` method. If the roles is null or empty, this exception will be executed by the help of included catch block in the main method. 

## Task6
In the code, I included `try` and `catch` blocks inside while loop for checking if the input is number or not by `NumberFormatException`. If there is a such kind of non-integer character, the program ignores the non-integer and calculates the result of numbers included.

# Week08
## Task1
I created several lists named as `shoppingList`, `newShoppingList` and linked list named as `newLinkedList` and added particular elements to them. Then I implemented several functions like printing, removing element at index, removing particular element, checking function and etc c.

## Task2 
First I created `number` list and added random number in unsorted order. Then I implemented several methods like `Collections.sort()` and `List.sort()` for sorting the list. Also I implemented `Comparator` interface by using anonymous and concrete classes.

## Task3 
For the representation of full name, I created `Account` class which implements `Comparable` interface. I created, fields, constructor and getter methods. Then I overriden `toString()` method for the suitable output representation. I overriden `compareTo()` method for comparing fields. In the main method I initialized List and added some names, surnames and account amounts. I printed and sorted the elements with `for-each` loops. For sorting balance, I used from `Comparator` interface.

## Task4
i. We can ensure the retainment of the order in the process of elimination of duplicates by using `LinkedHashSet`. This maintains the order of the input or elements unlike `HashSet`. 
ii. For this, I used `TreeSet` because it is for automatical sorting the elements in normal order(if it is string, it is alphabetical order). 
For example, when I included 3 names, printing process of `LinkedHashSet` will be based on insertion order, while `TreeSet` will ensure alphabetical order.

## Task5
The code solves the problem for queue. The `bread` array represents the wanted number of breads for each person. `totalBreads` shows the total number of breads in the store. `calculateNumber` method is the key factor for this code. In this code, the queue is instansiated by using `Queue`. The method iterates though the list for checking if there is enough bread in the market. If not, it breaks loop and returns the number of persons can buy bread from store. However, it is not for finding the maximum possibility of selling or the maximum number of people can buy bread. In the next code, I will implement this.

## Task6
This code is similar to previous task except usage of `PriorityQueue`. This is for special functionality which gives the maximum number of persons that can buy bread from store. As `Queue`, we should also import it for using.

# Week09
## Task1 
The code defines a `Task` class representing tasks with attributes like name, priority, and duration. It implements the `Comparable` interface to enable comparison based on priority. In the `Main` class, a `PriorityQueue` is created to store tasks. Tasks are added to the queue and iterated through in priority order. Each task is completed within the available time, and the completed tasks are printed. The total time spent on tasks is compared to the available time.

Variant d involves comparing the total time spent on tasks to the available time. If they are equal, it indicates efficient utilization of available time. If they are not equal, it suggests discrepancies in task completion or durations.

## Task2
I created in the code two `LinkedLists`, each with 1000 random integers. Method 1 adds integers in sorted order, while Method 2 adds all integers and sorts the list afterward. Both methods measure construction time in milliseconds. The `addInSortedOrder` method ensures sorted insertion by iterating through the list to find the appropriate position for each integer.

## Task3
The code takes a hardcoded string "hello" and prints each character along with its indexes in ascending and descending order. It uses a `TreeMap` to store characters as keys and their indexes as values, ensuring alphabetical ordering. Then, it iterates over the map and prints each character followed by its indexes.

## Task4
This code provides methods to find the most and least frequent characters in a given input string. It employs a caching mechanism to store the character frequencies for each input string, ensuring that subsequent calls with the same input utilize cached results. The `mostFrequentCharacter` method returns the character with the highest frequency, while the leastFrequentCharacter method returns the character with the lowest frequency. Both methods use a nested `HashMap` to store the frequency of each character in the input string.

## Task5
This Java code provides a method to find the unique characters in a given input string. It uses caching mechanism to store the unique characters for each input string, improving efficiency by avoiding redundant calculations for repeated inputs. The `uniqueCharacters` method returns the set of unique characters, either retrieving it from the cache or calculating it if not already cached.

# Week10
## Task1
This Java code defines a class `Generics` with generic methods for array manipulation like printing, finding middle and maximum elements, sorting, and swapping. The `Task1` class contains the `main` method, which prompts the user to input values for arrays of different types (integers, doubles, strings, tasks, points). These values are stored in corresponding arrays using a `Scanner`. Finally, the generic methods from `Generics` are used to print the arrays.

## Task2
In this java code, I creaated `Generics` class for establishment of different methods like `reciprocal()`, `fraction()`, `absValueOfDouble()`, and `absValueOfFloat()`. In main code, I employed `Scanner` class for getting value from user and implemented the methods.

## Task3
In this Java code, I created a `Pair` class using generics to establish a container for holding pairs of different types. In the `Task3` class, I employed the `Scanner` class to collect user input for creating two pairs, each consisting of a pair of items and an optional comment. After gathering the user input, I instantiated the pairs (pair1 and pair2) using the values provided by the user. Finally, I printed out the created pairs along with their comments.

## Task4
In this Java code, I've created a `Task4` class representing bank accounts and implemented a generic method `countElementsWithProperty` to count elements in a collection based on a specified property checker. Three test methods (`testEvenIntegers`, `testPalindromeStrings`, and `testEmptyAccounts`) demonstrate the functionality of the countElementsWithProperty method. Using the PropertyChecker interface and its implementations (`EvenIntegerChecker`, `PalindromeStringChecker`, `EmptyAccountChecker`), elements are evaluated against specific properties. Finally, the `main` method invokes the test methods and prints the results.

## Task5
In this Java code, I've created a `Task5` class representing a generic stack implementation with methods for pushing, popping, and peeking elements. It also includes custom exception classes `StackFullException` and `StackEmptyException` for handling full and empty stack conditions.

I've included a main method within the `Task5` class to demonstrate its functionalities. The main method creates an instance of `Task5` for integers, pushes elements onto the stack, attempts to push onto a full stack, then pops and peeks elements while handling exceptions for empty stack conditions.

# Week11
## Task1 
b. The output is compilation error. The error associates with the code in the `catch` and `finally` blocks of the testFinally() method. Output will be like this:
`Exception in thread "main" java.lang.Error: Unresolved compilation problem: Unreachable catch block for ExceptionDemo1. This exception is never thrown from the try statement body`
`at week11.FinallyDemo.testFinally(FinallyDemo.java:14)`
`at week11.FinallyDemo.main(FinallyDemo.java:5)`

c. I modified `ExceptionDemo1` with `Exception4` for being compatible with the try block. Another issue is in `finally` block. We can not throw an exception from `finally` block which can hide the exception handling inside `try` and `catch` above. For this, I created nested blocks that I handled the exception inside `finally` with `try-catch` block.

d.In the modified code, the output will be throwing all of the exceptions that are catched:
`week11.ExceptionDemo3`
        `at week11.Task1.testFinally(Task1.java:19)`
        `at week11.Task1.main(Task1.java:6)`
`week11.ExceptionDemo2`
        `at week11.Task1.testFinally(Task1.java:16)`
        `at week11.Task1.main(Task1.java:6)`

## Task2
In this Java code, I've created a `Task2`. The main method demonstrates various file operations:

a. Storing the string "Java" in a file named "output.txt" using `FileOutputStream`.
b. Checking the content of the file by printing it line by line using `BufferedReader`.
c. Reading the content of the file using `FileInputStream`:

i. Using the `read()` method to read the content of the file byte by byte and appending it to a `StringBuilder`.
ii. Using the `read(byte[])` method to read the content of the file into a byte array (`b`) and then converting the byte array to a string, appending it to a `StringBuilder`.
Each step is followed by closing the respective streams to release system resources.

The main difference between `read()` and `read(byte[])` is that The read() method reads one byte at a time, while the `read(byte[])` method reads multiple bytes at once into a byte array.

## Task3
The classes are `FileInputStream`, `FileOutputStream`, `FileReader` and `FileWriter`. For duplication, we first read the original file and write the content to the duplicate file. 

I duplicated the content into `duplicate_output.txt` file 

## Task4
In this code, I've created a file named "test.txt" with the content "Coding!". I then read the file twice: once character by character using the `read()` method and once using the `read(char[]) method`. I store the content in a `StringBuilder`. Finally, I print out the content read using the `read(char[])` method.

The main difference is that `read()` method reads one character at a time, while `read(char[])` is able to read multiple characters into buffer array.

## Task5
The purpose is to efficiently read text from the file by buffering the input, reducing I/O operations and improving performance.

Wrapping one stream object in another adds functionality and efficiency. In this case, it adds buffering capability, improves reading performance, and provides convenient methods for handling character-based input.

## Task6
In this code, I've defined a `Person` class with `name` and `age` attributes, along with methods for accessing and modifying them. Within the `Task6` class, I've implemented methods for saving an array of Person objects to a binary file using `ObjectOutputStream`, and for reading and printing these objects from the file using `ObjectInputStream`. In the main method, I've initialized an array of Person objects, saved them to a file named "persons.bin", and then read and printed them back.

In the provided code, I do not explicitly use the EOF (End of File) indicator. However, the code relies on EOFException, which is thrown by ObjectInputStream when it reaches the end of the stream while reading objects.

To ensure that all persons are read from the file, I use a null sentinel value. 

## Task7
In the `Task7` class, I've implemented two methods for file system traversal and information retrieval.

With the `printFileInfo(String path)` method, I print details about a specified file or directory, such as its name, path, size, and permissions.

Using the `traverseDirectory(String path)` method, I recursively traverse directories starting from the given path, printing information for each file and directory encountered.

In the main method, I specify a directory path to begin the traversal process.

## Task8

I create a Java program that performs various operations on a file containing random integers. First, I generate a file with a specified number of random integers. Then, I read and print all integers from the file. After that, I print a specified number of integers starting from a given offset in the file. Finally, I print them of integers in reverse order from the end of the file. Each operation is performed using a RandomAccessFile, allowing for efficient reading and manipulation of the file's contents.

## Task9 
I created `persons.csv` file and added information of persons like their names, surnames, IDs and ages. Then in the code, I read this file, skipping the header row. For each row of data, I create a `PersonCSV` object with `ID, first name, last name, and age`, storing these objects in a list. Then, I calculate the average age of all people in the list. I iterate through the list again, categorizing people into two groups: those with ages below the average and those with ages above the average. Finally, I write the information of people in each group to separate CSV files named "under_average_age.csv" and "above_average_age.csv". If any errors occur during file reading or writing, I print the stack trace for debugging.

# Week12
## Task1
First, I create `AFuncInt`(a functional interface) in the beginning of code with 3 methods: abstact `apply`, and two overloaded void return type `print` methods that get String variables and print them. Then, in the main method, I create an instance of anonymous class and also used lambda expressions to implement the interface separately. The output is not the same, because I included the implementation of abstract method of interface inside lambda expression unless it was not included in the instantiation with anonymous class.

## Task2

I created a `SpecificProperty` interface with a `check` method that returns a boolean. It allows me to define custom conditions to evaluate different data types like `Point` and `Person`.

In the `Utility` class, I added a `filter` method that takes a collection and a `SpecificProperty`, then returns a new collection with elements that meet the condition defined by `SpecificProperty`.

In the `Task2` class, I used lambda expressions to create specific conditions:

* `isOdd1` checks if a number is odd.
* `isInFirstQuadrant` checks if a `Point` has positive x and y.
* `isPangram` checks if a string contains every letter from 'a' to 'z'.
* `isOlderThan20` checks if a `Person` is older than 20.

I tested these conditions in the main method and used `filter` to get odd numbers from a list of 1 to 10. This code snippet showcases how to use lambda expressions, functional interfaces, and custom conditions to manipulate collections.

## Task3
I created the `Calculator` functional interface with a method `calculate(double a, double b)`. This method returns a double result based on the input parameters. In the main class, I defined lambda expressions to implement common mathematical operations.

First, I created lambdas for addition, subtraction, multiplication, division, and exponentiation:

* `addition`: returns the sum of two numbers.
* `subtraction`: returns the difference between two numbers.
* `multiplication`: returns the product of two numbers.
* `division`: returns the quotient of two numbers.
* `exponentiation`: returns the result of one number raised to the power of another.

Then, I used these lambda expressions to perform calculations and printed the results:

* Addition of 1 and 2 gave 3.
* Subtraction of 2 from 4 resulted in 2.
* Multiplication of 3 by 4 produced 12.
* Division of 4 by 2 resulted in 2.
* Exponentiation of 2 to the 4th power gave 16.

This approach demonstrates how lambda expressions can be used to implement functional interfaces and perform various calculations in a concise manner.

## Task4
First, I create a `Supplier` to generate a list of numbers from 1 to 10. Next, I use a `Function` to square each number in the list, collecting the results in a new list. Then, I create a `Predicate` to check if a number is even and use a `Consumer` to print out even numbers from the squared list.

Finally, I use another `Consumer` to print all squared numbers in the list. This is done with a lambda expression that loops through each element and prints it.

## Task5
I created an `Employee` class with three private fields: `firstName`, `age`, and `salary`. This class has getter methods for each field, a constructor for initializing the fields, and a toString method for representing an `Employee` object as a string.

In the `Task5` class, I created an array of three `Employee` objects with different `firstName`, `age`, and `salary` values. Using lambda expressions, I sorted the array in three different ways:

1. By `firstName` using `compareTo` to compare the string values.
2. By `age` using `Integer.compare` to compare the integer values.
3. By `salary` using `Double.compare` to compare the double values.
After each sort operation, I printed the sorted array to the console, showing the output in the order determined by the sorting criteria. The lambda expressions in the `Arrays.sort`method allowed for a clear and concise sorting logic.

## Task6
I wrote a code snippet that shows several operations using Java streams. It starts with a list of integers from 1 to 10. I used the `allMatch` method to check if all numbers are even, which returned false. Then, I used `anyMatch` to see if any number was even, and it returned true. Next, I verified that none of the numbers were negative using `noneMatch`, and this was also true.

To count the total number of elements, I used `count`, which showed there were 10 items. I generated 5 random numbers with `Stream.generate` and `limit`, and printed them with `forEach`. I found the first element in the list using `findFirst`, and any element using `findAny`. Both were present, and I printed them.

I also filtered the list to get only the even numbers, sorted them, and collected them into a new list. Then, I mapped each number to a string that starts with "Number: ", collecting them into another list. Finally, I used `reduce` to calculate the sum of all numbers, which I printed.

# Week13
## Task1
I wrote a code snippet that counts words in a text file both sequentially and concurrently. I created a file with test content using `BufferedWriter`. For the sequential count, I read the file line by line with `BufferedReader`, splitting each line into tokens and counting those with more than three symbols.

For concurrent word counting, I used a thread pool to process chunks of 300 lines. Each chunk was given to a `WordCountWorker`, which counted the words in its assigned lines. After all threads completed, I combined their results to get the total word count.

I then measured the time taken for both approaches and printed the results for comparison. This allowed me to analyze the performance difference between sequential and concurrent word counting.

## Task2
I created a Java program that writes a CSV file with 10 random tasks, each with a unique ID and a duration between 500 and 1500 milliseconds. The `Task` class holds the task ID and duration.

The `ParallelTaskExecutor` class extends `Thread` and takes tasks from a `BlockingQueue`. It simulates execution by sleeping for the specified duration and updates a shared counter to track completed tasks.

The `Task2` class has a method to read tasks from the CSV and another to execute tasks with a specified number of parallel task executors, measuring the total time taken.

In the `main` method, I ran the tasks with one executor, one executor per CPU core, and one executor per task, printing the time taken for each setup to compare their performance.

## Task3

