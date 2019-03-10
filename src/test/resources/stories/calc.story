
Scenario: Add digits
Given Claculator
When Add <num1> and <num2>
Then Rezult is <rez>
Examples:
num1|num2|rez
2|2|4
1|1|2

Scenario: Subtract digits
Given Claculator
When Subtract <num1> and <num2>
Then Rezult is <rez>
Examples:
num1|num2|rez
2|2|0
4|1|3

Scenario: Multiply digits
Given Claculator
When Multiply <num1> and <num2>
Then Rezult is <rez>
Examples:
num1|num2|rez
2|3|6
4|1|4

Scenario: Divide digits
Given Claculator
When Divide <num1> and <num2>
Then Rezult is <rez>
Examples:
num1|num2|rez
10|2|5
64|8|8

