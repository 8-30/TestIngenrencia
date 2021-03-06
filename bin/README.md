
This following program is the solution for the IOET Acme exercise.

Contents
========
 * [Exercise Description](#problem)
 * [Arquitecture](#arquitecture)
 * [Approach and Methodology](#approach-and-methodology)

## Description
The company ACME offers their employees the flexibility to work the hours they want. But due to some external circumstances they need to know what employees have been at the office within the same time frame

The goal of this exercise is to output a table containing pairs of employees and how often they have coincided in the office.

Input: the name of an employee and the schedule they worked, indicating the time and hours. This should be a .txt file with at least five sets of data. You can include the data from our examples below:

Example 1:

INPUT
RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00


OUTPUT:
ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2

Example 2:

INPUT:
RENE=MO10:15-12:00,TU10:00-12:00,TH013:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

OUTPUT:
RENE-ASTRID: 3

## Installation

this program requires [Node.js](https://nodejs.org/) to run.

Clone the project:
```sh
git clone https://github.com/8-30/acme.git
```

Install the dependencies and devDependencies and start the server.
```sh
cd acme
npm install
npm start
```

## Arquitecture

The functional structure of the program was modeled using the c4 model components diagram
![arquitecture](docs/arquitectureC4.png)

## Approach and Methodology

For exercise development first I read the problem carefully until I found a possible solution, then I translated the solution in pseudo code to check if it would be useful, once my solution was verified I proceeded to design the component diagram and finally assemble the project structure and implement the solution.

I Manage all my tasks using a proyect within the github repository created for the exercise.
![Tasks](docs/tasks.png)
