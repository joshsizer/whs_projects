/*	volume2.cpp
	This program will prompt the user for the price of a six-pack of soda and
	the volume of each can, then print out the price per ounce of soda.
	
	If you enter this test data, price per ounce should be 0.04
	test data: price: 2.95
	ounces: 12 
*/
#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	//declare constants
	const double CANS_PER_PACK = 6;

	//declare variables
	double packPrice;
	double canVolume;
	double packVolume;
	double pricePerOunce;

	//Read in price per pack
	cout << "Please enter the price for a six-pack: ";
	cin >> packPrice;
	
	//Read in can volume
	cout << "Please enter the volume for each can ( in ounces ): ";
	cin >> canVolume;
	
	//compute pack volume
	packVolume = canVolume * CANS_PER_PACK;
	
	//compute and print price per ounce
	pricePerOunce = packPrice / packVolume;
	
	//setprecision() will control the number of decimal places in the output
	cout << fixed << setprecision(2);
	cout << "Price per ounce: " << pricePerOunce << endl;

	cout << endl;
	system("pause");
	return EXIT_SUCCESS;
}

/*
	Answer the following questions:
	--------------------------------------------------------------------------

	1.	What is wrong with the following statement sequence?
		ReWrite in the program so that it will work correctly.
		( Hint: Why is it confusing?  Run this code segment to see... )
			
			double unitPrice;
			int quantity;
			cout << "Please enter the unit price: ";
			cin >> quantity;
			cin >> unitPrice;
		
	2.	The following code will run without any syntax errors, but it is
		not producing the correct output to the console.  How can you
		fix it to display the information correctly?
	
			cout << "Please enter the unit price: ";
			int unitPrice;
			cin >> unitPrice;
		
	3.	What is the output of the following statement sequence:
	
			double bottles = 10;
			cout << "The total volume is" << 5 * bottles;
		
	4.	Write a cout statement(s) that would print a decimal number 
		in dollars and cents format like this: $13.37 ?
		
	5.	Using the setw() manipulator ( example: line 40 ), improve 
		the output from the statement:
	
		cout << "Bottles: " << bottles << endl << "Cans: " << cans << endl;
		
		so that it looks like this where the ones and tens columns line up:
		
		Bottles:	 8		
		Cans:		24
		
		the numbers should line up in 1s and 10s column.
		( assume at most 8 digits are present )
*/